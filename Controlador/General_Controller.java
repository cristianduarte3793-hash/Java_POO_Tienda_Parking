
package Controlador;

import Modelo.Chofer_Modelo;
import Vista.Vista_Chofer;

public class General_Controller {
    
    public Vista_Chofer obj_vista;
    public General_Controller(Vista_Chofer obj_vista) {
        this.obj_vista = obj_vista;
    }    
        public void procesar_datos() {
            
            String dato_nombre = this.obj_vista.tomar_nombre();
            String dato_cedula = this.obj_vista.tomar_cedula();
            String dato_licencia = this.obj_vista.tomar_licencia();
            
            Chofer_Modelo obj_chofer = new Chofer_Modelo(
            dato_nombre,
            dato_licencia,
            dato_cedula);
            
            obj_vista.mostrar_datos(
            obj_chofer.getNombre_chofer(),
            obj_chofer.getCedula_chofer(),
            obj_chofer.getLicencia_chofer()
);
                
        }
    
}
