package StepsDefs;

import com.nntdata.CasoError;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CasoErrorStepsDefs {

    @Steps
    CasoError casoError;

    @When("caso error")
    public void casoError(){
        casoError.casoError();
    }

    @Then("el codigo respuesta es {int}")
    public void elCodigoRespuestaEs(int statusCode) {
        restAssuredThat((response -> response.statusCode(statusCode)));
    }
}
