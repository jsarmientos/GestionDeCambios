
package Formularios;
import Mantenimiento.ModeloActividad;
import Mantenimiento.Actividad;
import Mantenimiento.ModeloPerfil;
import Mantenimiento.Perfil;
import Conexion.ConexionBD;
import AppPackage.AnimationClass;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormGCMantTarea extends javax.swing.JFrame {
int mov = 0;
    public FormGCMantTarea() {
        
        initComponents();
        txtIdTarea.setVisible(false);
        llenarPerfil();
        llenarActividad();
        
        setSize(860, 700);
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        cargarTabla();
        //cboxPerfil.removeAllItems();
        
    }
    
    private void llenarPerfil() {
        
        ModeloPerfil modPerfil = new ModeloPerfil();
        ArrayList<Perfil> listaPerfils = modPerfil.getPerfil();
        
        cboxPerfil.removeAllItems();
        
        for (int i = 0; i < listaPerfils.size(); i++) {
            cboxPerfil.addItem(new Perfil(listaPerfils.get(i).getId(), listaPerfils.get(i).getNombre()));
            
        }
        
    }
    
    private void llenarActividad() {
        
        ModeloActividad modActividad = new ModeloActividad();
        ArrayList<Actividad> listaActividads = modActividad.getActividad();
        
        cboxActividad.removeAllItems();
        
        for (int i = 0; i < listaActividads.size(); i++) {
            cboxActividad.addItem(new Actividad(listaActividads.get(i).getId(), listaActividads.get(i).getNombre()));
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTareas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelActualizaTarea = new javax.swing.JLabel();
        jLabelGuardaTarea = new javax.swing.JLabel();
        jLabelEliminaTarea = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboxPerfil = new javax.swing.JComboBox<>();
        cboxActividad = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTarea = new javax.swing.JTable();
        btnGuardarTarea = new javax.swing.JButton();
        btnActualizarTarea = new javax.swing.JButton();
        btnEliminarTarea = new javax.swing.JButton();
        txtIdTarea = new javax.swing.JTextField();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE CAMBIOS");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanelTareas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mantenimiento de Tarea");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de Tarea:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Perfil:");

        jLabelActualizaTarea.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelActualizaTarea.setForeground(new java.awt.Color(0, 0, 153));
        jLabelActualizaTarea.setText("Actualizar");
        jLabelActualizaTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelGuardaTarea.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelGuardaTarea.setForeground(new java.awt.Color(0, 0, 153));
        jLabelGuardaTarea.setText("Guardar");
        jLabelGuardaTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelEliminaTarea.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabelEliminaTarea.setForeground(new java.awt.Color(0, 0, 153));
        jLabelEliminaTarea.setText("Eliminar");
        jLabelEliminaTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNombreTarea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTareaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Actividad:");

        cboxPerfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxPerfilItemStateChanged(evt);
            }
        });
        cboxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPerfilActionPerformed(evt);
            }
        });

        cboxActividad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxActividadItemStateChanged(evt);
            }
        });

        tblTarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idTarea", "nombreTarea", "PerfilConsultor", "Actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTareaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTarea);

        btnGuardarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTareaActionPerformed(evt);
            }
        });

        btnActualizarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTareaActionPerformed(evt);
            }
        });

        btnEliminarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaActionPerformed(evt);
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanelTareasLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(101, 101, 101)))
                            .addGroup(jPanelTareasLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(73, 73, 73)))
                        .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTareasLayout.createSequentialGroup()
                                .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboxActividad, javax.swing.GroupLayout.Alignment.LEADING, 0, 198, Short.MAX_VALUE)
                                .addComponent(cboxPerfil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                        .addComponent(btnGuardarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                        .addComponent(jLabelGuardaTarea)
                        .addGap(109, 109, 109)))
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelActualizaTarea))
                .addGap(95, 95, 95)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEliminaTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116))
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGuardaTarea)
                    .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEliminaTarea)
                        .addComponent(jLabelActualizaTarea)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEstimacion1MouseEntered(evt);
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

    private void txtNombreTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTareaActionPerformed

    private void cboxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPerfilActionPerformed

    }//GEN-LAST:event_cboxPerfilActionPerformed

    private void cboxPerfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxPerfilItemStateChanged
        
    }//GEN-LAST:event_cboxPerfilItemStateChanged

    private void btnGuardarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTareaActionPerformed
        
        String nombreTarea = txtNombreTarea.getText();
        
        int perfil = cboxPerfil.getItemAt(cboxPerfil.getSelectedIndex()).getId();
        
        int actividad = cboxActividad.getItemAt(cboxActividad.getSelectedIndex()).getId();
                        
        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Tarea (nombreTarea, idPerfilConsultor, idActividad) VALUES (?,?,?)");

            ps.setString(1, nombreTarea);
            ps.setInt(2, perfil);
            ps.setInt(3, actividad);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarea guardada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnGuardarTareaActionPerformed

    public void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblTarea.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("select idTarea, nombreTarea, nombrePerfil, nombreActividad from Tarea a \n"
                    + "inner join PerfilConsultor b on a.idPerfilConsultor = b.idPerfilConsultor\n"
                    + "inner join Actividad c on a.idActividad = c.idActividad");
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
    
    public void limpiar() {
        txtIdTarea.setText("");
        txtNombreTarea.setText("");
        
    }
    
    private void cboxActividadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxActividadItemStateChanged

    }//GEN-LAST:event_cboxActividadItemStateChanged

    private void btnActualizarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTareaActionPerformed
        
        int id = Integer.parseInt(txtIdTarea.getText());
        
        String nombreTarea = txtNombreTarea.getText();
        
        int perfil = cboxPerfil.getItemAt(cboxPerfil.getSelectedIndex()).getId();
        
        int actividad = cboxActividad.getItemAt(cboxActividad.getSelectedIndex()).getId();

        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE Tarea SET nombreTarea=?, idPerfilConsultor=?, idActividad=? WHERE idTarea=?");

            ps.setString(1, nombreTarea);
            ps.setInt(2, perfil);
            ps.setInt(3, actividad);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarea Actualizada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnActualizarTareaActionPerformed

    private void tblTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTareaMouseClicked
        
        try {
            int fila = tblTarea.getSelectedRow();
            int id = Integer.parseInt(tblTarea.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = ConexionBD.getConnection();
            ps = con.prepareStatement("SELECT nombreTarea, idPerfilConsultor, idActividad FROM Tarea WHERE idTarea=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                txtIdTarea.setText(String.valueOf(id));
                txtNombreTarea.setText(rs.getString("nombreTarea"));
                //cboxPerfil.getItemAt(cboxPerfil.getSelectedIndex()).getId();
                //cboxActividad.getItemAt(cboxActividad.getSelectedIndex()).getId();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_tblTareaMouseClicked

    private void btnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaActionPerformed
        
        int id = Integer.parseInt(txtIdTarea.getText());
        
        try {
            Connection con = ConexionBD.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Tarea WHERE idTarea=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarea Eliminada");
            limpiar();
            cargarTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnEliminarTareaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabelEstimacion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEstimacion1MouseEntered

    private void jLabelEstimacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseClicked
        this.setVisible(false);
        estim.setVisible(true);
    }//GEN-LAST:event_jLabelEstimacion1MouseClicked

    private void jLabelBusqueda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusqueda1MouseClicked
       this.setVisible(false);
       busq.setVisible(true);
        
    }//GEN-LAST:event_jLabelBusqueda1MouseClicked

    private void jLabelActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActividadMouseClicked
        this.setVisible(false);
        act.setVisible(true);
    }//GEN-LAST:event_jLabelActividadMouseClicked

    private void jLabelPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPerfilMouseClicked
        this.setVisible(false);
        perf.setVisible(true);
    }//GEN-LAST:event_jLabelPerfilMouseClicked
    
    public static FormGCEstimacion estim = new FormGCEstimacion();
    public static FormGCReporte busq = new FormGCReporte();
    public static FormGCMantPerfil perf = new FormGCMantPerfil();
    public static FormGCMantActividad act = new FormGCMantActividad();
    
    
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
            java.util.logging.Logger.getLogger(FormGCMantTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGCMantTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGCMantTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGCMantTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormGCMantTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTarea;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JButton btnGuardarTarea;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Actividad> cboxActividad;
    private javax.swing.JComboBox<Perfil> cboxPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelActualizaTarea;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelEliminaTarea;
    private javax.swing.JLabel jLabelEstimacion1;
    private javax.swing.JLabel jLabelGuardaTarea;
    private javax.swing.JLabel jLabelMantenimiento;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelTarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTarea;
    private javax.swing.JTextField txtIdTarea;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
