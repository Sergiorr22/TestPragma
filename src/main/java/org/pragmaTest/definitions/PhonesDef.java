package org.pragmaTest.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.pragmaTest.steps.PhonesStep;

public class PhonesDef {

    @Steps
    PhonesStep phonesStep;

    @Given("El usuario ingresa al aplicativo")
    public void elUsuarioIngresaAlAplicativo() {
        phonesStep.ingresoAplicativo();
    }


    @When("El usuario adiciona un producto {string} al carrito")
    public void elUsuarioAdicionaUnProductoAlCarrito(String producto) {
        phonesStep.agregarProducto(producto);
    }

    @And("ingresa al carrito de compras y confirma el pedido")
    public void ingresaAlCarritoDeComprasYConfirmaElPedido() {
        phonesStep.confirmarPedido();
    }

    @And("el usuario completa la información de pago {string}, {string}, {string}, {string}, {string}, {string}")
    public void elUsuarioCompletaLaInformaciónDePago(String name, String country, String city, String creditCard, String month, String year){
        phonesStep.ingresarInfoPago(name, country, city, creditCard, month, year);
    }

    @Then("se confirma la compra exitosa")
    public void seConfirmaLaCompraExitosa() {
        phonesStep.confirmacionCompra();
    }


    @And("ingresa al carrito y elimina el producto")
    public void ingresaAlCarritoYEliminaElProducto() {
        phonesStep.eliminarProducto();
    }

    @When("adiciona varios productos {string}, {string}")
    public void adicionaVariosProductos(String producto1, String producto2) {
        phonesStep.agregarVariosProductos(producto1, producto2);
    }
}
