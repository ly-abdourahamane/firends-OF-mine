package friendsofmine.repositories;

import friendsofmine.domain.Activite;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 21207221 on 06/03/2017.
 */
public interface ActiviteRepository extends CrudRepository<Activite,Long>{
   /* public void saveActivite(Activite activite);
    public Activite findOneActivite(Long id);
    public void setDescriptif(String descriptif);
    public Long countActivite();
    public ActiviteRepository getActiviteRepository();*/
}
