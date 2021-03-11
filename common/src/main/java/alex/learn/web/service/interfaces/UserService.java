package alex.learn.web.service.interfaces;

import alex.learn.web.domains.User;

import java.util.List;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
public interface UserService {

    List<User> getAll();
    String getAll_();

    User saveuser(User user);

    void saveuser(User[] users);

    void deleteuser(int id);

    void deleteuser(int[] ids);

    User updateuser(User user);

    User getById(int id);
}
