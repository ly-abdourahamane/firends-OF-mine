package friendsofmine.domain;

import org.hibernate.service.spi.InjectService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by kotoly on 03/03/17.
 */
public class Activite {
    @NotNull
    @Size(min=1)
    private String titre;

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
