package visao.vproduto;

import modelo.Produto;

public class DialogInformacoesProduto extends javax.swing.JDialog {

    public DialogInformacoesProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.botaoOK.setVisible(false);
    }

    public void setProduto(Produto p) {
        this.txtCodigo.setText(String.valueOf(p.getCodigo()));
        this.txtDescricao.setText(p.getDescricao());
        this.txtQuantidade.setText(String.valueOf(p.getQuantidade()));
        this.txtValorCusto.setText(String.valueOf(p.getValorCusto()));
        this.txtValorVenda.setText(String.valueOf(p.getValorVenda()));
    }

    public Produto getProduto() {
       Produto p = new Produto();
        
        p.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
        p.setDescricao(this.txtDescricao.getText());
        p.setValorCusto(Double.parseDouble(this.txtValorCusto.getText()));
        p.setValorVenda(Double.parseDouble(this.txtValorVenda.getText()));

        return p;
    }

    public void bloquearAll() {
        this.txtCodigo.setEditable(false);
        this.txtDescricao.setEditable(false);
        this.txtQuantidade.setEditable(false);
        this.txtValorCusto.setEditable(false);
        this.txtValorVenda.setEditable(false);
    }

    public void bloquearEstoque() {
        this.txtQuantidade.setEditable(false);
    }
    
    public void ocultarBotoes() {
        this.bloquearAll();
        this.botaoCancelar.setVisible(false);
        this.botaoOK.setVisible(true);
        this.botaoConfimar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        labelValorCompra = new javax.swing.JLabel();
        txtValorCusto = new javax.swing.JTextField();
        labelEstoque = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        labelValorVenda = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        botaoOK = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoConfimar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCodigo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelCodigo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodigo.setText("Código");

        labelDescricao.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição");

        txtDescricao.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelValorCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorCompra.setText("Valor de Compra");

        txtValorCusto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelEstoque.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelEstoque.setText("Estoque");

        txtQuantidade.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorVenda.setText("Valor de Venda");

        txtValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        botaoOK.setBackground(new java.awt.Color(153, 255, 153));
        botaoOK.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoOK.setForeground(new java.awt.Color(0, 0, 0));
        botaoOK.setText("OK");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(255, 51, 0));
        botaoCancelar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoConfimar.setBackground(new java.awt.Color(153, 255, 153));
        botaoConfimar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoConfimar.setForeground(new java.awt.Color(0, 0, 0));
        botaoConfimar.setText("Confimar");
        botaoConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfimarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180)
                                .addComponent(labelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(labelValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigo)
                    .addComponent(labelEstoque))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(labelDescricao)
                .addGap(13, 13, 13)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValorCompra)
                    .addComponent(labelValorVenda))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoOKActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfimarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoConfimarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogInformacoesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInformacoesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInformacoesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInformacoesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogInformacoesProduto dialog = new DialogInformacoesProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfimar;
    private javax.swing.JButton botaoOK;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JLabel labelValorCompra;
    private javax.swing.JLabel labelValorVenda;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorCusto;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
