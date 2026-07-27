package Modelo;

public class Motor_Modelo {

    // Inicializar variables
    public String numero_motor = "";
    String tipo_motor = "";
    String cilindraje_motor = "";

    // Constructor
    public Motor_Modelo(String dato_numero, String dato_tipo, String dato_cilindraje){
        this.numero_motor = dato_numero;
        this.tipo_motor = dato_tipo;
        this.cilindraje_motor = dato_cilindraje;
    }

    // Getters
    public String getNumero_motor() { return numero_motor; }
    public String getTipo_motor() { return tipo_motor; }
    public String getCilindraje_motor() { return cilindraje_motor; }

    // Setters
    public void setNumero_motor(String numero_motor) { this.numero_motor = numero_motor; }
    public void setTipo_motor(String tipo_motor) { this.tipo_motor = tipo_motor; }
    public void setCilindraje_motor(String cilindraje_motor) { this.cilindraje_motor = cilindraje_motor; }
    
    // Metodos de responsabilidad 
    
    public boolean validarMotor() {
    return !numero_motor.trim().equals("");
    }

    public boolean validarTipo() {
    return !tipo_motor.trim().equals("");
    }

    public boolean validarCilindraje() {
    return cilindraje_motor.matches("\\d+") && !cilindraje_motor.equals("");
    }
    
    
}