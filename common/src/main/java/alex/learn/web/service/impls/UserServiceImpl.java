package alex.learn.web.service.impls;

import alex.learn.web.domains.User;
import alex.learn.web.repositories.interfaces.UserRepository;
import alex.learn.web.service.interfaces.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
@Service
public class UserServiceImpl implements UserService {

    Gson gson = new Gson();

    //Resource注解默认采用byName注入， Autowire默认采用byType注入
    @Autowired
    //@Resource
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public String getAll_() {
        return this.gson.toJson(getAll());
    }

    @Transactional
    @Override
    public User saveuser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void saveuser(User[] users) {
        this.userRepository.save( Arrays.asList(users));
    }

    @Transactional
    @Override
    public void deleteuser(int id) {
        this.userRepository.delete(id);
    }

    @Override
    public void deleteuser(int[] ids) {
        List<Integer> list = new ArrayList<>();
        for(int i : ids){
           list.add(new Integer(i));
        }
        this.userRepository.delete(this.userRepository.findAll(list));
    }

    @Transactional
    @Override
    public User updateuser(User user) {
        return this.userRepository.saveAndFlush(user);
    }

    @Override
    public User getById(int id) {
        return this.userRepository.findOne(id);
    }

}
