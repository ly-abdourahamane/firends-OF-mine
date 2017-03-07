package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.IActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 21207221 on 06/03/2017.
 */

@Service
public class ActiviteService implements IActiviteService {

    private ActiviteRepository activiteRepository;

    @Autowired
    public void setActiviteRepository(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    @Override
    public void saveActivite(Activite activite){
        this.activiteRepository.save(activite);
    }

    @Override
    public Activite findOneActivite(Long id){
        return this.activiteRepository.findOne(id);
    }

    @Override
    public void setDescriptif(String descriptif) {

    }

    @Override
    public Long countActivite(){
        return this.activiteRepository.count();
    }

    public ActiviteRepository getActiviteRepository(){
        return activiteRepository;
    }
}
