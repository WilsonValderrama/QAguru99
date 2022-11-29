package com.demo.guru99.pageStep;

import com.demo.guru99.pageObject.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject =  new PaginaInicioPageObject();

    @Step
    public void abrirNavegador(){
      paginaInicioPageObject.open();
    }

    @Step
    public void ingresarUsuario(String usuario, String clave) throws IOException {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtUsuario()).sendKeys(usuario);
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtClave()).sendKeys(clave);
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIngresar()).click();
    }








}
