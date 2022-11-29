package com.demo.guru99.pageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/test/newtours/index.php")
public class PaginaInicioPageObject extends PageObject {

    By txtUsuario = By.xpath("//input[@name='userName']");

    By txtClave = By.xpath("//input[@name='password']");

    By btnIngresar = By.xpath("//input[@name='submit']");

    public By getTxtUsuario(){
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
