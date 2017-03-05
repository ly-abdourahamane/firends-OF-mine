package friendsofmine.controllers;

import friendsofmine.service.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kotoly on 04/03/17.
 */
@Controller
public class ActiviteController {
    @Autowired
    private Bootstrap bootstrap;

    @RequestMapping(value = "/activites", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("activites", bootstrap.getInitialisationService().getListeActivite());
        return "activites";
    }
}