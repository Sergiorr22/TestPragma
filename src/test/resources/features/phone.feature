@Phones @E2E

Feature: Add Phones


  Scenario: Compra de un telefono
    Given El usuario ingresa al aplicativo
    When El usuario adiciona un producto "" al carrito
    And ingresa al carrito de compras y confirma el pedido
    And el usuario completa la información de pago "Sergio Rodriguez", "Colombia", "Bogota", "6684 4565 1235 4564", "08", "28"
    Then se confirma la compra exitosa



  Scenario: Eliminar productos
    Given El usuario ingresa al aplicativo
    When El usuario adiciona un producto "" al carrito
    And ingresa al carrito y elimina el producto


  Scenario: Comprar varios telefonos
    Given El usuario ingresa al aplicativo
    When adiciona varios productos "", ""

