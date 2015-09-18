/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Cargo;
import bean.Empleado;
import bean.ProductoServicio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.Iterator;

/**
 *
 * @author Vladimir
 */
public class EmpleadoRegistrar extends javax.swing.JFrame {
    private char ch;
    private final  TextAutoCompleter textAutoCompleter;
    /**
     * Creates new form EmpleadoRegistrar
     */
    public EmpleadoRegistrar() {
        initComponents();
        this.textAutoCompleter = new TextAutoCompleter(tf_jefe);
        //infijo
        this.textAutoCompleter.setMode(0);
        inicializarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        proyectoPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        cargoQuery = java.beans.Beans.isDesignTime() ? null : proyectoPUEntityManager.createQuery("SELECT c FROM Cargo c");
        cargoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cargoQuery.getResultList();
        cargoListRenderizar1 = new renderizar.CargoListRenderizar();
        panel_registrarEmpleado = new javax.swing.JPanel();
        lbl_registrarEmpleado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_cargo = new javax.swing.JComboBox();
        jc_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tf_jefe = new javax.swing.JTextField();
        lbl_nombreJefe = new javax.swing.JLabel();
        lbl_apellidoJefe = new javax.swing.JLabel();
        lbl_jefeNom = new javax.swing.JLabel();
        lbl_apeJefe = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        cargoListRenderizar1.setText("cargoListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel_registrarEmpleado.setBackground(new java.awt.Color(0, 153, 255));
        panel_registrarEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarEmpleado.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        lbl_registrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarEmpleado.setText("Registrar Empleado");

        javax.swing.GroupLayout panel_registrarEmpleadoLayout = new javax.swing.GroupLayout(panel_registrarEmpleado);
        panel_registrarEmpleado.setLayout(panel_registrarEmpleadoLayout);
        panel_registrarEmpleadoLayout.setHorizontalGroup(
            panel_registrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registrarEmpleado)
                .addGap(139, 139, 139))
        );
        panel_registrarEmpleadoLayout.setVerticalGroup(
            panel_registrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        tf_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_apellidoActionPerformed(evt);
            }
        });
        tf_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_apellidoKeyTyped(evt);
            }
        });

        jLabel3.setText("Cédula");

        jLabel1.setText("Nombre:");

        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });
        tf_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cedulaFocusLost(evt);
            }
        });
        tf_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cedulaKeyTyped(evt);
            }
        });

        jLabel4.setText("Email:");

        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_emailKeyTyped(evt);
            }
        });

        jLabel5.setText("Dirección:");

        tf_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_direccionKeyTyped(evt);
            }
        });

        jLabel6.setText("Teléfono:");

        jLabel2.setText("Apellido:");

        tf_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telefonoKeyTyped(evt);
            }
        });

        jLabel9.setText("Cédula Jefe:");

        jLabel8.setText("Cargo:");

        cb_cargo.setRenderer(cargoListRenderizar1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cargoList, cb_cargo);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel7.setText("Nacimiento:");

        tf_jefe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_jefeFocusGained(evt);
            }
        });

        lbl_jefeNom.setText("Nombre:");

        lbl_apeJefe.setText("Apellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(tf_apellido)
                    .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(tf_direccion))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(lbl_jefeNom)
                                    .addComponent(jLabel8))
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb_cargo, 0, 192, Short.MAX_VALUE)
                                    .addComponent(lbl_apellidoJefe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_nombreJefe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jc_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_apeJefe)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_jefeNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jc_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_nombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_apeJefe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_apellidoJefe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_cancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_registrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_registrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        if ( !tf_nombre.getText().equals("")
                && !tf_apellido.getText().equals("")
                && !tf_cedula.getText().equals("")
                && !tf_email.getText().equals("")
                && !tf_direccion.getText().equals("")
                && !tf_telefono.getText().equals("")
                && !jc_fechaNacimiento.getDate().toString().equals("")
                ){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma el registro?");
            if(respuesta == JOptionPane.YES_OPTION){
                EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
                EntityManager ema = fact.createEntityManager();
                ema.getTransaction().begin();
                Cargo cargo = (Cargo)cb_cargo.getSelectedItem();
                Empleado empleado = new Empleado();
                empleado.setNombre(tf_nombre.getText());
                empleado.setApellido(tf_apellido.getText());
                empleado.setCedula(tf_cedula.getText());
                empleado.setEmail(tf_email.getText());
                empleado.setDireccion(tf_direccion.getText());
                empleado.setTelefono(Integer.parseInt(tf_telefono.getText()));
                empleado.setFechaNacimiento(jc_fechaNacimiento.getDate());
                empleado.setCodigoCargo(cargo);
                if (!tf_jefe.getText().equals("")){
                    empleado.setCodigoJefe(obtenerEmpleado(tf_jefe.getText()));
                }else{
                    empleado.setCodigoEmpleado(null);
                }
                ema.persist(empleado);
                ema.flush();

                //auditoria
                AuditoriaSistema as=new AuditoriaSistema();
                as.setAccion("Inserción");
                as.setTabla("Empleado");
                as.setAntes(empleado.toString());
                as.setDespues("No hay cambios");
                //trabajamos con la fecha
                Date fecha=new Date();
                DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                as.setFechaHora(formato.format(fecha));
                //as.setUsuario(LoginView.nombreUsuario);  
                as.setUsuario("Vladimir");
                ema.persist(as);
                ema.flush();
                ema.getTransaction().commit();
                ema.close();
                JOptionPane.showMessageDialog(null, "Creación Exitosa");
                this.dispose();
            }else if(respuesta == JOptionPane.YES_NO_OPTION){
                this.dispose();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, complete "
                    + "todos los datos requeridos");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_nombre.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
                ch=evt.getKeyChar();
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombreKeyTyped

    private void tf_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_apellidoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_apellidoActionPerformed

    private void tf_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apellidoKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_apellido.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }        ch=evt.getKeyChar();
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_apellidoKeyTyped

    private void tf_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_email.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }        
    }//GEN-LAST:event_tf_emailKeyTyped

    private void tf_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_direccionKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_direccion.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        
    }//GEN-LAST:event_tf_direccionKeyTyped

    private void tf_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cedulaKeyTyped
        // TODO add your handling code here:
        int limite=11;
        if(tf_cedula.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cedulaKeyTyped

    private void tf_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefonoKeyTyped
        // TODO add your handling code here:
        int limite=11;
        if(tf_telefono.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
                ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_telefonoKeyTyped

    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void tf_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cedulaFocusLost
        // TODO add your handling code here:
        if (obtenerEmpleado(tf_cedula.getText()) != null){
            JOptionPane.showMessageDialog(null, "¡El empleado ya existe!");
            tf_cedula.setText("");
            tf_cedula.requestFocus();
        }
    }//GEN-LAST:event_tf_cedulaFocusLost

    private void tf_jefeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_jefeFocusGained
        // TODO add your handling code here:
        try{
            Empleado emple = obtenerEmpleado(tf_jefe.getText());
            lbl_nombreJefe.setText(emple.getNombre());
            lbl_apellidoJefe.setText(emple.getApellido());
            lbl_jefeNom.setVisible(true);
            lbl_apeJefe.setVisible(true);
        }catch(NullPointerException e){
            System.out.println("sigue");
            lbl_nombreJefe.setText("");
            lbl_apellidoJefe.setText("");
            lbl_jefeNom.setVisible(false);
            lbl_apeJefe.setVisible(false);
        }
    }//GEN-LAST:event_tf_jefeFocusGained

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
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new EmpleadoRegistrar();
                frame.setTitle("Registrar Empleado");
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private java.util.List<bean.Cargo> cargoList;
    private renderizar.CargoListRenderizar cargoListRenderizar1;
    private javax.persistence.Query cargoQuery;
    private javax.swing.JComboBox cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static com.toedter.calendar.JDateChooser jc_fechaNacimiento;
    private javax.swing.JLabel lbl_apeJefe;
    private javax.swing.JLabel lbl_apellidoJefe;
    private javax.swing.JLabel lbl_jefeNom;
    private javax.swing.JLabel lbl_nombreJefe;
    private javax.swing.JLabel lbl_registrarEmpleado;
    private javax.swing.JPanel panel_registrarEmpleado;
    private javax.persistence.EntityManager proyectoPUEntityManager;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_jefe;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Empleado obtenerEmpleado(String cedula){
        Empleado empleado ;
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        ema.getTransaction().begin();
        Query query = ema.createNamedQuery("Empleado.findByCedula");
        query.setParameter("cedula", cedula);
        List<Empleado> emple = query.getResultList();
        try{
            empleado = emple.get(0);  
        }catch(ArrayIndexOutOfBoundsException e){
            empleado = null;
        }
        
        ema.close();
        return empleado;
    }
    private void inicializarLista(){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("Empleado.findAll");
        List<Empleado> pro = query.getResultList();
        Iterator <Empleado> it = pro.iterator();
        while (it.hasNext()){
            textAutoCompleter.addItem(it.next().getCedula());
            //textAutoCompleter.addItem(it.next().getNombre()+" "+it.next().getApellido() );
        }
        lbl_jefeNom.setVisible(false);
        lbl_apeJefe.setVisible(false);
        ema.close();
    }
}
