/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import viewAdmSist.LoginView;
import bean.AuditoriaSistema;
import bean.Habitacion;
import bean.Reserva;
import java.awt.Image;
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
public class HabitacionEliminar extends javax.swing.JFrame {
    private int resp;
    Date fecha=new Date();
    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private int fila;
    private Habitacion habitacion;
    private char ch;

    /**
     * Creates new form HabitacionEliminar
     */
    public HabitacionEliminar() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Habitacion h");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_eliminarHabitacion = new javax.swing.JPanel();
        lbl_eliminarHabitacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_numeroHabit = new javax.swing.JLabel();
        tf_numeroHabit = new javax.swing.JTextField();
        lbl_categoria = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_categoria = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        lbl_valor = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminarHabitacion.setBackground(new java.awt.Color(0, 153, 255));
        panel_eliminarHabitacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_eliminarHabitacion.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_eliminarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarHabitacion.setText("Eliminar Habitación");

        javax.swing.GroupLayout panel_eliminarHabitacionLayout = new javax.swing.GroupLayout(panel_eliminarHabitacion);
        panel_eliminarHabitacion.setLayout(panel_eliminarHabitacionLayout);
        panel_eliminarHabitacionLayout.setHorizontalGroup(
            panel_eliminarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarHabitacionLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lbl_eliminarHabitacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_eliminarHabitacionLayout.setVerticalGroup(
            panel_eliminarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminarHabitacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_numeroHabit.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_numeroHabit.setText("Número de Habitación:");

        tf_numeroHabit.setEditable(false);
        tf_numeroHabit.setBackground(new java.awt.Color(0, 153, 255));
        tf_numeroHabit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_numeroHabit.setForeground(new java.awt.Color(255, 255, 255));
        tf_numeroHabit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_numeroHabitKeyTyped(evt);
            }
        });

        lbl_categoria.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_categoria.setText("Nombre de Categoría:");

        lbl_codigo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codigo.setText("Código de Categoría:");

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigo.setForeground(new java.awt.Color(255, 255, 255));

        tf_categoria.setEditable(false);
        tf_categoria.setBackground(new java.awt.Color(0, 153, 255));
        tf_categoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_categoria.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_numeroHabit)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(tf_numeroHabit, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_numeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_numeroHabit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número Habitación", "Código Categoría", "Nombre" }));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addContainerGap(33, Short.MAX_VALUE))
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
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numero}"));
        columnBinding.setColumnName("Numero");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCategoria.codigoCategoria}"));
        columnBinding.setColumnName("Codigo Categoria");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCategoria.nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
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
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_eliminarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_eliminarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_numeroHabitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numeroHabitKeyTyped

    }//GEN-LAST:event_tf_numeroHabitKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

            // TODO add your handling code here:
            String valor;
            int i;
            int n;
            Date fecha1=new Date();
            String fecha2;
            DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
            fecha2=formato1.format(fecha1);
            //para verificar que no se elimine una habitacion que tiene reservas asignadas
            if(tf_numeroHabit.getText().length()==0){
                 JOptionPane.showMessageDialog(null,"Seleccione una habitación", "Error",JOptionPane.ERROR_MESSAGE);
                 return; 
            }
            n=Integer.parseInt(tf_numeroHabit.getText());
            query = entityManager.createNativeQuery( "SELECT * FROM habitacion h "
                    + "INNER JOIN reserva r "
                    + "on h.numero = r.numHabitacion "
                    + "WHERE (r.checkIn>="
                    +"'"+fecha2+"'"
                    +"OR r.checkOut>="
                    +"'"+fecha2+"')"
                    +"AND h.numero="
                    +n, Habitacion.class);
            List<Habitacion> ha=query.getResultList();
            if(!ha.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Esta habitación tiene reservas asignadas, si elimima perderá dichas reservas","Aviso",JOptionPane.INFORMATION_MESSAGE );
            }    
                resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
                  if(resp==JOptionPane.YES_OPTION){
                    entityManager.getTransaction().begin();
                      //eliminamos las habitaciones que dependen de dicha reserva
                        query=entityManager.createNativeQuery("SELECT * FROM reserva WHERE "
                        + "numHabitacion= "
                        + "'"+tf_numeroHabit.getText()+"'",Reserva.class);
                        List<Reserva> r=query.getResultList();
                        if(r.size()>=1){
                            for(i=0;i<r.size();i++){
                                valor=r.get(i).toString();
                                entityManager.remove(r.get(i));
                                 registrarAuditoria("Reserva",valor);
                            }
                            entityManager.flush();
                         }
                //
                    Habitacion h=entityManager.find(Habitacion.class,Integer.parseInt(tf_numeroHabit.getText()) );
                    valor=h.toString();//guardamos el objeto antes de eliminar
                    entityManager.remove(h);
                    registrarAuditoria("Habitacion",valor);
                    entityManager.getTransaction().commit();
                   // entityManager.close();
                    JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                    resetear();
                    list.remove(h);
                }else{
                      this.dispose();
                 }             
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tf_valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valorKeyPressed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Número Habitación" || list_filtros.getSelectedItem()=="Código Categoría"){
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
        int id;
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if (list_filtros.getSelectedItem()=="Número Habitación"){
                query = entityManager.createNamedQuery("Habitacion.findByNumero");
                query.setParameter("numero", Integer.parseInt(tf_valor.getText()));
                List<Habitacion> h = query.getResultList();
                if (h.size()==0){
                    JOptionPane.showMessageDialog(null,"Número de habitación inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
               list.clear();
               list.addAll(h);
            }
            else if (list_filtros.getSelectedItem()=="Código Categoría"){
                id=Integer.parseInt(tf_valor.getText());
                query = entityManager.createNativeQuery( "SELECT * FROM habitacion h "
                    + "INNER JOIN categ_habitacion c "
                    + "on h.codigoCategoria = c.codigoCategoria "
                    + "WHERE c.codigoCategoria = "
                    +id, Habitacion.class);
                List<Habitacion> h = query.getResultList();
                if (h.size()==0){
                    JOptionPane.showMessageDialog(null,"Código Categoría Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(h);
            }
            else if (list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery( "SELECT * FROM habitacion h "
                    + "INNER JOIN categ_habitacion c "
                    + "on h.codigoCategoria = c.codigoCategoria "
                    + "WHERE c.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Habitacion.class);
                List<Habitacion> h = query.getResultList();
                if (h.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre de categoría inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(h);

            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
         fila=masterTable.getSelectedRow();
         obtenerHabitacion(fila);
         inicializarHabitacion();
    }//GEN-LAST:event_masterTableMouseClicked
    private void obtenerHabitacion(int fila) {
            query = entityManager.createNamedQuery("Habitacion.findByNumero");
            query.setParameter("numero", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
           
            try{
               habitacion = (Habitacion)query.getSingleResult();
               System.out.println(habitacion);
            }catch(javax.persistence.NoResultException e){
                System.out.println(habitacion);
            }
      }
    private void inicializarHabitacion(){
       tf_numeroHabit.setText(Integer.toString(habitacion.getNumero()));
       tf_codigo.setText(Integer.toString(habitacion.getCodigoCategoria().getCodigoCategoria()));
        tf_categoria.setText(habitacion.getCodigoCategoria().getNombre());
     }
       private void resetear(){
        tf_codigo.setText(null);
        tf_numeroHabit.setText(null);
        tf_categoria.setText(null);
    }
    private void registrarAuditoria(String entidad,String valor){
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Eliminación");
            as.setTabla(entidad);
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            as.setAntes(valor);
            as.setDespues("No hay modificaciones");
            entityManager.persist(as);
            entityManager.flush();
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
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new HabitacionEliminar();
                frame.setVisible(true);
                frame.setTitle("Eliminar Habitacion");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_eliminarHabitacion;
    private javax.swing.JLabel lbl_numeroHabit;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.Habitacion> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_eliminarHabitacion;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_numeroHabit;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
