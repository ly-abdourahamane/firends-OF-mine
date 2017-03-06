package friendsofmine.domain;

import org.hibernate.service.spi.InjectService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by kotoly on 03/03/17.
 */
@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long identifiant;

    @NotNull
    @Size(min=1)
    private String titre;

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Long getId() {

        return identifiant;
    }

    private String descriptif;

    public String getTitre() {
        return titre;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public Activite(String titre, String descriptif) {
        this.titre = titre;
        this.descriptif = descriptif;
    }
}
