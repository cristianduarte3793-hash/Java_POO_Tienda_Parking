package Modelo;

public class Carro_Modelo {

    // Inicializar variables
    public String placa_carro = "";
    String marca_carro = "";
    String color_carro = "";

    // Constructor
    public Carro_Modelo(String dato_placa, String dato_marca, String dato_color){
        this.placa_carro = dato_placa;
        this.marca_carro = dato_marca;
        this.color_carro = dato_color;
    }

    // Getters
    public String getPlaca_carro() { return placa_carro; }
    public String getMarca_carro() { return marca_carro; }
    public String getColor_carro() { return color_carro; }

    // Setters
    public void setPlaca_carro(String placa_carro) { this.placa_carro = placa_carro; }
    public void setMarca_carro(String marca_carro) { this.marca_carro = marca_carro; }
    public void setColor_carro(String color_carro) { this.color_carro = color_carro; }
    
    // Metodos de responsabilidad 
    
    public boolean validarPlaca() {
    return !placa_carro.equals("") && placa_carro.length() >= 6;
    }

    public boolean validarMarca() {
    return !marca_carro.equals("");
    }

    public boolean validarColor() {
    return !color_carro.equals("");
    }
    
}