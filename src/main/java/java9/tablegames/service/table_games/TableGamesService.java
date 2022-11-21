package java9.tablegames.service.table_games;

import java9.tablegames.entity.TableGames;

import java.util.List;

public interface TableGamesService {
    List<TableGames> findAll();
    TableGames findById(Integer id);
}
