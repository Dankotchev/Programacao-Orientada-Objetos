package visao.vvenda;

import controle.ControleClienteBanco;
import controle.ControleItemVendidoBanco;
import controle.ControleProdutoBanco;
import controle.ControleVendaBanco;
import controle.excecoes.NotExistException;
import controle.excecoes.InsufficientStockException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ItemVendido;
import modelo.Produto;
import modelo.Venda;

public class DialogInserirVenda extends javax.swing.JDialog {

    List<Produto> listaProduto = new ArrayList<>();

    ControleProdutoBanco bancoProduto = new ControleProdutoBanco();
    ControleItemVendidoBanco bancoIV = new ControleItemVendidoBanco();
    ControleClienteBanco bancoCliente = new ControleClienteBanco();
    ControleVendaBanco bancoVenda = new ControleVendaBanco();

    private int item;
    private double totalVenda;

    private Date data = new Date(System.currentTimeMillis());
    private SimpleDateFormat sdfBanco = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfVisao = new SimpleDateFormat("dd/MM/yyyy");

    public DialogInserirVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.botaoOK.setVisible(false);
        this.txtData.setText(sdfVisao.format(data));
    }

    public Venda getVenda() {
        Venda v = new Venda();

        v.setNrNF(Integer.parseInt(this.txtnrNF.getText()));
        v.setData(data);
        v.setFormaPagto(String.valueOf(this.cbFormaPagto.getSelectedItem()));
        return v;
    }

    public ItemVendido getIV() {
        ItemVendido iv = new ItemVendido();
        iv.setQuantidadeVendida(Integer.parseInt(this.txtQtdProduto.getText()));
        iv.setPrecoVenda(Double.parseDouble(this.txtValorVenda.getText()));
        return iv;
    }

    public int getNrNF() {
        return Integer.parseInt(this.txtnrNF.getText());
    }

    public int getCodProd() {
        return Integer.parseInt(this.txtCodProduto.getText());
    }

    public int getCodCli() {
        return Integer.parseInt(this.txtCodCliente.getText());
    }

    public void atualizarTabela(List<Produto> listaProduto) {
        this.item = 1;
        this.totalVenda = 0;
        double subtotal = 0;

        DefaultTableModel modelo = (DefaultTableModel) tabelaResumoVenda.getModel();
        modelo.setRowCount(0);

        for (Produto p : listaProduto) {
            subtotal = p.getValorVenda() * p.getQuantidade();
            modelo.addRow(new Object[]{item++, p.getCodigo(), p.getDescricao(),
                p.getValorVenda(), p.getQuantidade(), subtotal});
            this.totalVenda += subtotal;
        }
    }

//     throw InsufficientStockException 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnrNF = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelCodCliente = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoFinalizarVenda = new javax.swing.JButton();
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

        botaoFinalizarVenda.setBackground(new java.awt.Color(153, 255, 153));
        botaoFinalizarVenda.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoFinalizarVenda.setForeground(new java.awt.Color(0, 0, 0));
        botaoFinalizarVenda.setText("Finalizar Venda");
        botaoFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarVendaActionPerformed(evt);
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
        txtCodProduto.setText("0");

        txtQtdProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtQtdProduto.setText("0");

        labelQtdProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelQtdProduto.setText("Qtd");

        txtValorVenda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtValorVenda.setText("0");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(botaoInserirProduto)
                                .addGap(18, 18, 18)
                                .addComponent(labelCodProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelQtdProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValorVenda)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoFinalizarVenda)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarVendaActionPerformed
        ItemVendido iv;
        int cod = Integer.parseInt(this.txtCodCliente.getText());

        try {
            this.bancoVenda.inserir(this.getVenda(), cod);

            for (Produto p : this.listaProduto) {
                iv = new ItemVendido();
                iv.setPrecoVenda(p.getValorVenda());
                iv.setQuantidadeVendida(p.getQuantidade());

                this.bancoIV.inserir(iv, this.getNrNF(), p.getCodigo());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        this.setVisible(false);
    }//GEN-LAST:event_botaoFinalizarVendaActionPerformed

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoOKActionPerformed

    private void botaoInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirProdutoActionPerformed
        int codProduto = Integer.parseInt(this.txtCodProduto.getText());
        int qtdProduto = Integer.parseInt(this.txtQtdProduto.getText());
        double valorVenda = Double.parseDouble(this.txtValorVenda.getText());

        Produto pBanco = null;

        if (codProduto > -1) {
            try {
                pBanco = bancoProduto.pesquisar(codProduto);
                Produto pVenda = pBanco.clone();

                if (qtdProduto <= pBanco.getQuantidade()) {
                    pBanco.efetuarVenda(qtdProduto);
                    pVenda.setQuantidade(qtdProduto);
                    pVenda.setValorVenda(valorVenda);

                    this.bancoProduto.alterarVC(pBanco);
                    this.listaProduto.add(pVenda);
                    this.atualizarTabela(listaProduto);
                    this.txtTotalVenda.setText(String.valueOf(this.totalVenda));

                } else {
                    throw new InsufficientStockException();
                }

            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (NotExistException ex) {
                JOptionPane.showMessageDialog(null, "Código " + ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            } catch (CloneNotSupportedException ex) {
                System.out.println(ex.toString());
            } catch (InsufficientStockException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um Código de Produto.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoInserirProdutoActionPerformed

    private void txtCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodClienteFocusLost
        int codigo = Integer.parseInt(this.txtCodCliente.getText());
        try {
            if (!(bancoCliente.existe(codigo))) {
                JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (NotExistException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Informe um Código de Cliente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
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
    private javax.swing.JButton botaoFinalizarVenda;
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
