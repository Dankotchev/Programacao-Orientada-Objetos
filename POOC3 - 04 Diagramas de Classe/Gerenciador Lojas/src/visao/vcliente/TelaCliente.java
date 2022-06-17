package visao.vcliente;

import controle.ControleClienteBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import visao.TelaInicial;

public class TelaCliente extends javax.swing.JFrame {

    ControleClienteBanco bancoCliente = new ControleClienteBanco();
    List<Cliente> listaCliente = new ArrayList<>();

    public TelaCliente() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoClienteNovo = new javax.swing.JButton();
        botaoClienteExcluir = new javax.swing.JButton();
        botaoClienteAlterar = new javax.swing.JButton();
        botaoClientePequisar = new javax.swing.JButton();
        botaoClienteListarTodos = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        codigoProduto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(230, 230));

        botaoClienteNovo.setBackground(new java.awt.Color(153, 255, 153));
        botaoClienteNovo.setForeground(new java.awt.Color(0, 0, 0));
        botaoClienteNovo.setText("Novo Cliente");
        botaoClienteNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteNovoActionPerformed(evt);
            }
        });

        botaoClienteExcluir.setBackground(new java.awt.Color(153, 255, 255));
        botaoClienteExcluir.setForeground(new java.awt.Color(0, 0, 0));
        botaoClienteExcluir.setText("Excluir");
        botaoClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteExcluirActionPerformed(evt);
            }
        });

        botaoClienteAlterar.setBackground(new java.awt.Color(153, 255, 255));
        botaoClienteAlterar.setForeground(new java.awt.Color(0, 0, 0));
        botaoClienteAlterar.setText("Alterar");
        botaoClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteAlterarActionPerformed(evt);
            }
        });

        botaoClientePequisar.setBackground(new java.awt.Color(153, 255, 255));
        botaoClientePequisar.setForeground(new java.awt.Color(0, 0, 0));
        botaoClientePequisar.setText("Pesquisar");
        botaoClientePequisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientePequisarActionPerformed(evt);
            }
        });

        botaoClienteListarTodos.setBackground(new java.awt.Color(153, 255, 153));
        botaoClienteListarTodos.setForeground(new java.awt.Color(0, 0, 0));
        botaoClienteListarTodos.setText("Listar Todos");
        botaoClienteListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteListarTodosActionPerformed(evt);
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

        txtCodigoCliente.setText("10");

        codigoProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        codigoProduto.setText("Informe um Código de Cliente");
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
                                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoClientePequisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoClienteNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(botaoClienteListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoClienteNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoClienteAlterar)
                    .addComponent(botaoClientePequisar)
                    .addComponent(botaoClienteExcluir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoClienteListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClientePequisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientePequisarActionPerformed
        int cod = Integer.parseInt(this.txtCodigoCliente.getText());

        if (cod > 0) {
            DialogInformacoesCliente tela = new DialogInformacoesCliente(this, true);
            Cliente c = null;

            try {
                c = bancoCliente.pesquisar(cod);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (c != null) {
                tela.setCliente(c);
                tela.ocultarBotoes();
                tela.setVisible(true);
                tela.setVisible(false);
            }
            tela.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoClientePequisarActionPerformed

    private void botaoClienteNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteNovoActionPerformed
        DialogInformacoesCliente tela = new DialogInformacoesCliente(this, true);
        tela.setVisible(true);

        try {
            bancoCliente.inserir(tela.getCliente());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        tela.dispose();
    }//GEN-LAST:event_botaoClienteNovoActionPerformed

    private void botaoClienteListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteListarTodosActionPerformed
        try {
            this.listaCliente = this.bancoCliente.listarTodos();
            DialogListaCliente tela = new DialogListaCliente(this, true);
            tela.atualizarTabela(listaCliente);
            
            this.setVisible(false);
            tela.setVisible(true);
            this.setVisible(true);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_botaoClienteListarTodosActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botaoClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteAlterarActionPerformed
        int cod = Integer.parseInt(this.txtCodigoCliente.getText());

        if (cod > 0) {
            DialogInformacoesCliente tela = new DialogInformacoesCliente(this, true);
            Cliente c = null;

            try {
                c = bancoCliente.pesquisar(cod);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (c != null) {
                tela.setCliente(c);
                tela.setVisible(true);

                c = tela.getCliente();
                try {
                    bancoCliente.alterar(c);
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
            JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoClienteAlterarActionPerformed

    private void botaoClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteExcluirActionPerformed
        int cod = Integer.parseInt(this.txtCodigoCliente.getText());

        if (cod > 0) {
            Cliente c = null;

            try {
                c = bancoCliente.pesquisar(cod);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

            if (c != null) {
                int resposta = JOptionPane.showConfirmDialog(null, "Confimar", "Exclusão de Produtos", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    try {
                        bancoCliente.excluir(cod);
                    } catch (SQLException ex) {
                        System.out.println(ex.toString());
                    } catch (NotExistException ex) {
                        JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoClienteExcluirActionPerformed

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
            @Override
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botaoClienteAlterar;
    private javax.swing.JButton botaoClienteExcluir;
    private javax.swing.JButton botaoClienteListarTodos;
    private javax.swing.JButton botaoClienteNovo;
    private javax.swing.JButton botaoClientePequisar;
    private javax.swing.JLabel codigoProduto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCodigoCliente;
    // End of variables declaration//GEN-END:variables

}
