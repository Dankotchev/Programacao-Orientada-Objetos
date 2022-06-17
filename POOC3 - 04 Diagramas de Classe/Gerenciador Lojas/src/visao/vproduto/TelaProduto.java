package visao.vproduto;

import controle.ControleProdutoBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Venda;
import visao.TelaInicial;

public class TelaProduto extends javax.swing.JFrame {

    ControleProdutoBanco bancoProduto = new ControleProdutoBanco();

    public TelaProduto() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoProdutoNovo = new javax.swing.JButton();
        botaoProdutoExcluir = new javax.swing.JButton();
        botaoProdutoAlterar = new javax.swing.JButton();
        botaoProdutoPequisar = new javax.swing.JButton();
        botaoProdutoListarTodos = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        txtCodigoProduto = new javax.swing.JTextField();
        codigoProduto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setMinimumSize(new java.awt.Dimension(230, 230));

        botaoProdutoNovo.setBackground(new java.awt.Color(153, 255, 153));
        botaoProdutoNovo.setForeground(new java.awt.Color(0, 0, 0));
        botaoProdutoNovo.setText("Novo Produto");
        botaoProdutoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoNovoActionPerformed(evt);
            }
        });

        botaoProdutoExcluir.setBackground(new java.awt.Color(153, 255, 255));
        botaoProdutoExcluir.setForeground(new java.awt.Color(0, 0, 0));
        botaoProdutoExcluir.setText("Excluir");
        botaoProdutoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoExcluirActionPerformed(evt);
            }
        });

        botaoProdutoAlterar.setBackground(new java.awt.Color(153, 255, 255));
        botaoProdutoAlterar.setForeground(new java.awt.Color(0, 0, 0));
        botaoProdutoAlterar.setText("Alterar");
        botaoProdutoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoAlterarActionPerformed(evt);
            }
        });

        botaoProdutoPequisar.setBackground(new java.awt.Color(153, 255, 255));
        botaoProdutoPequisar.setForeground(new java.awt.Color(0, 0, 0));
        botaoProdutoPequisar.setText("Pesquisar");
        botaoProdutoPequisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoPequisarActionPerformed(evt);
            }
        });

        botaoProdutoListarTodos.setBackground(new java.awt.Color(153, 255, 153));
        botaoProdutoListarTodos.setForeground(new java.awt.Color(0, 0, 0));
        botaoProdutoListarTodos.setText("Listar Todos");
        botaoProdutoListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoListarTodosActionPerformed(evt);
            }
        });

        botCancelar.setBackground(new java.awt.Color(255, 51, 51));
        botCancelar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });

        txtCodigoProduto.setText("1000");

        codigoProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        codigoProduto.setText("Informe um Código de Produto");
        codigoProduto.setToolTipText("");
        codigoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoProdutoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoProdutoPequisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoProdutoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoProdutoNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(botaoProdutoListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProdutoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProdutoAlterar)
                    .addComponent(botaoProdutoPequisar)
                    .addComponent(botaoProdutoExcluir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoProdutoListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProdutoPequisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoPequisarActionPerformed
        int cod = Integer.parseInt(this.txtCodigoProduto.getText());

        if (cod > 0) {
            DialogInformacoesProduto tela = new DialogInformacoesProduto(this, true);
            Venda p = null;

            try {
                p = bancoProduto.pesquisar(cod);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (p != null) {
                tela.setProduto(p);
                tela.ocultarBotoes();
                tela.setVisible(true);
                tela.setVisible(false);
            }
            tela.dispose();
        } else {
            // Não inseriu um código, apresentar mensagem
            JOptionPane.showMessageDialog(null, "Informe um Código de Produto.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoProdutoPequisarActionPerformed

    private void botaoProdutoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoNovoActionPerformed
        DialogInformacoesProduto tela = new DialogInformacoesProduto(this, true);
        tela.bloquearEstoque();
        tela.setVisible(true);

        try {
            bancoProduto.inserir(tela.getProduto());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        tela.dispose();
    }//GEN-LAST:event_botaoProdutoNovoActionPerformed

    private void botaoProdutoListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoListarTodosActionPerformed
        DialogListaProduto tela = new DialogListaProduto(this, true);
        this.setVisible(false);
        tela.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_botaoProdutoListarTodosActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botaoProdutoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoAlterarActionPerformed
        int cod = Integer.parseInt(this.txtCodigoProduto.getText());

        if (cod > 0) {
            DialogInformacoesProduto tela = new DialogInformacoesProduto(this, true);
            Venda p = null;

            try {
                p = bancoProduto.pesquisar(cod);
            } catch (SQLException ex) {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotExistException ex) {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (p != null) {
                tela.setProduto(p);
                tela.bloquearEstoque();
                tela.setVisible(true);

                p = tela.getProduto();
                try {
                    bancoProduto.alterar(p);
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                } catch (NotExistException ex) {
                    JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                }
                tela.setVisible(false);
            }
            tela.dispose();
        } else {
            // Não inseriu um código, apresentar mensagem
            JOptionPane.showMessageDialog(null, "Informe um Código de Produto.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoProdutoAlterarActionPerformed

    private void botaoProdutoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoExcluirActionPerformed
        int cod = Integer.parseInt(this.txtCodigoProduto.getText());

        if (cod > 0) {
            Venda p = null;

            try {
                p = bancoProduto.pesquisar(cod);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (p != null) {
                int resposta = JOptionPane.showConfirmDialog(null, "Confimar", "Exclusão de Produtos", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    try {
                        bancoProduto.excluir(cod);
                    } catch (SQLException ex) {
                        System.out.println(ex.toString());
                    } catch (NotExistException ex) {
                        JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um Código de Produto.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoProdutoExcluirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botaoProdutoAlterar;
    private javax.swing.JButton botaoProdutoExcluir;
    private javax.swing.JButton botaoProdutoListarTodos;
    private javax.swing.JButton botaoProdutoNovo;
    private javax.swing.JButton botaoProdutoPequisar;
    private javax.swing.JLabel codigoProduto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCodigoProduto;
    // End of variables declaration//GEN-END:variables

}
