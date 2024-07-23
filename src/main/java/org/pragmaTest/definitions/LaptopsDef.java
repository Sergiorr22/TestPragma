package org.pragmaTest.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.pragmaTest.steps.LaptopsStep;


public class LaptopsDef {

    @Steps
    LaptopsStep laptopsStep;

    @When("El usuario selecciona una laptop")
    public void elUsuarioSeleccionaUnaLaptop() {
        laptopsStep.agregarLaptop();
    }

    @And("no completa la informacion de pago y no permite comprar")
    public void noCompletaLaInformacionDePagoYSaleError() {
        laptopsStep.sinInfoPago();
    }

    @And("selecciona una laptop")
    public void seleccionaUnaLaptop() {
        laptopsStep.agregarLaptopConjunto();
    }
}
