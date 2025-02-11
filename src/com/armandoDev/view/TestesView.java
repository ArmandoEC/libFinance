
package com.armandoDev.view;


public class TestesView extends javax.swing.JFrame {
    
    public TestesView() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelTitle1 = new javax.swing.JLabel();
        rSButtonNovo = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonBuscar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonCancelar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonSalvar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonAlterar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNome1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonBuscar1 = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonAlterar1 = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonNovo1 = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSTextFullRound1 = new rojeru_san.rsfield.RSTextFullRound();
        rSTextFullRound2 = new rojeru_san.rsfield.RSTextFullRound();
        rSLabelImageAdicionar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageBuscar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageCancelar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageEditar = new rojeru_san.rslabel.RSLabelImage();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(249, 249, 249));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanelHeader.setBackground(new java.awt.Color(128, 171, 214));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(291, 41));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("LibFinance");

        jLabelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("Título");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        rSButtonNovo.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonNovo.setText("Novo");
        rSButtonNovo.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonNovo.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonBuscar.setBackground(new java.awt.Color(56, 182, 255));
        rSButtonBuscar.setText("Buscar");
        rSButtonBuscar.setColorHover(new java.awt.Color(0, 151, 239));
        rSButtonBuscar.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonCancelar.setBackground(new java.awt.Color(255, 87, 87));
        rSButtonCancelar.setText("Cancelar");
        rSButtonCancelar.setColorHover(new java.awt.Color(239, 0, 0));
        rSButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonSalvar.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonSalvar.setText("Salvar");
        rSButtonSalvar.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonSalvar.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonAlterar.setBackground(new java.awt.Color(255, 189, 89));
        rSButtonAlterar.setText("Alterar");
        rSButtonAlterar.setColorHover(new java.awt.Color(255, 155, 5));
        rSButtonAlterar.setPreferredSize(new java.awt.Dimension(150, 40));

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNome.setText("editavel");
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusGained(evt);
            }
        });

        jTextFieldNome1.setEditable(false);
        jTextFieldNome1.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNome1.setText("nao editavel");
        jTextFieldNome1.setToolTipText("");
        jTextFieldNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        rSButtonBuscar1.setBackground(new java.awt.Color(56, 182, 255));
        rSButtonBuscar1.setText("Buscar");
        rSButtonBuscar1.setColorHover(new java.awt.Color(0, 151, 239));
        rSButtonBuscar1.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonAlterar1.setBackground(new java.awt.Color(255, 189, 89));
        rSButtonAlterar1.setText("Voltar");
        rSButtonAlterar1.setColorHover(new java.awt.Color(255, 155, 5));
        rSButtonAlterar1.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonNovo1.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonNovo1.setText("Novo");
        rSButtonNovo1.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonNovo1.setPreferredSize(new java.awt.Dimension(150, 40));

        rSTextFullRound1.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRound1.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRound1.setCaretPosition(0);
        rSTextFullRound1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rSTextFullRound1.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRound1.setPlaceholder("");

        rSTextFullRound2.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRound2.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRound2.setCaretPosition(0);
        rSTextFullRound2.setEnabled(false);
        rSTextFullRound2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rSTextFullRound2.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRound2.setPlaceholder("");

        rSLabelImageAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/adicionar-24x24.png"))); // NOI18N

        rSLabelImageBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/buscar-24x24.png"))); // NOI18N

        rSLabelImageCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/cancelar-24x24.png"))); // NOI18N

        rSLabelImageEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/editar-24x24.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rSTextFullRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(rSButtonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(268, 268, 268)
                                .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(rSTextFullRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSLabelImageBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSLabelImageCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSLabelImageEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSTextFullRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(rSTextFullRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSLabelImageBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelImageCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelImageEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        jTextFieldNome.selectAll();
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNome1;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonAlterar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonAlterar1;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonBuscar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonBuscar1;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonCancelar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonNovo;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonNovo1;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonSalvar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageAdicionar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageBuscar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageCancelar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageEditar;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRound1;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRound2;
    // End of variables declaration//GEN-END:variables

    
}
