package visao.vcompra;

import controle.dao.ControleProdutoBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Compra;

public class DialogInserirCompra extends javax.swing.JDialog {

    private ControleProdutoBanco bancoProduto = new ControleProdutoBanco();

    private Date data = new Date(System.currentTimeMillis());
    private final SimpleDateFormat sdfVisao = new SimpleDateFormat("dd/MM/yyyy");

    public DialogInserirCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.txtDataCompra.setText(sdfVisao.format(this.data));
    }

    public Compra getCompra() {
        Compra c = new Compra();

        c.setNrCompra(Integer.parseInt(this.txtNrCompra.getText()));
        c.setFornecedor(this.txtFornecedor.getText());
        c.setQtdComprada(Integer.parseInt(this.txtQuantidade.getText()));
        c.setValorCompra(Double.valueOf(this.txtValorCompra.getText()));
        c.setData(this.data);

        return c;
    }

    public int getNrCompra() {
        return Integer.parseInt(this.txtNrCompra.getText());
    }

    public int getCodProduto() {
        return Integer.parseInt(this.txtCodProduto.getText());
    }

    public int getQtd() {
        return Integer.parseInt(this.txtQuantidade.getText());
    }

    public double getValorCompra() {
        return Double.parseDouble(this.txtValorCompra.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNrCompra = new javax.swing.JTextField();
        labelNrCompra = new javax.swing.JLabel();
        labelFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoConfimar = new javax.swing.JButton();
        labelQuantidade = new javax.swing.JLabel();
        labelValorCompra = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        txtCodProduto = new javax.swing.JTextField();
        labelCodProduto = new javax.swing.JLabel();
        labelDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações dos Clientes");

        txtNrCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelNrCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelNrCompra.setText("# Compra");

        labelFornecedor.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelFornecedor.setText("Fornecedor");

        txtFornecedor.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        txtQuantidade.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        botaoCancelar.setBackground(new java.awt.Color(255, 51, 0));
        botaoCancelar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoConfimar.setBackground(new java.awt.Color(153, 255, 153));
        botaoConfimar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoConfimar.setText("Confimar");
        botaoConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfimarActionPerformed(evt);
            }
        });

        labelQuantidade.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelQuantidade.setText("Quantidade");

        labelValorCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorCompra.setText("Valor Compra");

        txtValorCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        txtCodProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodProdutoFocusLost(evt);
            }
        });

        labelCodProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodProduto.setText("Codigo do Produto");

        labelDataCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelDataCompra.setText("Data");

        txtDataCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNrCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNrCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(labelCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNrCompra)
                    .addComponent(labelCodProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelDataCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(labelValorCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfimarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoConfimarActionPerformed

    private void txtCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProdutoFocusLost

        try {
            if (!(bancoProduto.existe(this.getCodProduto()))) {
                JOptionPane.showMessageDialog(null, "Informe um Código de Produto Válido.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (NotExistException ex) {
            JOptionPane.showMessageDialog(null, "Informe um Código de Produto Válido.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtCodProdutoFocusLost

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
            java.util.logging.Logger.getLogger(DialogInserirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInserirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInserirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInserirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogInserirCompra dialog = new DialogInserirCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel labelCodProduto;
    private javax.swing.JLabel labelDataCompra;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelNrCompra;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelValorCompra;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDataCompra;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNrCompra;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
