
package Mantenimiento;

import Mantenimiento.Perfil;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPerfil {
    
    public ArrayList<Perfil> getPerfil() {
        
        Connection con = ConexionBD.getConnection();
        Statement stmt;
        ResultSet rs;
        
        ArrayList<Perfil> listaPerfils = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from PerfilConsultor");
            
            while (rs.next()) {
                Perfil perfil = new Perfil();
                perfil.setId(rs.getInt("idPerfilConsultor"));
                perfil.setNombre(rs.getString("nombrePerfil"));
                listaPerfils.add(perfil);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaPerfils;
        
    }
    
}
