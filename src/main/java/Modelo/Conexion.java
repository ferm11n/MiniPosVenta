package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;

    public Connection getCon() {
        try{
            String myDB = "jdbc.mysql://localhost:3306/miniposventa?serverTimezone=UTC";
            con = DriverManager.getConnection(myDB, "root", "root");
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
