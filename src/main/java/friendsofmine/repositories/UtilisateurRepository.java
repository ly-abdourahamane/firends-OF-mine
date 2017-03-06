package friendsofmine.repositories;

import friendsofmine.domain.Utilisateur;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 21207221 on 06/03/2017.
 */
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
   /* public void saveUtilisateur(Utilisateur utilisateur);
    public Long getId();
    public Utilisateur findOneUtilisateur(Utilisateur utilisateur);
    public String getEmail();
    public Long countUtilisateur();
    public void setEmail(String email);
    public UtilisateurRepository getUtilisateurRepository();*/

}
