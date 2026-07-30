package Vista;

import java.util.Scanner;

public class Vista_Pasajero {

    Scanner leer = new Scanner(System.in);

    public String tomar_cedula() {
        System.out.print("Ingrese la cedula del pasajero: ");
        return leer.nextLine();
    }

    public String tomar_nombre() {
        System.out.print("Ingrese el nombre del pasajero: ");
        return leer.nextLine();
    }

    public void siguiente_pasajero() {
        System.out.println();
        System.out.println("Introduzca los datos del siguiente pasajero");
        System.out.println();
    }

    public void mostrar_datos(String cedula, String nombre) {

        System.out.println("\n===== DATOS DEL PASAJERO =====");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println();
    }

    public void mostrarError(String mensaje) {
    System.out.println(mensaje);
    }    
    
}