package fr.univ.lorraine.bootifultesttp.steps;

import fr.univ.lorraine.bootifultesttp.services.AdderService;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@ContextConfiguration(classes = AdderService.class)
public class AdderServiceSteps {

    @Autowired
    private AdderService adderService;

    private int givenNumber, base, sum;

    @Step("Given a number {0}")
    public void givenBase(int base) {
        this.base = base;
        this.adderService.setNum(this.base);
    }


    @Step("When you add {0}")
    public void whenAdd(int x) {
        this.givenNumber = x;
        sum = adderService.add(x);
    }

    @Step("The result should be")
    public void summedUp() {
        assertEquals(base + givenNumber, sum);
    }

    public void sumWrong() {
        assertNotEquals(base + givenNumber, sum);
    }


}
