//package java9.tablegames;
//
//import java9.tablegames.entity.Client;
//import java9.tablegames.repository.RegistrationRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import static org.assertj.core.api.Assertions.*;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//public class RegistrationRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private RegistrationRepository repository;
//
//    @Test
//    public void testCreateClient() {
//        Client client = new Client();
//        client.setLogin("testUserLogin");
//        client.setName("Alex");
//        client.setSurname("Ivanov");
//        client.setEmail("AlexIvanov@mail.ru");
//        client.setPassword("Alex123!");
//
//        Client savedClient = repository.save(client);
//
//        Client existClient = entityManager.find(Client.class, savedClient.getId());
//        assertThat(client.getLogin()).isEqualTo(existClient.getLogin());
//    }
//}
