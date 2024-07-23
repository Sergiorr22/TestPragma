@conjunto @E2E
Feature: Conjunto


  Scenario: Validacion error informacion de pago
    Given El usuario ingresa al aplicativo
    When El usuario selecciona una laptop
    And ingresa al carrito de compras y confirma el pedido
    And no completa la informacion de pago y no permite comprar


  Scenario: seleccionar distintos productos
    Given El usuario ingresa al aplicativo
    When El usuario adiciona un producto "" al carrito
    And selecciona un monitor
    And selecciona una laptop
    And ingresa al carrito de compras y confirma el pedido
    And el usuario completa la información de pago "Sergio Rodriguez", "Colombia", "Bogota", "6684 4565 1235 4564", "08", "28"
    Then se confirma la compra exitosa