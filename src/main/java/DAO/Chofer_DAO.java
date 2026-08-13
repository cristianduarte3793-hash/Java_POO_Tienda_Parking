package DAO;

import Conexion.Conexion;
import Modelo.Chofer_Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Chofer_DAO {

    private Conexion conexion;

    public Chofer_DAO() {
        this.conexion = new Conexion();
    }

    public void guardarChofer(Chofer_Modelo objChofer) throws SQLException {

        Connection conn = this.conexion.hacerConexion();

        String sql = "INSERT INTO chofer "
                + "(cedula_chofer, nombre_chofer, licencia_chofer) "
                + "VALUES (?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, objChofer.getCedula_chofer());
        ps.setString(2, objChofer.getNombre_chofer());
        ps.setString(3, objChofer.getLicencia_chofer());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}