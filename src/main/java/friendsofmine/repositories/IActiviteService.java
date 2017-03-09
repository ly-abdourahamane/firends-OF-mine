package friendsofmine.repositories;

import friendsofmine.domain.Activite;

/**
 * Created by Abdourahamane on 07/03/2017.
 */
public interface IActiviteService {
    public void saveActivite(Activite activite);
    public Activite findOneActivite(Long id);
    public Long countActivite();
    public ActiviteRepository getActiviteRepository();
}
