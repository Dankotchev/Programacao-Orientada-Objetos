package visao.vvenda;

import controle.Estoque;
import controle.dao.ControleItemVendidoBanco;
import controle.dao.ControleVendaBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.ItemVendido;
import modelo.Venda;
import visao.TelaInicial;

public class TelaVenda extends javax.swing.JFrame {

    private final ControleVendaBanco bancoVenda = new ControleVendaBanco();
    private final ControleItemVendidoBanco bancoIV = new ControleItemVendidoBanco();
    private List<Venda> listaVenda = new ArrayList<>();

    public TelaVenda() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVendaNovo = new javax.swing.JButton();
        botaoVendaListarTodos = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        botaoVendaListarUltimas = new javax.swing.JButton();
        labelNrNF = new javax.swing.JLabel();
        txtnrNFVenda = new javax.swing.JTextField();
        botaoVendaExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setMinimumSize(new java.awt.Dimension(230, 230));

        botaoVendaNovo.setBackground(new java.awt.Color(153, 255, 153));
        botaoVendaNovo.setForeground(new java.awt.Color(0, 0, 0));
        botaoVendaNovo.setText("Nova Venda");
        botaoVendaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaNovoActionPerformed(evt);
            }
        });

        botaoVendaListarTodos.setBackground(new java.awt.Color(153, 255, 153));
        botaoVendaListarTodos.setForeground(new java.awt.Color(0, 0, 0));
        botaoVendaListarTodos.setText("Listar Todas Vendas");
        botaoVendaListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaListarTodosActionPerformed(evt);
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

        botaoVendaListarUltimas.setBackground(new java.awt.Color(153, 255, 153));
        botaoVendaListarUltimas.setForeground(new java.awt.Color(0, 0, 0));
        botaoVendaListarUltimas.setText("Listar Ultimas Vendas");
        botaoVendaListarUltimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaListarUltimasActionPerformed(evt);
            }
        });

        labelNrNF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNrNF.setText("Informe um Nota Fiscal");
        labelNrNF.setToolTipText("");
        labelNrNF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtnrNFVenda.setText("10");

        botaoVendaExcluir.setBackground(new java.awt.Color(153, 255, 255));
        botaoVendaExcluir.setText("Excluir");
        botaoVendaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVendaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnrNFVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoVendaNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoVendaListarTodos)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaListarUltimas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(labelNrNF)))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVendaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnrNFVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVendaExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNrNF)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVendaListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVendaListarUltimas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVendaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaNovoActionPerformed

        DialogInserirVenda tela = new DialogInserirVenda(this, true);
        tela.setVisible(true);
        Venda venda = tela.getVenda();

        try {
            this.bancoVenda.inserir(venda, tela.getCodCli());
            for (ItemVendido iv : venda.getListaIV()) {
                this.bancoIV.inserir(iv, venda.getNrNF());
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        tela.dispose();
    }//GEN-LAST:event_botaoVendaNovoActionPerformed

    private void botaoVendaListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaListarTodosActionPerformed
        try {
            this.listaVenda = this.bancoVenda.listarTodos();
            DialogListaVenda tela = new DialogListaVenda(this, true);
            tela.atualizarTabela(this.listaVenda);

            this.setVisible(false);
            tela.setVisible(true);
            this.setVisible(true);

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_botaoVendaListarTodosActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botaoVendaListarUltimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaListarUltimasActionPerformed
        try {
            this.listaVenda = this.bancoVenda.listarUltimas();
            DialogListaVenda tela = new DialogListaVenda(this, true);
            tela.atualizarTabela(this.listaVenda);

            this.setVisible(false);
            tela.setVisible(true);
            this.setVisible(true);

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_botaoVendaListarUltimasActionPerformed

    private void botaoVendaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaExcluirActionPerformed
        // Essa função exclui de forma lógica no Banco de Dados
        try {
            if (this.bancoVenda.existe(this.getNF())) {
                // Se a venda existir, pede confirmação da exclusão
                int resposta = JOptionPane.showConfirmDialog(null, "Confimar", "Exclusão de Cliente", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    // Retornar os produtos vendidos para o estoque
                    Estoque e = new Estoque();
                    e.retornarVenda(this.getNF());
                    this.bancoVenda.excluir(this.getNF());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (NotExistException ex) {
            JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe uma Nota Fiscal", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoVendaExcluirActionPerformed

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

    private int getNF() {
        return Integer.parseInt(this.txtnrNFVenda.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botaoVendaExcluir;
    private javax.swing.JButton botaoVendaListarTodos;
    private javax.swing.JButton botaoVendaListarUltimas;
    private javax.swing.JButton botaoVendaNovo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelNrNF;
    private javax.swing.JTextField txtnrNFVenda;
    // End of variables declaration//GEN-END:variables

}
