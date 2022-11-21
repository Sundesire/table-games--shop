package java9.tablegames.controller;

import java9.tablegames.entity.Client;
import java9.tablegames.service.registration.RegistrationService;
import java9.tablegames.service.registration.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private RegistrationService registrationService;

    @Autowired
    public void setRegistrationService(RegistrationService service) {
        this.registrationService = service;
    }

    @GetMapping("/registration-sucess")
    public String registrationSucess(Model model) {
        return "registration-sucess";
    }

    @PostMapping("/create-user")
    public String createClient(Model model, Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {

        }
        model.addAttribute("client", client);
        registrationService.createNewClient(client);
        return "registration-sucess";
    }
//
//    @PostMapping("/update-info")
//    public String updateInfo(@RequestParam Integer id,
//                             @RequestParam String name,
//                             @RequestParam String surname,
//                             @RequestParam String adress,
//                             @RequestParam String phone,
//                             @RequestParam String email
//                             ) {
//        registrationServiceImpl.updateClientInfo(id, name, surname, adress, phone, email);
//        return "redirect:/"; //Ссылка на личный кабинет
//    }
}
