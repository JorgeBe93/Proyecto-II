/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Empleado;
import bean.Rol;
import bean.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
//import static view.EmpleadoEliminar.empleado;

/**
 *
 * @author Vladimir
 */
public class EliminarUsuario extends javax.swing.JFrame {
    private int cantidad;
    private char ch;
   // private RolesDialogParaUsuario ventana = new RolesDialogParaUsuario(this, true);
    private Empleado empleado;
    private Usuario usuario;
    private int fila = -1;
    private int codEmpleado;
    private Usuario usu;

    /**
     * Creates new form EditarUsuario
     */
    public EliminarUsuario() {
        initComponents();
        rolList.clear();
        rolTable.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        sacarEmpleadoLoggueado();
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        rolQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Rol r");
        rolList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(rolQuery.getResultList());
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(usuarioQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_idEmpleado = new javax.swing.JTextField();
        tf_nombreUsuario = new javax.swing.JTextField();
        tf_apellidoUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        panel_editarUsuario = new javax.swing.JPanel();
        lbl_editarUsuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        masterTableUsuario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rolTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jLabel1.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        tf_idEmpleado.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTableUsuario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigoEmpleado}"), tf_idEmpleado, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        tf_nombreUsuario.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTableUsuario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empleado.nombre}"), tf_nombreUsuario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        tf_apellidoUsuario.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTableUsuario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empleado.apellido}"), tf_apellidoUsuario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Datos del Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_apellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_apellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excluded.png"))); // NOI18N
        btn_cancelar.setText("Salir");
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
                .addGap(25, 25, 25)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(34, 34, 34))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cancelar, btn_eliminar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_cancelar, btn_eliminar});

        panel_editarUsuario.setBackground(new java.awt.Color(0, 153, 255));
        panel_editarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_editarUsuario.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_editarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editarUsuario.setText("Eliminar Usuario");

        javax.swing.GroupLayout panel_editarUsuarioLayout = new javax.swing.GroupLayout(panel_editarUsuario);
        panel_editarUsuario.setLayout(panel_editarUsuarioLayout);
        panel_editarUsuarioLayout.setHorizontalGroup(
            panel_editarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editarUsuarioLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(lbl_editarUsuario)
                .addGap(138, 138, 138))
        );
        panel_editarUsuarioLayout.setVerticalGroup(
            panel_editarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_editarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuarioList, masterTableUsuario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empleado.nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empleado.apellido}"));
        columnBinding.setColumnName("Apellido");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(masterTableUsuario);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nombre", "Apellido" }));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("Valor:");

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_valorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, rolList, rolTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRol}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(rolTable);
        if (rolTable.getColumnModel().getColumnCount() > 0) {
            rolTable.getColumnModel().getColumn(0).setMinWidth(60);
            rolTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            rolTable.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(panel_editarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel_editarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
                // TODO add your handling code here:
                String antes;
                String despues;
            int resp = JOptionPane.showConfirmDialog(null,"¿Desea guardar los cambios?", "Confirmar Modificación",JOptionPane.YES_NO_OPTION );
           /* if ( LoginView.idUsuario == Integer.parseInt(tf_idEmpleado.getText())){
                JOptionPane.showMessageDialog(null, "No puede eliminar su propia cuenta", "Error"
                , JOptionPane.ERROR_MESSAGE);
                
            }*/ 
            if (resp==JOptionPane.YES_OPTION && (fila != -1) && 
                    !tf_idEmpleado.getText().equals("")){
                    //int fila = masterTableUsuario.getSelectedRow();
                    //int codEmpleado = Integer.parseInt(masterTableUsuario.getValueAt(fila, 0).toString());
                    //empleado = obtenerEmpleado(codEmpleado);
                    entityManager.getTransaction().begin();
    /*                usuarioQuery = entityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
                    usuarioQuery.setParameter("codigoEmpleado", codEmpleado);
                    JOptionPane.showMessageDialog(null, codEmpleado + " a guardar");
                    usu = (Usuario)usuarioQuery.getSingleResult();      */
                    //Empleado empleadoFind = entityManager.find(Empleado.class, usu.getCodigoEmpleado());
                    //antes=empleadoFind.getUsuario().toString();
                    antes = usu.toString();
                    Usuario usuFind = entityManager.find(Usuario.class, usu.getCodigoEmpleado());
                    Empleado empleadoFind = usuFind.getEmpleado();
                    empleadoFind.setUsuario(null);
                    usuFind.setEmpleado(null);
                    entityManager.merge(empleadoFind);
                    entityManager.remove(entityManager.merge(usuFind));
                    entityManager.flush();
                    //suprimirUsuario(codEmpleado);
                    //empleado.setUsuario(null);
                    //entityManager.merge(empleado);
                    //entityManager.flush();
                    despues="Sin cambios";
                    //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Eliminación");
                    as.setTabla("Usuario");
                    //trabajamos con la fecha
                    Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora(formato.format(fecha));
                    as.setUsuario(LoginView.nombreUsuario);
                    as.setAntes(antes);
                    as.setDespues(despues);
                    entityManager.persist(as);
                    entityManager.getTransaction().commit();
                    //em.close();
                    JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                    usuarioList.remove(usu);
                    vaciarCampos();
                    
                    fila = -1;
                    empleado = null;
            }
            //this.dispose();
            
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        entityManager.close();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void masterTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableUsuarioMouseClicked
        // TODO add your handling code here:
        fila = masterTableUsuario.getSelectedRow();
        codEmpleado = Integer.parseInt(masterTableUsuario.getValueAt(fila, 0).toString());
        //JOptionPane.showMessageDialog(null, codEmpleado);
        rolQuery = entityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
        rolQuery.setParameter("codigoEmpleado", codEmpleado);
        usuario = (Usuario)rolQuery.getSingleResult();
        List<Rol> rolesDelUsuario = (List)usuario.getRolCollection();
        rolList.clear();
        rolList.addAll(rolesDelUsuario);
        
        
        empleado = obtenerEmpleado(codEmpleado);
        usuarioQuery = entityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
        usuarioQuery.setParameter("codigoEmpleado", codEmpleado);
        //JOptionPane.showMessageDialog(null, codEmpleado + " a guardar");
        usu = (Usuario)usuarioQuery.getSingleResult();
    }//GEN-LAST:event_masterTableUsuarioMouseClicked

    private void tf_valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valorKeyPressed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Código"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
        else{
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Código"){
                int id=Integer.parseInt(tf_valor.getText());
                usuarioQuery = entityManager.createNamedQuery( "Usuario.findByCodigoEmpleado");
                usuarioQuery.setParameter("codigoEmpleado",id);
                List<Usuario> r = usuarioQuery.getResultList();
                if (r.size()==0){
                    JOptionPane.showMessageDialog(null,"Identificación inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                usuarioList.clear();
                usuarioList.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Nombre"){
                //            id=Integer.parseInt(tf_valor.getText());
                usuarioQuery = entityManager.createNativeQuery( "SELECT * FROM usuario u "
                    + "INNER JOIN empleado e "
                    + "on u.codigoEmpleado = e.codigoEmpleado "
                    + "WHERE e.nombre like '%"
                    +tf_valor.getText()+ "%'", Usuario.class);
                List<Usuario> r = usuarioQuery.getResultList();

                if (r.size()==0){
                    JOptionPane.showMessageDialog(null,"No se encontró al usuario", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                usuarioList.clear();
                usuarioList.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
                usuarioQuery = entityManager.createNativeQuery( "SELECT * FROM usuario u "
                    + "INNER JOIN empleado e "
                    + "on u.codigoEmpleado = e.codigoEmpleado "
                    + "WHERE e.apellido like '%"
                    +tf_valor.getText()+ "%'", Usuario.class);
                List<Usuario> r = usuarioQuery.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Usuario inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                usuarioList.clear();
                usuarioList.addAll(r);
            }

        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame= new EliminarUsuario();
                frame.pack();
                frame.setTitle(args[0]);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_editarUsuario;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTableUsuario;
    private javax.swing.JPanel panel_editarUsuario;
    private java.util.List<bean.Rol> rolList;
    private javax.persistence.Query rolQuery;
    public static javax.swing.JTable rolTable;
    private javax.swing.JTextField tf_apellidoUsuario;
    public static javax.swing.JTextField tf_idEmpleado;
    private javax.swing.JTextField tf_nombreUsuario;
    private javax.swing.JTextField tf_valor;
    private java.util.List<bean.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
   /* private List<Rol> obtenerRolesAsignar(Collection<Rol> rolesDeUsuario, List<Rol> rolesSeleccionados){ 
        List<Rol> lista = new ArrayList<Rol>();
        for(Rol rolDeUsuario : rolesDeUsuario){
            for(Rol rolSeleccionado: rolesSeleccionados){
                if(rolDeUsuario.equals(rolSeleccionado)){
                    rolesSeleccionados.remove(rolSeleccionado);
                }
            }
        }
        rolesDeUsuario.addAll(rolesSeleccionados);
        lista.addAll(rolesDeUsuario);
        return lista;
    }   
    
    private List<Rol> generarLista(){
        List<Rol> lista = new ArrayList<Rol>();
        Rol rol ;
        for(int fila : rolTable.getSelectedRows()){
            rol = obtenerRol(Integer.parseInt(rolTable.getValueAt(fila, 0).toString()));
            
            lista.add(rol);
        }
        return lista;
    }*/
    
    /*private Rol obtenerRol(int idRol){
        rolQuery = entityManager.createNamedQuery("Rol.findByIdRol");
        rolQuery.setParameter("idRol", idRol);
        Rol rol = (Rol)rolQuery.getSingleResult();
        return rol;
    }*/
    /*private List<Rol> obtenerRolesUsuario(){
        List<Rol> lista = new ArrayList<Rol>();
        Rol rol;
        for(int fila : rolTable.getSelectedRows()){
            rol = obtenerRol(Integer.parseInt(rolTable.getValueAt(fila, 0).toString()));
            lista.add(rol);
        }
        return lista;
    }*/
    private void vaciarCampos(){
        tf_apellidoUsuario.setText(null);
        tf_nombreUsuario.setText(null);
        tf_idEmpleado.setText(null);
        rolList.clear();
    }
    private Empleado obtenerEmpleado(int codigoEmpleado){
        //EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        //EntityManager ema = fact.createEntityManager();
        System.out.println(codigoEmpleado);
        Query empleadoQuery = entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
        empleadoQuery.setParameter("codigoEmpleado", codigoEmpleado);
        Empleado empleado;
        empleado = (Empleado)empleadoQuery.getSingleResult();
        return empleado;
    }
    private void sacarEmpleadoLoggueado(){
        Usuario e;
        for (int i = 0; i < usuarioList.size(); i++ ){
            e = usuarioList.get(i);
            if(e.getCodigoEmpleado() == LoginView.idUsuario){
                usuarioList.remove(e);
            }
        }
    }
}
