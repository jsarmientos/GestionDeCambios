
package Formularios;
import AppPackage.AnimationClass;

public class FormGCReporte extends javax.swing.JFrame {
int mov = 0;
    public FormGCReporte() {
        initComponents();
        
        setSize(860, 700);
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTareas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        jLabelDescargaBusq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBusqueda = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelBusqueda1 = new javax.swing.JLabel();
        jLabelMantenimiento = new javax.swing.JLabel();
        jLabelActividad = new javax.swing.JLabel();
        jLabelTarea = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelEstimacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE CAMBIOS");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanelTareas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BÚSQUEDA DE REGISTROS");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Fecha Inicio:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Fin:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "todos", "administrator", "jmallqui", "evaldez", "dvera" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Usuario:");

        jLabelBuscar.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabelBuscar.setForeground(new java.awt.Color(0, 0, 204));
        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jLabelBuscar.setText("BUSCAR");
        jLabelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelDescargaBusq.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabelDescargaBusq.setForeground(new java.awt.Color(0, 0, 204));
        jLabelDescargaBusq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Descarga.png"))); // NOI18N
        jLabelDescargaBusq.setText("DESCARGAR");
        jLabelDescargaBusq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Total Jornadas", "Costo Medio", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBusqueda);

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTareasLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTareasLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTareasLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelBuscar)
                        .addGap(96, 96, 96)
                        .addComponent(jLabelDescargaBusq)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTareasLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscar)
                    .addComponent(jLabelDescargaBusq))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shutdown.png"))); // NOI18N
        jLabel4.setText("SALIR");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 610, 100, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresario.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 400, 200, 200);

        jLabelBusqueda1.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jLabelBusqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        jLabelBusqueda1.setText("REPORTE");
        jLabelBusqueda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabelMantenimiento.setBounds(10, 230, 200, 40);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
        
        //Mueve label de derecha a izquierda, de la posición 50 a -100
        //AnimationClass mantenimientoizq = new AnimationClass();        
        //mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelPerfil);
        //mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelTarea);
        //mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelActividad);
        
    }//GEN-LAST:event_jLabelMantenimientoMouseExited

    private void jLabelEstimacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseClicked
        
        this.setVisible(false);
        estima.setVisible(true);
    }//GEN-LAST:event_jLabelEstimacion1MouseClicked

    private void jLabelActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActividadMouseClicked
        
        this.setVisible(false);
        manActividad.setVisible(true);
        
    }//GEN-LAST:event_jLabelActividadMouseClicked

    private void jLabelPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPerfilMouseClicked
        
        this.setVisible(false);
        manPerfil.setVisible(true);
    }//GEN-LAST:event_jLabelPerfilMouseClicked

    private void jLabelTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTareaMouseClicked
        
        this.setVisible(false);
        manTarea.setVisible(true);
        
    }//GEN-LAST:event_jLabelTareaMouseClicked

    public static FormGCEstimacion estima = new FormGCEstimacion();    
    public static FormGCMantTarea manTarea = new FormGCMantTarea();
    public static FormGCMantActividad manActividad = new FormGCMantActividad();
    public static FormGCMantPerfil manPerfil = new FormGCMantPerfil();
    
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
            java.util.logging.Logger.getLogger(FormGCReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGCReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGCReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGCReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormGCReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelDescargaBusq;
    private javax.swing.JLabel jLabelEstimacion1;
    private javax.swing.JLabel jLabelMantenimiento;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelTarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBusqueda;
    // End of variables declaration//GEN-END:variables
}
