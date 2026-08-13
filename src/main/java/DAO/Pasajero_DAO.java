package DAO;

import Conexion.Conexion;
import Modelo.Pasajero_Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pasajero_DAO {

    private Conexion conexion;

    public Pasajero_DAO() {
        this.conexion = new Conexion();
    }

    public void guardarPasajero(Pasajero_Modelo objPasajero) throws SQLException {

        Connection conn = this.conexion.hacerConexion();

        String sql = "INSERT INTO pasajero "
                + "(num_cedula, nombre_completo) "
                + "VALUES (?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, objPasajero.getNum_Cedula());
        ps.setString(2, objPasajero.getNombre_Completo());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}