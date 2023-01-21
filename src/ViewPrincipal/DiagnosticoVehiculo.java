/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewPrincipal;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Diego
 */
public class DiagnosticoVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosticoVehiculo
     */
    public DiagnosticoVehiculo() {
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

        Regresar = new javax.swing.JButton();
        BotonAgregarVehiculo = new javax.swing.JButton();
        BotonListaVehiculos = new javax.swing.JButton();
        abastecerunidad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Regresar.setText("Regresar");
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        BotonAgregarVehiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonAgregarVehiculo.setText("Agregar Vehículo");
        getContentPane().add(BotonAgregarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 170, -1));

        BotonListaVehiculos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonListaVehiculos.setText("Ver lista de Vehículos");
        getContentPane().add(BotonListaVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, -1));

        abastecerunidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        abastecerunidad.setText("Abastecer Unidad");
        abastecerunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abastecerunidadActionPerformed(evt);
            }
        });
        getContentPane().add(abastecerunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Diagnostico Vehiculo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/zyro-image (4).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abastecerunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abastecerunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abastecerunidadActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnosticoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosticoVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregarVehiculo;
    public javax.swing.JButton BotonListaVehiculos;
    public javax.swing.JButton Regresar;
    public javax.swing.JButton abastecerunidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}