
package Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Conexion.Querys;
import Formularios.FormResEstimacion;

public class Querys{
    
        
    public DefaultComboBoxModel LlenaComboTarea(){
        
            DefaultComboBoxModel tareas = new DefaultComboBoxModel();
            try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "Select distinct nombreTarea from Tarea";
            ResultSet resultado = sql.executeQuery(consulta);
            
            tareas.addElement("Seleccionar");
            while(resultado.next()){
                
                tareas.addElement(resultado.getString(1));
                
            }
            sql.close();
            resultado.close();
                       
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
            return tareas;
                    
    }
    

    public DefaultComboBoxModel LlenaComboActividad(String TareaSel){  
            DefaultComboBoxModel activ = new DefaultComboBoxModel();
            try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "select a.nombreActividad From Tarea t INNER JOIN "
                    + "Actividad a on (t.idActividad = a.idActividad) "
                    + "Where nombreTarea = '"+TareaSel+"'";
            ResultSet resultado = sql.executeQuery(consulta);
            
            activ.addElement("Seleccionar");
            while(resultado.next()){
                activ.addElement(resultado.getString(1));
            }
            sql.close();
            resultado.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
            return activ;
    }


    
    
    public String CompletaPerfil(String TareaSelec, String ActivSelec){
            String perfilObt = "";
            try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "declare @var1 varchar(25) set @var1 = (select "
                    + "idActividad from Actividad where nombreActividad ='"+ActivSelec+"') "
                    + "Select p.nombrePerfil From Tarea t "
                    + "INNER JOIN PerfilConsultor p on (t.idPerfilConsultor = p.idPerfilConsultor) "
                    + "INNER JOIN Actividad a on (t.idActividad = a.idActividad) "
                    + "Where nombreTarea = '"+TareaSelec+"' and a.idActividad = @var1";
                        
            ResultSet resultado = sql.executeQuery(consulta);
            resultado.next();//Utilizado solo cuando la query muestra un solo resultado
            perfilObt=resultado.getString(1);                
            sql.close();
            resultado.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return perfilObt;                               
    }
    
    public void InsertaEstimacionTemp(){
        
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "insert Estimacion (razonSocial,fecha,idCostosTotales,idUsuarios) values('temporal','01/01/2021',1,1)";
            
            //int count = sql.executeUpdate(consulta);
            sql.executeUpdate(consulta);
            sql.close(); 
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
    }
    
    public int ExtraeUltIdEstimacionTemp(){
        int IdEst=0;
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            
            String consulta = "select max(idEstimacion) from Estimacion";
            
            ResultSet resultado = sql.executeQuery(consulta);
            resultado.next();//Utilizado solo cuando la query muestra un solo resultado
            IdEst=Integer.parseInt(resultado.getString(1));
                
            sql.close();
            resultado.close();
                       
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        return IdEst;
    }
    
    
    public void RegistrarTarea(String tareaR, String actividadR, String perfilR, double nJornadasR, int codEstimR){   
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();            
            String consulta = "declare @var1 varchar(25) set @var1 = (select t.idTarea "
                    + "from Tarea t INNER JOIN PerfilConsultor p on (t.idPerfilConsultor = p.idPerfilConsultor) "
                    + "INNER JOIN Actividad a on (t.idActividad = a.idActividad) "
                    + "Where nombreTarea='"+tareaR+"' and nombreActividad='"+actividadR+"' and nombrePerfil='"+perfilR+"') "
                    + "insert RegistroTarea (nroJornadas,idEstimacion,idTarea) values("+nJornadasR+","+codEstimR+",@var1)";                           
            sql.executeUpdate(consulta);                
            sql.close();            
            JOptionPane.showMessageDialog(null, "Registro realizado exitosamente");            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    
    public void CancelaRegistros(int CodigoEstimacion){    
            
            try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "delete from RegistroTarea where idEstimacion="+CodigoEstimacion+";";
            sql.executeUpdate(consulta);
            sql.close();            
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }           
    }
    
    
    public double costoPerfil(String nomTarea, String Actividad, String PerfilCons){
        double costPerf=0;
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();            
            String consulta = "select p.costoPerfil from Tarea t inner join Actividad "
                    + "a on (a.idActividad = t.idActividad) inner join PerfilConsultor "
                    + "p on (p.idPerfilConsultor = t.idPerfilConsultor) "
                    + "where t.nombreTarea='Diseño Funcional' and a.nombreActividad='Análisis' "
                    + "and p.nombrePerfil='Técnico de Sistemas'";
            sql.executeQuery(consulta);
            ResultSet resultado = sql.executeQuery(consulta);
            resultado.next();//Utilizado solo cuando la query muestra un solo resultado
            costPerf=Double.parseDouble(resultado.getString(1));
            sql.close();
            resultado.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }        
        return costPerf;
    }
    
    
    public void RegistrarCostosTotales(double totalJorn, double totalCost, double costoMedio){
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();            
            String consulta = "insert CostosTotales(totalJornadas, totalCosto, "
                    + "costoMedio) values("+totalJorn+","+totalCost+","+costoMedio+")";            
            sql.executeUpdate(consulta);            
            sql.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    public int obtIdCostosTotales(){
        int IdCostTot=0;
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "select max(idCostosTotales) from CostosTotales";
            
            ResultSet resultado = sql.executeQuery(consulta);
            resultado.next();//Utilizado solo cuando la query muestra un solo resultado
            IdCostTot=Integer.parseInt(resultado.getString(1));
                
            sql.close();
            resultado.close();
                       
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        return IdCostTot;
    }
    
    public void RegistrarEstimacion(String razSoc, int idCostTot, int idUser, int idEstim){   
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();            
            String consulta = "update Estimacion set razonSocial='"+razSoc+"', "
                    + "fecha=GETDATE(),idCostosTotales="+idCostTot+","
                    + "idUsuarios="+idUser+" where idEstimacion="+idEstim+"";            
            sql.executeUpdate(consulta);            
            sql.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    
    public int Login(String user, String password){        
        int result=0;        
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();            
            String consulta = "select * from Usuarios where usuario='"+user+"' and clave='"+password+"'";
            ResultSet resultado = sql.executeQuery(consulta);              
            if (resultado.next()) {                
                result=1;                
            } else {                
                JOptionPane.showMessageDialog(null,"Usuario o password incorrectos");
                result=0;                
            }            
            sql.close();
            resultado.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return result;        
    }
    
    public int ExtraeIdUsuario(String user, String pwd){
        int idUsuario=0;
        
        try{
            Statement sql = Conexion.ConexionBD.getConnection().createStatement();
            
            String consulta = "select IdUsuarios from Usuarios where usuario='"+user+"' and clave='"+pwd+"'";
            ResultSet resultado = sql.executeQuery(consulta);
            resultado.next();//Utilizado solo cuando la query muestra un solo resultado
            idUsuario=Integer.parseInt(resultado.getString(1));
            
            
            sql.close();
            resultado.close();
                       
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
               
        return idUsuario;
    }
    
        
    
}
