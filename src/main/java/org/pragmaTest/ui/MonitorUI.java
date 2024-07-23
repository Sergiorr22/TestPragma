package org.pragmaTest.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MonitorUI extends PageObject {

    private static final By LBL_MONITORS = By.xpath("//a[@onclick=\"byCat('monitor')\"]");
    private static final By LBL_APPLE = By.xpath("//a[.='Apple monitor 24']");
    private static final By LBL_ASUS = By.xpath("//a[.='ASUS Full HD']");


    public static By getLblMonitors() {
        return LBL_MONITORS;
    }

    public static By getLblApple() {
        return LBL_APPLE;
    }

    public static By getLblAsus() {
        return LBL_ASUS;
    }
}
