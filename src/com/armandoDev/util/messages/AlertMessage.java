package com.armandoDev.util.messages;

import javax.swing.JFrame;

public class AlertMessage extends javax.swing.JDialog {

    public AlertMessage(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public AlertMessage(JFrame parent, boolean modal, String message) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelMenssage.setText(message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShade1 = new RSComponentShade.RSPanelShade();
        rSPanelImage2 = new rojeru_san.rspanel.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabelMenssage = new javax.swing.JLabel();
        rSButtonNovo = new rojeru_san.rsbutton.RSButtonRoundRipple();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        rSPanelShade1.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/messages/alert.png"))); // NOI18N
        rSPanelImage2.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mensagem do Sistema");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelMenssage.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelMenssage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenssage.setText("Texto");
        jLabelMenssage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        rSButtonNovo.setBackground(new java.awt.Color(183, 183, 0));
        rSButtonNovo.setText("OK");
        rSButtonNovo.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonNovo.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelShade1Layout = new javax.swing.GroupLayout(rSPanelShade1);
        rSPanelShade1.setLayout(rSPanelShade1Layout);
        rSPanelShade1Layout.setHorizontalGroup(
            rSPanelShade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelMenssage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rSPanelShade1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShade1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        rSPanelShade1Layout.setVerticalGroup(
            rSPanelShade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShade1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabelMenssage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShade1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShade1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonNovoActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonNovoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlertMessage dialog = new AlertMessage(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMenssage;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonNovo;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage2;
    private RSComponentShade.RSPanelShade rSPanelShade1;
    // End of variables declaration//GEN-END:variables

}
