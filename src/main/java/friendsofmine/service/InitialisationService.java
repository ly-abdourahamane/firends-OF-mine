package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kotoly on 04/03/17.
 */

@Service
public class InitialisationService {

    public InitialisationService(){}
    private List<Utilisateur> listeUtilisateur ;
    private List<Activite> listeActivite ;

    public List<Utilisateur> getListeUtilisateur() {
        return listeUtilisateur;
    }

    public List<Activite> getListeActivite() {
        return listeActivite;
    }

    public void initDonnees() {
        listeUtilisateur = new ArrayList<Utilisateur>();
        listeActivite = new ArrayList<Activite>();
        Activite activite1 = new Activite("preparateur de commande","prepare des commandes pour des magasin");
        Activite activite2 = new Activite("footing","fait du sport pour se mettre en forme");
        Activite activite3 = new Activite("reviser","preparation d'un examen");
        Activite activite4 = new Activite("conduire","aller avec des amis en foot en salle");

        Date date = Calendar.getInstance().getTime();

        Utilisateur utilisateur1 = new Utilisateur("ly","abdou","abd@gmail.com","M",new Date());
        Utilisateur utilisateur2 = new Utilisateur("diallo","mariam","mam@gmail.com","F",date);
        Utilisateur utilisateur3 = new Utilisateur("sylla","issaga","isga@gmail.com","M",date);
        Utilisateur utilisateur4 = new Utilisateur("camara","aissata","aissata@gmail.com","F",new Date());
        Utilisateur utilisateur5 = new Utilisateur("kololomou","jean","jean@gmail.com","M",date);

        listeActivite.add(activite1);
        listeActivite.add(activite2);
        listeActivite.add(activite3);
        listeActivite.add(activite4);

        listeUtilisateur.add(utilisateur1);
        listeUtilisateur.add(utilisateur2);
        listeUtilisateur.add(utilisateur3);
        listeUtilisateur.add(utilisateur4);
        listeUtilisateur.add(utilisateur5);
    }
}
