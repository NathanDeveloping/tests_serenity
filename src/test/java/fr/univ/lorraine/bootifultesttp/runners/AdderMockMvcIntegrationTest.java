package fr.univ.lorraine.bootifultesttp.runners;

import fr.univ.lorraine.bootifultesttp.controllers.AdderController;
import fr.univ.lorraine.bootifultesttp.services.AdderService;
import fr.univ.lorraine.bootifultesttp.steps.AdderRestSteps;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import net.serenitybdd.jbehave.SerenityStory;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeStory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SerenityRunner.class)
@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
public class AdderMockMvcIntegrationTest extends SerenityStory {

    @Autowired
    private AdderService adderService;

    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }

}