package visao.vvenda;

import controle.ControleClienteBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import visao.vcliente.*;
import modelo.Cliente;
import modelo.ItemVendido;

public class DialogInserirVenda extends javax.swing.JDialog {

    List<ItemVendido> listaVenda = new ArrayList<>();
    ControleClienteBanco bancoCliente = new ControleClienteBanco();

    public DialogInserirVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.botaoOK.setVisible(false);

        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat sdfBanco = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfVisao = new SimpleDateFormat("dd/MM/yyyy");
        this.txtData.setText(sdfVisao.format(data));
    }

    public void setCliente(Cliente c) {
        this.txtnrNF.setText(String.valueOf(c.getCodigo()));
        this.txtNome.setText(c.getNome());
        this.txtContato.setText(c.getContato());
    }

    public Cliente getCliente() {
        Cliente c = new Cliente();

        c.setCodigo(Integer.parseInt(this.txtnrNF.getText()));
        c.setNome(this.txtNome.getText());
        c.setContato(this.txtContato.getText());

        return c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnrNF = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelCodCliente = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoConfimar = new javax.swing.JButton();
        botaoOK = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtData = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResumoVenda = new javax.swing.JTable();
        labelResumoVenda = new javax.swing.JLabel();
        cbFormaPagto = new javax.swing.JComboBox<>();
        labelFormaPagto = new javax.swing.JLabel();
        botaoInserirProduto = new javax.swing.JButton();
        labelCodProduto = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        txtQtdProduto = new javax.swing.JTextField();
        labelQtdProduto = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        labelValorVenda = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotalVenda = new javax.swing.JTextField();
        jLabelTotalVenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Venda");

        txtnrNF.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelCodigo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodigo.setText("Número Nota Fiscal");

        labelCodCliente.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodCliente.setText("Código Cliente:");

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
        botaoConfimar.setText("Finalizar Venda");
        botaoConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfimarActionPerformed(evt);
            }
        });

        botaoOK.setBackground(new java.awt.Color(153, 255, 153));
        botaoOK.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoOK.setForeground(new java.awt.Color(0, 0, 0));
        botaoOK.setText("OK");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelData.setText("Data");

        txtCodCliente.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodClienteFocusLost(evt);
            }
        });

        tabelaResumoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Valor Unitário", "Qtd.", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(tabelaResumoVenda);
        if (tabelaResumoVenda.getColumnModel().getColumnCount() > 0) {
            tabelaResumoVenda.getColumnModel().getColumn(0).setMaxWidth(60);
            tabelaResumoVenda.getColumnModel().getColumn(1).setMaxWidth(150);
            tabelaResumoVenda.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        labelResumoVenda.setText("Resumo da Venda");

        cbFormaPagto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Dinheiro", "Cheque", "Cartão de Crédito" }));

        labelFormaPagto.setText("Forma de Pagamento");

        botaoInserirProduto.setBackground(new java.awt.Color(204, 204, 204));
        botaoInserirProduto.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoInserirProduto.setForeground(new java.awt.Color(0, 0, 0));
        botaoInserirProduto.setText("Inserir Produto");
        botaoInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirProdutoActionPerformed(evt);
            }
        });

        labelCodProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelCodProduto.setText("Código Produto:");

        txtCodProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        txtQtdProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelQtdProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelQtdProduto.setText("Qtd");

        txtValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        labelValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelValorVenda.setText("Valor Unitário");

        txtTotalVenda.setFont(new java.awt.Font("Fira Sans", 1, 15)); // NOI18N
        txtTotalVenda.setText("0");

        jLabelTotalVenda.setFont(new java.awt.Font("Fira Sans", 1, 15)); // NOI18N
        jLabelTotalVenda.setText("Total da Venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnrNF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(labelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(labelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodCliente)
                                    .addComponent(labelCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoInserirProduto)
                                .addGap(18, 18, 18)
                                .addComponent(labelCodProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelQtdProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValorVenda)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoConfimar)
                                .addGap(179, 179, 179)
                                .addComponent(botaoOK)
                                .addGap(164, 164, 164)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTotalVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelResumoVenda)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelData)
                    .addComponent(labelCodCliente)
                    .addComponent(labelFormaPagto))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnrNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserirProduto)
                    .addComponent(labelCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelResumoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalVenda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfimarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoConfimarActionPerformed

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoOKActionPerformed

    private void botaoInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoInserirProdutoActionPerformed

    private void txtCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodClienteFocusLost
//        int codigo = Integer.parseInt(this.txtCodCliente.getText());
//        try {
//            if (!(bancoCliente.existe(codigo))) {
//                JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        } catch (NotExistException ex) {
//            System.out.println(ex.toString());
//            JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_txtCodClienteFocusLost

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
            java.util.logging.Logger.getLogger(DialogInserirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInserirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInserirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInserirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogInserirVenda dialog = new DialogInserirVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoInserirProduto;
    private javax.swing.JButton botaoOK;
    private javax.swing.JComboBox<String> cbFormaPagto;
    private javax.swing.JLabel jLabelTotalVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCodCliente;
    private javax.swing.JLabel labelCodProduto;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelFormaPagto;
    private javax.swing.JLabel labelQtdProduto;
    private javax.swing.JLabel labelResumoVenda;
    private javax.swing.JLabel labelValorVenda;
    private javax.swing.JTable tabelaResumoVenda;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQtdProduto;
    private javax.swing.JTextField txtTotalVenda;
    private javax.swing.JTextField txtValorVenda;
    private javax.swing.JTextField txtnrNF;
    // End of variables declaration//GEN-END:variables
}
