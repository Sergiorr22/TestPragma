package org.pragmaTest.steps;

import org.pragmaTest.ui.MonitorUI;
import org.pragmaTest.ui.PhonesUI;
import org.pragmaTest.utilities.AccionesWeb;

public class MonitorsStep {

    private AccionesWeb accionesWeb;

    public void agregarMonitor(){
        accionesWeb.esperoElementoVisible(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblMonitors());
        accionesWeb.clickBoton(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblApple());
        accionesWeb.clickBoton(MonitorUI.getLblApple());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }

    public void agregarVariosMonitores(){

        accionesWeb.esperoElementoVisible(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblMonitors());
        accionesWeb.clickBoton(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblApple());
        accionesWeb.clickBoton(MonitorUI.getLblApple());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();

        accionesWeb.bordearElemento(PhonesUI.getBtnHome());
        accionesWeb.clickBoton(PhonesUI.getBtnHome());

        accionesWeb.esperoElementoVisible(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblMonitors());
        accionesWeb.clickBoton(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblAsus());
        accionesWeb.clickBoton(MonitorUI.getLblAsus());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();

    }

    public void agregarMonitorConjunto(){
        accionesWeb.bordearElemento(PhonesUI.getBtnHome());
        accionesWeb.clickBoton(PhonesUI.getBtnHome());
        accionesWeb.esperoElementoVisible(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblMonitors());
        accionesWeb.clickBoton(MonitorUI.getLblMonitors());
        accionesWeb.bordearElemento(MonitorUI.getLblApple());
        accionesWeb.clickBoton(MonitorUI.getLblApple());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }


}
