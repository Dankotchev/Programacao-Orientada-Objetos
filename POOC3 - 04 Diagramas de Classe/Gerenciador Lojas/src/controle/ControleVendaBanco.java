package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Venda;
import controle.excecoes.NotExistException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleVendaBanco {

    public void inserir(Venda v, int codCliente) throws SQLException {

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "INSERT INTO venda (nrNF, data, formaPagto, codigoClienteVenda) values (?, ?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, v.getNrNF());
        executarSQL.setDate(2, (Date) v.getData());
        executarSQL.setString(3, v.getFormaPagto());
        executarSQL.setInt(4, codCliente);

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }

    public void excluir(int nrNF) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "DELETE FROM venda WHERE nrNF = ?";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, nrNF);

        int linhas = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (linhas == 0) {
            throw new NotExistException();
        }
    }

    public List<Venda> listarTodos() throws SQLException {
        List<Venda> listaVenda = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM venda";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        Venda v;
        while (resultadoConsulta.next()) {
            v = new Venda();
            v.setNrNF(resultadoConsulta.getInt("nrNF"));
            v.setData(resultadoConsulta.getDate("data"));
            v.setFormaPagto(resultadoConsulta.getString("formaPagto"));
            listaVenda.add(v);
        }
        return listaVenda;
    }
}
