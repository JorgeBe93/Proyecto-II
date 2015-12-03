/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VerAuditoriaSistema.java
 *
 * Created on 28/07/2015, 03:54:46 PM
 */

package viewAdmSist;

import bean.AuditoriaSistema;
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
public class VerAuditoriaSistema extends javax.swing.JFrame {
    private char ch;
    private String opcion;

    /** Creates new form VerAuditoriaSistema */
    public VerAuditoriaSistema() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM AuditoriaSistema a");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        list_filtros = new javax.swing.JComboBox();
        lbl_filtro = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panel_auditoria = new javax.swing.JPanel();
        lbl_auditoria = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Auditoría de Sistema");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entidad", "Acción", "Usuario", "Fecha" }));
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                list_filtrosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                list_filtrosFocusLost(evt);
            }
        });

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

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

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_filtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_filtro))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoAuditoria}"));
        columnBinding.setColumnName("Auditoria");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario}"));
        columnBinding.setColumnName("Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaHora}"));
        columnBinding.setColumnName("Fecha Hora");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${accion}"));
        columnBinding.setColumnName("Accion");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tabla}"));
        columnBinding.setColumnName("Tabla");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${antes}"));
        columnBinding.setColumnName("Antes");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${despues}"));
        columnBinding.setColumnName("Despues");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        panel_auditoria.setBackground(new java.awt.Color(0, 153, 255));
        panel_auditoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_auditoria.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_auditoria.setForeground(new java.awt.Color(255, 255, 255));
        lbl_auditoria.setText("Auditoría de Sistema");

        javax.swing.GroupLayout panel_auditoriaLayout = new javax.swing.GroupLayout(panel_auditoria);
        panel_auditoria.setLayout(panel_auditoriaLayout);
        panel_auditoriaLayout.setHorizontalGroup(
            panel_auditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_auditoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_auditoria)
                .addGap(162, 162, 162))
        );
        panel_auditoriaLayout.setVerticalGroup(
            panel_auditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_auditoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_auditoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cerrar.setText("Cancelar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_auditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel_auditoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addGap(33, 33, 33))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
         if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
             opcion=(String) list_filtros.getSelectedItem();
             if(opcion.equals("Fecha")){
                 query=entityManager.createNativeQuery("SELECT * FROM auditoria_sistema WHERE fechaHora LIKE "
                    +"'%"+tf_valor.getText()+"%'", AuditoriaSistema.class);
                 List<AuditoriaSistema> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;
             }
             if(opcion.equals("Acción")){
                 query=entityManager.createNativeQuery("SELECT * FROM auditoria_sistema WHERE accion LIKE "
                    +"'%"+tf_valor.getText()+"%'", AuditoriaSistema.class);
                 List<AuditoriaSistema> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para dicha acción", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;

             }
             if(opcion.equals("Entidad")){
                 query=entityManager.createNativeQuery("SELECT * FROM auditoria_sistema WHERE tabla LIKE "
                    +"'%"+tf_valor.getText()+"%'", AuditoriaSistema.class);
                 List<AuditoriaSistema> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para dicha Entidad", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;

             }
             if(opcion.equals("Usuario")){
                 query=entityManager.createNativeQuery("SELECT * FROM auditoria_sistema WHERE usuario LIKE "
                    +"'%"+tf_valor.getText()+"%'", AuditoriaSistema.class);
                 List<AuditoriaSistema> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para dicho Usuario", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;

             }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        String opc;
        opc=(String) list_filtros.getSelectedItem();
        if(opc=="Entidad" || opc=="Acción" || opc=="Usuario"){
            ch=evt.getKeyChar();
             if(Character.isDigit(ch)){
                   getToolkit().beep();
                    evt.consume();
              }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void list_filtrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusLost
        // TODO add your handling code here:
        if(list_filtros.getSelectedItem()=="Fecha"){
             Date fecha= new Date(); 
            DateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
            tf_valor.setText(formato.format(fecha));   
         }
            
    }//GEN-LAST:event_list_filtrosFocusLost

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btn_buscarFocusLost

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
          tf_valor.setText(null);
       
    }//GEN-LAST:event_list_filtrosFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new VerAuditoriaSistema();
                frame.setTitle("Auditoría de Sistema");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_auditoria;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.AuditoriaSistema> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JPanel panel_auditoria;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
