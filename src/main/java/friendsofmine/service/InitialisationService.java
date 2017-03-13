package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kotoly on 04/03/17.
 */

@Service
@Transactional
public class InitialisationService {

    public InitialisationService(){}

    @Autowired
    private ActiviteRepository activiteRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    private  Activite randonnee, lindyhop, taekwondo;
    private Utilisateur mary, thom;

    public void initDonnees() {
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

        mary = new Utilisateur("mary","youla","mary@gmail.com","F",date);
        thom = new Utilisateur("thom","diallo","thom@gmail.com","M",date);

        randonnee = new Activite("randonnee","randonnée");
        lindyhop = new Activite("lindyhop","lindyhp");
        taekwondo = new Activite("taekwondo","taekwondo");

        activiteRepository.save(randonnee);
        activiteRepository.save(lindyhop);
        activiteRepository.save(taekwondo);

        utilisateurRepository.save(thom);
        utilisateurRepository.save(mary);

      /*  activiteRepository.save(activite1);
        activiteRepository.save(activite2);
        activiteRepository.save(activite3);
        activiteRepository.save(activite4);

        utilisateurRepository.save(utilisateur1);
        utilisateurRepository.save(utilisateur2);
        utilisateurRepository.save(utilisateur3);
        utilisateurRepository.save(utilisateur4);
        utilisateurRepository.save(utilisateur5); */
    }

    public Activite getRandonnee() {
        return randonnee;
    }

    public Activite getLindyhop() {
        return lindyhop;
    }

    public Activite getTaekwondo() {
        return taekwondo;
    }

    public Utilisateur getThom() {
        return thom;
    }

    public Utilisateur getMary() {
        return mary;
    }
}
