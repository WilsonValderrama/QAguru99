package com.demo.guru99.stepDefinitions;

import com.demo.guru99.pageObject.PaginaMenuInicio;
import com.demo.guru99.pageStep.PaginaInicioStep;
import com.demo.guru99.utils.DatosLogin;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;

public class LoginStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;

    @Steps
    PaginaMenuInicio paginaMenuInicio;

    @Dado("^el usuario se encuentre en el modulo de registro$")
    public void elUsuarioSeEncuentreEnElModuloDeRegistro() {
        paginaInicioStep.abrirNavegador();
    }


    @Cuando("^el ingrese el usuario con la clave$")
    public void elIngreseElUsuarioConLaClave(List<DatosLogin> datosLoginList) throws IOException {
        paginaInicioStep.ingresarUsuario(datosLoginList.get(0).getUsuario(), datosLoginList.get(0).getClave());

    }

    @Entonces("^el visualizara un mensaje de bienvenida$")
    public void elVisualizaraUnMensajeDeBienvenida() {
        paginaMenuInicio.ValidarMensaje();

    }

    @Cuando("^el ingrese los datos de logueo fallidos$")
    public void elIngreseLosDatosDeLogueoFallidos(List<DatosLogin> datosLoginList) throws IOException {
        paginaInicioStep.abrirNavegador();
        paginaInicioStep.ingresarUsuario(datosLoginList.get(0).getUsuario(), datosLoginList.get(0).getClave());
    }


    @Entonces("^el visualizara un mensaje de error$")
    public void elVisualizaraUnMensajeDeError() {
    }


}
