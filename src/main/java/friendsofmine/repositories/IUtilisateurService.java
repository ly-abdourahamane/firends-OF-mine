package friendsofmine.repositories;

import friendsofmine.domain.Utilisateur;

/**
 * Created by Abdourahamane on 07/03/2017.
 */
public interface IUtilisateurService {
    public void saveUtilisateur(Utilisateur utilisateur);

    public Utilisateur findOneUtilisateur(long id);

    public String getEmail();

    public long countUtilisateur();

    public void setEmail(String email);

    public UtilisateurRepository getUtilisateurRepository();
}
