
package Modelo;

public class Pasajero_Modelo {
    
    // Inicializar variables
    public String num_cedula = "";
    String nombre_completo = "";
    
    // Constructor
    public Pasajero_Modelo(String dato_cedula, String dato_nombre){
        this.num_cedula = dato_cedula;
        this.nombre_completo = dato_nombre;
    }

    // Getters
    public String getNum_Cedula() { return num_cedula; }
    public String getNombre_Completo() { return nombre_completo; }

    // Setters
    public void setNum_Cedula(String num_cedula) { this.num_cedula = num_cedula; }
    public void setNombre_Completo(String nombre_completo) { this.nombre_completo = nombre_completo; }
    
    // Metodos de responsabilidad
    
    public boolean validarCedula() {
    return num_cedula != null && num_cedula.matches("\\d{8,10}");
    }

    public boolean validarNombre() {
    return !nombre_completo.trim().equals("");
    }
    
}
