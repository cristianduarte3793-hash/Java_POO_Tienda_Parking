package Vista;

import java.util.Scanner;

public class Vista_Carro {

    Scanner leer = new Scanner(System.in);

    public String tomar_placa() {
        System.out.print("Ingrese la placa del carro: ");
        return leer.nextLine();
    }

    public String tomar_marca() {
        System.out.print("Ingrese la marca del carro: ");
        return leer.nextLine();
    }

    public String tomar_color() {
        System.out.print("Ingrese el color del carro: ");
        return leer.nextLine();
    }
    
    public void siguiente_carro() {
        System.out.println();
        System.out.println("Introduzca los datos del siguiente carro");
        System.out.println();
    }

    public void mostrar_datos(String placa, String marca, String color) {

        System.out.println("\n===== DATOS DEL CARRO =====");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println();
    }
    
    public void mostrarError(String mensaje) {
    System.out.println(mensaje);
    }

}