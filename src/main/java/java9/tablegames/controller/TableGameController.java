package java9.tablegames.controller;

import java9.tablegames.entity.TableGames;
import java9.tablegames.service.table_games.TableGamesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TableGameController {
    private TableGamesServiceImp tableGamesServiceImp;

    @Autowired
    public void setTableGamesServiceImp(TableGamesServiceImp tableGamesServiceImp) {
        this.tableGamesServiceImp = tableGamesServiceImp;
    }

    @GetMapping("/game-info/{id}")
    public String gameInfoPage(Model model,
                               @PathVariable Integer id) {
        TableGames game = tableGamesServiceImp.findById(id);
        model.addAttribute("game", game);
        return "game-info";
    }

}
