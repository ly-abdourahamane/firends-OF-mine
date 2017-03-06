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
        this.utilisateurRepository.save(utilisateur);
    }

    public Utilisateur findOneUtilisateur(Long id){
       return this.utilisateurRepository.findOne(id);
    }


    public Long countUtilisateur(){
        return this.utilisateurRepository.count();
    }

    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }
}
