
package com.armandoDev.view;


public class MenuPrincipalView extends javax.swing.JFrame {
    
    public MenuPrincipalView() {
        initComponents();
        jPanelMenuBackground.setVisible(false);
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        buttonExit = new rojeru_san.rsbutton.RSButtonForma();
        jPanelMenuLateral = new javax.swing.JPanel();
        buttonCadastro = new rojeru_san.rsbutton.RSButtonForma();
        buttonRelatorios = new rojeru_san.rsbutton.RSButtonForma();
        jPanelMenuBackground = new javax.swing.JPanel();
        jPanelMenuCadastro = new javax.swing.JPanel();
        jLabelTitleCadastro = new javax.swing.JLabel();
        rSButtonForma1 = new rojeru_san.rsbutton.RSButtonForma();
        jPanelMenuRelatorios = new javax.swing.JPanel();
        jLabelTitleRelatorios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanelBackground.setBackground(new java.awt.Color(153, 153, 153));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanelHeader.setBackground(new java.awt.Color(128, 171, 214));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(291, 41));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("LibFinance");

        buttonExit.setBackground(new java.awt.Color(128, 171, 214));
        buttonExit.setBorder(null);
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/menuPrincipal/sair.png"))); // NOI18N
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanelMenuLateral.setBackground(new java.awt.Color(255, 255, 255));

        buttonCadastro.setBackground(new java.awt.Color(255, 255, 255));
        buttonCadastro.setBorder(null);
        buttonCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/menuPrincipal/adicionar.png"))); // NOI18N
        buttonCadastro.setColorHover(new java.awt.Color(204, 204, 204));
        buttonCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCadastroMouseEntered(evt);
            }
        });

        buttonRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        buttonRelatorios.setBorder(null);
        buttonRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/menuPrincipal/relatorio.png"))); // NOI18N
        buttonRelatorios.setColorHover(new java.awt.Color(204, 204, 204));
        buttonRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRelatoriosMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(buttonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenuBackground.setLayout(new java.awt.CardLayout());

        jLabelTitleCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitleCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleCadastro.setText("Cadastros");
        jLabelTitleCadastro.setOpaque(true);

        rSButtonForma1.setBackground(new java.awt.Color(240, 240, 240));
        rSButtonForma1.setBorder(null);
        rSButtonForma1.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonForma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/menuPrincipal/setaDireita.png"))); // NOI18N
        rSButtonForma1.setText("Participantes");
        rSButtonForma1.setColorHover(new java.awt.Color(147, 215, 255));
        rSButtonForma1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rSButtonForma1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonForma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuCadastroLayout = new javax.swing.GroupLayout(jPanelMenuCadastro);
        jPanelMenuCadastro.setLayout(jPanelMenuCadastroLayout);
        jPanelMenuCadastroLayout.setHorizontalGroup(
            jPanelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitleCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonForma1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanelMenuCadastroLayout.setVerticalGroup(
            jPanelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuCadastroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTitleCadastro)
                .addGap(11, 11, 11)
                .addComponent(rSButtonForma1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(656, Short.MAX_VALUE))
        );

        jPanelMenuBackground.add(jPanelMenuCadastro, "card3");

        jLabelTitleRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitleRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleRelatorios.setText("Relatórios");

        javax.swing.GroupLayout jPanelMenuRelatoriosLayout = new javax.swing.GroupLayout(jPanelMenuRelatorios);
        jPanelMenuRelatorios.setLayout(jPanelMenuRelatoriosLayout);
        jPanelMenuRelatoriosLayout.setHorizontalGroup(
            jPanelMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitleRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        jPanelMenuRelatoriosLayout.setVerticalGroup(
            jPanelMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuRelatoriosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTitleRelatorios)
                .addContainerGap(687, Short.MAX_VALUE))
        );

        jPanelMenuBackground.add(jPanelMenuRelatorios, "card3");

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelMenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(364, 364, 364))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(jButton1)
                                .addContainerGap(505, Short.MAX_VALUE))))))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCadastroMouseEntered
        siwtchMenuMouseEntredEvnt("menuCadastro");
    }//GEN-LAST:event_buttonCadastroMouseEntered

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRelatoriosMouseEntered
        siwtchMenuMouseEntredEvnt("menuRelatorios");
    }//GEN-LAST:event_buttonRelatoriosMouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanelMenuBackground.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rSButtonForma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonForma1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonForma buttonCadastro;
    private rojeru_san.rsbutton.RSButtonForma buttonExit;
    private rojeru_san.rsbutton.RSButtonForma buttonRelatorios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleCadastro;
    private javax.swing.JLabel jLabelTitleRelatorios;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenuBackground;
    private javax.swing.JPanel jPanelMenuCadastro;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelMenuRelatorios;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma1;
    // End of variables declaration//GEN-END:variables

    private void siwtchMenuMouseEntredEvnt(String menu) {
        jPanelMenuBackground.setVisible(true);
        jPanelMenuCadastro.setVisible(menu.equals("menuCadastro"));
        jPanelMenuRelatorios.setVisible(menu.equals("menuRelatorios"));
    }
    
}
