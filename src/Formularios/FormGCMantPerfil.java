package Formularios;

import AppPackage.AnimationClass;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormGCMantPerfil extends javax.swing.JFrame {
int mov = 0;
    public FormGCMantPerfil() {
        initComponents();
        txtIdPerfil.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabelActualizaPerf = new javax.swing.JLabel();
        jLabelGuardaPerf = new javax.swing.JLabel();
        jLabelEliminaPerf = new javax.swing.JLabel();
        txtNomPerfil = new javax.swing.JTextField();
        txtCostoPerfil = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerfil = new javax.swing.JTable();
        txtIdPerfil = new javax.swing.JTextField();
        btnActualizarPerfil = new javax.swing.JButton();
        btnGuardarPerfil = new javax.swing.JButton();
        btnEliminarPerfil = new javax.swing.JButton();
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
        jLabel6.setText("Mantenimiento de Perfil");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de Perfil:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Costo de Perfil:");

        jLabelActualizaPerf.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelActualizaPerf.setForeground(new java.awt.Color(0, 0, 153));
        jLabelActualizaPerf.setText("Actualizar");
        jLabelActualizaPerf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelGuardaPerf.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelGuardaPerf.setForeground(new java.awt.Color(0, 0, 153));
        jLabelGuardaPerf.setText("Guardar");
        jLabelGuardaPerf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelEliminaPerf.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelEliminaPerf.setForeground(new java.awt.Color(0, 0, 153));
        jLabelEliminaPerf.setText("Eliminar");
        jLabelEliminaPerf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNomPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPerfilActionPerformed(evt);
            }
        });

        txtCostoPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCostoPerfil.setToolTipText("");

        tblPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Perfil", "Nombre Perfil", "Costo Perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerfilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerfil);

        txtIdPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPerfilActionPerformed(evt);
            }
        });

        btnActualizarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPerfilActionPerformed(evt);
            }
        });

        btnGuardarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPerfilActionPerformed(evt);
            }
        });

        btnEliminarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCostoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarPerfil)
                    .addComponent(jLabelGuardaPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(btnActualizarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabelActualizaPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEliminaPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116))
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(68, 68, 68)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCostoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGuardarPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnActualizarPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelActualizaPerf)
                        .addComponent(jLabelGuardaPerf))
                    .addComponent(jLabelEliminaPerf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
        jLabelActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActividadMouseClicked(evt);
            }
        });
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
        btnSalir.setBounds(100, 610, 130, 50);

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

    private void txtNomPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomPerfilActionPerformed

    private void txtIdPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPerfilActionPerformed

    private void btnActualizarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPerfilActionPerformed
        
        int id = Integer.parseInt(txtIdPerfil.getText());
        
        String nombrePerfil = txtNomPerfil.getText();
        int costoPerfil = Integer.parseInt(txtCostoPerfil.getText());

        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE PerfilConsultor SET nombrePerfil=?, costoPerfil=? WHERE idPerfilConsultor=?");

            ps.setString(1, nombrePerfil);
            ps.setInt(2, costoPerfil);
            ps.setInt(3, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil Actualizado");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnActualizarPerfilActionPerformed

    private void btnGuardarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPerfilActionPerformed

        String nombrePerfil = txtNomPerfil.getText();
        int costoPerfil = Integer.parseInt(txtCostoPerfil.getText());

        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO PerfilConsultor (nombrePerfil, costoPerfil) VALUES (?,?)");

            ps.setString(1, nombrePerfil);
            ps.setInt(2, costoPerfil);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil guardado");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnGuardarPerfilActionPerformed

    private void tblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerfilMouseClicked

        try {
            int fila = tblPerfil.getSelectedRow();
            int id = Integer.parseInt(tblPerfil.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("SELECT nombrePerfil, costoPerfil FROM PerfilConsultor WHERE idPerfilConsultor=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                txtIdPerfil.setText(String.valueOf(id));
                txtNomPerfil.setText(rs.getString("nombrePerfil"));
                txtCostoPerfil.setText(rs.getString("costoPerfil"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_tblPerfilMouseClicked

    private void btnEliminarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPerfilActionPerformed
        
        int id = Integer.parseInt(txtIdPerfil.getText());
        
        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM PerfilConsultor WHERE idPerfilConsultor=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil Eliminado");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnEliminarPerfilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabelBusqueda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusqueda1MouseClicked
        this.setVisible(false);
        busqueda.setVisible(true);        
        
    }//GEN-LAST:event_jLabelBusqueda1MouseClicked

    private void jLabelEstimacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseClicked
        
        this.setVisible(false);
        estimac.setVisible(true);
        
        
    }//GEN-LAST:event_jLabelEstimacion1MouseClicked

    private void jLabelTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTareaMouseClicked
        this.setVisible(false);
        tarea.setVisible(true);
    }//GEN-LAST:event_jLabelTareaMouseClicked

    private void jLabelActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActividadMouseClicked
        this.setVisible(false);
        activ.setVisible(true);
    }//GEN-LAST:event_jLabelActividadMouseClicked
    public static FormGCEstimacion estimac = new FormGCEstimacion();
    public static FormGCReporte busqueda = new FormGCReporte();
    public static FormGCMantTarea tarea = new FormGCMantTarea();
    public static FormGCMantPerfil activ = new FormGCMantPerfil();
    
    
    
    public void limpiar() {
        txtIdPerfil.setText("");
        txtNomPerfil.setText("");
        txtCostoPerfil.setText("");
    }

    public void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblPerfil.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {15, 150, 50};
        for (int i = 0; i < tblPerfil.getColumnCount(); i++) {
            tblPerfil.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("SELECT idPerfilConsultor, nombrePerfil, costoPerfil FROM PerfilConsultor");

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
            java.util.logging.Logger.getLogger(FormGCMantPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGCMantPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGCMantPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGCMantPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGCMantPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPerfil;
    private javax.swing.JButton btnEliminarPerfil;
    private javax.swing.JButton btnGuardarPerfil;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelActualizaPerf;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelEliminaPerf;
    private javax.swing.JLabel jLabelEstimacion1;
    private javax.swing.JLabel jLabelGuardaPerf;
    private javax.swing.JLabel jLabelMantenimiento;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelTarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPerfil;
    private javax.swing.JTextField txtCostoPerfil;
    private javax.swing.JTextField txtIdPerfil;
    private javax.swing.JTextField txtNomPerfil;
    // End of variables declaration//GEN-END:variables
}
