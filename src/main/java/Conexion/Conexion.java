package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String URL = "jdbc:mysql://localhost:3306/tiendaparking";
    private final String USUARIO = "root";
    private final String PASSWORD = "";

    public Connection hacerConexion() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USUARIO,
                PASSWORD
        );
    }
}