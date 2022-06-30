package StepsDefs;

import com.nntdata.ValidarDatos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;



import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ValidarStepsDefs {


    @Steps
    ValidarDatos validarDatos;
    @When("validar codigo")
    public void validarDatos(){
        validarDatos.validarDatos();
    }

    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
       restAssuredThat((response -> response.statusCode(statusCode)));
    }


}

