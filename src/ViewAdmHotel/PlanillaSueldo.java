/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import bean.AuditoriaSistema;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jorge
 */
public class PlanillaSueldo extends javax.swing.JFrame {
 private Connection connection;
 private  int respuesta;
 private  int mes;
 private int anho;
 private String periodo;
 Date fecha=new Date();
 DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
 EntityManager ema = fact.createEntityManager();
 private String valor;

    /**
     * Creates new form GenerarInformeAsist
     */
    public PlanillaSueldo() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a  FROM Asistencia a");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel3 = new javax.swing.JPanel();
        lbl_registrarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jm_mes = new com.toedter.calendar.JMonthChooser();
        lbl_año = new javax.swing.JLabel();
        lbl_mes = new javax.swing.JLabel();
        jy_año = new com.toedter.calendar.JYearChooser();
        tf_aguinaldo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Generar Planilla Pago Sueldo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(lbl_registrarC)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registrarC)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_año.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbl_año.setText("Año:");

        lbl_mes.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbl_mes.setText("Mes:");

        tf_aguinaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        tf_aguinaldo.setText("Aguinaldo");
        tf_aguinaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_aguinaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_mes)
                .addGap(18, 18, 18)
                .addComponent(jm_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lbl_año)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(tf_aguinaldo)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_año)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_aguinaldo)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
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
                .addComponent(btn_generar)
                .addGap(33, 33, 33)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
  
        Query q;
        mes=jm_mes.getMonth();
        mes=mes+1;
        System.out.println(mes);
        anho=jy_año.getYear();
        System.out.println(anho);
        periodo=anho+"-"+mes;
        System.out.println("Periodo:"+" "+periodo);
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Generar la planilla de pagos de sueldos?","Confirmar Creación",JOptionPane.YES_NO_OPTION );
        if (respuesta == JOptionPane.YES_OPTION){
             EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
             EntityManager ema = fact.createEntityManager();
             q=ema.createNativeQuery("Select * from planilla_pago_sueldo where "
                     + "periodo= "+"'"+periodo+"'");
             List<bean.PlanillaPagoSueldo>pps=q.getResultList();
             if(pps.isEmpty()){
                    valor="Pago de sueldo periodo: "+periodo;
                    registrarAuditoria(valor);
                   Connection(mes,anho);//genero la planilla y despues consulto
                     try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                        HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                        par.put("Periodo_q", periodo);
                        par.put("Periodo_i", fechaLetra(mes,anho));
                        JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/pagoSueldos.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                        JasperViewer jv = new JasperViewer(jp,false);
                        jv.setVisible(true);
                        jv.setTitle("Planilla de Pago de Sueldos");
                        Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                        jv.setIconImage(icon);
                        jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   }
                    catch(Exception e)
                   {
                        e.printStackTrace();
                   }
             }else{
                      try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                        HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                        par.put("Periodo_q", periodo);
                        par.put("Periodo_i", fechaLetra(mes,anho));
                        JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/pagoSueldos.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                        JasperViewer jv = new JasperViewer(jp,false);
                        jv.setVisible(true);
                        jv.setTitle("Planilla de Pago de Sueldos");
                        Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                        jv.setIconImage(icon);
                        jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   }
                    catch(Exception e)
                   {
                        e.printStackTrace();
                   }   
             }
            
        }
       
              
    }//GEN-LAST:event_btn_generarActionPerformed

    private void tf_aguinaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_aguinaldoActionPerformed
        // TODO add your handling code here:
        Query q;
         respuesta=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea efectuar el pago de aguinaldo?", "Confirmar Registro",JOptionPane.YES_NO_OPTION );
            if (respuesta==JOptionPane.YES_OPTION){
                periodo="2015"+"-"+"13";
                q=ema.createNativeQuery("Select * from planilla_pago_sueldo where "
                     + "periodo= "+"'"+periodo+"'");
                 List<bean.PlanillaPagoSueldo>pps=q.getResultList();
                if(pps.isEmpty()){
                        valor="Pago de sueldo aguinaldo: "+periodo;
                        registrarAuditoria(valor);
                        ConnectionAguinaldo(periodo);
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                            HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                            par.put("Periodo_q", periodo);
                            JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/pagoAguinaldo.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                            JasperViewer jv = new JasperViewer(jp,false);
                            jv.setVisible(true);
                            jv.setTitle("Planilla de Pago de Aguinaldos");
                            Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                            jv.setIconImage(icon);
                            jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                       }
                        catch(Exception e)
                       {
                            e.printStackTrace();
                       }  
                }else{ 
                        //sólo consulto
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                            HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                            par.put("Periodo_q", periodo);
                            JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/pagoAguinaldo.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                            JasperViewer jv = new JasperViewer(jp,false);
                            jv.setVisible(true);
                            jv.setTitle("Planilla de Pago de Aguinaldos");
                            Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                            jv.setIconImage(icon);
                            jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                       }
                        catch(Exception e)
                       {
                            e.printStackTrace();
                       }  
                }
                   
            }
    }//GEN-LAST:event_tf_aguinaldoActionPerformed
      private void Connection(int mes, int anho){
          int seguro;
          int extraccion;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/hotel db?user=root&password=user";
            connection = DriverManager.getConnection(BaseDeDatos);
            if(connection != null){
                System.out.println("Conexion Exitosa!");
               CallableStatement st=connection.prepareCall("{call planilla_pago (?,?,?,?)}");
               //  CallableStatement st=connection.prepareCall("{call planilla_pago }");
                 st.setInt(1, mes);
                 st.setInt(2, anho);
                 st.registerOutParameter(3, java.sql.Types.INTEGER);
                 st.execute();
                 extraccion=st.getInt(3);
                 seguro=st.getInt(4);
                 // extraccion es el monto
                 System.out.println("Extracción para empleados: "+extraccion);
                 System.out.println("Extracción para IPS: "+seguro);
                connection.close();
               
            }else{
                System.out.println("Conexion Fallida!");                
            }
             
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
    }
    private void  ConnectionAguinaldo(String periodo){
        int extraccion=0;
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/hotel db?user=root&password=user";
            connection = DriverManager.getConnection(BaseDeDatos);
            if(connection != null){
                System.out.println("Conexion Exitosa!");
                CallableStatement st=connection.prepareCall("{call pago_aguinaldo (?,?)}");
               //  CallableStatement st=connection.prepareCall("{call planilla_pago }");
                 st.setString(1, periodo);
                 st.registerOutParameter(2, java.sql.Types.INTEGER);
                 st.execute();
                 extraccion=st.getInt(2);
                 // extraccion es el monto
                 System.out.println("Extracción para aguinaldo: "+extraccion);
                connection.close();
            }else{
                System.out.println("Conexion Fallida!");                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      private String fechaLetra(int mes,int anho){
          String fechaLetra=" ";
          switch(mes){
              case 1:
                    fechaLetra="Enero";
                    break;
              case 2:
                    fechaLetra="Febrero";
                    break;
              case 3:
                    fechaLetra="Marzo";
                    break;
              case 4:
                    fechaLetra="Abril";
                    break;
                  
              case 5:
                    fechaLetra="Mayo";
                    break;
              case 6:
                    fechaLetra="Junio";
                    break;
              case 7:
                    fechaLetra="Julio";
                    break;
              case 8:
                    fechaLetra="Agosto";
                    break;
              case 9:
                    fechaLetra="Septiembre";
                    break;
              case 10:
                    fechaLetra="Octubre";
                    break;
              case 11:
                    fechaLetra="Noviembre";
                    break;
              case 12:
                    fechaLetra="Diciembre";
                    break;      
      }
          fechaLetra=fechaLetra+"-"+anho;
          return fechaLetra;
          
      }
         private void registrarAuditoria(String valor){
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Inserción");
            as.setTabla("Planilla Pago Sueldo");
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            as.setAntes(valor);
            as.setDespues("No hay modificaciones");
            ema.getTransaction().begin();
            ema.persist(as);
            ema.getTransaction().commit();
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
            java.util.logging.Logger.getLogger(PlanillaSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanillaSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanillaSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanillaSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new PlanillaSueldo(); 
               frame.setVisible(true);
               Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
               frame.setIconImage(icon);
               frame.setTitle("Generar Planilla de Pago de Sueldos");
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_generar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JMonthChooser jm_mes;
    private com.toedter.calendar.JYearChooser jy_año;
    private javax.swing.JLabel lbl_año;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_registrarC;
    private java.util.List<bean.Asistencia> list;
    private javax.persistence.Query query;
    private javax.swing.JButton tf_aguinaldo;
    // End of variables declaration//GEN-END:variables
}
