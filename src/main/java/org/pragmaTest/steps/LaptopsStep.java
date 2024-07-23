package org.pragmaTest.steps;

import org.pragmaTest.ui.LaptopsUI;
import org.pragmaTest.ui.MonitorUI;
import org.pragmaTest.ui.PhonesUI;
import org.pragmaTest.utilities.AccionesWeb;

public class LaptopsStep {

    private AccionesWeb accionesWeb;

    public void agregarLaptop(){
        accionesWeb.esperoElementoVisible(LaptopsUI.getLblLaptops());
        accionesWeb.bordearElemento(LaptopsUI.getLblLaptops());
        accionesWeb.clickBoton(LaptopsUI.getLblLaptops());
        accionesWeb.posicionarElementoScroll(LaptopsUI.getLblMacbook());
        accionesWeb.bordearElemento(LaptopsUI.getLblMacbook());
        accionesWeb.clickBoton(LaptopsUI.getLblMacbook());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }



    public void sinInfoPago(){

        accionesWeb.esperoElementoVisible(PhonesUI.getBtnPurchase());
        accionesWeb.posicionarElementoScroll(PhonesUI.getBtnPurchase());
        accionesWeb.bordearElemento(PhonesUI.getBtnPurchase());
        accionesWeb.clickBoton(PhonesUI.getBtnPurchase());
        accionesWeb.tomarEvidencia();
    }

    public void agregarLaptopConjunto(){

        accionesWeb.bordearElemento(PhonesUI.getBtnHome());
        accionesWeb.clickBoton(PhonesUI.getBtnHome());
        accionesWeb.esperoElementoVisible(LaptopsUI.getLblLaptops());
        accionesWeb.bordearElemento(LaptopsUI.getLblLaptops());
        accionesWeb.clickBoton(LaptopsUI.getLblLaptops());
        accionesWeb.posicionarElementoScroll(LaptopsUI.getLblMacbook());
        accionesWeb.bordearElemento(LaptopsUI.getLblMacbook());
        accionesWeb.clickBoton(LaptopsUI.getLblMacbook());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }


}
