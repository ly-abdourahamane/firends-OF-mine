package friendsofmine.controllers;

import friendsofmine.domain.Utilisateur;
import friendsofmine.service.Bootstrap;
import friendsofmine.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public String list(Model model) {
        model.addAttribute("utilisateurs", utilisateurService.findAllUtilisateurs());
        return "utilisateurs";
    }

    @GetMapping("utilisateur/{id}")
    public String showUtilisateur(@PathVariable long id, Model model) {
        Utilisateur user = utilisateurService.findOneUtilisateur(id);
        if (user == null) {
            return "error";
        } else {
            model.addAttribute("utilisateur", user);
            return "utilisateurShow";
        }
    }

    @GetMapping("utilisateur/new")
    public String showForm(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "utilisateurForm";
    }

    @PostMapping("/utilisateur")
    public String checkUser(@Valid Utilisateur utilisateur, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "utilisateurForm";
        }
        utilisateurService.saveUtilisateur(utilisateur);
        long id = utilisateur.getId();
        return "redirect:/utilisateur/" + id;
    }

    @RequestMapping("utilisateur/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        Utilisateur utilisateur = utilisateurService.findOneUtilisateur(id);
        if (utilisateur == null) {
            model.addAttribute("error", "404");
            return "error";
        }

        model.addAttribute("utilisateur", utilisateur);
        return "utilisateurForm";
    }


    @DeleteMapping("utilisateur/delete/{id}")
    public String delete(@PathVariable long id) {
        Utilisateur utilisateur = utilisateurService.findOneUtilisateur(id);
        if (utilisateur == null) {
            return "error";
        }
        utilisateurService.deleteUtilisateur(id);
        return "redirect:/utilisateurs";
    }
}












