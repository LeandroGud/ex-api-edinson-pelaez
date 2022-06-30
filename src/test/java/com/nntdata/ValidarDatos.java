package com.nntdata;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ValidarDatos {

    private static String URL = "https://www.freetogame.com/api/games?platform=pc&category=shooter";

    @Step("Validar Datos")
    public void validarDatos(){
        SerenityRest.given()
                .contentType("application/json")
                .get(URL);
    }
}
