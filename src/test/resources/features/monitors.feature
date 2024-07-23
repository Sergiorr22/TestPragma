@Monitors @E2E

Feature: Add Monitors

  Scenario: Agregar un monitor
    Given El usuario ingresa al aplicativo
    When El usuario selecciona un monitor
    And ingresa al carrito de compras y confirma el pedido
    And el usuario completa la información de pago "Sergio Rodriguez", "Colombia", "Bogota", "6684 4565 1235 4564", "08", "28"
    Then se confirma la compra exitosa


  Scenario: Agregar varios monitores
    Given El usuario ingresa al aplicativo
    When El usuario selecciona los dos monitores
    And ingresa al carrito de compras y confirma el pedido
    And el usuario completa la información de pago "Sergio Rodriguez", "Colombia", "Bogota", "6684 4565 1235 4564", "08", "28"
    Then se confirma la compra exitosa
