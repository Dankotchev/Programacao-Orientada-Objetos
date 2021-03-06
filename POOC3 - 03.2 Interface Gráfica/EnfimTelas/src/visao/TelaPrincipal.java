package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;

public class TelaPrincipal extends javax.swing.JFrame {

    private ArrayList<Aluno> listaAluno = new ArrayList<>();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);

        //Criação de um aluno
        Aluno aluno = new Aluno("123456789", "Nome da Nome", "Curso de Curso");
        listaAluno.add(aluno);

        this.atualizarTabela();
    }

    private void atualizarTabela() {
        // Pega o modelo da tabelaAlunos, como modelo padrão
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlunos.getModel();

        modelo.setRowCount(0);

        // Percorrer a lista de alunos e colocar na tabelaAlunos
        for (Aluno aluno : listaAluno) {
            modelo.addRow(new Object[]{aluno.getProntuario(), aluno.getNome(), aluno.getCurso()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCRUD = new javax.swing.JPanel();
        botNovoAluno = new javax.swing.JButton();
        botAlterarAluno = new javax.swing.JButton();
        botExcluirAluno = new javax.swing.JButton();
        botVisualizarAluno = new javax.swing.JButton();
        botSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jPanelTituloManter = new javax.swing.JPanel();
        jLabelManuAlunos = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCRUD.setBackground(new java.awt.Color(153, 255, 153));
        jPanelCRUD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jPanelCRUD.setToolTipText("");
        jPanelCRUD.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        botNovoAluno.setBackground(new java.awt.Color(204, 255, 204));
        botNovoAluno.setText("Novo");
        botNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoAlunoActionPerformed(evt);
            }
        });
        jPanelCRUD.add(botNovoAluno);

        botAlterarAluno.setBackground(new java.awt.Color(204, 255, 204));
        botAlterarAluno.setText("Alterar");
        botAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarAlunoActionPerformed(evt);
            }
        });
        jPanelCRUD.add(botAlterarAluno);

        botExcluirAluno.setBackground(new java.awt.Color(204, 255, 204));
        botExcluirAluno.setText("Excluir");
        botExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirAlunoActionPerformed(evt);
            }
        });
        jPanelCRUD.add(botExcluirAluno);

        botVisualizarAluno.setBackground(new java.awt.Color(204, 255, 204));
        botVisualizarAluno.setText("Visualizar");
        botVisualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVisualizarAlunoActionPerformed(evt);
            }
        });
        jPanelCRUD.add(botVisualizarAluno);

        botSair.setBackground(new java.awt.Color(204, 255, 204));
        botSair.setText("Sair");
        botSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSairActionPerformed(evt);
            }
        });
        jPanelCRUD.add(botSair);

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prontuário", "Nome", "Curso"
            }
        ));
        jScrollPane1.setViewportView(tabelaAlunos);

        jPanelTituloManter.setBackground(new java.awt.Color(153, 255, 153));

        jLabelManuAlunos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelManuAlunos.setText("Manutenção de Alunos");

        javax.swing.GroupLayout jPanelTituloManterLayout = new javax.swing.GroupLayout(jPanelTituloManter);
        jPanelTituloManter.setLayout(jPanelTituloManterLayout);
        jPanelTituloManterLayout.setHorizontalGroup(
            jPanelTituloManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloManterLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabelManuAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloManterLayout.setVerticalGroup(
            jPanelTituloManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloManterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManuAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloManter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTituloManter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoAlunoActionPerformed
        // Será acionado quando o botão for presionado
        // This indica que a tela atual é a responsável pelo dialog
        // True indica que o dialog será aberto de forma bloqueante
        DialogCadastroAluno tela = new DialogCadastroAluno(this, true);

        // Seta o aluno na tela
        //tela.setAluno(aluno);
        // Torna a tela visivel, bloqueando a tela principal
        tela.setVisible(true);
        listaAluno.add(tela.getAluno());

        this.atualizarTabela();

        tela.dispose(); // Libera a memória imediatamente
    }//GEN-LAST:event_botNovoAlunoActionPerformed

    private void botAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlterarAlunoActionPerformed
        // Pega a linha selecionada (-1 senão estiver selecionada)
        int linha = tabelaAlunos.getSelectedRow();

        if (linha != -1) {
            // Criação de uma tela dialog
            DialogCadastroAluno tela = new DialogCadastroAluno(this, true);
            // Pega da listaAluno e coloca na tela
            tela.setAluno(this.listaAluno.get(linha));
            tela.setVisible(true);

            // Troca os dados novos, inserirndo no lugar dos antigos
            listaAluno.set(linha, tela.getAluno());
            this.atualizarTabela();
            tela.setVisible(false);
            tela.dispose();
        } else {
            // Não selecionou uma linha da tabela, apresentar mensagem
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }

    }//GEN-LAST:event_botAlterarAlunoActionPerformed

    private void botExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirAlunoActionPerformed
        int linha = tabelaAlunos.getSelectedRow();

        if (linha != -1) {
            // Pega da listaAluno e exclui
            JOptionPane.showConfirmDialog(null, "Confimar?");
            listaAluno.remove(linha);
            this.atualizarTabela();

        } else {
            // Não selecionou uma linha da tabela, apresentar mensagem
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_botExcluirAlunoActionPerformed

    private void botVisualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVisualizarAlunoActionPerformed
        // Pega a linha selecionada (-1 senão estiver selecionada)
        int linha = tabelaAlunos.getSelectedRow();

        if (linha != -1) {
            // Criação de uma tela dialog
            DialogCadastroAluno tela = new DialogCadastroAluno(this, true);
            // Pega da listaAluno e coloca na tela
            tela.setAluno(this.listaAluno.get(linha));
            tela.bloquearCampos();
            tela.setVisible(true);

            tela.setVisible(false);
            tela.dispose();
        } else {
            // Não selecionou uma linha da tabela, apresentar mensagem
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_botVisualizarAlunoActionPerformed

    private void botSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAlterarAluno;
    private javax.swing.JButton botExcluirAluno;
    private javax.swing.JButton botNovoAluno;
    private javax.swing.JButton botSair;
    private javax.swing.JButton botVisualizarAluno;
    private javax.swing.JLabel jLabelManuAlunos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCRUD;
    private javax.swing.JPanel jPanelTituloManter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAlunos;
    // End of variables declaration//GEN-END:variables
}
