
package Formularios;
import ClasesPOO.*;
import AppPackage.AnimationClass;
import ClasesPOO.CostoEconomico;
import Formularios.FormLogin;
import Formularios.FormResEstimacion;
import Conexion.Querys;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class FormGCEstimacion extends javax.swing.JFrame {
    
    
    public String razonSocial="";
    public static int codEstimacion=0;
    public String tarea="";
    public String actividad="";
    public String perfil="";
    public double numJornadas;
    public double costoPerf;
    public double costoEconom;
    public double costoTotal;
    public double costoMedio;
    public double totalJornadas;
    public static int cont = -1;
    int mov = 0;
    public static double vectJornadas[] = new double[30];
    public static double vectCostoPerfil[] = new double[30];
    public static double vectCostoEcon[];
    Querys consulta = new Querys();
    
    public FormGCEstimacion() {
        initComponents();
        
        setSize(860, 700);
        //POSICIONA VENTANA EN CENTRO DE PANTALLA
        this.setLocationRelativeTo(null);
        
        jLabelBienvenidos.setVisible(true);
        
        //OCULTA CAMPOS
        jLabel10.setVisible(false);
        jLabelCodEstimacion.setVisible(false);
        jLabel6.setVisible(false);
        jLabel12.setVisible(false);
        jTextFieldRazonSocial.setVisible(false);
        jLabel2.setVisible(false);
        jComboBoxTarea.setVisible(false);
        jLabel3.setVisible(false);
        jComboBoxActividad.setVisible(false);
        jLabel7.setVisible(false);
        jLabelPerfilPorActividad.setVisible(false);
        jLabel9.setVisible(false);
        jTextFieldNroJornadas.setVisible(false);
        jLabelAddTarea.setVisible(false);
        jLabelLimpiar.setVisible(false);
        jLabelCancelar.setVisible(false);
        jLabelCalcular.setVisible(false);
        
        jLabelCodEstimacion.setText(String.valueOf(codEstimacion));
        
        //LLENA LISTA DE COMBO TAREA
        jComboBoxTarea.removeAllItems();
        jComboBoxTarea.setModel(consulta.LlenaComboTarea()); 
        
        
        
                
        
    }    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTareas = new javax.swing.JPanel();
        jLabelCancelar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxTarea = new javax.swing.JComboBox<>();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabelCodEstimacion = new javax.swing.JLabel();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelAddTarea = new javax.swing.JLabel();
        jLabelCalcular = new javax.swing.JLabel();
        jLabelPerfilPorActividad = new javax.swing.JLabel();
        jTextFieldNroJornadas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldRazonSocial = new javax.swing.JTextField();
        jLabelBienvenidos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelReporte1 = new javax.swing.JLabel();
        jLabelActividad = new javax.swing.JLabel();
        jLabelTarea = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelMantenimiento = new javax.swing.JLabel();
        jLabelEstimacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE CAMBIOS");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanelTareas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTareas.setLayout(null);

        jLabelCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCanela.png"))); // NOI18N
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseClicked(evt);
            }
        });
        jPanelTareas.add(jLabelCancelar);
        jLabelCancelar.setBounds(450, 390, 99, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Registrar los datos para las tareas a estimar:");
        jPanelTareas.add(jLabel6);
        jLabel6.setBounds(34, 58, 338, 19);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tarea:");
        jPanelTareas.add(jLabel2);
        jLabel2.setBounds(34, 198, 43, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Actividad:");
        jPanelTareas.add(jLabel3);
        jLabel3.setBounds(363, 198, 69, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Perfil Según Actividad:");
        jPanelTareas.add(jLabel7);
        jLabel7.setBounds(34, 267, 159, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Nro Jornadas:");
        jPanelTareas.add(jLabel9);
        jLabel9.setBounds(363, 267, 98, 17);

        jComboBoxTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTareaItemStateChanged(evt);
            }
        });
        jComboBoxTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTareaActionPerformed(evt);
            }
        });
        jPanelTareas.add(jComboBoxTarea);
        jComboBoxTarea.setBounds(82, 195, 161, 22);

        jComboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxActividad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxActividadItemStateChanged(evt);
            }
        });
        jPanelTareas.add(jComboBoxActividad);
        jComboBoxActividad.setBounds(473, 195, 110, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Cod. Estimación:");
        jPanelTareas.add(jLabel10);
        jLabel10.setBounds(430, 15, 91, 14);

        jLabelCodEstimacion.setText("00001");
        jPanelTareas.add(jLabelCodEstimacion);
        jLabelCodEstimacion.setBounds(539, 13, 35, 16);

        jLabelLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLimpia.png"))); // NOI18N
        jLabelLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLimpiarMouseClicked(evt);
            }
        });
        jPanelTareas.add(jLabelLimpiar);
        jLabelLimpiar.setBounds(270, 390, 85, 42);

        jLabelAddTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAgregarTar.png"))); // NOI18N
        jLabelAddTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddTareaMouseClicked(evt);
            }
        });
        jPanelTareas.add(jLabelAddTarea);
        jLabelAddTarea.setBounds(60, 390, 130, 40);

        jLabelCalcular.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabelCalcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btcalcular.png"))); // NOI18N
        jLabelCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalcularMouseClicked(evt);
            }
        });
        jPanelTareas.add(jLabelCalcular);
        jLabelCalcular.setBounds(250, 470, 130, 65);

        jLabelPerfilPorActividad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanelTareas.add(jLabelPerfilPorActividad);
        jLabelPerfilPorActividad.setBounds(205, 264, 140, 20);

        jTextFieldNroJornadas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNroJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNroJornadasActionPerformed(evt);
            }
        });
        jPanelTareas.add(jTextFieldNroJornadas);
        jTextFieldNroJornadas.setBounds(473, 264, 121, 23);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Razón Social:");
        jPanelTareas.add(jLabel12);
        jLabel12.setBounds(34, 120, 93, 17);
        jPanelTareas.add(jTextFieldRazonSocial);
        jTextFieldRazonSocial.setBounds(145, 117, 353, 22);

        jLabelBienvenidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bienvenidos.png"))); // NOI18N
        jPanelTareas.add(jLabelBienvenidos);
        jLabelBienvenidos.setBounds(0, 170, 610, 190);

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 100);

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

        jLabelReporte1.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jLabelReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        jLabelReporte1.setText("REPORTE");
        jLabelReporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReporte1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelReporte1);
        jLabelReporte1.setBounds(10, 340, 123, 30);

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
        /*AnimationClass mantenimientoizq = new AnimationClass();        
        mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelPerfil);
        mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelTarea);
        mantenimientoizq.jLabelXLeft(50, -100, 10, 5, jLabelActividad);
        */
        
        
    }//GEN-LAST:event_jLabelMantenimientoMouseExited

    private void jTextFieldNroJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNroJornadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNroJornadasActionPerformed

    private void jComboBoxTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTareaActionPerformed

    }//GEN-LAST:event_jComboBoxTareaActionPerformed

    private void jComboBoxTareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTareaItemStateChanged
        
        jLabelPerfilPorActividad.setText("");
        tarea = String.valueOf(jComboBoxTarea.getSelectedItem());
        
        if (!tarea.equals("Seleccionar")) {
            jComboBoxActividad.setModel(consulta.LlenaComboActividad(tarea));
            
        }else{
            jComboBoxActividad.removeAllItems();
        }
                
    }//GEN-LAST:event_jComboBoxTareaItemStateChanged

    private void jComboBoxActividadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxActividadItemStateChanged
        
        actividad = String.valueOf(jComboBoxActividad.getSelectedItem());
        
        jLabelPerfilPorActividad.setText(consulta.CompletaPerfil(tarea, actividad));
        
        perfil=jLabelPerfilPorActividad.getText();
        
    }//GEN-LAST:event_jComboBoxActividadItemStateChanged

    private void jLabelEstimacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstimacion1MouseClicked
        /*AnimationClass mantenimientodown = new AnimationClass();
        mantenimientodown.jLabelYDown(0, 500, 10, 5, jLabelFondoBlanco);*/
        
        consulta.InsertaEstimacionTemp();
        codEstimacion = consulta.ExtraeUltIdEstimacionTemp();        
        jLabelCodEstimacion.setText(String.valueOf(codEstimacion));
        
        jLabelBienvenidos.setVisible(false);
        jLabel10.setVisible(true);
        jLabelCodEstimacion.setVisible(true);
        jLabel6.setVisible(true);
        jLabel12.setVisible(true);
        jTextFieldRazonSocial.setVisible(true);
        jLabel2.setVisible(true);
        jComboBoxTarea.setVisible(true);
        jLabel3.setVisible(true);
        jComboBoxActividad.setVisible(true);
        jLabel7.setVisible(true);
        jLabelPerfilPorActividad.setVisible(true);
        jLabel9.setVisible(true);
        jTextFieldNroJornadas.setVisible(true);
        jLabelAddTarea.setVisible(true);
        jLabelLimpiar.setVisible(true);
        jLabelCancelar.setVisible(true);
        jLabelCalcular.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_jLabelEstimacion1MouseClicked

    private void jLabelAddTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddTareaMouseClicked
        cont=cont+1;
        razonSocial = jTextFieldRazonSocial.getText();
        numJornadas = Double.parseDouble(jTextFieldNroJornadas.getText());
        consulta.RegistrarTarea(tarea, actividad, perfil, numJornadas, codEstimacion);
        
        limpiaCamposEstimacion();
        costoPerf=consulta.costoPerfil(tarea, actividad, perfil);
        
        vectJornadas[cont]=numJornadas;
        vectCostoPerfil[cont]=costoPerf;
        
        
    }//GEN-LAST:event_jLabelAddTareaMouseClicked

    private void jLabelLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLimpiarMouseClicked
        limpiaCamposEstimacion();
        jTextFieldRazonSocial.setText("");
        
    }//GEN-LAST:event_jLabelLimpiarMouseClicked

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        
        consulta.CancelaRegistros(codEstimacion);
        
        limpiaCamposEstimacion();
        jTextFieldRazonSocial.setText("");
        
        
        
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void jLabelCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalcularMouseClicked
        int IdCostoRegistrado=0;        
        
        CostoEconomico costoE = new CostoEconomico(costoEconom, numJornadas);        
        CostoTotal costoT = new CostoTotal(costoTotal, costoEconom, numJornadas);        
        NumeroJornadas NroJorn = new NumeroJornadas(totalJornadas, numJornadas);
                
        costoEconom = costoE.calcCostoEconomico();
        costoTotal = costoT.calcCostoTotal();
        totalJornadas = NroJorn.calcTotalJornadas();
        
        if ((totalJornadas > costoTotal) || totalJornadas <= 0) {
            costoMedio = 0;            
        } else {            
            costoMedio = costoTotal/totalJornadas;            
        }        
        consulta.RegistrarCostosTotales(totalJornadas, costoTotal, costoMedio);
        IdCostoRegistrado=consulta.obtIdCostosTotales();        
        
        consulta.RegistrarEstimacion(razonSocial, IdCostoRegistrado, FormLogin.idUsuario, codEstimacion);
        
        resEstimacion.MuestraResultEstimacion();        
        resEstimacion.setVisible(true);
        
    }//GEN-LAST:event_jLabelCalcularMouseClicked

    private void jLabelPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPerfilMouseClicked

        this.setVisible(false);
        mantPerfil.setVisible(true);
        
        
    }//GEN-LAST:event_jLabelPerfilMouseClicked

    private void jLabelTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTareaMouseClicked
        
        this.setVisible(false);
        mantTarea.setVisible(true);
        
    }//GEN-LAST:event_jLabelTareaMouseClicked

    private void jLabelActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActividadMouseClicked
        
        this.setVisible(false);
        mantActividad.setVisible(true);
        
    }//GEN-LAST:event_jLabelActividadMouseClicked

    private void jLabelReporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReporte1MouseClicked
        
        this.setVisible(false);
        buscar.setVisible(true);
        
    }//GEN-LAST:event_jLabelReporte1MouseClicked
    
    public static FormGCReporte buscar = new FormGCReporte();
    public static FormGCMantTarea mantTarea = new FormGCMantTarea();
    public static FormGCMantActividad mantActividad = new FormGCMantActividad();
    public static FormGCMantPerfil mantPerfil = new FormGCMantPerfil();
    public static FormResEstimacion resEstimacion = new FormResEstimacion();
    
    
    public void limpiaCamposEstimacion(){
        
        
        
        //REINICIA LISTA DE COMBO TAREA
        jComboBoxTarea.removeAllItems();
        jComboBoxTarea.setModel(consulta.LlenaComboTarea());
        
        jTextFieldNroJornadas.setText("");
        
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
            java.util.logging.Logger.getLogger(FormGCEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGCEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGCEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGCEstimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGCEstimacion().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelAddTarea;
    private javax.swing.JLabel jLabelBienvenidos;
    private javax.swing.JLabel jLabelCalcular;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelCodEstimacion;
    private javax.swing.JLabel jLabelEstimacion1;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelMantenimiento;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfilPorActividad;
    private javax.swing.JLabel jLabelReporte1;
    private javax.swing.JLabel jLabelTarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JTextField jTextFieldNroJornadas;
    private javax.swing.JTextField jTextFieldRazonSocial;
    // End of variables declaration//GEN-END:variables
}
