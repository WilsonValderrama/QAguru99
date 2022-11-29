package com.demo.guru99.pageObject;

import com.demo.guru99.models.Validacion;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.regex.Matcher;

public class PaginaMenuInicio {

    Validacion validacion = new Validacion();

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    @Step
    public void ValidarMensaje(){

        Assert.assertThat(paginaInicioPageObject.getDriver().findElement(validacion.getLblValidacion())
                .isDisplayed(), Matchers.is(true));


    }





}
