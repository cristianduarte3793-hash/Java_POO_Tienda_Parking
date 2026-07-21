package TiendaParking;

import Controlador.General_Controller;
import Vista.Vista_Chofer;

public class TiendaParking {

    public static void main(String[] args) {

        Vista_Chofer obj_vista = new Vista_Chofer();
        General_Controller obj_controlador = new General_Controller(obj_vista);

        obj_controlador.procesar_datos();

    }

}