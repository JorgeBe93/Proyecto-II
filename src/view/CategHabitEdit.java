/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.CategHabitacion;
import java.awt.Image;
import java.text.DateFormat;
import java.text.DecimalFormat;
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
public class CategHabitEdit extends javax.swing.JFrame {
    private char ch;
    private int resp;
    private int fila;
    private  CategHabitacion chab;
    DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");

    /**
     * Creates new form CategHabitEdt
     */
    public CategHabitEdit() {
        initComponents();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT ch FROM CategHabitacion ch");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_EditarCH = new javax.swing.JPanel();
        lbl_editarCH = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_codigo = new javax.swing.JTextField();
        lbl_costo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        tf_costo = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        panel_buscarCH = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_EditarCH.setBackground(new java.awt.Color(0, 153, 255));
        panel_EditarCH.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_editarCH.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        lbl_editarCH.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editarCH.setText("Editar Categoría de Habitación");

        javax.swing.GroupLayout panel_EditarCHLayout = new javax.swing.GroupLayout(panel_EditarCH);
        panel_EditarCH.setLayout(panel_EditarCHLayout);
        panel_EditarCHLayout.setHorizontalGroup(
            panel_EditarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EditarCHLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(lbl_editarCH)
                .addGap(84, 84, 84))
        );
        panel_EditarCHLayout.setVerticalGroup(
            panel_EditarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_editarCH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigo.setForeground(new java.awt.Color(255, 255, 255));

        lbl_costo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_costo.setText("Costo por noche (Gs):");

        lbl_nombre.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        tf_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_costoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_costoKeyTyped(evt);
            }
        });

        lbl_codigo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codigo.setText("Código de Categoría:");

        tf_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreFocusLost(evt);
            }
        });
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_costo)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_codigo))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costo)
                    .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        panel_buscarCH.setBackground(new java.awt.Color(204, 204, 204));
        panel_buscarCH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_buscarCH.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nombre", "Costo" }));

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

        javax.swing.GroupLayout panel_buscarCHLayout = new javax.swing.GroupLayout(panel_buscarCH);
        panel_buscarCH.setLayout(panel_buscarCHLayout);
        panel_buscarCHLayout.setHorizontalGroup(
            panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(21, 21, 21))
        );
        panel_buscarCHLayout.setVerticalGroup(
            panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCategoria}"));
        columnBinding.setColumnName("Codigo Categoria");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costoxnoche}"));
        columnBinding.setColumnName("Costoxnoche");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_EditarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panel_buscarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(85, 85, 85))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(176, 176, 176)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_EditarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_buscarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String antes;
        String despues;
        int codigo;
        //verifica nuevamente si esta intentando cambiar por un nombre ya existente
         query=entityManager.createNamedQuery("CategHabitacion.findByNombre");
         query.setParameter("nombre", tf_nombre.getText().toLowerCase());
         List<CategHabitacion> ch= query.getResultList();
         if(ch.size()!=0){
                 codigo=ch.get(0).getCodigoCategoria();
                 if(Integer.parseInt(tf_codigo.getText())!=codigo){//pregunta si esta intentando cambiar por un nombre ya existente
                        tf_nombre.setText(null);
                        tf_nombre.requestFocus();
                        return;
                  }
          }
         if (tf_nombre.getText().length()==0 || tf_costo.getText().length()==0){
                JOptionPane.showMessageDialog(null,"No se admiten campos con valores nulos", "Advertencia",JOptionPane.ERROR_MESSAGE);
                return;
             }else{
                        resp=  JOptionPane.showConfirmDialog(null,"Desea Guardar los cambios?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
                    if (resp==JOptionPane.YES_OPTION){
                        query=entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
                        query.setParameter("codigoCategoria",Integer.parseInt(tf_codigo.getText()));
                        List<CategHabitacion> c=query.getResultList();
                        antes=c.get(0).toString();
                        CategHabitacion ca=new CategHabitacion();
                        ca.setCodigoCategoria(Integer.parseInt(tf_codigo.getText()));
                        ca.setNombre(tf_nombre.getText());
                        ca.setCostoxnoche(desformatear(tf_costo.getText()));
                        entityManager.getTransaction().begin();
                        entityManager.merge(ca);
                        entityManager.flush();
                        //despues de los cambios
                        despues=ca.toString();
                        //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Modificación");
                        as.setTabla("Categoría de Habitación");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora(formato.format(fecha));    
                        as.setUsuario(LoginView.nombreUsuario);
                        as.setAntes(antes);
                        as.setDespues(despues);
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                        //entityManager.close();
                        JOptionPane.showMessageDialog(null, "Modificación Exitosa");
                        list.remove(c.get(0));
                        list.add(ca);
                        resetear();
                        
                    }else{
                            this.dispose();
                    }
                }
                
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreFocusLost
         int codigo;
        if(tf_nombre.getText().length()==0){
            tf_nombre.requestFocus();
            return;
        }
         query=entityManager.createNamedQuery("CategHabitacion.findByNombre");
                    query.setParameter("nombre", tf_nombre.getText().toLowerCase());
                    List<CategHabitacion> ch= query.getResultList();
                    if(ch.size()!=0){
                        codigo=ch.get(0).getCodigoCategoria();
                         if(Integer.parseInt(tf_codigo.getText())!=codigo){//pregunta si esta intentando cambiar por un nombre ya existente
                            JOptionPane.showMessageDialog(null,"Ya existe una categoría con el mismo nombre", "Error",JOptionPane.ERROR_MESSAGE);
                            tf_nombre.setText(null);
                            tf_nombre.requestFocus();
                         }
                    }
    }//GEN-LAST:event_tf_nombreFocusLost

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Código" || list_filtros.getSelectedItem()=="Costo"){
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
        int cod;
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if (list_filtros.getSelectedItem()=="Código"){
                cod=Integer.parseInt(tf_valor.getText());
                query=entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
                query.setParameter("codigoCategoria", cod);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
            if(list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery( "SELECT * FROM categ_habitacion WHERE nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", CategHabitacion.class);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Nombre de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
            if(list_filtros.getSelectedItem()=="Costo"){
                query = entityManager.createNativeQuery( "SELECT * FROM categ_habitacion WHERE costoxnoche>= "
                    +"'"+tf_valor.getText()+"'", CategHabitacion.class);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Precio de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
          fila=masterTable.getSelectedRow();
         obtenerCategoria(fila);
         inicializarCategoria();
    }//GEN-LAST:event_masterTableMouseClicked

    private void tf_costoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_costoKeyReleased
        // TODO add your handling code here:
        String valor;
        int numero;
        if(tf_costo.getText().length()!=0){
            valor=tf_costo.getText();
            numero=(desformatear(valor));
            tf_costo.setText(formateador(numero));
        }
    }//GEN-LAST:event_tf_costoKeyReleased

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

    private void tf_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_costoKeyTyped
        // TODO add your handling code here:
         int limite=10;
         if(tf_costo.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_costoKeyTyped
    private void obtenerCategoria(int fila) {
            query = entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
            query.setParameter("codigoCategoria", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
           
            try{
               chab = (CategHabitacion)query.getSingleResult();
               System.out.println(chab);
            }catch(javax.persistence.NoResultException e){
                System.out.println(chab);
            }
      }
    private void inicializarCategoria(){
        tf_codigo.setText(Integer.toString(chab.getCodigoCategoria()));
        tf_nombre.setText(chab.getNombre());
        tf_costo.setText(formateador(chab.getCostoxnoche()));
     }
        private void resetear(){
        tf_nombre.setText(null);
        tf_costo.setText(null);
        tf_codigo.setText(null);
    }
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
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CategHabitEdit();
                frame.setVisible(true);
                frame.setTitle("Editar Categoría de Habitación");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            }
        });
    }
     private String formateador(int num){
        String formateado;
        formateado=formatea.format(num);
        return formateado;
    }
    private int desformatear(String num){
        int numero;
        num=num.replace(".", "");
        numero=Integer.parseInt(num);
        return numero;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_editarCH;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.CategHabitacion> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_EditarCH;
    private javax.swing.JPanel panel_buscarCH;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
