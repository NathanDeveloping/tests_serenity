package fr.univ.lorraine.bootifultesttp.stories;

import fr.univ.lorraine.bootifultesttp.steps.AdderRestSteps;
import fr.univ.lorraine.bootifultesttp.steps.AdderServiceSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdderStory {

    @Steps
    AdderRestSteps adderSteps;

    @Given("a number")
    public void givenANumber() throws Exception {
        adderSteps.givenCurrentNumber();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num) {
        adderSteps.whenAddNumber(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum() {
        adderSteps.thenSummedUp();
    }
}
