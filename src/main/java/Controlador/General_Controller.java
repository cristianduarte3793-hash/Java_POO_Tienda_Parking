
package Controlador;

import Modelo.Carro_Modelo;
import Modelo.Chofer_Modelo;
import Modelo.Motor_Modelo;
import Modelo.Pasajero_Modelo;
import Vista.Vista_Chofer;
import Vista.Vista_Carro;
import Vista.Vista_Motor;
import Vista.Vista_Pasajero;

public class General_Controller {

    public Vista_Chofer obj_vista_chofer;
    public Vista_Carro obj_vista_carro;
    public Vista_Motor obj_vista_motor;
    public Vista_Pasajero obj_vista_pasajero;

    public General_Controller(
            Vista_Chofer obj_vista_chofer,
            Vista_Carro obj_vista_carro,
            Vista_Motor obj_vista_motor,
            Vista_Pasajero obj_vista_pasajero){

        this.obj_vista_chofer = obj_vista_chofer;
        this.obj_vista_carro = obj_vista_carro;
        this.obj_vista_motor = obj_vista_motor;
        this.obj_vista_pasajero = obj_vista_pasajero;

    }

    public void procesar_chofer(){

        String dato_nombre = obj_vista_chofer.tomar_nombre();
        String dato_cedula = obj_vista_chofer.tomar_cedula();
        String dato_licencia = obj_vista_chofer.tomar_licencia();

        Chofer_Modelo obj_chofer = new Chofer_Modelo(
                dato_nombre,
                dato_licencia,
                dato_cedula);

        obj_vista_chofer.mostrar_datos(
                obj_chofer.getNombre_chofer(),
                obj_chofer.getCedula_chofer(),
                obj_chofer.getLicencia_chofer());

    }

    public void procesar_carro(){

        String dato_placa = obj_vista_carro.tomar_placa();
        String dato_marca = obj_vista_carro.tomar_marca();
        String dato_color = obj_vista_carro.tomar_color();

        Carro_Modelo obj_carro = new Carro_Modelo(
                dato_placa,
                dato_marca,
                dato_color);

        obj_vista_carro.mostrar_datos(
                obj_carro.getPlaca_carro(),
                obj_carro.getMarca_carro(),
                obj_carro.getColor_carro());

    }

    public void procesar_motor(){

        String dato_numero = obj_vista_motor.tomar_numero();
        String dato_tipo = obj_vista_motor.tomar_tipo();
        String dato_cilindraje = obj_vista_motor.tomar_cilindraje();

        Motor_Modelo obj_motor = new Motor_Modelo(
                dato_numero,
                dato_tipo,
                dato_cilindraje);

        obj_vista_motor.mostrar_datos(
                obj_motor.getNumero_motor(),
                obj_motor.getTipo_motor(),
                obj_motor.getCilindraje_motor());

    }

    public void procesar_pasajero(){

        String dato_cedula = obj_vista_pasajero.tomar_cedula();
        String dato_nombre = obj_vista_pasajero.tomar_nombre();

        Pasajero_Modelo obj_pasajero = new Pasajero_Modelo(
                dato_cedula,
                dato_nombre);

        obj_vista_pasajero.mostrar_datos(
                obj_pasajero.getNum_Cedula(),
                obj_pasajero.getNombre_Completo());

    }

}