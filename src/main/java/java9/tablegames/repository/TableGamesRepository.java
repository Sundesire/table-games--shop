package java9.tablegames.repository;

import java9.tablegames.entity.TableGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableGamesRepository extends JpaRepository<TableGames, Integer> {

}
