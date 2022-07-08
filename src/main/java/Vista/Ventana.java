package Vista;

import Controlador.Pizarra;
import Modelo.Figura;
import java.awt.Color;

public class Ventana extends javax.swing.JFrame {

    private Figura figura;
    private Pizarra pizarra;
    
    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.figura = new Figura(Figura.TRIANGUL0, Color.BLUE, 25, 25);
        pizarra = new Pizarra();
        pizarra.setBounds(10, 10, this.panelPizarra.getWidth() - 20, this.panelPizarra.getHeight() - 20);
        this.panelPizarra.add(pizarra);
        pizarra.setFigura(figura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPizarra = new javax.swing.JPanel();
        btLimpiar = new javax.swing.JButton();
        btLimpiar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Figura:");

        panelPizarra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPizarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelPizarraMouseMoved(evt);
            }
        });
        panelPizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPizarraMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelPizarraLayout = new javax.swing.GroupLayout(panelPizarra);
        panelPizarra.setLayout(panelPizarraLayout);
        panelPizarraLayout.setHorizontalGroup(
            panelPizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        panelPizarraLayout.setVerticalGroup(
            panelPizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        btLimpiar.setText("Eliminar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btLimpiar1.setText("Dibujar");
        btLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Triangulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panelPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btLimpiar1)
                        .addGap(113, 113, 113)
                        .addComponent(btLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(76, 76, 76)
                .addComponent(panelPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiar)
                    .addComponent(btLimpiar1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        this.pizarra.setLimpiar(true);
        this.pizarra.repaint();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void panelPizarraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseMoved
        configurarDibujo();
    }//GEN-LAST:event_panelPizarraMouseMoved

    private void panelPizarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseEntered
        configurarDibujo();
    }//GEN-LAST:event_panelPizarraMouseEntered

    private void btLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimpiar1ActionPerformed

    public void configurarDibujo() {
         this.pizarra.setLimpiar(false);  
        this.pizarra.setFigura(figura);
    }
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btLimpiar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelPizarra;
    // End of variables declaration//GEN-END:variables
}
