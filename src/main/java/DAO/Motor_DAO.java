package DAO;

import Conexion.Conexion;
import Modelo.Motor_Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motor_DAO {

    private Conexion conexion;

    public Motor_DAO() {
        this.conexion = new Conexion();
    }

    public void guardarMotor(Motor_Modelo objMotor) throws SQLException {

        Connection conn = this.conexion.hacerConexion();

        String sql = "INSERT INTO motor "
                + "(numero_motor, tipo_motor, cilindraje_motor) "
                + "VALUES (?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, objMotor.getNumero_motor());
        ps.setString(2, objMotor.getTipo_motor());
        ps.setString(3, objMotor.getCilindraje_motor());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}