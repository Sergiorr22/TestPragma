package org.pragmaTest.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PhonesUI extends PageObject {

    private static final By BTN_PHONES = By.xpath("//a[@onclick=\"byCat('phone')\"]");
    private static By LBL_PRODUCT;
    private static final By BTN_ADD = By.xpath("//a[.='Add to cart']");
    private static final By BTN_CART = By.id("cartur");
    private static final By BTN_ORDER = By.xpath("//button[.='Place Order']");
    private static final By INPUT_NAME = By.id("name");
    private static final By INPUT_COUNTRY = By.id("country");
    private static final By INPUT_CITY = By.id("city");
    private static final By INPUT_CARD = By.id("card");
    private static final By INPUT_MONTH = By.id("month");
    private static final By INPUT_YEAR = By.id("year");
    private static final By BTN_PURCHASE = By.xpath("//button[.='Purchase']");
    private static final By LBL_CONFIRM = By.xpath("//p[@class='lead text-muted ']");
    private static final By BTN_OK = By.xpath("//button[.='OK']");
    private static final By BTN_DELETE = By.xpath("//a[.='Delete']");
    private static final By LBL_CART = By.xpath("//tr[@class='success']");
    private static final By BTN_HOME = By.cssSelector("a.nav-link[href='index.html']");

    public static void setLblProduct(String producto) {
        PhonesUI.LBL_PRODUCT = By.xpath("//a[.='" +producto+ "']");
    }

    public static By getLblProduct() {
        return LBL_PRODUCT;
    }

    public static By getBtnPhones() {
        return BTN_PHONES;
    }

    public static By getBtnAdd() {
        return BTN_ADD;
    }

    public static By getBtnCart() {
        return BTN_CART;
    }

    public static By getBtnOrder() {
        return BTN_ORDER;
    }

    public static By getInputName() {
        return INPUT_NAME;
    }

    public static By getInputCountry() {
        return INPUT_COUNTRY;
    }

    public static By getInputCity() {
        return INPUT_CITY;
    }

    public static By getInputCard() {
        return INPUT_CARD;
    }

    public static By getInputMonth() {
        return INPUT_MONTH;
    }

    public static By getInputYear() {
        return INPUT_YEAR;
    }

    public static By getBtnPurchase() {
        return BTN_PURCHASE;
    }

    public static By getLblConfirm() {
        return LBL_CONFIRM;
    }

    public static By getBtnOk() {
        return BTN_OK;
    }

    public static By getBtnDelete() {
        return BTN_DELETE;
    }

    public static By getLblCart() {
        return LBL_CART;
    }

    public static By getBtnHome() {
        return BTN_HOME;
    }
}
