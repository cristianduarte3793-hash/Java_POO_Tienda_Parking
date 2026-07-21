package Vista;

import java.util.Scanner;

public class Vista_Chofer {

    Scanner leer = new Scanner(System.in);

    public String tomar_nombre() {
        System.out.print("Ingrese el nombre del chofer: ");
        return leer.nextLine();
    }

    public String tomar_cedula() {
        System.out.print("Ingrese la cedula del chofer: ");
        return leer.nextLine();
    }

    public String tomar_licencia() {
        System.out.print("Ingrese la licencia del chofer: ");
        return leer.nextLine();
    }

    public void mostrar_datos(String nombre, String cedula, String licencia) {
        System.out.println("\n===== DATOS DEL CHOFER =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Licencia: " + licencia);
    }
}