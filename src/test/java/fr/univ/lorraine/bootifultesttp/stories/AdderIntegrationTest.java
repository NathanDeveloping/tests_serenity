package fr.univ.lorraine.bootifultesttp.stories;

import fr.univ.lorraine.bootifultesttp.controllers.AdderController;
import fr.univ.lorraine.bootifultesttp.services.AdderService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
public class AdderIntegrationTest extends AdderStory {

    @Autowired private AdderService adderService;

    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }
}
