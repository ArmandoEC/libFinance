
package com.armandoDev.view;

import com.armandoDev.entity.ParticipanteTipoEntity;
import com.armandoDev.exception.ErroException;
import com.armandoDev.exception.NegocioException;
import com.armandoDev.filter.ParticipanteTipoFilter;
import com.armandoDev.internal.LoadingInternal;
import com.armandoDev.negocio.ParticipanteTipoBO;
import com.armandoDev.tableModel.CadastroTipoParticipantesTableModel;
import com.armandoDev.util.TableUtil;
import com.armandoDev.util.document.NumbersDocument;
import com.armandoDev.util.document.StringDocument;
import com.armandoDev.util.messages.MessagesUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingWorker;
import org.apache.commons.lang.StringUtils;

public class ParticipanteTipoView extends javax.swing.JFrame {
    
    //VARIAVEIS
    private ParticipanteTipoEntity entity;
    
    //NEGOCIO
    private ParticipanteTipoBO negocio;
    
    //FILTER
    private ParticipanteTipoFilter filter;
    
    //LISTAS
    private List<ParticipanteTipoEntity> listTipos;
    private List<Integer> sizeTable;
    
    //TABLE MODEL
    private CadastroTipoParticipantesTableModel tableModel;
    
    public ParticipanteTipoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        init();
    }
    
    private void init() {     
        
        rSTextFullRoundNome.setDocument(new StringDocument(60));      
        rSTextFullRoundCodigo.setDocument(new NumbersDocument(9));      
        negocio = new ParticipanteTipoBO();   
        
        sizeTable = new ArrayList<>();
        sizeTable.add(80);
        sizeTable.add(320);
        
        acaoCancelar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        buttonExit = new rojeru_san.rsbutton.RSButtonForma();
        jLabel4 = new javax.swing.JLabel();
        rSTextFullRoundCodigo = new rojeru_san.rsfield.RSTextFullRound();
        jLabel3 = new javax.swing.JLabel();
        rSTextFullRoundNome = new rojeru_san.rsfield.RSTextFullRound();
        rSLabelImageAdicionar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageBuscar = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImageEditar = new rojeru_san.rslabel.RSLabelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoParticipante = new javax.swing.JTable();
        rSButtonSalvar = new rojeru_san.rsbutton.RSButtonRoundRipple();
        rSButtonCancelar = new rojeru_san.rsbutton.RSButtonRoundRipple();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
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
                .addGap(10, 10, 10)
                .addComponent(jLabelTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        rSTextFullRoundCodigo.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rSTextFullRoundCodigo.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundCodigo.setPlaceholder("");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        rSTextFullRoundNome.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rSTextFullRoundNome.setPhColor(new java.awt.Color(0, 0, 0));
        rSTextFullRoundNome.setPlaceholder("");

        rSLabelImageAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/adicionar-24x24.png"))); // NOI18N
        rSLabelImageAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImageAdicionarMouseClicked(evt);
            }
        });

        rSLabelImageBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/buscar-24x24.png"))); // NOI18N
        rSLabelImageBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImageBuscarMouseClicked(evt);
            }
        });

        rSLabelImageEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/armandoDev/images/editar-24x24.png"))); // NOI18N
        rSLabelImageEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImageEditarMouseClicked(evt);
            }
        });

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
        jTableTipoParticipante.setRowHeight(20);
        jTableTipoParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoParticipanteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTipoParticipante);

        rSButtonSalvar.setBackground(new java.awt.Color(126, 217, 87));
        rSButtonSalvar.setText("Salvar");
        rSButtonSalvar.setColorHover(new java.awt.Color(85, 187, 42));
        rSButtonSalvar.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonSalvarActionPerformed(evt);
            }
        });

        rSButtonCancelar.setBackground(new java.awt.Color(255, 87, 87));
        rSButtonCancelar.setText("Cancelar");
        rSButtonCancelar.setColorHover(new java.awt.Color(239, 0, 0));
        rSButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 40));
        rSButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 10, 10))
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
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
                    .addComponent(rSLabelImageAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void rSLabelImageAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImageAdicionarMouseClicked
        
        rSTextFullRoundCodigo.setText(null);
        rSTextFullRoundCodigo.setEditable(false);
        rSTextFullRoundNome.setText(null);
        rSTextFullRoundNome.setEditable(true);
        rSLabelImageBuscar.setEnabled(false);
        rSLabelImageEditar.setEnabled(false);
        rSLabelImageAdicionar.setEnabled(false);
        jTableTipoParticipante.setEnabled(false);
        rSButtonSalvar.setEnabled(true);
        rSButtonCancelar.setEnabled(true);
        
    }//GEN-LAST:event_rSLabelImageAdicionarMouseClicked

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        entity = null;
        negocio = null;
        filter = null;
        listTipos = null;
        tableModel = null;
        sizeTable = null;
        this.dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void rSButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonCancelarActionPerformed
        acaoCancelar();
    }//GEN-LAST:event_rSButtonCancelarActionPerformed

    private void rSButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonSalvarActionPerformed
        
        try {
            
            LoadingInternal internal = new LoadingInternal(null, true);
            SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

                @Override
                protected Void doInBackground() throws Exception {
                    salvarTipoParticipante();
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
        
    }//GEN-LAST:event_rSButtonSalvarActionPerformed

    private void rSLabelImageEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImageEditarMouseClicked
        
        if (jTableTipoParticipante.getSelectedRowCount() == 1) {
            
            entity = tableModel.getRow(jTableTipoParticipante.getSelectedRow());
            rSTextFullRoundCodigo.setText(entity.getCodigo().toString());
            rSTextFullRoundNome.setText(entity.getNome());
            
            rSTextFullRoundCodigo.setEditable(false);
            rSTextFullRoundNome.setEditable(true);
            rSLabelImageBuscar.setEnabled(false);
            rSLabelImageEditar.setEnabled(false);
            rSLabelImageAdicionar.setEnabled(false);
            jTableTipoParticipante.setEnabled(false);
            rSButtonCancelar.setEnabled(true);
            rSButtonSalvar.setEnabled(true);
          
        }
        
    }//GEN-LAST:event_rSLabelImageEditarMouseClicked

    private void jTableTipoParticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoParticipanteMouseClicked
        if (evt.getClickCount() == 2 && jTableTipoParticipante.isEnabled()) rSLabelImageEditarMouseClicked(null);        
    }//GEN-LAST:event_jTableTipoParticipanteMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParticipanteTipoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonForma buttonExit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoParticipante;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonCancelar;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonSalvar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageAdicionar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageBuscar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImageEditar;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRoundCodigo;
    private rojeru_san.rsfield.RSTextFullRound rSTextFullRoundNome;
    // End of variables declaration//GEN-END:variables

    private void acaoCancelar() {
        
        rSTextFullRoundCodigo.setText(null);
        rSTextFullRoundCodigo.setEditable(true);
        rSTextFullRoundNome.setText(null);
        rSTextFullRoundNome.setEditable(true);
        rSLabelImageBuscar.setEnabled(true);
        rSLabelImageEditar.setEnabled(true);
        rSLabelImageAdicionar.setEnabled(true);
        jTableTipoParticipante.setEnabled(true);
        rSButtonCancelar.setEnabled(false);
        rSButtonSalvar.setEnabled(false);
        
        entity = null;
        
    }

    private void buscarTipoParticipante() {

        try {

            filter = new ParticipanteTipoFilter();
            filter.setCodigo(Long.valueOf(rSTextFullRoundCodigo.getText()));
            filter.setNome(rSTextFullRoundNome.getText());

            listTipos = negocio.getTipoParticipante(filter);
            tableModel = new CadastroTipoParticipantesTableModel(listTipos);
            jTableTipoParticipante.setModel(tableModel);
            TableUtil.configureTable(jTableTipoParticipante, sizeTable);

        } catch (ErroException e) {
            MessagesUtil.erroMessage(this, true, e.getMessage());
        }

    }
    
    private void salvarTipoParticipante() {
        
        try {
            
            if (validarCamposSalvar()) {
                
                entity = new ParticipanteTipoEntity();
                entity.setCodigo(Long.valueOf(rSTextFullRoundCodigo.getText()));
                entity.setNome(rSTextFullRoundNome.getText());
                
                negocio.salvarTipoParticipante(entity);
                MessagesUtil.sucessMessage(this, true);
                
                rSTextFullRoundCodigo.setText(null);
                rSTextFullRoundNome.setText(null);
                buscarTipoParticipante();
                acaoCancelar();
            }
            
        } catch (ErroException e) {
            MessagesUtil.erroMessage(this, true, e.getMessage());
        }
        
    }
    
    private boolean validarCamposSalvar() {
        
        if (StringUtils.isBlank(rSTextFullRoundNome.getText())) {
            MessagesUtil.alertMessage(this, true, "Informe o nome do Tipo de Participante");
            rSTextFullRoundNome.grabFocus();
            return false;
        }
        
        return true;
        
    }
       
}
