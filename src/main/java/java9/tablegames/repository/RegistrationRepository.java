package java9.tablegames.repository;

import java9.tablegames.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Client, Integer> {
    User findByLogin(String login);
}
