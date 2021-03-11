package alex.learn.web.repositories.interfaces;

import alex.learn.web.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
public interface UserRepository extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<Integer> {
}
