/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import bean.Actividad;
import bean.Rol;
import java.awt.Image;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class BuscarActividad extends javax.swing.JFrame {
    private char ch;
    private int fila;
    private int codigo;
    private String nombre;

    /**
     * Creates new form BuscarActividad
     */
    public BuscarActividad() {
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

        EntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        Query = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT a FROM Actividad a");
        List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(Query.getResultList());
        panel_BuscarAct = new javax.swing.JPanel();
        lbl_BuscarAct = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_BuscarAct.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarAct.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarAct.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarAct.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarAct.setText("Buscar Actividad");

        javax.swing.GroupLayout panel_BuscarActLayout = new javax.swing.GroupLayout(panel_BuscarAct);
        panel_BuscarAct.setLayout(panel_BuscarActLayout);
        panel_BuscarActLayout.setHorizontalGroup(
            panel_BuscarActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarActLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lbl_BuscarAct)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panel_BuscarActLayout.setVerticalGroup(
            panel_BuscarActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarActLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_BuscarAct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Descripción" }));
        list_filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_filtrosActionPerformed(evt);
            }
        });
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, 0, 122, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_buscar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, List, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codActividad}"));
        columnBinding.setColumnName("Codigo Actividad");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
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
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(panel_BuscarAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_BuscarAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        int id;
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Código"){
                id=Integer.parseInt(tf_valor.getText());
                Query = EntityManager.createNamedQuery("Actividad.findByCodActividad");
                Query.setParameter("codActividad",id);
                List<Actividad> a = Query.getResultList();
                if (a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de Actividad inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(a);
            }
            else{
                Query = EntityManager.createNativeQuery( "SELECT * FROM actividad WHERE nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Actividad.class);
                List<Actividad> a = Query.getResultList();
                if (a.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Descripción de actividad inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(a);

            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void list_filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_filtrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_filtrosActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_masterTableMouseClicked

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_list_filtrosFocusGained

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
            java.util.logging.Logger.getLogger(BuscarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new BuscarActividad();
                frame.setVisible(true);
                frame.setTitle("Buscar Actividad");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private java.util.List<bean.Actividad> List;
    private javax.persistence.Query Query;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BuscarAct;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_BuscarAct;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
