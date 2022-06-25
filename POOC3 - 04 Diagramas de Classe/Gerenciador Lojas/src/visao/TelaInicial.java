package visao;

import visao.vcaixa.DialogExtratoCaixa;
import visao.vcliente.TelaCliente;
import visao.vproduto.TelaProduto;
import visao.vvenda.TelaVenda;
import visao.vcompra.DialogInserirCompra;
import visao.vcompra.TelaCompra;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boaoInicialProdutos = new javax.swing.JButton();
        botaoInicialClientes = new javax.swing.JButton();
        botaoInicialVendas = new javax.swing.JButton();
        botaoInicialCaixa = new javax.swing.JButton();
        labelTituloGL = new javax.swing.JLabel();
        botaoInicialCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Lojas");
        setBackground(new java.awt.Color(0, 102, 102));
        setMaximumSize(new java.awt.Dimension(380, 600));
        setMinimumSize(new java.awt.Dimension(380, 600));
        setResizable(false);

        boaoInicialProdutos.setText("Produtos");
        boaoInicialProdutos.setPreferredSize(new java.awt.Dimension(75, 75));
        boaoInicialProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boaoInicialProdutosActionPerformed(evt);
            }
        });

        botaoInicialClientes.setText("Clientes");
        botaoInicialClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicialClientesActionPerformed(evt);
            }
        });

        botaoInicialVendas.setText("Vendas");
        botaoInicialVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicialVendasActionPerformed(evt);
            }
        });

        botaoInicialCaixa.setText("Caixa");
        botaoInicialCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicialCaixaActionPerformed(evt);
            }
        });

        labelTituloGL.setBackground(new java.awt.Color(153, 255, 153));
        labelTituloGL.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        labelTituloGL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloGL.setText("Gerenciador de Lojas");

        botaoInicialCompra.setText("Comprar");
        botaoInicialCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicialCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelTituloGL, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(boaoInicialProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoInicialClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(botaoInicialVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoInicialCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botaoInicialCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTituloGL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boaoInicialProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInicialClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoInicialVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInicialCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoInicialCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boaoInicialProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boaoInicialProdutosActionPerformed
        TelaProduto tela = new TelaProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_boaoInicialProdutosActionPerformed

    private void botaoInicialClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicialClientesActionPerformed
        TelaCliente tela = new TelaCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoInicialClientesActionPerformed

    private void botaoInicialVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicialVendasActionPerformed
        TelaVenda tela = new TelaVenda();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoInicialVendasActionPerformed

    private void botaoInicialCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicialCaixaActionPerformed
        DialogExtratoCaixa tela = new DialogExtratoCaixa(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoInicialCaixaActionPerformed

    private void botaoInicialCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicialCompraActionPerformed
        TelaCompra tela = new TelaCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoInicialCompraActionPerformed

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
    private javax.swing.JButton boaoInicialProdutos;
    private javax.swing.JButton botaoInicialCaixa;
    private javax.swing.JButton botaoInicialClientes;
    private javax.swing.JButton botaoInicialCompra;
    private javax.swing.JButton botaoInicialVendas;
    private javax.swing.JLabel labelTituloGL;
    // End of variables declaration//GEN-END:variables
}
