package friendsofmine.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kotoly on 03/03/17.
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1)
    private String nom;
    @NotNull
    @Size(min = 1)
    private String prenom;
    @NotNull
    @Email
  //  @Pattern(regexp = "[a-z]*@[a-z]*.com")
    private String email;
    @NotNull
    @Pattern(regexp = "[M,F]")
    private String sexe;

    private Date date;

    //mise en place de persistance
    @OneToMany
    private Set<Activite> activites = new HashSet<Activite>();
    public void addActivites(Activite activite) {
        activites .add(activite);
    }

    public Set<Activite> getEnsemble_activites() {
        return  activites ;
    }

    public Utilisateur(){}
    public Utilisateur(String nom, String prenom, String email, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.date = date;
    }

    public Utilisateur(String nom, String prenom, String email, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
    }

    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return email;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDate() {
        return date;
    }

    public Set<Activite> getActivites() {
        return activites;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
