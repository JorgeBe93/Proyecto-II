/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginView.java
 *
 * Created on 20/07/2015, 10:39:37 AM
 */

package view;

import bean.AuditoriaSistema;
import bean.Rol;
//import bean.Permiso;
import bean.Usuario;
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
public class LoginView extends javax.swing.JFrame {
    private char ch;
    private int lim=11;
    private int limit=45;
    
    private int codEmpl;
    public static String nombreUsuario;
    public static int idUsuario;

    /** Creates new form LoginView */
    public LoginView() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        btn_iniciar = new javax.swing.JButton();
        lbl_codempl = new javax.swing.JLabel();
        tf_codempl = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        btn_cambiar = new javax.swing.JButton();
        btn_recordar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al Sistema");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        btn_iniciar.setText("Iniciar Sesión");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        lbl_codempl.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lbl_codempl.setForeground(new java.awt.Color(0, 102, 255));
        lbl_codempl.setText("Usuario");

        tf_codempl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codemplKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codemplKeyTyped(evt);
            }
        });

        lbl_password.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 102, 255));
        lbl_password.setText("Password");

        tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passwordKeyTyped(evt);
            }
        });

        btn_cambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        btn_cambiar.setText("Cambiar Contraseña");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        btn_recordar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key_delete.png"))); // NOI18N
        btn_recordar.setText("Recordar Contraseña");
        btn_recordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recordarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_recordar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_codempl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_codempl)
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_codempl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_codempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_iniciar)
                .addGap(18, 18, 18)
                .addComponent(btn_cambiar)
                .addGap(20, 20, 20)
                .addComponent(btn_recordar)
                .addGap(15, 15, 15))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hotel Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        if(tf_codempl.getText().length()==0 || tf_password.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Escriba su código y contraseña", "Error",JOptionPane.ERROR_MESSAGE);
            return;

        }else{
            codEmpl=Integer.parseInt(tf_codempl.getText());
            query = entityManager.createNamedQuery( "Usuario.findByCodigoEmpleado");
            query.setParameter("codigoEmpleado",codEmpl);
            List<Usuario> u = query.getResultList();
            if(u.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Código de usuario Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                 tf_codempl.setText(null);
                 tf_codempl.requestFocus();
                 return;
            }else{
                if(u.get(0).getPassword().equals(tf_password.getText())){ 
                        //si no tiene asigado ningun rol, no puede ingresar
                         if(u.get(0).getRolCollection().isEmpty()){
                             JOptionPane.showMessageDialog(null, "No tiene asignado ningun rol, no puede ingresar al sistema","Error",JOptionPane.ERROR_MESSAGE );
                             tf_codempl.setText(null);
                             tf_password.setText(null);
                             return;
                        }
                        //para evitar que cambie su rol por si mismo
                        idUsuario=u.get(0).getEmpleado().getCodigoEmpleado();
                        //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Inicio Sesion");
                        as.setTabla("Ninguna");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora(formato.format(fecha));
                        as.setUsuario(nombreUsuario);
                        entityManager.getTransaction().begin();
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                        entityManager.close();
                       // JOptionPane.showMessageDialog(null,"Inicio de Sesión "
                        //         + "Exitoso", "Correcto",JOptionPane.INFORMATION_MESSAGE);
                        //String args[]= new String[1];
                        //args[0]  = "Menú del Sistema";
                        
                        Object [] roles = obtenerObjectoConRoles((List)u.get(0).getRolCollection());
                        
                        // Con JCombobox
                        Object seleccion = JOptionPane.showInputDialog(
                           null,
                           "Seleccione un Rol para Iniciar Sesión",
                           "Selector de Roles",
                           JOptionPane.QUESTION_MESSAGE,
                           null,  // null para icono defecto
                           roles, 
                           roles[0]);
                        switch (seleccion.toString()) {
                        case "Administrador del Sistema":
                            {
                                String args[] = new String[1];
                                args[0] = "Administrador del Sistema";
                                view.MenuAdminSist.main(args);
                                break;
                            }
                        case "Recepcionista":
                            {
                                String args[] = new String[1];
                                args[0] = "Recepcionista";
                                view.MenuRecepcionista.main(args);
                                break;
                            }
                        case "Administrador del Hotel":
                            {
                                String args[] = new String[1];
                                args[0] = "Administrador del Hotel";
                                ViewAdmHotel.MenuAdminHotel.main(args);
                                break;
                            }
                        default:
                            JOptionPane.showMessageDialog(null, "Sin permisos para "
                                    + "esta operación", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                        this.dispose();              
                }else{
                     JOptionPane.showMessageDialog(null,"Contraseña Incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_password.setText(null);
                     tf_password.requestFocus();
                     return;
                }
            }
            
        }

    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void tf_codemplKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codemplKeyTyped
        // TODO add your handling code here:
         if(tf_codempl.getText().length()==lim){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_codemplKeyTyped

    private void tf_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyTyped
        // TODO add your handling code here:
        if(tf_password.getText().length()==limit){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_passwordKeyTyped

    private void btn_recordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recordarActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Recordar contraseña";
        RecordarContrasenaView.main(args);
        this.dispose();
    }//GEN-LAST:event_btn_recordarActionPerformed

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Cambiar contraseña";
        CambiarPasswordView.main(args);
        this.dispose();
    }//GEN-LAST:event_btn_cambiarActionPerformed

    private void tf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btn_iniciar.doClick();
        } 
    }//GEN-LAST:event_tf_passwordKeyPressed

    private void tf_codemplKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codemplKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !tf_password.getText().equals("")){
            btn_iniciar.doClick();
        }
    }//GEN-LAST:event_tf_codemplKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new LoginView();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
               frame.setTitle("Ingreso al Sistema");
               Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
               frame.setIconImage(icon);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_recordar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_codempl;
    private javax.swing.JLabel lbl_password;
    private java.util.List<bean.Usuario> list;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_codempl;
    public static javax.swing.JPasswordField tf_password;
    // End of variables declaration//GEN-END:variables
    private Object[] obtenerObjectoConRoles(List<Rol> rolesDelUsuario ){
        int tamanho = rolesDelUsuario.size();
        Object [] rolesAretornar = new Object[tamanho];
        int i = 0; 
        for(Rol rol:  rolesDelUsuario){
            rolesAretornar[i] = rol.getNombre();
            i++;
        }
        return rolesAretornar;
    }

}
