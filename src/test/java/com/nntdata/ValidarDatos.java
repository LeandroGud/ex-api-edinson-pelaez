package com.nntdata;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ValidarDatos {

    private static String URL = "https://www.freetogame.com/api/games?platform?=";

    @Step("Validar status")
    public void validarDatos(int id){
        SerenityRest.given()
                .contentType("application/json")
                .get(URL+id);
    }
}
