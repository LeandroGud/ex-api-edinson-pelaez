Feature: Validacion

  Scenario: validando estatus y propiedades
    When validar el usuario con el id512
    Then el codigo de respuesta es 200
    And el type es "unknown"

  Scenario: vaildar caso error
    Then el codigo de respuesta es 400