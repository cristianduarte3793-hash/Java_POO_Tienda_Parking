package DAO;

import Conexion.Conexion;
import Modelo.Carro_Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Carro_DAO {

    private Conexion conexion;

    public Carro_DAO() {
        this.conexion = new Conexion();
    }

    public void guardarCarro(Carro_Modelo objCarro) throws SQLException {

        Connection conn = this.conexion.hacerConexion();

        String sql = "INSERT INTO carro "
                + "(placa_carro, marca_carro, color_carro) "
                + "VALUES (?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, objCarro.getPlaca_carro());
        ps.setString(2, objCarro.getMarca_carro());
        ps.setString(3, objCarro.getColor_carro());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}