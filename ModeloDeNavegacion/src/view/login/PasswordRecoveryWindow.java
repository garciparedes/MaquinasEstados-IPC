/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

/**
 *
 * @author garciparedes
 */
public class PasswordRecoveryWindow extends javax.swing.JFrame {

    PasswordRecoveryController controller;
    
    public PasswordRecoveryWindow() {
        initComponents();
        controller = new PasswordRecoveryController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_infoRecovery1 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        lbl_infoRecovery2 = new javax.swing.JLabel();
        txt_recovery = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_infoRecovery1.setText("Aqui puedes recuperar tu contraseña.");

        btn_atras.setText("<- Atras");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        lbl_infoRecovery2.setText("Introduce el correo con el que te registraste:");

        btn_enviar.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_atras)
                    .addComponent(lbl_infoRecovery2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_recovery)
                        .addGap(18, 18, 18)
                        .addComponent(btn_enviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_infoRecovery1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_atras)
                .addGap(33, 33, 33)
                .addComponent(lbl_infoRecovery1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_infoRecovery2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_recovery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enviar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        controller.back();
    }//GEN-LAST:event_btn_atrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JToggleButton btn_enviar;
    private javax.swing.JLabel lbl_infoRecovery1;
    private javax.swing.JLabel lbl_infoRecovery2;
    private javax.swing.JTextField txt_recovery;
    // End of variables declaration//GEN-END:variables
}
