package visao;

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
        this.botaoCancelar.setVisible(false);
        this.botaoOK.setVisible(true);
        this.botaoConfimar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDadosTop = new javax.swing.JPanel();
        labelDadosProd = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelDadosTop.setBackground(new java.awt.Color(204, 204, 204));
        painelDadosTop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelDadosProd.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelDadosProd.setText("Informações do Produto");

        javax.swing.GroupLayout painelDadosTopLayout = new javax.swing.GroupLayout(painelDadosTop);
        painelDadosTop.setLayout(painelDadosTopLayout);
        painelDadosTopLayout.setHorizontalGroup(
            painelDadosTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDadosProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosTopLayout.setVerticalGroup(
            painelDadosTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDadosProd, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(painelDadosTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 455, -1));

        txtCodigo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 200, -1));

        labelCodigo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodigo.setText("Código");
        getContentPane().add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 70, -1));

        labelDescricao.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição");
        getContentPane().add(labelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 70, -1));

        txtDescricao.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, 455, 35));

        labelValorCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorCompra.setText("Valor de Compra");
        getContentPane().add(labelValorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, 200, -1));

        txtValorCusto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtValorCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 239, 200, -1));

        labelEstoque.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelEstoque.setText("Estoque");
        getContentPane().add(labelEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 76, 70, -1));

        txtQuantidade.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 99, 200, -1));

        labelValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorVenda.setText("Valor de Venda");
        getContentPane().add(labelValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 216, 200, -1));

        txtValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 239, 200, -1));

        botaoOK.setBackground(new java.awt.Color(153, 255, 153));
        botaoOK.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoOK.setText("OK");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });
        getContentPane().add(botaoOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 70, 46));

        botaoCancelar.setBackground(new java.awt.Color(255, 51, 0));
        botaoCancelar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 145, 46));

        botaoConfimar.setBackground(new java.awt.Color(153, 255, 153));
        botaoConfimar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoConfimar.setText("Confimar");
        botaoConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfimarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 145, 46));

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
    private javax.swing.JLabel labelDadosProd;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JLabel labelValorCompra;
    private javax.swing.JLabel labelValorVenda;
    private javax.swing.JPanel painelDadosTop;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorCusto;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
