package visao.vvenda;

import visao.vcliente.*;
import controle.ControleClienteBanco;
import controle.ControleItemVendidoBanco;
import controle.ControleVendaBanco;
import java.sql.SQLException;
import visao.TelaInicial;

public class TelaVenda extends javax.swing.JFrame {

    ControleVendaBanco bancoVenda = new ControleVendaBanco();
    ControleItemVendidoBanco bancoIV = new ControleItemVendidoBanco();
    ControleClienteBanco bancoCliente = new ControleClienteBanco();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVendaListarTodos)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVendaListarUltimas)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoVendaNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(botaoVendaListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVendaListarUltimas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVendaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaNovoActionPerformed
        DialogInserirVenda tela = new DialogInserirVenda(this, true);
        tela.setVisible(true);

    
        try {
            this.bancoVenda.inserir(tela.getVenda());
            this.bancoIV.inserir(tela.getIV(), tela.getNrNF(), tela.getCodProd());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
      


        tela.dispose();
    }//GEN-LAST:event_botaoVendaNovoActionPerformed

    private void botaoVendaListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaListarTodosActionPerformed
        DialogListaCliente tela = new DialogListaCliente(this, true);
        this.setVisible(false);
        tela.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_botaoVendaListarTodosActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botaoVendaListarUltimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaListarUltimasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVendaListarUltimasActionPerformed

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
    private javax.swing.JButton botaoVendaListarTodos;
    private javax.swing.JButton botaoVendaListarUltimas;
    private javax.swing.JButton botaoVendaNovo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

}
