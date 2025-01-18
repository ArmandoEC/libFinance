
package com.armandoDev.view;

import com.armandoDev.entity.TipoParticipanteEntity;
import com.armandoDev.negocio.TipoParticipanteBO;
import com.armandoDev.util.document.StringDocument;
import com.armandoDev.util.messages.MessagesUtil;
import org.apache.commons.lang.StringUtils;

public class TiposParticipanteView extends javax.swing.JFrame {
    
    //NEGOCIO
    TipoParticipanteBO negocio;
    
    public TiposParticipanteView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        init();
    }
    
    private void init() {
        
        jTextFieldNome.setDocument(new StringDocument(60));
        
        negocio = new TipoParticipanteBO();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        rSButtonNovo = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonBuscar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonAlterar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonSalvar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonCancelar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(249, 249, 249));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanelHeader.setBackground(new java.awt.Color(128, 171, 214));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(291, 41));

        jLabelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("Cadastro de Tipos de Participante");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        rSButtonNovo.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonNovo.setText("Novo");
        rSButtonNovo.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonNovo.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonNovoActionPerformed(evt);
            }
        });

        rSButtonBuscar.setBackground(new java.awt.Color(56, 182, 255));
        rSButtonBuscar.setText("Buscar");
        rSButtonBuscar.setColorHover(new java.awt.Color(0, 151, 239));
        rSButtonBuscar.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonAlterar.setBackground(new java.awt.Color(255, 189, 89));
        rSButtonAlterar.setText("Alterar");
        rSButtonAlterar.setColorHover(new java.awt.Color(255, 155, 5));
        rSButtonAlterar.setEnabled(false);
        rSButtonAlterar.setPreferredSize(new java.awt.Dimension(150, 40));

        rSButtonSalvar.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonSalvar.setText("Salvar");
        rSButtonSalvar.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonSalvar.setEnabled(false);
        rSButtonSalvar.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonSalvarActionPerformed(evt);
            }
        });

        rSButtonCancelar.setBackground(new java.awt.Color(255, 87, 87));
        rSButtonCancelar.setText("Cancelar");
        rSButtonCancelar.setColorHover(new java.awt.Color(239, 0, 0));
        rSButtonCancelar.setEnabled(false);
        rSButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldCodigo.setToolTipText("");
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        jTextFieldNome.selectAll();
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    private void rSButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonNovoActionPerformed
        acaoNovo();
    }//GEN-LAST:event_rSButtonNovoActionPerformed

    private void rSButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonCancelarActionPerformed
        acaoCancelar();
    }//GEN-LAST:event_rSButtonCancelarActionPerformed

    private void rSButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonSalvarActionPerformed
        salvarNovoTipoParticipante();
    }//GEN-LAST:event_rSButtonSalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiposParticipanteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonAlterar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonBuscar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonCancelar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonNovo;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonSalvar;
    // End of variables declaration//GEN-END:variables

    private void acaoNovo() {
        rSButtonNovo.setEnabled(false);
        rSButtonBuscar.setEnabled(false);
        rSButtonAlterar.setEnabled(false);
        rSButtonSalvar.setEnabled(true);
        rSButtonCancelar.setEnabled(true);
        jTextFieldNome.setEditable(true);
    }
    
    private void acaoCancelar() {
        rSButtonNovo.setEnabled(true);
        rSButtonBuscar.setEnabled(true);
        rSButtonAlterar.setEnabled(false);
        rSButtonSalvar.setEnabled(false);
        rSButtonCancelar.setEnabled(false);
        jTextFieldNome.setEditable(false);
        jTextFieldCodigo.setText(null);
        jTextFieldNome.setText(null);
    }
    
    private void salvarNovoTipoParticipante() {
        
        try {
            
            if (StringUtils.isNotBlank(jTextFieldNome.getText())) {
                negocio.save(new TipoParticipanteEntity(jTextFieldNome.getText()));
                acaoCancelar();
                
            } else {
                MessagesUtil.alertMessage(this, true, "Informe o nome do Tipo de Participante!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
