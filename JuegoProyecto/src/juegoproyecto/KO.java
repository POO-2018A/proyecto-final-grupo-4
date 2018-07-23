
package juegoproyecto;

import javax.swing.ImageIcon;

public class KO extends javax.swing.JFrame {


    public KO() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        ImagenGanador = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        gana = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        FBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        ImagenGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenGanador.setToolTipText("");
        getContentPane().add(ImagenGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 280, 300));

        lblGanador.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(204, 0, 0));
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setText("WINNER");
        getContentPane().add(lblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 280, 90));

        gana.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gana.setText("Mostrar Ganador");
        gana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganaActionPerformed(evt);
            }
        });
        getContentPane().add(gana, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ko.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        FBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(FBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 290, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        JuegoProyecto.window.setVisible(true);
        JuegoProyecto.window.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void ganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganaActionPerformed
        ImagenGanador.setIcon(new ImageIcon(Ventana2.imagenganador));
    }//GEN-LAST:event_ganaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FBlanco;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenGanador;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton gana;
    private javax.swing.JLabel lblGanador;
    // End of variables declaration//GEN-END:variables
}
