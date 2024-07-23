package org.pragmaTest.steps;

import net.thucydides.core.util.EnvironmentVariables;
import org.pragmaTest.ui.PhonesUI;
import org.pragmaTest.utilities.AccionesWeb;
import org.pragmaTest.utilities.UtilDatosAleatorios;

public class PhonesStep {

    private AccionesWeb accionesWeb;

    public void ingresoAplicativo() {
        accionesWeb.abrirPaginaConURL("https://www.demoblaze.com/index.html");
        accionesWeb.esperaCargarPagina();
    }

    public void agregarProducto(String producto){
        producto = obtenerProducto("");
        PhonesUI.setLblProduct(producto);
        accionesWeb.posicionarElementoScroll(PhonesUI.getLblProduct());
        accionesWeb.esperoElementoVisible(PhonesUI.getLblProduct());
        accionesWeb.bordearElemento(PhonesUI.getLblProduct());
        accionesWeb.clickBoton(PhonesUI.getLblProduct());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }

    public void confirmarPedido(){
        accionesWeb.bordearElemento(PhonesUI.getBtnCart());
        accionesWeb.clickBoton(PhonesUI.getBtnCart());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnOrder());
        accionesWeb.bordearElemento(PhonesUI.getBtnOrder());
        accionesWeb.clickBoton(PhonesUI.getBtnOrder());
    }

    public void ingresarInfoPago(String name, String country, String city, String creditCard, String month, String year){

        accionesWeb.esperoElementoVisible(PhonesUI.getInputName());
        accionesWeb.escribirTexto(PhonesUI.getInputName(), name);
        accionesWeb.bordearElemento(PhonesUI.getInputName());

        accionesWeb.escribirTexto(PhonesUI.getInputCountry(), country);
        accionesWeb.bordearElemento(PhonesUI.getInputCountry());

        accionesWeb.escribirTexto(PhonesUI.getInputCity(), city);
        accionesWeb.bordearElemento(PhonesUI.getInputCity());

        accionesWeb.escribirTexto(PhonesUI.getInputCard(), creditCard);
        accionesWeb.bordearElemento(PhonesUI.getInputCard());

        accionesWeb.escribirTexto(PhonesUI.getInputMonth(), month);
        accionesWeb.bordearElemento(PhonesUI.getInputMonth());

        accionesWeb.escribirTexto(PhonesUI.getInputYear(), year);
        accionesWeb.bordearElemento(PhonesUI.getInputYear());

        accionesWeb.bordearElemento(PhonesUI.getBtnPurchase());
        accionesWeb.clickBoton(PhonesUI.getBtnPurchase());
    }

    public void confirmacionCompra(){
        accionesWeb.esperoElementoVisible(PhonesUI.getLblConfirm());
        accionesWeb.bordearElemento(PhonesUI.getLblConfirm());
        accionesWeb.tomarEvidencia();
        accionesWeb.clickBoton(PhonesUI.getBtnOk());
    }

    public void eliminarProducto(){
        accionesWeb.bordearElemento(PhonesUI.getBtnCart());
        accionesWeb.clickBoton(PhonesUI.getBtnCart());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnOrder());
        accionesWeb.bordearElemento(PhonesUI.getBtnDelete());
        accionesWeb.bordearElemento(PhonesUI.getLblCart());
        accionesWeb.clickBoton(PhonesUI.getBtnDelete());
        accionesWeb.elementoInexistente(PhonesUI.getLblCart());
    }

    public void agregarVariosProductos(String producto1, String producto2){
        producto1 = obtenerProducto("");
        PhonesUI.setLblProduct(producto1);
        accionesWeb.posicionarElementoScroll(PhonesUI.getLblProduct());
        accionesWeb.esperoElementoVisible(PhonesUI.getLblProduct());
        accionesWeb.bordearElemento(PhonesUI.getLblProduct());
        accionesWeb.clickBoton(PhonesUI.getLblProduct());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();

        producto2 = obtenerProducto("");
        PhonesUI.setLblProduct(producto2);
        accionesWeb.bordearElemento(PhonesUI.getBtnHome());
        accionesWeb.clickBoton(PhonesUI.getBtnHome());
        accionesWeb.esperoElementoVisible(PhonesUI.getLblProduct());
        accionesWeb.posicionarElementoScroll(PhonesUI.getLblProduct());
        accionesWeb.bordearElemento(PhonesUI.getLblProduct());
        accionesWeb.tomarEvidencia();
        accionesWeb.clickBoton(PhonesUI.getLblProduct());
        accionesWeb.esperoElementoVisible(PhonesUI.getBtnAdd());
        accionesWeb.bordearElemento(PhonesUI.getBtnAdd());
        accionesWeb.clickBoton(PhonesUI.getBtnAdd());
        accionesWeb.aceptarAlerta();
    }









    public String obtenerProducto(String producto){
        if(producto.isEmpty()){
            producto = UtilDatosAleatorios.obtenerDatoAleatorioTxt("src/test/resources/archivos/Phones.txt");
        }else{
            return producto;
        }
        return producto;
    }



}
