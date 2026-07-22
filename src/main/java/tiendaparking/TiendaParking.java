package TiendaParking;

import Controlador.General_Controller;
import Vista.Vista_Carro;
import Vista.Vista_Chofer;
import Vista.Vista_Motor;
import Vista.Vista_Pasajero;

public class TiendaParking {

    public static void main(String[] args) {

        Vista_Chofer obj_vista_chofer = new Vista_Chofer();
        Vista_Carro obj_vista_carro = new Vista_Carro();
        Vista_Motor obj_vista_motor = new Vista_Motor();
        Vista_Pasajero obj_vista_pasajero = new Vista_Pasajero();

        General_Controller obj_controlador = new General_Controller(
                obj_vista_chofer,
                obj_vista_carro,
                obj_vista_motor,
                obj_vista_pasajero);

        obj_controlador.procesar_chofer();
        obj_controlador.procesar_carro();
        obj_controlador.procesar_motor();
        obj_controlador.procesar_pasajero();

    }

}