#language: es

  Característica: login

    @login
    Escenario: login exitoso
      Dado el usuario se encuentre en el modulo de registro
      Cuando el ingrese el usuario con la clave
        | usuario           | clave   |
        | wilson.valderrama | sqa2022 |
      Entonces el visualizara un mensaje de bienvenida

    @loginFallido
    Esquema del escenario: login fallido
      Cuando el ingrese los datos de logueo fallidos
        | usuario           | clave   |
        | <usuario>         | <clave> |
      Entonces el visualizara un mensaje de error
      Ejemplos:
        | usuario            | clave   |
        | WilsonValderrama   | sqa2023 |
        | WilsonValderrama10 | sqa2024 |


