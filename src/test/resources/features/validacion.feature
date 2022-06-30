Feature: Validacion

  Scenario: validando estatus y propiedades
    When validar codigo
    Then el codigo de respuesta es 200


  Scenario: vaildar el caso error
    When caso error
    Then el codigo respuesta es 400