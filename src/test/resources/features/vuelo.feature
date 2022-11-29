#language: es

  Característica: Buscar vuelo

    Antecedentes:
      Dado el usuario se encuentre en el modulo de registro
      Cuando el ingrese el usuario con la clave
        | usuario           | clave   |
        | wilson.valderrama | sqa2022 |

    Escenario: Buscar vuelo fallido
      Dado que el usuario se encuentre en el modulo de vuelo
      Cuando el usuario despliegue el formulario de vuelo
      Entonces El visualizara un mensaje de no hay puestos