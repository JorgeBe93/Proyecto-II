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
public class ProdSerEliminar extends javax.swing.JFrame {
    private int resp;
    private int fila;
    private ProductoServicio prodser;
    private  char ch;
    DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##"); 
    

    /**
     * Creates new form ProdSerEliminar
     */
    public ProdSerEliminar() {
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
        panel_eliminarPS = new javax.swing.JPanel();
        lbl_eliminarPS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_codigoPS = new javax.swing.JTextField();
        lbl_codigoPS1 = new javax.swing.JLabel();
        lbl_nombrePS1 = new javax.swing.JLabel();
        tf_nombrePS = new javax.swing.JTextField();
        tf_costoPS = new javax.swing.JTextField();
        lbl_costoPS1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        lbl_valor = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminarPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_eliminarPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_eliminarPS.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_eliminarPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarPS.setText("Eliminar Servicio");

        javax.swing.GroupLayout panel_eliminarPSLayout = new javax.swing.GroupLayout(panel_eliminarPS);
        panel_eliminarPS.setLayout(panel_eliminarPSLayout);
        panel_eliminarPSLayout.setHorizontalGroup(
            panel_eliminarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarPSLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lbl_eliminarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_eliminarPSLayout.setVerticalGroup(
            panel_eliminarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarPSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigoPS.setEditable(false);
        tf_codigoPS.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigoPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigoPS.setForeground(new java.awt.Color(255, 255, 255));

        lbl_codigoPS1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codigoPS1.setText("Código:");

        lbl_nombrePS1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_nombrePS1.setText("Nombre:");

        tf_nombrePS.setEditable(false);
        tf_nombrePS.setBackground(new java.awt.Color(0, 153, 255));
        tf_nombrePS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_nombrePS.setForeground(new java.awt.Color(255, 255, 255));

        tf_costoPS.setEditable(false);
        tf_costoPS.setBackground(new java.awt.Color(0, 153, 255));
        tf_costoPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_costoPS.setForeground(new java.awt.Color(255, 255, 255));

        lbl_costoPS1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_costoPS1.setText("Costo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_codigoPS1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombrePS1)
                            .addComponent(lbl_costoPS1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrePS, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoPS1)
                    .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePS1)
                    .addComponent(tf_nombrePS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costoPS1)
                    .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código P/S", "Nombre", "Costo", "Categoría P/S" }));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costo}"));
        columnBinding.setColumnName("Costo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(180);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_eliminarPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_eliminarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_costoPS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_costoPS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_costoPS1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
            int codigo;
            codigo=Integer.parseInt(tf_codigoPS.getText());
            String valor;
            Date fecha1=new Date();
            String fecha2;
            DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
            fecha2=formato1.format(fecha1);
            //verificamos que no se este intentando eliminar un producto o servicio que tiene consumo registrados para 
            //una reserva actual
           query=entityManager.createNativeQuery("SELECT * FROM producto_servicio ps "
                    + "INNER JOIN consumo_pro_ser c "
                    + "on ps.codigoPS = c.codigoPS "
                    +"INNER JOIN reserva r "
                    +"on c.codigoReserva=r.codigoReserva "
                    + "WHERE (r.checkIn<="
                    +"'"+fecha2+"' "
                    +"AND r.checkOut>="
                    +"'"+fecha2+"')"
                    +"AND ps.codigoPS="
                    +codigo, ProductoServicio.class);
            List<ProductoServicio> p=query.getResultList();
            if(!p.isEmpty()){
                JOptionPane.showMessageDialog(null, "Este Servicio tiene consumos registrados de reservas actuales, si elimina perderá dichos registros","Error",JOptionPane.INFORMATION_MESSAGE );
                
            }
                   resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
                  if(resp==JOptionPane.YES_OPTION){
                        entityManager.getTransaction().begin();
                        ProductoServicio ps=entityManager.find(ProductoServicio.class, Integer.parseInt(tf_codigoPS.getText()));
                        valor=ps.toString();
                        entityManager.remove(ps);
                        //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Eliminación");
                        as.setTabla("Producto/Servicio");
                        as.setAntes(valor);
                        as.setDespues("No hay cambios");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora((formato.format(fecha)));
                        as.setUsuario("nadie");
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                       // entityManager.close();
                        JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                        list.clear();
                        list.remove(ps);
                        resetear();
                  }else{
                         this.dispose();
                  }
            
           
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
                     JOptionPane.showMessageDialog(null, "No puede eliminar datos de productos","Error",JOptionPane.ERROR_MESSAGE );
                        return;
           }
         obtenerProdSer(fila);
         inicializarProdSer();
    }//GEN-LAST:event_masterTableMouseClicked
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
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame= new ProdSerEliminar();
                frame.setVisible(true);
                frame.setTitle("Eliminar Servicio");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigoPS1;
    private javax.swing.JLabel lbl_costoPS1;
    private javax.swing.JLabel lbl_eliminarPS;
    private javax.swing.JLabel lbl_nombrePS1;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.ProductoServicio> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_eliminarPS;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codigoPS;
    private javax.swing.JTextField tf_costoPS;
    private javax.swing.JTextField tf_nombrePS;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
