
package Mantenimiento;

import Mantenimiento.Actividad;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloActividad {
    
    public ArrayList<Actividad> getActividad() {
        
        Connection con = ConexionBD.getConnection();
        Statement stmt;
        ResultSet rs;
        
        ArrayList<Actividad> listaActividads = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from Actividad");
            
            while (rs.next()) {
                Actividad actividad = new Actividad();
                actividad.setId(rs.getInt("idActividad"));
                actividad.setNombre(rs.getString("nombreActividad"));
                listaActividads.add(actividad);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ModeloActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaActividads;
        
    }
    
}
