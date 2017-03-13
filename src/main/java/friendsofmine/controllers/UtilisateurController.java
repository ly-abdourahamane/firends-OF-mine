package friendsofmine.controllers;

import friendsofmine.service.Bootstrap;
import friendsofmine.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kotoly on 04/03/17.
 */
@Controller
public class UtilisateurController {
   @Autowired
    private Bootstrap bootstrap;

   @Autowired
   private UtilisateurService utilisateurService;


    @RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("utilisateurs", utilisateurService.findAllUtilisateurs());
        return "utilisateurs";
    }
}
