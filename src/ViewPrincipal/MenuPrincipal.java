/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewPrincipal;

import Controller.ControllerMenuPrincipal;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Diego
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setIconImage(getIconImage());
    }
  
       @Override
  public Image getIconImage () {  
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Image/Logo.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtencionCliente = new javax.swing.JButton();
        botonPlantillaMedica = new javax.swing.JButton();
        botonTransporteEmergencia = new javax.swing.JButton();
        botonDiagnosticoVehiculo = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtencionCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonAtencionCliente.setText("Atención al Cliente");
        botonAtencionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtencionClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtencionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 250, 40));

        botonPlantillaMedica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonPlantillaMedica.setText("Plantilla Médica");
        getContentPane().add(botonPlantillaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 250, 40));

        botonTransporteEmergencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonTransporteEmergencia.setText("Transporte Emergencia");
        botonTransporteEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransporteEmergenciaActionPerformed(evt);
            }
        });
        getContentPane().add(botonTransporteEmergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 250, 40));

        botonDiagnosticoVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonDiagnosticoVehiculo.setText("Diagnóstico Vehículo");
        botonDiagnosticoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiagnosticoVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(botonDiagnosticoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 250, 40));

        BotonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 60, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("José López V.- 27.392.939");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Integrantes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Diego Argotte V.- 26.837.785  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("José El Asmar V.- 27.130.898");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 230, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sistema de Salud");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/zyro-image (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void botonTransporteEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransporteEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTransporteEmergenciaActionPerformed

    private void botonAtencionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtencionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtencionClienteActionPerformed

    private void botonDiagnosticoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiagnosticoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDiagnosticoVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal menu = new MenuPrincipal();
                ControllerMenuPrincipal ctrl = new ControllerMenuPrincipal(menu);
                ctrl.iniciar();
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonSalir;
    public javax.swing.JButton botonAtencionCliente;
    public javax.swing.JButton botonDiagnosticoVehiculo;
    public javax.swing.JButton botonPlantillaMedica;
    public javax.swing.JButton botonTransporteEmergencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
