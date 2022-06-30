
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection getConnection(){
        String conexionURL = "jdbc:sqlserver://127.0.0.1:1433;database="
                + "ProyGestionCambios;user=sa;password=123456;loginTimeout=30;";
        try{
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.toString());
            return null;
        }
    }
}
