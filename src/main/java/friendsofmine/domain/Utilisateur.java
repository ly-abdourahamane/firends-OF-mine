package friendsofmine.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kotoly on 03/03/17.
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
    @Pattern(regexp = "M|F")
    private String sexe;

    private Date dateNaissance;

    //mise en place de persistance
    @OneToMany
    private Set<Activite> activites = new HashSet<Activite>();

    public void addActivites(Activite activite) {
        activites.add(activite);
    }

    public Set<Activite> getEnsemble_activites() {
        return activites;
    }

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email, String sexe, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
    }

    public Utilisateur(String nom, String prenom, String email, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
    }

    public long getId() {
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

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
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
