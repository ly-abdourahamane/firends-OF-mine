package friendsofmine.service;

import friendsofmine.domain.Utilisateur;
import friendsofmine.repositories.IUtilisateurService;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 21207221 on 06/03/2017.
 */
@Service
public class UtilisateurService implements IUtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    @Autowired
    public void setUtilisateurRepository(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public void saveUtilisateur(Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public Utilisateur findOneUtilisateur(Long id){
       return this.utilisateurRepository.findOne(id);
    }

    @Override
    public Long countUtilisateur(){
        return this.utilisateurRepository.count();
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }

    public ArrayList<Utilisateur> findAllUtilisateurs(){
        return (ArrayList<Utilisateur>) this.utilisateurRepository.findAll(new Sort(Sort.Direction.ASC,"nom"));
    }
}
