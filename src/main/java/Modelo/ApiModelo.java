package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ApiModelo {

    private String[][] lista_carros;
    private String[][] lista_motores;

    private List<Chofer_Modelo> lista_chofer;
    private List<Pasajero_Modelo> lista_pasajero;

    public ApiModelo() {

        this.lista_carros = new String[3][3];
        this.lista_motores = new String[3][3];

        this.lista_chofer = new ArrayList<>();
        this.lista_pasajero = new ArrayList<>();

    }

    public String[][] getLista_carros() {
        return lista_carros;
    }

    public void setLista_carros(String[][] lista_carros) {
        this.lista_carros = lista_carros;
    }

    public String[][] getLista_motores() {
        return lista_motores;
    }

    public void setLista_motores(String[][] lista_motores) {
        this.lista_motores = lista_motores;
    }

    public List<Chofer_Modelo> getLista_chofer() {
        return lista_chofer;
    }

    public void setLista_chofer(List<Chofer_Modelo> lista_chofer) {
        this.lista_chofer = lista_chofer;
    }

    public List<Pasajero_Modelo> getLista_pasajero() {
        return lista_pasajero;
    }

    public void setLista_pasajero(List<Pasajero_Modelo> lista_pasajero) {
        this.lista_pasajero = lista_pasajero;
    }

    public void guardar_chofer(Chofer_Modelo obj_chofer) {
        this.lista_chofer.add(obj_chofer);
    }

    public void guardar_pasajero(Pasajero_Modelo obj_pasajero) {
        this.lista_pasajero.add(obj_pasajero);
    }

    public void guardar_carros(String[][] carros) {

        for (int i = 0; i < this.lista_carros.length; i++) {

            for (int j = 0; j < this.lista_carros[i].length; j++) {

                this.lista_carros[i][j] = carros[i][j];

            }

        }

    }

    public void guardar_motores(String[][] motores) {

        for (int i = 0; i < this.lista_motores.length; i++) {

            for (int j = 0; j < this.lista_motores[i].length; j++) {

                this.lista_motores[i][j] = motores[i][j];

            }

        }

    }

    public Chofer_Modelo buscar_chofer(String cedula) {

        for (Chofer_Modelo obj_chofer : this.lista_chofer) {

            if (obj_chofer.getCedula_chofer().equals(cedula)) {
                return obj_chofer;
            }

        }

        return null;
    }

    public Pasajero_Modelo buscar_pasajero(String cedula) {

        for (Pasajero_Modelo obj_pasajero : this.lista_pasajero) {

            if (obj_pasajero.getNum_Cedula().equals(cedula)) {
                return obj_pasajero;
            }

        }

        return null;
    }

    public List<Chofer_Modelo> listar_choferes() {
        return this.lista_chofer;
    }

    public List<Pasajero_Modelo> listar_pasajeros() {
        return this.lista_pasajero;
    }
    
    public String[][] listar_carros() {
        return this.lista_carros;
}

    public String[][] listar_motores() {
        return this.lista_motores;
}

}