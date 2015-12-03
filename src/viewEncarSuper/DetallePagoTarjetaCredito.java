/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewEncarSuper;

import bean.DetalleCobro;
import bean.FacturaCobro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pc
 */
public class DetallePagoTarjetaCredito extends javax.swing.JDialog {

    /**
     * Creates new form DetallePagoTarjeta
     */
    int numeroFactura;
    String tipo;
    String nro;
    String entidad;
    int total, j, cant;
  public static  int totalmonto;
    public DetallePagoTarjetaCredito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarTablaDetalle();
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
        detalleCobroQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DetalleCobro d");
        detalleCobroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(detalleCobroQuery.getResultList());
        facturaCobroQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM FacturaCobro f");
        facturaCobroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : facturaCobroQuery.getResultList();
        btn_cancelar3 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_registrarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar3.setText("Cancelar");
        btn_cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(0, 153, 255));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entidad", "Monto Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaDetalle);

        jLabel5.setText("Total:");

        tf_total.setEnabled(false);
        tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/credit-card-icon.png"))); // NOI18N

        lbl_registrarC.setBackground(new java.awt.Color(0, 153, 255));
        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Cobros Tarjeta Credito");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registrarC)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane4)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbl_registrarC)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tf_total, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_registrarC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar3)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalActionPerformed

    private void btn_cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar3ActionPerformed
        // TODO add your handling code here:{
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelar3ActionPerformed

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
            java.util.logging.Logger.getLogger(DetallePagoTarjetaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallePagoTarjetaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallePagoTarjetaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallePagoTarjetaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetallePagoTarjetaCredito dialog = new DetallePagoTarjetaCredito(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar3;
    private java.util.List<bean.DetalleCobro> detalleCobroList;
    private javax.persistence.Query detalleCobroQuery;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<bean.FacturaCobro> facturaCobroList;
    private javax.persistence.Query facturaCobroQuery;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_registrarC;
    private static javax.swing.JTable tablaDetalle;
    private static javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables

        private void llenarTablaDetalle() {
            total=0;
        facturaCobroQuery = entityManager.createNativeQuery( "SELECT * "+
          "FROM factura_cobro fc "+
          "JOIN detalle_cobro dc "+
          "on dc.idDetalle=fc.forma_pago "+
          "WHERE fc.tipoFactura='Crédito' "+
           "and dc.forma='TarjetaCredito' "+
          "AND STR_TO_DATE(fechaEmision , '%d/%m/%Y %H :%i :%s') "+
          "BETWEEN STR_TO_DATE('"+ArquearCaja.tf_fechaApertura.getText()+"', '%d/%m/%Y %H :%i :%s') "+
          "AND STR_TO_DATE('"+ArquearCaja.tf_fechaCierre.getText()+"', '%d/%m/%Y %H :%i :%s') ", FacturaCobro.class);
 
          List<FacturaCobro> p=facturaCobroQuery.getResultList();
                if (p.isEmpty()){
                     JOptionPane.showMessageDialog(null,"Sin detalle", "Error",JOptionPane.ERROR_MESSAGE);
                     this.dispose();
                }
              else{
                 for (int i=0;i<p.size();i++){
                   DetalleCobro de= obtenerDetalle(p.get(i).getFormaPago().getIdDetalle());
                    if (validar(de.getIdBanco().getNombre()) == false){
                        facturaCobroQuery=entityManager.createNativeQuery("SELECT distinct b.nombre "+
                        "FROM factura_cobro fc "+
                        "JOIN detalle_cobro dc "+
                        "on dc.idDetalle=fc.forma_pago "+
                        "join banco b "+
                        "on b.idbanco=dc.id_banco "+
                        "WHERE fc.tipoFactura='Crédito' "+
                        "and dc.forma='TarjetaCredito' "+
                        "AND STR_TO_DATE(fechaEmision , '%d/%m/%Y %H :%i :%s') "+
                        "BETWEEN STR_TO_DATE('"+ArquearCaja.tf_fechaApertura.getText()+"', '%d/%m/%Y %H :%i :%s') "+
                        "AND STR_TO_DATE('"+ArquearCaja.tf_fechaCierre.getText()+"', '%d/%m/%Y %H :%i :%s') "+
                         " and dc.idDetalle="+de.getIdDetalle()+
                        " GROUP BY b.nombre");
                         Object resultado1=facturaCobroQuery.getSingleResult();          
                         entidad=(resultado1.toString());
                        //System.out.print(entidad);



                        facturaCobroQuery=entityManager.createNativeQuery("SELECT sum(fc.total)"+
                        "FROM factura_cobro fc "+
                        "JOIN detalle_cobro dc "+
                        "on dc.idDetalle=fc.forma_pago "+
                         "join banco b "+
                        "on b.idbanco=dc.id_banco "+
                        "WHERE fc.tipoFactura='Crédito' "+
                        "and dc.forma='TarjetaCredito' "+
                        "AND STR_TO_DATE(fechaEmision , '%d/%m/%Y %H :%i :%s') "+
                        "BETWEEN STR_TO_DATE('"+ArquearCaja.tf_fechaApertura.getText()+"', '%d/%m/%Y %H :%i :%s') "+
                        "AND STR_TO_DATE('"+ArquearCaja.tf_fechaCierre.getText()+"', '%d/%m/%Y %H :%i :%s') "+
                         " and dc.idDetalle="+de.getIdDetalle()+
                        " GROUP BY b.nombre");
                         Object resultado=facturaCobroQuery.getSingleResult();
                         total=Integer.parseInt(resultado.toString());
                              //    System.out.print(total);

                         inicializar_tabla(entidad, total);

                        }
                       
        }
              }
        
}
 public  static void inicializar_tabla( String entidad, int total) {
        
        DefaultTableModel dtm = (DefaultTableModel) tablaDetalle.getModel();
        String[] fila = new String[2];
        fila[0] = entidad;
        fila[1] = String.valueOf(total);
        
        dtm.addRow(fila);
        tablaDetalle.setModel(dtm);
        
        totalmonto= total+totalmonto;
        tf_total.setText("" + totalmonto);
     
}
    public static boolean validar(String ent) {
        int  c=0;
        for (int j=0;j<tablaDetalle.getRowCount();j++){
                            if (tablaDetalle.getValueAt(j, 0).toString().equals(ent)){
                               c=c+1; //repetido
                            }
        }
      if (c==0){
          //no se agrego aun a la tabla
          return false;
      }
      else{
          //ya existe en la tabla
          return true;
      }
}       
        
  
private DetalleCobro obtenerDetalle(int id){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("DetalleCobro.findByIdDetalle");
        query.setParameter("idDetalle", id);
        List<DetalleCobro> a = query.getResultList();
        DetalleCobro nom = null;
        try{
            nom = a.get(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Algo pasó");
        }
        
        ema.close();
        return nom;
    }
private void imprimir() {
       facturaCobroQuery = entityManager.createNativeQuery( "SELECT * "+
          "FROM factura_cobro fc "+
          "JOIN detalle_cobro dc "+
          "on dc.idDetalle=fc.forma_pago "+
          "WHERE fc.tipoFactura='Crédito' "+
           "and dc.forma='TarjetaDebito' "+
          "AND STR_TO_DATE(fechaEmision , '%d/%m/%Y %H :%i :%s') "+
          "BETWEEN STR_TO_DATE('"+ArquearCaja.tf_fechaApertura.getText()+"', '%d/%m/%Y %H :%i :%s') "+
          "AND STR_TO_DATE('"+ArquearCaja.tf_fechaCierre.getText()+"', '%d/%m/%Y %H :%i :%s') ", FacturaCobro.class);
 
          List<FacturaCobro> p=facturaCobroQuery.getResultList();
                if (p.isEmpty()){
                     JOptionPane.showMessageDialog(null,"Sin detalle", "Error",JOptionPane.ERROR_MESSAGE);
                     this.dispose();
                }
              else{
              try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "1234");
          //  HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
            Map parametros=new HashMap();
            parametros.put("fecha",ArquearCaja.tf_fechaApertura.getText() );
            parametros.put("fechaFin",ArquearCaja.tf_fechaCierre.getText() );
            parametros.put("formaPago","TarjetaCredito" );
            JasperPrint jp = JasperFillManager.fillReport("C:/proyecto/src/reportes/DetalleCobro.jasper", parametros,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Detalle Cobro");
         //    Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
           //  jv.setIconImage(icon);
            jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         }
    }
}
