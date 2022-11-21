package java9.tablegames.controller;

import java9.tablegames.entity.Client;
import java9.tablegames.entity.TableGames;
import java9.tablegames.service.registration.RegistrationServiceImpl;
import java9.tablegames.service.table_games.TableGamesService;
import java9.tablegames.service.table_games.TableGamesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class MainPageController {

    private TableGamesServiceImp tableGamesServiceImp;

    @Autowired
    public void setTableGamesService (TableGamesServiceImp tableGamesServiceImp) {
        this.tableGamesServiceImp = tableGamesServiceImp;
    }

    @GetMapping("/")
    public String mainPage(Model model){
        List<TableGames> games = tableGamesServiceImp.findAll();
        model.addAttribute("games", games);
        return "index";
    }
//    @GetMapping("/index")
//    public String mainPageIndex(Model model){
//        List<TableGames> games = tableGamesServiceImp.findAll();
//        model.addAttribute("games", games);
//        return "index";
//    }

    @GetMapping("/login")
    public String loginPage(Model model){
        return "login";
    }

    @GetMapping("/registration")
    public String registrationPage(Model model){
        model.addAttribute("client", new Client());
        return "registration";
    }

    @PostMapping("/show_all_games")
    public List<TableGames> showAllGames() {
        return tableGamesServiceImp.findAll();
    }

    @GetMapping("/shopping-cart")
    public String shoppingCartPage(Model model) {
        return "shopping-cart";
    }
}
