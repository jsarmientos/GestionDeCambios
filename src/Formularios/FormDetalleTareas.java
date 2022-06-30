
package Formularios;
import Conexion.*;
import Formularios.FormGCEstimacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FormDetalleTareas extends javax.swing.JFrame {

static ResultSet rs2=null;

    public FormDetalleTareas() {
        initComponents();
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        
        MuestraDetalleTareas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalleTareas = new javax.swing.JTable();
        jLabelVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETALLE DE TAREAS REGISTRADAS");

        jTableDetalleTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableDetalleTareas);

        jLabelVolver.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabelVolver.setForeground(new java.awt.Color(0, 0, 153));
        jLabelVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btReturn.png"))); // NOI18N
        jLabelVolver.setText("VOLVER");
        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addComponent(jLabelVolver)
                .addContainerGap(553, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelVolver)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabelVolverMouseClicked

    private void jLabelVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelVolverMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDetalleTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDetalleTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDetalleTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDetalleTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDetalleTareas().setVisible(true);
            }
        });
    }
    
    //public static FormGCEstimacion GCEstimacion = new FormGCEstimacion();
    
    
    public void MuestraDetalleTareas(){
        
        DefaultTableModel modelo2 = (DefaultTableModel) jTableDetalleTareas.getModel();
        modelo2.setRowCount(0);
        modelo2.setColumnIdentifiers(new Object[]{"Cod Estimacion","Razón Social","Fecha","Nro Jornadas","Tarea","Actividad","Perfil","Costo x Perfil"});
    try {
        
        Statement sql = Conexion.ConexionBD.getConnection().createStatement();      
      
        String consulta2 = "Select e.idEstimacion, e.razonSocial, e.fecha, r.nroJornadas, "
                + "t.nombreTarea, a.nombreActividad, p.nombrePerfil, p.costoPerfil "
                + "from Estimacion e inner join RegistroTarea r on (r.idEstimacion = e.idEstimacion) "
                + "inner join Tarea t on (t.idTarea = r.idTarea) "
                + "inner join Actividad a on (a.idActividad = t.idActividad) "
                + "inner join PerfilConsultor p on (p.idPerfilConsultor = t.idPerfilConsultor) "
                + "where e.idEstimacion="+FormGCEstimacion.codEstimacion+"";
        //JOptionPane.showMessageDialog(null,consulta);
                
        rs2 = sql.executeQuery(consulta2);
        
    } catch (SQLException ex) {
        Logger.getLogger(FormDetalleTareas.class.getName()).log(Level.SEVERE, null, ex);
    }               
        try{
            while(rs2.next()){
                Vector v2 = new Vector();
                v2.add(rs2.getInt(1));
                v2.add(rs2.getString(2));
                v2.add(rs2.getString(3));//fecha
                v2.add(rs2.getDouble(4));
                v2.add(rs2.getString(5));
                v2.add(rs2.getString(6));
                v2.add(rs2.getString(7));
                v2.add(rs2.getDouble(8));
                modelo2.addRow(v2);
                jTableDetalleTareas.setModel(modelo2);
                
            }
        }catch (SQLException e){
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalleTareas;
    // End of variables declaration//GEN-END:variables
}
