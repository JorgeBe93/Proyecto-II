/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import viewAdmSist.LoginView;
import bean.Actividad;
import bean.AuditoriaSistema;
import bean.Empleado;
import bean.Lugar;
import bean.SeguimientoActividad;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class RegistrarSeguimiento extends javax.swing.JFrame {
    private int resp;
    private char ch;
    private int fila;
    private int limite=11;
   // private final  TextAutoCompleter textAutoCompleter;
    Date fecha=new Date();
    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    /**
     * Creates new form RegistrarActividad
     */
    public RegistrarSeguimiento() {
        initComponents();
       // this.textAutoCompleter = new TextAutoCompleter(tf_codEmpleado);
        //infijo
       // this.textAutoCompleter.setMode(0);
       
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

        empleadoListRenderizar1 = new renderizar.EmpleadoListRenderizar();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        lugarListRenderizar1 = new renderizar.LugarListRenderizar();
        lugarQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Lugar l");
        lugarList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : lugarQuery.getResultList();
        actividadListRenderizar1 = new renderizar.ActividadListRenderizar();
        actividadQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Actividad a");
        actividadList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : actividadQuery.getResultList();
        jPanel3 = new javax.swing.JPanel();
        lbl_registrarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_empleado = new javax.swing.JTextField();
        lbl_lugar = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        tf_codEmpleado = new javax.swing.JTextField();
        lbl_codEmpleado = new javax.swing.JLabel();
        list_lugar = new javax.swing.JComboBox();
        list_descripcion = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        lugarListRenderizar1.setText("lugarListRenderizar1");

        actividadListRenderizar1.setText("actividadListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Registrar Seguimiento Actividad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbl_registrarC)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_empleado.setEditable(false);
        tf_empleado.setBackground(new java.awt.Color(0, 153, 255));
        tf_empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_empleado.setForeground(new java.awt.Color(255, 255, 255));

        lbl_lugar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_lugar.setText("Lugar de Actividad:");

        lbl_descripcion.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_descripcion.setText("Descripción:");

        tf_codEmpleado.setEditable(false);
        tf_codEmpleado.setBackground(new java.awt.Color(0, 153, 255));
        tf_codEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        tf_codEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyTyped(evt);
            }
        });

        lbl_codEmpleado.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codEmpleado.setText("Código Empleado:");

        list_lugar.setRenderer(lugarListRenderizar1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lugarList, list_lugar);
        bindingGroup.addBinding(jComboBoxBinding);

        list_descripcion.setRenderer(actividadListRenderizar1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, actividadList, list_descripcion);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_codEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_lugar)
                            .addComponent(lbl_descripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(list_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codEmpleado)
                    .addComponent(tf_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lugar)
                    .addComponent(list_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descripcion)
                    .addComponent(list_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado", "Cedula", "Nombre", "Apellido", "Cargo", "Jefe" }));
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                list_filtrosFocusGained(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_buscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado}"));
        columnBinding.setColumnName(" Empleado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
        columnBinding.setColumnName("Cedula");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellido}"));
        columnBinding.setColumnName("Apellido");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCargo.nombre}"));
        columnBinding.setColumnName("Cargo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefono}"));
        columnBinding.setColumnName("Telefono");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoJefe.codigoEmpleado}"));
        columnBinding.setColumnName("Codigo Jefe");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codEmpleadoKeyTyped
        // TODO add your handling code here:
         if(tf_codEmpleado.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
         ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
       
    }//GEN-LAST:event_tf_codEmpleadoKeyTyped

    private void tf_codEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codEmpleadoKeyPressed
        // TODO add your handling code here:
         int cod;
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             cod=Integer.parseInt(tf_codEmpleado.getText());
            query=entityManager.createNativeQuery("SELECT * FROM empleado WHERE codigoEmpleado="
            +cod, Empleado.class);
            List<Empleado> em=query.getResultList();
            if(em.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Código de Empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                 return;
            }
            tf_empleado.setText(em.get(0).getNombre()+" "+em.get(0).getApellido());
         }
        
    }//GEN-LAST:event_tf_codEmpleadoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if(tf_codEmpleado.getText().length()==0 ){
             JOptionPane.showMessageDialog(null,"Seleccione un empleado", "Error",JOptionPane.ERROR_MESSAGE);
                return;
        }
        resp=  JOptionPane.showConfirmDialog(null,"Desea Registrar una nuevo seguimiento de Actividad?", "Confirmar Registro",JOptionPane.YES_NO_OPTION );
        if (resp==JOptionPane.YES_OPTION){
                    SeguimientoActividad a=new SeguimientoActividad();
                    Empleado e=obtenerEmpleado();
                    a.setCodigoEmpleado(e);
                    Lugar l=(Lugar) list_lugar.getSelectedItem();
                    a.setLugar(l);
                    Actividad ac=(Actividad) list_descripcion.getSelectedItem();
                    a.setFechaHora(formato.format(fecha));
                    a.setActividad(ac);
                    entityManager.getTransaction().begin();
                    entityManager.persist(a);
                    entityManager.flush();
                     //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Inserción");
                    as.setTabla("Seguimiento de Actividad");
                    as.setFechaHora(formato.format(fecha));
                    as.setAntes(a.toString());
                    as.setDespues("No hay cambios");
                    as.setUsuario(LoginView.nombreUsuario);  
                    entityManager.persist(as);
                    entityManager.getTransaction().commit();
                    JOptionPane.showMessageDialog(null,"Creación exitosa", "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    resetear();
                    
        }else{
                 this.dispose();
        }
       
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        char ch;
        if (list_filtros.getSelectedItem()=="Jefe"
            || list_filtros.getSelectedItem()=="Empleado"
            || list_filtros.getSelectedItem()=="Cedula"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
         if (list_filtros.getSelectedItem()=="Nombre"
            || list_filtros.getSelectedItem()=="Apellido"
            || list_filtros.getSelectedItem()=="Cargo"){
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_list_filtrosFocusGained

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE nombre LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE apellido LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Apellido inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="Cedula"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE cedula LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Empleado"){
                query=entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
                query.setParameter("codigoEmpleado", Integer.parseInt(tf_valor.getText()));
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Cargo"){
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN cargo c "
                    + "on e.codigoCargo = c.codigoCargo "
                    + "WHERE c.nombre like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Jefe"){
                //query=entityManager.createNamedQuery("Empleado.findByCedula");
                //query.setParameter("cedula", tf_valor.getText());
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN empleado j "
                    + "on e.codigoJefe = j.codigoEmpleado "
                    + "WHERE j.cedula like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
        int codigo;
           fila=masterTable.getSelectedRow();
           codigo= (Integer)masterTable.getValueAt(fila, 0);
           tf_codEmpleado.setText(Integer.toString(codigo));
           tf_empleado.setText(masterTable.getValueAt(fila, 2)+" "+masterTable.getValueAt(fila, 3));
        
    }//GEN-LAST:event_masterTableMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new RegistrarSeguimiento(); 
               frame.setVisible(true);
               frame.setTitle("Registrar Seguimiento de Actividad");
               Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
               frame.setIconImage(icon);
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               frame.setLocationRelativeTo(null);
            }
        });
    }
  /*    private void inicializarLista(){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("Empleado.findAll");
        List<Empleado> e = query.getResultList();
        Iterator <Empleado> it = e.iterator();
        while (it.hasNext()){
            textAutoCompleter.addItem(it.next().getCodigoEmpleado());
        }
        
    }*/
       private Empleado obtenerEmpleado(){
        query = entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
        query.setParameter("codigoEmpleado", Integer.parseInt(tf_codEmpleado.getText()));
        List<Empleado> em = query.getResultList();
        Empleado emple = null;
        try{
            emple = em.get(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Algo pasó");
        }
        return emple;
    }
       private void resetear(){
           tf_codEmpleado.setText(null);
           tf_empleado.setText(null);
       
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bean.Actividad> actividadList;
    private renderizar.ActividadListRenderizar actividadListRenderizar1;
    private javax.persistence.Query actividadQuery;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private renderizar.EmpleadoListRenderizar empleadoListRenderizar1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codEmpleado;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_lugar;
    private javax.swing.JLabel lbl_registrarC;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.Empleado> list;
    private javax.swing.JComboBox list_descripcion;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JComboBox list_lugar;
    private java.util.List<bean.Lugar> lugarList;
    private renderizar.LugarListRenderizar lugarListRenderizar1;
    private javax.persistence.Query lugarQuery;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codEmpleado;
    private javax.swing.JTextField tf_empleado;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
