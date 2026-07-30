package Controlador;

import Modelo.ApiModelo;
import Modelo.Carro_Modelo;
import Modelo.Chofer_Modelo;
import Modelo.Motor_Modelo;
import Modelo.Pasajero_Modelo;
import Vista.Vista_Carro;
import Vista.Vista_Chofer;
import Vista.Vista_Motor;
import Vista.Vista_Pasajero;

public class General_Controller {

    public Vista_Chofer obj_vista_chofer;
    public Vista_Carro obj_vista_carro;
    public Vista_Motor obj_vista_motor;
    public Vista_Pasajero obj_vista_pasajero;   
    public ApiModelo obj_api;

    public General_Controller(
            Vista_Chofer obj_vista_chofer,
            Vista_Carro obj_vista_carro,
            Vista_Motor obj_vista_motor,
            Vista_Pasajero obj_vista_pasajero) {

        this.obj_vista_chofer = obj_vista_chofer;
        this.obj_vista_carro = obj_vista_carro;
        this.obj_vista_motor = obj_vista_motor;
        this.obj_vista_pasajero = obj_vista_pasajero;
        this.obj_api = new ApiModelo();
    }

public void procesar_chofer() {

    for (int i = 0; i < 2; i++) {

        if (i > 0) {
            obj_vista_chofer.siguiente_chofer();
        }

        Chofer_Modelo obj_chofer = new Chofer_Modelo("", "", "");

        do {
            obj_chofer.setNombre_chofer(obj_vista_chofer.tomar_nombre());

            if (!obj_chofer.validarNombre()) {
                obj_vista_chofer.mostrarError("Error: El nombre no puede estar vacio.");
            }

        } while (!obj_chofer.validarNombre());

        do {
            obj_chofer.setCedula_chofer(obj_vista_chofer.tomar_cedula());

            if (!obj_chofer.validarCedula()) {
                obj_vista_chofer.mostrarError("Error: La cedula debe tener entre 8 y 10 numeros.");
            }

        } while (!obj_chofer.validarCedula());

        do {
            obj_chofer.setLicencia_chofer(obj_vista_chofer.tomar_licencia());

            if (!obj_chofer.validarLicencia()) {
                obj_vista_chofer.mostrarError("Error: La licencia no puede estar vacia.");
            }

        } while (!obj_chofer.validarLicencia());

        obj_api.guardar_chofer(obj_chofer);

        obj_vista_chofer.mostrar_datos(
                obj_chofer.getNombre_chofer(),
                obj_chofer.getCedula_chofer(),
                obj_chofer.getLicencia_chofer());
    }
}
    public void procesar_carro() {

    String[][] carros = new String[3][3];

        for (int i = 0; i < carros.length; i++) {
            if (i > 0) {
                obj_vista_carro.siguiente_carro();
        }

        carros[i][0] = obj_vista_carro.tomar_placa();
        carros[i][1] = obj_vista_carro.tomar_marca();
        carros[i][2] = obj_vista_carro.tomar_color();

        }

        obj_api.guardar_carros(carros);

    }

    public void procesar_motor() {

    String[][] motores = new String[3][3];

        for (int i = 0; i < motores.length; i++) {
            if (i > 0) {
                obj_vista_motor.siguiente_motor();}

        motores[i][0] = obj_vista_motor.tomar_numero();
        motores[i][1] = obj_vista_motor.tomar_tipo();
        motores[i][2] = obj_vista_motor.tomar_cilindraje();

        }

        obj_api.guardar_motores(motores);

    }

public void procesar_pasajero() {

    for (int i = 0; i < 2; i++) {

        if (i > 0) {
            obj_vista_pasajero.siguiente_pasajero();
        }

        Pasajero_Modelo obj_pasajero = new Pasajero_Modelo("", "");

        do {
            obj_pasajero.setNum_Cedula(obj_vista_pasajero.tomar_cedula());

            if (!obj_pasajero.validarCedula()) {
                obj_vista_pasajero.mostrarError("Error: La cedula debe tener entre 8 y 10 numeros.");
            }

        } while (!obj_pasajero.validarCedula());

        do {
            obj_pasajero.setNombre_Completo(obj_vista_pasajero.tomar_nombre());

            if (!obj_pasajero.validarNombre()) {
                obj_vista_pasajero.mostrarError("Error: El nombre no puede estar vacio.");
            }

        } while (!obj_pasajero.validarNombre());

        obj_api.guardar_pasajero(obj_pasajero);

        obj_vista_pasajero.mostrar_datos(
                obj_pasajero.getNum_Cedula(),
                obj_pasajero.getNombre_Completo());
    }
}
}