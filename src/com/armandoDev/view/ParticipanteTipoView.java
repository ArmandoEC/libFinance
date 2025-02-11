
package com.armandoDev.view;

import com.armandoDev.entity.ParticipanteTipoEntity;
import com.armandoDev.filter.ParticipanteTipoFilter;
import com.armandoDev.internal.LoadingInternal;
import com.armandoDev.negocio.ParticipanteTipoBO;
import com.armandoDev.util.document.NumbersDocument;
import com.armandoDev.util.document.StringDocument;
import javax.swing.SwingWorker;

public class ParticipanteTipoView extends javax.swing.JFrame {
    
    //VARIAVEIS
    private ParticipanteTipoEntity entity;
    
    //NEGOCIO
    private ParticipanteTipoBO negocio;
    
    public ParticipanteTipoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        init();
    }
    
    private void init() {        
        rSTextFullRoundNome.setDocument(new StringDocument(60));      
        rSTextFullRoundCodigo.setDocument(new NumbersDocument(9));      
        negocio = new ParticipanteTipoBO();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSTextFullRoundCodigo = new rojeru_san.rsfield.RSTextFullRound();
        jLabel3 = new javax.swing.JLabel();
        rSTextFullRoundNome = new rojeru_san.rsfield.RSTextFullRound();
        rSLabelImageAdicionar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageBuscar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageCancelar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageEditar = new rojeru_san.rslabel.RSLabelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoParticipante = new javax.swing.JTable();

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

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        rSTextFullRoundCodigo.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setCaretPosition(0);
        rSTextFullRoundCodigo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rSTextFullRoundCodigo.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setPlaceholder("");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        rSTextFullRoundNome.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rSTextFullRoundNome.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setPlaceholder("");

        rSLabelImageAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/adicionar-24x24.png"))); // NOI18N

        rSLabelImageBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/buscar-24x24.png"))); // NOI18N
        rSLabelImageBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImageBuscarMouseClicked(evt);
            }
        });

        rSLabelImageCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/cancelar-24x24.png"))); // NOI18N

        rSLabelImageEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/editar-24x24.png"))); // NOI18N

        jTableTipoParticipante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableTipoParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTipoParticipante.setToolTipText("");
        jTableTipoParticipante.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableTipoParticipante.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableTipoParticipante);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(rSTextFullRoundCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(rSTextFullRoundNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rSLabelImageBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rSLabelImageEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rSLabelImageCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(rSTextFullRoundCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(rSTextFullRoundNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSLabelImageBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelImageEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelImageCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSLabelImageBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImageBuscarMouseClicked
        
        try {
            
            LoadingInternal internal = new LoadingInternal(null, true);
            SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

                @Override
                protected Void doInBackground() throws Exception {
                    buscarTipoParticipante();
                    return null;
                }

                @Override
                protected void done() {
                    internal.dispose();
                }
            };

            sw.execute();
            internal.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_rSLabelImageBuscarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParticipanteTipoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoParticipante;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageAdicionar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageBuscar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageCancelar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageEditar;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRoundCodigo;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRoundNome;
    // End of variables declaration//GEN-END:variables

   private void buscarTipoParticipante() {
       
       ParticipanteTipoFilter filter = new ParticipanteTipoFilter();
       filter.setCodigo(Long.valueOf(rSTextFullRoundCodigo.getText()));
       filter.setNome(rSTextFullRoundNome.getText());
       
   }
       
}
