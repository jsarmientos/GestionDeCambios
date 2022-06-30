
package Formularios;
import Conexion.ConexionBD;
import AppPackage.AnimationClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormGCMantActividad extends javax.swing.JFrame {
int mov = 0;
    public FormGCMantActividad() {
        initComponents();
        txtIdActividad.setVisible(false);
        setSize(860, 700);
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        cargarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTareas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividad = new javax.swing.JTable();
        jLabelActualizaActiv = new javax.swing.JLabel();
        jLabelGuardaActiv = new javax.swing.JLabel();
        jLabelEliminaActiv = new javax.swing.JLabel();
        txtNomActividad = new javax.swing.JTextField();
        btnGuardarActividad = new javax.swing.JButton();
        btnActualizarActividad = new javax.swing.JButton();
        btnEliminarActividad = new javax.swing.JButton();
        txtIdActividad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelBusqueda1 = new javax.swing.JLabel();
        jLabelMantenimiento = new javax.swing.JLabel();
        jLabelActividad = new javax.swing.JLabel();
        jLabelTarea = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelEstimacion1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE CAMBIOS");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanelTareas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mantenimiento de Actividad");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de Actividad:");

        tblActividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Actividad", "Nombre Actividad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActividad.getTableHeader().setReorderingAllowed(false);
        tblActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividad);
        if (tblActividad.getColumnModel().getColumnCount() > 0) {
            tblActividad.getColumnModel().getColumn(0).setMinWidth(20);
            tblActividad.getColumnModel().getColumn(0).setMaxWidth(85);
            tblActividad.getColumnModel().getColumn(1).setMinWidth(50);
            tblActividad.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        jLabelActualizaActiv.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelActualizaActiv.setForeground(new java.awt.Color(0, 0, 153));
        jLabelActualizaActiv.setText("Actualizar");
        jLabelActualizaActiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelGuardaActiv.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelGuardaActiv.setForeground(new java.awt.Color(0, 0, 153));
        jLabelGuardaActiv.setText("Guardar");
        jLabelGuardaActiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelEliminaActiv.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelEliminaActiv.setForeground(new java.awt.Color(0, 0, 153));
        jLabelEliminaActiv.setText("Eliminar");
        jLabelEliminaActiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNomActividad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActividadActionPerformed(evt);
            }
        });

        btnGuardarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActividadActionPerformed(evt);
            }
        });

        btnActualizarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActividadActionPerformed(evt);
            }
        });

        btnEliminarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelGuardaActiv)))
                .addGap(99, 99, 99)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelActualizaActiv)
                    .addComponent(btnActualizarActividad))
                .addGap(103, 103, 103)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEliminaActiv)
                    .addComponent(btnEliminarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtIdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(68, 68, 68)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGuardaActiv)
                    .addComponent(jLabelActualizaActiv)
                    .addComponent(jLabelEliminaActiv))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTareas);
        jPanelTareas.setBounds(230, 100, 610, 580);

        jPanel1.setBackground(new java.awt.Color(26, 123, 231));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE GESTIÓN DE CAMBIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 853, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresario.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 400, 200, 200);

        jLabelBusqueda1.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jLabelBusqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        jLabelBusqueda1.setText("REPORTE");
        jLabelBusqueda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBusqueda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBusqueda1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBusqueda1);
        jLabelBusqueda1.setBounds(10, 340, 123, 30);

        jLabelMantenimiento.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jLabelMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Engranaje.png"))); // NOI18N
        jLabelMantenimiento.setText("MANTENIMIENTO");
        jLabelMantenimiento.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMantenimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelMantenimientoMouseDragged(evt);
            }
        });
        jLabelMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMantenimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMantenimientoMouseExited(evt);
            }
        });
        getContentPane().add(jLabelMantenimiento);
        jLabelMantenimiento.setBounds(10, 230, 200, 30);

        jLabelActividad.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabelActividad.setForeground(new java.awt.Color(0, 0, 153));
        jLabelActividad.setText("Actividades");
        jLabelActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabelActividad);
        jLabelActividad.setBounds(-100, 320, 100, 20);

        jLabelTarea.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabelTarea.setForeground(new java.awt.Color(0, 0, 153));
        jLabelTarea.setText("Tareas");
        jLabelTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTareaMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelTarea);
        jLabelTarea.setBounds(-100, 290, 56, 20);

        jLabelPerfil.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(0, 0, 153));
        jLabelPerfil.setText("Perfiles");
        jLabelPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPerfilMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelPerfil);
        jLabelPerfil.setBounds(-100, 260, 65, 20);

        jLabelEstimacion1.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jLabelEstimacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculo.png"))); // NOI18N
        jLabelEstimacion1.setText("ESTIMACIÓN");
        jLabelEstimacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEstimacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEstimacion1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelEstimacion1);
        jLabelEstimacion1.setBounds(10, 130, 155, 30);

        btnSalir.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shutdown.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(100, 600, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMantenimientoMouseClicked
        
        if (mov == 0) {
            mov = 1;
        }else mov = 0;
        
        if (mov == 1) {
            //Mueve label de izquierda a derecha, de la posición -100 a 50
        AnimationClass mantenimientoderec = new AnimationClass();        
        mantenimientoderec.jLabelXRight(-100, 50, 10, 5, jLabelPerfil);
        mantenimientoderec.jLabelXRight(-100, 50, 10, 5, jLabelTarea);
        mantenimientoderec.jLabelXRight(-100, 50, 10, 5, jLabelActividad);
        
        }else{
            if (mov == 0) {
                //Mueve label de derecha a izquierda, de la posición 50 a -100
                AnimationClass mantenimientoizq = new AnimationClass();        
                mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelPerfil);
                mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelTarea);
                mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelActividad);
            }
        }
        
        
    }//GEN-LAST:event_jLabelMantenimientoMouseClicked

    private void jLabelMantenimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMantenimientoMouseDragged
        
    }//GEN-LAST:event_jLabelMantenimientoMouseDragged

    private void jLabelMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMantenimientoMouseEntered
                
    }//GEN-LAST:event_jLabelMantenimientoMouseEntered

    private void jLabelMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMantenimientoMouseExited
        
        
        
    }//GEN-LAST:event_jLabelMantenimientoMouseExited

    private void txtNomActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActividadActionPerformed

    public void limpiar() {
        
        txtNomActividad.setText("");        
    }
    
        public void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblActividad.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("SELECT idActividad, nombreActividad FROM Actividad");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
    
    private void btnGuardarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActividadActionPerformed
        
        String nombreActividad = txtNomActividad.getText();

        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Actividad (nombreActividad) VALUES (?)");

            ps.setString(1, nombreActividad);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actividad guardada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnGuardarActividadActionPerformed

    private void btnActualizarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActividadActionPerformed
        
        int id = Integer.parseInt(txtIdActividad.getText());
        
        String nombreActividad = txtNomActividad.getText();

        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE Actividad SET nombreActividad=? WHERE idActividad=?");

            ps.setString(1, nombreActividad);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actividad Actualizada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnActualizarActividadActionPerformed

    private void btnEliminarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActividadActionPerformed
        
        int id = Integer.parseInt(txtIdActividad.getText());
        
        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Actividad WHERE idActividad=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actividad Eliminada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnEliminarActividadActionPerformed

    private void tblActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadMouseClicked
        
        try {
            int fila = tblActividad.getSelectedRow();
            int id = Integer.parseInt(tblActividad.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("SELECT nombreActividad FROM Actividad WHERE idActividad=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                txtIdActividad.setText(String.valueOf(id));
                txtNomActividad.setText(rs.getString("nombreActividad"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_tblActividadMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabelBusqueda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusqueda1MouseClicked
        this.setVisible(false);
        busca.setVisible(true);
    }//GEN-LAST:event_jLabelBusqueda1MouseClicked

    private void jLabelEstimacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseClicked
        this.setVisible(false);
        estimacion.setVisible(true);
    }//GEN-LAST:event_jLabelEstimacion1MouseClicked

    private void jLabelTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTareaMouseClicked
        this.setVisible(false);
        tarea.setVisible(true);
        
    }//GEN-LAST:event_jLabelTareaMouseClicked

    private void jLabelPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPerfilMouseClicked
        this.setVisible(false);
        perf.setVisible(true);
    }//GEN-LAST:event_jLabelPerfilMouseClicked

    public static FormGCReporte busca = new FormGCReporte();
    public static FormGCEstimacion estimacion = new FormGCEstimacion();
    public static FormGCMantTarea tarea = new FormGCMantTarea();
    public static FormGCMantPerfil perf = new FormGCMantPerfil();
    
    public static void main(String args[]) {
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormGCMantActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGCMantActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGCMantActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGCMantActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGCMantActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarActividad;
    private javax.swing.JButton btnEliminarActividad;
    private javax.swing.JButton btnGuardarActividad;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelActualizaActiv;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelEliminaActiv;
    private javax.swing.JLabel jLabelEstimacion1;
    private javax.swing.JLabel jLabelGuardaActiv;
    private javax.swing.JLabel jLabelMantenimiento;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelTarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActividad;
    private javax.swing.JTextField txtIdActividad;
    private javax.swing.JTextField txtNomActividad;
    // End of variables declaration//GEN-END:variables
}
