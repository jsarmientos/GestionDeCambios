
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
public class FormResEstimacion extends javax.swing.JFrame {

static ResultSet rs1=null;


    public FormResEstimacion() {
        initComponents();
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        MuestraResultEstimacion();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultEstimacion = new javax.swing.JTable();
        jLabelVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESULTADO DE ESTIMACIÓN DE COSTOS");

        jTableResultEstimacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableResultEstimacion);

        jLabelVolver.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabelVolver.setForeground(new java.awt.Color(0, 0, 153));
        jLabelVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btReturn.png"))); // NOI18N
        jLabelVolver.setText("VOLVER");
        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Visualizar Detalle");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabelVolver)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jLabelVolver)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabelVolverMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        
        detalleTareas.MuestraDetalleTareas();
        this.setVisible(false);
        detalleTareas.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_jLabel2MouseClicked
    public static FormDetalleTareas detalleTareas = new FormDetalleTareas();
    
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
            java.util.logging.Logger.getLogger(FormResEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormResEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormResEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormResEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormResEstimacion().setVisible(true);
            }
        });
    }
    
    //public static FormGCEstimacion GCEstimacion = new FormGCEstimacion();
    public void MuestraResultEstimacion(){
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTableResultEstimacion.getModel();
        modelo1.setRowCount(0);
        modelo1.setColumnIdentifiers(new Object[]{"Cod Estimacion","Razón Social","Fecha","Total Jornadas","Costo Medio","Costo Total","Usuario Ejecutor"});
    try {
        
        Statement sql = Conexion.ConexionBD.getConnection().createStatement();      
      
        String consulta1 = "SELECT e.idEstimacion, e.razonSocial, e.fecha, "
                    + "c.totalJornadas, c.costoMedio, c.totalCosto, u.usuario "
                    + "FROM Estimacion e inner join CostosTotales c on "
                    + "(c.idCostosTotales = e.idCostosTotales) "
                    + "inner join Usuarios u on (u.idUsuarios = e.idUsuarios) "
                    + "where e.idEstimacion="+FormGCEstimacion.codEstimacion+"";
        //JOptionPane.showMessageDialog(null,consulta);
       
        
        //JOptionPane.showMessageDialog(null,consulta);
        rs1 = sql.executeQuery(consulta1);
        
    } catch (SQLException ex) {
        Logger.getLogger(FormResEstimacion.class.getName()).log(Level.SEVERE, null, ex);
    }               
        try{
            while(rs1.next()){
                Vector v1 = new Vector();
                v1.add(rs1.getInt(1));
                v1.add(rs1.getString(2));
                v1.add(rs1.getString(3));//fecha
                v1.add(rs1.getDouble(4));
                v1.add(rs1.getDouble(5));
                v1.add(rs1.getDouble(6));
                v1.add(rs1.getString(7));
                modelo1.addRow(v1);
                jTableResultEstimacion.setModel(modelo1);
                
            }
        }catch (SQLException e){
        }
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultEstimacion;
    // End of variables declaration//GEN-END:variables
}
