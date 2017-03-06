package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 21207221 on 06/03/2017.
 */

@Service
public class ActiviteService  {

    private ActiviteRepository activiteRepository;

    @Autowired
    public void setActiviteRepository(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    public void saveActivite(Activite activite){
        this.activiteRepository.save(activite);
    }

    public Activite findOneActivite(Long id){
        return this.activiteRepository.findOne(id);
    }

    public Long countActivite(){
        return this.activiteRepository.count();
    }

    public ActiviteRepository getActiviteRepository(){
        return activiteRepository;
    }
}
