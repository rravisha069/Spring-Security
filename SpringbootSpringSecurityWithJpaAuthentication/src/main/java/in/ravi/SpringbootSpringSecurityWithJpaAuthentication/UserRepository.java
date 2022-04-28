package in.ravi.SpringbootSpringSecurityWithJpaAuthentication;

import in.ravi.SpringbootSpringSecurityWithJpaAuthentication.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String userName);
}
