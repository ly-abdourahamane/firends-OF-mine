package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.IActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 21207221 on 06/03/2017.
 */

@Service
@org.springframework.transaction.annotation.Transactional
public class ActiviteService implements IActiviteService {

    private ActiviteRepository activiteRepository;    private UtilisateurService utilisateurService;


    @Autowired
    public void setActiviteRepository(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    @Autowired
    public void setUtilisateurService(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    public ActiviteService() {

    }

    public UtilisateurService getUtilisateurService() {
        return utilisateurService;
    }

    @Override
    public void saveActivite(Activite activite) {
        if (activite == null) {
            throw new IllegalArgumentException();
        }
        this.utilisateurService.saveUtilisateur(activite.getUtilisateur());
        this.activiteRepository.save(activite);
        activite.getUtilisateur().addActivites(activite);
    }

    @Override
    public Activite findOneActivite(long id) {
        return this.activiteRepository.findOne(id);
    }

    @Override
    public long countActivite() {
        return this.activiteRepository.count();
    }

    @Override
    public ActiviteRepository getActiviteRepository() {
        return activiteRepository;
    }

    public ArrayList<Activite> findAllActivites() {
        return (ArrayList<Activite>) this.activiteRepository.findAll(new Sort(Sort.Direction.ASC, "titre"));
    }
}
