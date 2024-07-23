package org.pragmaTest.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LaptopsUI extends PageObject {

    private static final By LBL_LAPTOPS = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private static final By LBL_MACBOOK = By.xpath("//a[.='MacBook Pro']");

    public static By getLblLaptops() {
        return LBL_LAPTOPS;
    }

    public static By getLblMacbook() {
        return LBL_MACBOOK;
    }
}
