package com.demo.guru99.stepDefinitions;

import com.demo.guru99.pageStep.PaginaInicioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class VueloStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;

    @Dado("^que el usuario se encuentre en el modulo de vuelo$")
    public void queElUsuarioSeEncuentreEnElModuloDeVuelo() {



    }


    @Cuando("^el usuario despliegue el formulario de vuelo$")
    public void elUsuarioDespliegueElFormularioDeVuelo() {

    }

    @Entonces("^El visualizara un mensaje de no hay puestos$")
    public void elVisualizaraUnMensajeDeNoHayPuestos() {

    }

}
