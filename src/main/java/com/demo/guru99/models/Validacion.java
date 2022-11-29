package com.demo.guru99.models;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Validacion extends PageObject {

    By lblValidacion = By.xpath("//h3[contains(text(),'Login Successfully')]");

    public By getLblValidacion() {
        return lblValidacion;
    }
}
