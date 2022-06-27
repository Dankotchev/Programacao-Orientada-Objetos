package controle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Produto;
import controle.excecoes.NotExistException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleProdutoBanco {

    public void inserir(Produto p) throws SQLException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "INSERT INTO produto (codigoProduto, descricao, valorVenda, valorCusto) VALUES (?, ?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, p.getCodigo());
        executarSQL.setString(2, p.getDescricao());
        executarSQL.setDouble(3, p.getValorVenda());
        executarSQL.setDouble(4, p.getValorCusto());

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }

    // Exclusão lógica das informações no Banco de Dados
    public void excluir(int codigo) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE produto SET status = false WHERE codigoProduto = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, codigo);

        int linhas = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (linhas == 0) {
            throw new NotExistException();
        }
    }

    public void alterar(Produto p) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE produto SET descricao = ?, valorVenda = ?, valorCusto = ? WHERE codigoProduto = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setString(1, p.getDescricao());
        executarSQL.setDouble(2, p.getValorVenda());
        executarSQL.setDouble(3, p.getValorCusto());
        executarSQL.setInt(4, p.getCodigo());

        int quantAlterados = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (quantAlterados == 0) {
            throw new NotExistException();
        }
    }

    public void alterarVC(Produto p) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE produto SET quantidade = ?, valorVenda = ?, valorCusto = ? WHERE codigoProduto = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(2, p.getQuantidade());
        executarSQL.setDouble(3, p.getValorVenda());
        executarSQL.setDouble(4, p.getValorCusto());
        executarSQL.setInt(5, p.getCodigo());

        int quantAlterados = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (quantAlterados == 0) {
            throw new NotExistException();
        }
    }

    public Produto pesquisar(int codigo) throws SQLException, NotExistException {

        Produto p = null;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM produto WHERE (codigoProduto = ?) AND (status = true)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, codigo);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.next();
        if (resultadoConsulta.getRow() > 0) {
            p = new Produto();
            p.setCodigo(codigo);
            p.setDescricao(resultadoConsulta.getString("descricao"));
            p.setQuantidade(resultadoConsulta.getInt("quantidade"));
            p.setValorCusto(resultadoConsulta.getDouble("valorCusto"));
            p.setValorVenda(resultadoConsulta.getDouble("valorVenda"));
        } else {
            throw new NotExistException();
        }
        executarSQL.close();
        conexao.close();
        return p;
    }

    public List<Produto> listarTodos() throws SQLException {
        List<Produto> listaProduto = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM produto WHERE status = true";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        Produto p;
        while (resultadoConsulta.next()) {
            p = new Produto();
            p.setCodigo(resultadoConsulta.getInt("codigoProduto"));
            p.setDescricao(resultadoConsulta.getString("descricao"));
            p.setQuantidade(resultadoConsulta.getInt("quantidade"));
            p.setValorCusto(resultadoConsulta.getDouble("valorCusto"));
            p.setValorVenda(resultadoConsulta.getDouble("valorVenda"));

            listaProduto.add(p);
        }
        return listaProduto;
    }

    public boolean existe(int codigo) throws SQLException, NotExistException {

        boolean existe = false;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM produto WHERE (codigoProduto = ?) AND (status = true)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, codigo);
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
