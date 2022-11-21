package java9.tablegames.service.table_games;

import java9.tablegames.entity.TableGames;
import java9.tablegames.repository.RegistrationRepository;
import java9.tablegames.repository.TableGamesRepository;
import java9.tablegames.service.registration.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableGamesServiceImp implements TableGamesService{

    private TableGamesRepository repository;

    @Autowired
    public void setRegistrationService(TableGamesRepository tableGamesRepository) {
        this.repository = tableGamesRepository;
    }

    @Override
    public List<TableGames> findAll() {
        return repository.findAll();
    }

    @Override
    public TableGames findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
