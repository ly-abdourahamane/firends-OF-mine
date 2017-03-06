package friendsofmine.service;

import friendsofmine.domain.Utilisateur;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 21207221 on 06/03/2017.
 */
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public void saveUtilisateur(Utilisateur utilisateur) {

    }
    public Long getId() {

    }
    public Utilisateur findOneUtilisateur(Utilisateur utilisateur){

    }
    public String getEmail(){

    }
    public Long countUtilisateur(){

    }
    public void setEmail(String email){

    }
    public UtilisateurRepository getUtilisateurRepository(){

    }
}
