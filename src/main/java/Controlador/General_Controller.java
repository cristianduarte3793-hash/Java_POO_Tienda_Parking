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

        Chofer_Modelo obj_chofer = new Chofer_Modelo("", "", "");

        do {
            obj_chofer.setNombre_chofer(obj_vista_chofer.tomar_nombre());

            if (!obj_chofer.validarNombre()) {
                obj_vista_chofer.mostrarError("Error: El nombre no puede estar vacío.");
            }
        } while (!obj_chofer.validarNombre());

        do {
            obj_chofer.setCedula_chofer(obj_vista_chofer.tomar_cedula());

            if (!obj_chofer.validarCedula()) {
                obj_vista_chofer.mostrarError("Error: La cédula debe tener entre 8 y 10 números.");
            }

        } while (!obj_chofer.validarCedula());

        do {
            obj_chofer.setLicencia_chofer(obj_vista_chofer.tomar_licencia());

            if (!obj_chofer.validarLicencia()) {
                obj_vista_chofer.mostrarError("Error: La licencia no puede estar vacía.");
            }

        } while (!obj_chofer.validarLicencia());
        
        obj_api.guardar_chofer(obj_chofer);
        
        obj_vista_chofer.mostrar_datos(
                obj_chofer.getNombre_chofer(),
                obj_chofer.getCedula_chofer(),
                obj_chofer.getLicencia_chofer());
    }

    public void procesar_carro() {

        Carro_Modelo obj_carro = new Carro_Modelo("", "", "");

        do {
            obj_carro.setPlaca_carro(obj_vista_carro.tomar_placa());

            if (!obj_carro.validarPlaca()) {
                obj_vista_carro.mostrarError("Error: La placa debe tener mínimo 6 caracteres.");
            }
        } while (!obj_carro.validarPlaca());

        do {
            obj_carro.setMarca_carro(obj_vista_carro.tomar_marca());

            if (!obj_carro.validarMarca()) {
                obj_vista_carro.mostrarError("Error: La marca no puede estar vacía.");
            }

        } while (!obj_carro.validarMarca());

        do {
            obj_carro.setColor_carro(obj_vista_carro.tomar_color());

            if (!obj_carro.validarColor()) {
                obj_vista_carro.mostrarError("Error: El color no puede estar vacío.");
            }

        } while (!obj_carro.validarColor());

        obj_vista_carro.mostrar_datos(
                obj_carro.getPlaca_carro(),
                obj_carro.getMarca_carro(),
                obj_carro.getColor_carro());
    }

    public void procesar_motor() {

        Motor_Modelo obj_motor = new Motor_Modelo("", "", "");

        do {
            obj_motor.setNumero_motor(obj_vista_motor.tomar_numero());

            if (!obj_motor.validarMotor()) {
                obj_vista_motor.mostrarError("Error: El número del motor no puede estar vacío.");
            }

        } while (!obj_motor.validarMotor());

        do {
            obj_motor.setTipo_motor(obj_vista_motor.tomar_tipo());

            if (!obj_motor.validarTipo()) {
                obj_vista_motor.mostrarError("Error: El tipo del motor no puede estar vacío.");
            }

        } while (!obj_motor.validarTipo());

        do {
            obj_motor.setCilindraje_motor(obj_vista_motor.tomar_cilindraje());

            if (!obj_motor.validarCilindraje()) {
                obj_vista_motor.mostrarError("Error: El cilindraje solo debe contener números.");
            }

        } while (!obj_motor.validarCilindraje());

        obj_vista_motor.mostrar_datos(
                obj_motor.getNumero_motor(),
                obj_motor.getTipo_motor(),
                obj_motor.getCilindraje_motor());
    }

    public void procesar_pasajero() {

        Pasajero_Modelo obj_pasajero = new Pasajero_Modelo("", "");

        do {
            obj_pasajero.setNum_Cedula(obj_vista_pasajero.tomar_cedula());

            if (!obj_pasajero.validarCedula()) {
                obj_vista_pasajero.mostrarError("Error: La cédula debe tener entre 8 y 10 números.");
            }

        } while (!obj_pasajero.validarCedula());

        do {
            obj_pasajero.setNombre_Completo(obj_vista_pasajero.tomar_nombre());

            if (!obj_pasajero.validarNombre()) {
                obj_vista_pasajero.mostrarError("Error: El nombre no puede estar vacío.");
            }

        } while (!obj_pasajero.validarNombre());

        obj_api.guardar_pasajero(obj_pasajero);

        obj_vista_pasajero.mostrar_datos(
            obj_pasajero.getNum_Cedula(),
            obj_pasajero.getNombre_Completo());
    }
}