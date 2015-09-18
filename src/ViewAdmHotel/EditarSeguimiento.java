/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import bean.Actividad;
import bean.AuditoriaSistema;
import bean.Empleado;
import bean.Lugar;
import bean.SeguimientoActividad;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EditarSeguimiento extends javax.swing.JFrame {
    private int resp;
    private char ch;
    private int limite=11;
    private final  TextAutoCompleter textAutoCompleter;

    /**
     * Creates new form EditarSeguimiento
     */
    public EditarSeguimiento() {
        initComponents();
        this.textAutoCompleter = new TextAutoCompleter(tf_codEmpleado);
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

        lugarListRenderizar1 = new renderizar.LugarListRenderizar();
        actividadListRenderizar1 = new renderizar.ActividadListRenderizar();
        EntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        Query = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT l FROM Lugar l");
        List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(Query.getResultList());
        actividadQuery = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT a FROM Actividad a");
        actividadList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : actividadQuery.getResultList();
        panel_EditarLugar = new javax.swing.JPanel();
        lbl_EditarLugar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_empleado = new javax.swing.JTextField();
        lbl_lugar = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        tf_codEmpleado = new javax.swing.JTextField();
        tf_fechaHora = new javax.swing.JTextField();
        lbl_fechaHora = new javax.swing.JLabel();
        lbl_codEmpleado = new javax.swing.JLabel();
        list_lugar = new javax.swing.JComboBox();
        list_descripcion = new javax.swing.JComboBox();
        lbl_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        lugarListRenderizar1.setText("lugarListRenderizar1");

        actividadListRenderizar1.setText("actividadListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_EditarLugar.setBackground(new java.awt.Color(0, 153, 255));
        panel_EditarLugar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_EditarLugar.setFont(new java.awt.Font("Corbel", 1, 26)); // NOI18N
        lbl_EditarLugar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EditarLugar.setText("Editar Seguimiento de Actividad");

        javax.swing.GroupLayout panel_EditarLugarLayout = new javax.swing.GroupLayout(panel_EditarLugar);
        panel_EditarLugar.setLayout(panel_EditarLugarLayout);
        panel_EditarLugarLayout.setHorizontalGroup(
            panel_EditarLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarLugarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl_EditarLugar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_EditarLugarLayout.setVerticalGroup(
            panel_EditarLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarLugarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_EditarLugar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_empleado.setEnabled(false);

        lbl_lugar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_lugar.setText("Lugar de Actividad:");

        lbl_descripcion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_descripcion.setText("Descripción:");

        tf_codEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyTyped(evt);
            }
        });

        tf_fechaHora.setEnabled(false);

        lbl_fechaHora.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_fechaHora.setText("Fecha/Hora:");

        lbl_codEmpleado.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_codEmpleado.setText(" Empleado:");

        list_lugar.setRenderer(lugarListRenderizar1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, List, list_lugar);
        bindingGroup.addBinding(jComboBoxBinding);

        list_descripcion.setRenderer(actividadListRenderizar1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, actividadList, list_descripcion);
        bindingGroup.addBinding(jComboBoxBinding);

        lbl_codigo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_codigo.setText("Código Seguimiento:");

        tf_codigo.setEditable(false);
        tf_codigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fechaHora)
                            .addComponent(lbl_descripcion))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo)
                            .addComponent(lbl_codEmpleado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_lugar)
                        .addGap(18, 18, 18)
                        .addComponent(list_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lugar)
                    .addComponent(list_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descripcion))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaHora)
                    .addComponent(tf_fechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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
                .addGap(40, 40, 40)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_EditarLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panel_EditarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codEmpleadoKeyPressed
        // TODO add your handling code here:
        int cod;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cod=Integer.parseInt(tf_codEmpleado.getText());
            Query=EntityManager.createNativeQuery("SELECT * FROM empleado WHERE codigoEmpleado="
                +cod, Empleado.class);
            List<Empleado> em=Query.getResultList();
            if(em.isEmpty()){
                JOptionPane.showMessageDialog(null,"Código de Empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            tf_empleado.setText(em.get(0).getNombre()+" "+em.get(0).getApellido());
        }

    }//GEN-LAST:event_tf_codEmpleadoKeyPressed

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

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String antes;
        String despues;
         if (tf_codEmpleado.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún código de empleado", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
              resp=  JOptionPane.showConfirmDialog(null,"Desea guardar los cambios?", "Confirmar Modificación",JOptionPane.YES_NO_OPTION );
             if (resp==JOptionPane.YES_OPTION){
                 EntityManager.getTransaction().begin();
                 Query=EntityManager.createNamedQuery("SeguimientoActividad.findByCodigoSeguimiento");
                 Query.setParameter("codigoSeguimiento", Integer.parseInt(tf_codigo.getText()));
                 List<SeguimientoActividad> seg=Query.getResultList();
                 antes=seg.get(0).toString();
                 SeguimientoActividad se=new SeguimientoActividad();
                 se.setCodigoSeguimiento(Integer.parseInt(tf_codigo.getText()));
                 se.setFechaHora(tf_fechaHora.getText());
                 Empleado e=obtenerEmpleado();
                 se.setCodigoEmpleado(e);
                 se.setLugar((Lugar) list_lugar.getSelectedItem());
                 se.setActividad((Actividad) list_descripcion.getSelectedItem());
                 EntityManager.merge(se);
                 EntityManager.flush();
                 despues=se.toString();
                 //registramos los datos necesarios para la auditoria
                 AuditoriaSistema as=new AuditoriaSistema();
                 as.setAccion("Modificación");
                 as.setTabla("Seguimiento de Actividad");
                 as.setAntes(antes);
                 as.setDespues(despues);
                 //trabajamos con la fecha
                 Date fecha=new Date();
                 DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                 as.setFechaHora(formato.format(fecha));
                 as.setUsuario("nadie");
                 EntityManager.persist(as);
                 EntityManager.getTransaction().commit();
                 EntityManager.close();
                 JOptionPane.showMessageDialog(null, "Modificación Exitosa");
             }
         }
         this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new BuscarSeguimiento();
                frame.setVisible(true);
                frame.setTitle("Buscar Seguimiento de Actividad");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }
      private void inicializarLista(){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("Empleado.findAll");
        List<Empleado> e = query.getResultList();
        Iterator <Empleado> it = e.iterator();
        while (it.hasNext()){
            textAutoCompleter.addItem(it.next().getCodigoEmpleado());
        }
        ema.close();
    }
       private Empleado obtenerEmpleado(){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("Empleado.findByCodigoEmpleado");
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
        
        ema.close();
        return emple;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private java.util.List<bean.Lugar> List;
    private javax.persistence.Query Query;
    private java.util.List<bean.Actividad> actividadList;
    private renderizar.ActividadListRenderizar actividadListRenderizar1;
    private javax.persistence.Query actividadQuery;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_EditarLugar;
    private javax.swing.JLabel lbl_codEmpleado;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_fechaHora;
    private javax.swing.JLabel lbl_lugar;
    public static javax.swing.JComboBox list_descripcion;
    public static javax.swing.JComboBox list_lugar;
    private renderizar.LugarListRenderizar lugarListRenderizar1;
    private javax.swing.JPanel panel_EditarLugar;
    public static javax.swing.JTextField tf_codEmpleado;
    public static javax.swing.JTextField tf_codigo;
    public static javax.swing.JTextField tf_empleado;
    public static javax.swing.JTextField tf_fechaHora;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
