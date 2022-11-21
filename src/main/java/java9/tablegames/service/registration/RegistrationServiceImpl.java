package java9.tablegames.service.registration;

import java9.tablegames.entity.Client;
import java9.tablegames.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    private RegistrationRepository repository;

    @Autowired
    public void setRegistrationRepository(RegistrationRepository repository) {
        this.repository = repository;
    }

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public boolean createNewClient(Client client) {
        User clientFromDb = repository.findByLogin(client.getLogin());
        if (clientFromDb != null) {
            return false;
        }
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        repository.save(client);
        return true;
    }
}
