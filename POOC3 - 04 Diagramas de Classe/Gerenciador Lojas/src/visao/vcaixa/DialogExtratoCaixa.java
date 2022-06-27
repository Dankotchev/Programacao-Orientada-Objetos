package visao.vcaixa;

import controle.dao.ControleCompraBanco;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import controle.dao.ControleItemVendidoBanco;
import controle.dao.ControleVendaBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Compra;
import modelo.ItemVendido;
import modelo.Venda;

public class DialogExtratoCaixa extends javax.swing.JDialog {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private final NumberFormat nf = NumberFormat.getCurrencyInstance();

    private final ControleVendaBanco bancoVenda = new ControleVendaBanco();
    private final ControleCompraBanco bancoCompra = new ControleCompraBanco();
    private final ControleItemVendidoBanco bancoIV = new ControleItemVendidoBanco();

    private List<Venda> listaVenda = new ArrayList<>();
    private List<Compra> listaCompra = new ArrayList<>();

    private double saldoExtrato = 0.0;

    public DialogExtratoCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.getVendas();
        this.getCompras();
        this.atualizarTabela();
        this.labelSaldoAtual.setText(nf.format(this.saldoExtrato));

    }

    private void getCompras() {
        try {
            this.listaCompra = bancoCompra.listarTodos();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void getVendas() {
        try {
            this.listaVenda = bancoVenda.listarTodos();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void atualizarTabela() {
        int tamanhoVendas = this.listaVenda.size();
        int tamanhoCompras = this.listaCompra.size();

        int v = 0, c = 0, linha = 0;

        Compra com = null;
        Venda ven = null;

        do {
            if (c < tamanhoCompras) {
                com = this.listaCompra.get(c);
            }
            if (v < tamanhoVendas) {
                ven = this.listaVenda.get(v);
            }

            // Se a data de Compra for anterior a de venda, apresentar a compra
            // E incrementar o indice de compra
            if (c < tamanhoCompras && (com.getData().before(ven.getData()))) {
                this.inserirCompraTabela(com, linha ++);
                c++;
            } // Caso ao contrario, apresentar a Venda e incrementar o indice de venda
            else if (c < tamanhoCompras && (com.getData().after(ven.getData()))) {
                this.inserirVendaTabela(ven, linha ++);
                v++;
            } else if (v < tamanhoVendas && (com.getData().before(ven.getData()))) {
                this.inserirVendaTabela(ven, linha++);
                v++;
            } else if (v < tamanhoVendas && (com.getData().after(ven.getData()))) {
                this.inserirCompraTabela(com, linha++);
                c++;
            }

        } while (v < tamanhoVendas || c < tamanhoCompras);
    }

    private void inserirVendaTabela(Venda venda, int linha) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaExtrato.getModel();
        modelo.setRowCount(linha);

        try {
            // Busco todos os Item Vendidos de uma venda, e guardo sua lista
            List<ItemVendido> listaIV = new ArrayList<>();
            listaIV = this.bancoIV.retonarItemVendido(venda.getNrNF());
            venda.setListaIV(listaIV);

            // Apresentar o resultado na Tabela Extrato
            modelo.addRow(new Object[]{sdf.format(venda.getData()),
                venda.getTextoMovimento(), nf.format(venda.getValorMovimento())});

            this.saldoExtrato += venda.getValorMovimento();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (NotExistException ex) {
            System.out.println(ex.toString());
        }
    }

    private void inserirCompraTabela(Compra compra, int linha) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaExtrato.getModel();
        modelo.setRowCount(linha);

        modelo.addRow(new Object[]{sdf.format(compra.getData()),
            compra.getTextoMovimento(), nf.format(compra.getValorMovimento())});

        this.saldoExtrato += compra.getValorMovimento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExtrato = new javax.swing.JTable();
        botaoFechar = new javax.swing.JButton();
        labelDescSaldo = new javax.swing.JLabel();
        labelSaldoAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Extrato de Caixa");
        setMinimumSize(new java.awt.Dimension(600, 230));

        tabelaExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Movimentação", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaExtrato);
        if (tabelaExtrato.getColumnModel().getColumnCount() > 0) {
            tabelaExtrato.getColumnModel().getColumn(0).setMaxWidth(200);
            tabelaExtrato.getColumnModel().getColumn(1).setMinWidth(200);
            tabelaExtrato.getColumnModel().getColumn(2).setMinWidth(100);
        }

        botaoFechar.setBackground(new java.awt.Color(255, 51, 51));
        botaoFechar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        labelDescSaldo.setBackground(new java.awt.Color(153, 255, 153));
        labelDescSaldo.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        labelDescSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescSaldo.setText("Saldo em Caixa:");

        labelSaldoAtual.setBackground(new java.awt.Color(153, 255, 153));
        labelSaldoAtual.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        labelSaldoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoAtual.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDescSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescSaldo)
                    .addComponent(labelSaldoAtual))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

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
            System.out.println(ex.toString());

        } catch (InstantiationException ex) {
            System.out.println(ex.toString());

        } catch (IllegalAccessException ex) {
            System.out.println(ex.toString());

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.toString());
        }
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogExtratoCaixa dialog = new DialogExtratoCaixa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescSaldo;
    private javax.swing.JLabel labelSaldoAtual;
    private javax.swing.JTable tabelaExtrato;
    // End of variables declaration//GEN-END:variables

    private ControleItemVendidoBanco controleItemVendidoBanco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
