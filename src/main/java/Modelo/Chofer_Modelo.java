package Modelo;

public class Chofer_Modelo {

    // Inicializar variables
    public String nombre_chofer = "";
    String licencia_chofer = "";
    String cedula_chofer = "";

    // Constructor
    public Chofer_Modelo(String dato_nombre, String dato_licencia, String dato_cedula){
        this.nombre_chofer = dato_nombre;
        this.licencia_chofer = dato_licencia;
        this.cedula_chofer = dato_cedula;
    }

    // Getters
    public String getNombre_chofer() { return nombre_chofer; }
    public String getLicencia_chofer() { return licencia_chofer; }
    public String getCedula_chofer() { return cedula_chofer; }

    // Setters
    public void setNombre_chofer(String nombre_chofer) { this.nombre_chofer = nombre_chofer; }
    public void setLicencia_chofer(String licencia_chofer) { this.licencia_chofer = licencia_chofer; }
    public void setCedula_chofer(String cedula_chofer) { this.cedula_chofer = cedula_chofer; }
    
    // Metodos de responsabilidad 
    
    public boolean validarNombre() {
        return !nombre_chofer.trim().equals("");
    }

    public boolean validarCedula() {
        return cedula_chofer.trim().matches("\\d{8,10}");
    }

    public boolean validarLicencia() {
        return !licencia_chofer.trim().equals("");
    }
    
}