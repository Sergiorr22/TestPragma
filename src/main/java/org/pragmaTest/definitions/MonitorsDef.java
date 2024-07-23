package org.pragmaTest.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.pragmaTest.steps.MonitorsStep;


public class MonitorsDef {

    @Steps
    MonitorsStep monitorsStep;

    @When("El usuario selecciona un monitor")
    public void elUsuarioSeleccionaUnMonitor() {
        monitorsStep.agregarMonitor();
    }

    @When("El usuario selecciona los dos monitores")
    public void elUsuarioSeleccionaLosDosMonitores() {
        monitorsStep.agregarVariosMonitores();
    }

    @And("selecciona un monitor")
    public void seleccionaUnMonitor() {
        monitorsStep.agregarMonitorConjunto();
    }
}
