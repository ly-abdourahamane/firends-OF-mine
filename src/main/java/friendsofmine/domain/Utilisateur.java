package friendsofmine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by kotoly on 03/03/17.
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long identifiant;

    @NotNull
    @Size(min = 1)
    private String nom;
    @NotNull
    @Size(min = 1)
    private String prenom;
    @NotNull
    @Pattern(regexp = "[a-z]*@[a-z]*.com")
    private String mail;
    @NotNull
    @Pattern(regexp = "[M,F]")
    private String sexe;
    private Date date;

    public Utilisateur(String nom, String prenom, String mail, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
        this.date = date;
    }

    public Utilisateur(String nom, String prenom, String mail, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDate() {
        return date;
    }

}
