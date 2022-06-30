package controle;

import controle.excecao.ApprovedBudgetException;
import controle.excecao.NotExistException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.MateriaPrima;
import modelo.Orcamento;
import modelo.Servico;

public class ControleOrcamento {

    private List<Orcamento> listaOrcamento = new ArrayList<>();
    private final OrcamentoDAO bancoOrcamento = new OrcamentoDAO();

    // 3 a
    public void adicionar(Orcamento orcamento, List<MateriaPrima> listaMP, List<Servico> listaS) {
        orcamento.setListaItens(listaMP);
        orcamento.setListaServicos(listaS);
        this.listaOrcamento.add(orcamento);
    }

    // 3 b
    public Orcamento localizar(int codOrcamento) throws NotExistException {
        Orcamento localizar = null;

        for (Orcamento orc : listaOrcamento) {
            if (codOrcamento == orc.getCodigoOrcamento()) {
                localizar = orc;
            }
        }

        if (localizar == null) {
            throw new NotExistException();
        }

        return localizar;
    }

    // 3 c
    public void adicionarItens(Orcamento o, MateriaPrima item) throws NotExistException, ApprovedBudgetException {
        for (Orcamento orcamento : listaOrcamento) {
            if (orcamento.equals(o)) {
                if (orcamento.getDataAprovacao().equals(null)) {
                    throw new ApprovedBudgetException();
                } else {
                    orcamento.getListaItens().add(item);
                }
            }
        }
    }

    // 3 d
    public List<Orcamento> orcamentoCliente(int codCliente) {
        List<Orcamento> listaOrcCliente = new ArrayList<>();
        for (Orcamento orcamento : listaOrcCliente) {
            if (orcamento.getCodigoCliente() == codCliente) {
                listaOrcCliente.add(orcamento);
            }
        }
        return listaOrcCliente;
    }

    // 3 e
    public void aprovarOrcamento(int codOrcamento) throws ApprovedBudgetException, SQLException, NotExistException {
        for (Orcamento orcamento : listaOrcamento) {
            if (orcamento.getCodigoOrcamento() == codOrcamento) {
                if (orcamento.getDataAprovacao().equals(null)) {
                    throw new ApprovedBudgetException();
                } else {
                    this.bancoOrcamento.alterar(orcamento);
                }
            }
        }
    }
}
