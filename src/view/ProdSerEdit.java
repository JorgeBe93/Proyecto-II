/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Articulo;
import bean.AuditoriaSistema;
import bean.ProductoServicio;
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
public class ProdSerEdit extends javax.swing.JFrame {
    private int resp;
    private char ch;
    private int fila;
    private ProductoServicio prodser;
    DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##"); 

    /**
     * Creates new form ProdSerEdit
     */
    public ProdSerEdit() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM ProductoServicio p");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_modificarPS = new javax.swing.JPanel();
        lbl_modificarPS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_codigoPS = new javax.swing.JTextField();
        lbl_codigoPS = new javax.swing.JLabel();
        lbl_nombrePS = new javax.swing.JLabel();
        tf_nombrePS = new javax.swing.JTextField();
        tf_costoPS = new javax.swing.JTextField();
        lbl_costoPS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        lbl_valor = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_modificarPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_modificarPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_modificarPS.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_modificarPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modificarPS.setText("Modificar  Servicio");

        javax.swing.GroupLayout panel_modificarPSLayout = new javax.swing.GroupLayout(panel_modificarPS);
        panel_modificarPS.setLayout(panel_modificarPSLayout);
        panel_modificarPSLayout.setHorizontalGroup(
            panel_modificarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarPSLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(lbl_modificarPS)
                .addGap(141, 141, 141))
        );
        panel_modificarPSLayout.setVerticalGroup(
            panel_modificarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarPSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_modificarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigoPS.setEditable(false);
        tf_codigoPS.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigoPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigoPS.setForeground(new java.awt.Color(255, 255, 255));

        lbl_codigoPS.setBackground(new java.awt.Color(0, 153, 255));
        lbl_codigoPS.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codigoPS.setText("Código:");

        lbl_nombrePS.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_nombrePS.setText("Nombre:");

        tf_nombrePS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombrePSFocusLost(evt);
            }
        });

        tf_costoPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_costoPSKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_costoPSKeyTyped(evt);
            }
        });

        lbl_costoPS.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_costoPS.setText("Costo (Gs.):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_costoPS)
                        .addGap(18, 18, 18)
                        .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombrePS)
                            .addComponent(lbl_codigoPS))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrePS, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoPS)
                    .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePS)
                    .addComponent(tf_nombrePS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costoPS)
                    .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
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
                .addComponent(btn_guardar)
                .addGap(42, 42, 42)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código P/S", "Nombre", "Costo", " " }));

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

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
        btn_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_buscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoPS}"));
        columnBinding.setColumnName("Codigo PS");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costo}"));
        columnBinding.setColumnName("Costo");
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
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(180);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_modificarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_modificarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String antes;
        String despues;
        int codigo;
          if(tf_codigoPS.getText().length()==0){
              JOptionPane.showMessageDialog(null,"Seleccione un servicio", "Error",JOptionPane.ERROR_MESSAGE);
                 return;
           }
        query=entityManager.createNamedQuery("ProductoServicio.findByNombre");
        query.setParameter("nombre", tf_nombrePS.getText().toLowerCase());
        List<ProductoServicio> ps=query.getResultList();
        if(ps.size()!=0){
            codigo=ps.get(0).getCodigoPS();
            if(Integer.parseInt(tf_codigoPS.getText())!=codigo){//pregunta si esta intentando cambiar por un nombre ya existente
                     tf_nombrePS.setText(null);
                     tf_nombrePS.requestFocus();
                     return;
             }
         }
        if(tf_nombrePS.getText().length()==0 || tf_costoPS.getText().length()==0){
                JOptionPane.showMessageDialog(null,"No se admiten campos con valores nulos", "Error",JOptionPane.ERROR_MESSAGE);
                 return;
        }else{
                 resp=  JOptionPane.showConfirmDialog(null,"Desea guardar los cambios?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
                 if (resp==JOptionPane.YES_OPTION){
                     query=entityManager.createNamedQuery("ProductoServicio.findByCodigoPS");
                     query.setParameter("codigoPS", Integer.parseInt(tf_codigoPS.getText()));
                     List<ProductoServicio> p=query.getResultList();
                     //antes de los cambios
                     antes=p.get(0).toString();
                     ProductoServicio pser= new ProductoServicio();
                     pser.setCodigoPS(Integer.parseInt(tf_codigoPS.getText()));
                     pser.setNombre(tf_nombrePS.getText());
                     pser.setCosto(desformatear(tf_costoPS.getText()));
               /*      CategoriaProdSer cps=(CategoriaProdSer) list_categoriaPS.getSelectedItem();
                     pser.setCodigoCategoria(cps);*/
                     entityManager.getTransaction().begin();
                     entityManager.merge(pser);
                     entityManager.flush();
                     despues=pser.toString();
                     //registramos los datos necesarios para la auditoria
                     AuditoriaSistema as=new AuditoriaSistema();
                     as.setAccion("Modificación");
                     as.setTabla("Producto/Servicio");
                     //trabajamos con la fecha
                     Date fecha=new Date();
                     DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                     as.setFechaHora(formato.format(fecha));    
                     as.setUsuario(LoginView.nombreUsuario);
                     as.setAntes(antes);
                     as.setDespues(despues);
                     entityManager.persist(as);
                     entityManager.getTransaction().commit();
                    // entityManager.close();
                     JOptionPane.showMessageDialog(null, "Modificación Exitosa");
                     list.remove(p.get(0));
                     list.add(pser);
                     resetear();
                 }else{
                         this.dispose();
                 }
         }
       
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tf_valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valorKeyPressed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Código P/S" || list_filtros.getSelectedItem()=="Costo"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
       
    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if (list_filtros.getSelectedItem()=="Código P/S"){
                query = entityManager.createNamedQuery("ProductoServicio.findByCodigoPS");
                query.setParameter("codigoPS", Integer.parseInt(tf_valor.getText()));
                List<ProductoServicio> ps = query.getResultList();
                if (ps.size()==0){
                    JOptionPane.showMessageDialog(null,"Código de Producto/Servicio inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
               list.addAll(ps);
            }
            /*   else if (list_filtros.getSelectedItem()=="Categoría P/S"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM producto_servicio p "
                    + "INNER JOIN categoria_prod_ser c "
                    + "on p.codigoCategoria = c.codigoCategoria "
                    + "WHERE c.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", ProductoServicio.class);
                List<ProductoServicio> ps = Query.getResultList();
                if (ps.size()==0){
                    JOptionPane.showMessageDialog(null," Categoría de P/S Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(ps);
            }*/
            else if (list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery( "SELECT * FROM producto_servicio p "
                    + "WHERE p.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", ProductoServicio.class);
                List<ProductoServicio> ps = query.getResultList();
                if (ps.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre de Producto/Servicio inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ps);
            }
            else if (list_filtros.getSelectedItem()=="Costo"){
                query = entityManager.createNativeQuery( "SELECT * FROM producto_servicio p "
                    + "WHERE p.costo>= "
                    +"'"+tf_valor.getText()+"'", ProductoServicio.class);
                List<ProductoServicio> ps = query.getResultList();
                if (ps.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Costo de Producto/Servicio inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ps);
            }

        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
        int codigo;
        fila=masterTable.getSelectedRow();
        codigo=(Integer)masterTable.getValueAt(fila, 0);
        query=entityManager.createNamedQuery("Articulo.findByCodigoArticulo");
        query.setParameter("codigoArticulo", codigo);
         List<Articulo> a=query.getResultList();
          if(a.size()>=1){
                     JOptionPane.showMessageDialog(null, "No puede modificar datos de los productos","Error",JOptionPane.ERROR_MESSAGE );
                        return;
           }
         obtenerProdSer(fila);
         inicializarProdSer();
    }//GEN-LAST:event_masterTableMouseClicked

    private void tf_costoPSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_costoPSKeyReleased
        // TODO add your handling code here:
         String valor;
        int numero;
        if(tf_costoPS.getText().length()!=0){
            valor=tf_costoPS.getText();
            numero=(desformatear(valor));
            tf_costoPS.setText(formateador(numero));
        }
         
    }//GEN-LAST:event_tf_costoPSKeyReleased

    private void tf_costoPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_costoPSKeyTyped
        // TODO add your handling code here:
        int limite=11;
        if(tf_costoPS.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_costoPSKeyTyped

    private void tf_nombrePSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombrePSFocusLost
        // TODO add your handling code here:
        int codigo;
        if(tf_nombrePS.getText().length()==0){
            tf_nombrePS.requestFocus();
            return;
        }
        query=entityManager.createNamedQuery("ProductoServicio.findByNombre");
        query.setParameter("nombre", tf_nombrePS.getText().toLowerCase());
        List<ProductoServicio> ps=query.getResultList();
        if(ps.size()!=0){
            codigo=ps.get(0).getCodigoPS();
            if(Integer.parseInt(tf_codigoPS.getText())!=codigo){//pregunta si esta intentando cambiar por un nombre ya existente
                    JOptionPane.showMessageDialog(null,"Ya existe un producto/servicio con el mismo nombre", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_nombrePS.setText(null);
                     tf_nombrePS.requestFocus();
             }
         }
    }//GEN-LAST:event_tf_nombrePSFocusLost
    private void obtenerProdSer(int fila) {
            query = entityManager.createNamedQuery("ProductoServicio.findByCodigoPS");
            query.setParameter("codigoPS", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
           
            try{
               prodser = (ProductoServicio)query.getSingleResult();
               System.out.println(prodser);
            }catch(javax.persistence.NoResultException e){
                System.out.println(prodser);
            }
      }
    private void inicializarProdSer(){
      tf_codigoPS.setText(Integer.toString(prodser.getCodigoPS()));
      tf_nombrePS.setText(prodser.getNombre());
      tf_costoPS.setText(formateador(prodser.getCosto()));
     }
       private void resetear(){
         tf_codigoPS.setText(null);
        tf_nombrePS.setText(null);
        tf_costoPS.setText(null);
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
            java.util.logging.Logger.getLogger(ProdSerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdSerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdSerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdSerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame= new ProdSerEdit();
                frame.setVisible(true);
                frame.setTitle("Modificar Servicio");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigoPS;
    private javax.swing.JLabel lbl_costoPS;
    private javax.swing.JLabel lbl_modificarPS;
    private javax.swing.JLabel lbl_nombrePS;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.ProductoServicio> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_modificarPS;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codigoPS;
    private javax.swing.JTextField tf_costoPS;
    private javax.swing.JTextField tf_nombrePS;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
