package friendsofmine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by kotoly on 04/03/17.
 */
@Component
public class Bootstrap {

    private InitialisationService initialisationService;

    @Autowired
    public void setInitialisationService(InitialisationService initialisationService){
        this.initialisationService = initialisationService;
    }

    public InitialisationService getInitialisationService() {
        return initialisationService;
    }

    @PostConstruct
    public void init() {
        initialisationService.initDonnees();
    }
}
