package controle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Venda;
import controle.excecoes.NotExistException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleVendaBanco {

    public void inserir(Venda v, int codCliente) throws SQLException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "INSERT INTO venda (nrNF, data, formaPagto, codigoClienteVenda) VALUES (?, ?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, v.getNrNF());
        executarSQL.setDate(2, new java.sql.Date(v.getData().getTime()));
        executarSQL.setString(3, v.getFormaPagto());
        executarSQL.setInt(4, codCliente);

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }

    // Exclusão lógica das informações no Banco de Dados
    public void excluir(int nrNF) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE venda SET status = false WHERE nrNF = ?";
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

    public Venda pesquisar(int nrNF) throws SQLException, NotExistException {

        Venda v = null;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM venda WHERE (nrNF = ?) AND (status = true)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrNF);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.next();
        if (resultadoConsulta.getRow() > 0) {
            v = new Venda();
            v.setNrNF(nrNF);
            v.setData(resultadoConsulta.getDate("data"));
            v.setFormaPagto("formaPagto");
        } else {
            throw new NotExistException();
        }
        executarSQL.close();
        conexao.close();
        return v;
    }

    public List<Venda> listarTodos() throws SQLException {

        List<Venda> listaVenda = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM venda WHERE status = true";

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

    public List<Venda> listarUltimas() throws SQLException {

        List<Venda> listaVenda = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM venda WHERE status = true ORDER BY data ASC LIMIT 10 ";

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

    public boolean existe(int nrNF) throws SQLException, NotExistException {

        boolean existe = false;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM venda WHERE (nrNF = ?) AND (status = true)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrNF);

        ResultSet resultadoConsulta;
        resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.next();
        if (resultadoConsulta.getRow() > 0) {
            existe = true;
        } else {
            throw new NotExistException();
        }

        executarSQL.close();
        conexao.close();
        return existe;
    }
}
