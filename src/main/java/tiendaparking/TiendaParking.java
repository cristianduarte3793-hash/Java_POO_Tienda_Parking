package tiendaparking;

import Controlador.General_Controller;
import Vista.Vista_Carro;
import Vista.Vista_Chofer;
import Vista.Vista_Motor;
import Vista.Vista_Pasajero;

public class TiendaParking {

    public static void main(String[] args) {

        Vista_Chofer vista_chofer = new Vista_Chofer();
        Vista_Carro vista_carro = new Vista_Carro();
        Vista_Motor vista_motor = new Vista_Motor();
        Vista_Pasajero vista_pasajero = new Vista_Pasajero();

        General_Controller controlador = new General_Controller(
                vista_chofer,
                vista_carro,
                vista_motor,
                vista_pasajero
        );

        controlador.procesar_chofer();
        controlador.procesar_carro();
        controlador.procesar_motor();
        controlador.procesar_pasajero();
    }
}