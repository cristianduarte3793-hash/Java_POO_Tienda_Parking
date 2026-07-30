package Vista;

import java.util.Scanner;

public class Vista_Motor {

    Scanner leer = new Scanner(System.in);

    public String tomar_numero() {
        System.out.print("Ingrese el numero del motor: ");
        return leer.nextLine();
    }

    public String tomar_tipo() {
        System.out.print("Ingrese el tipo de motor: ");
        return leer.nextLine();
    }

    public String tomar_cilindraje() {
        System.out.print("Ingrese el cilindraje del motor: ");
        return leer.nextLine();
    }
    
    public void siguiente_motor() {
        System.out.println();
        System.out.println("Introduzca los datos del siguiente motor");
        System.out.println();
    }

    public void mostrar_datos(String numero, String tipo, String cilindraje) {

        System.out.println("\n===== DATOS DEL MOTOR =====");
        System.out.println("Numero: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println();
    }
    
    public void mostrarError(String mensaje) {
    System.out.println(mensaje);
    }

}