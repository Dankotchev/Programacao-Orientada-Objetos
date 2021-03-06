package controle.dao;

import controle.excecoes.NotExistException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Compra;

public class ControleCompraBanco {

    public void inserir(Compra c, int codProd) throws SQLException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "INSERT INTO compra (nrCompra, fornecedor, qtdComprada, valorCompra, codigoProdutoCompra, data) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, c.getNrCompra());
        executarSQL.setString(2, c.getFornecedor());
        executarSQL.setInt(3, c.getQtdComprada());
        executarSQL.setDouble(4, c.getValorCompra());
        executarSQL.setInt(5, codProd);
        executarSQL.setDate(6, new java.sql.Date(c.getData().getTime()));

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }

    public List<Compra> listarTodos() throws SQLException {

        List<Compra> listaVenda = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM compra WHERE status = true";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        ResultSet resultadoConsulta = executarSQL.executeQuery();

        Compra c;
        while (resultadoConsulta.next()) {
            c = new Compra();
            c.setNrCompra(resultadoConsulta.getInt("nrCompra"));
            c.setFornecedor(resultadoConsulta.getString("fornecedor"));
            c.setQtdComprada(resultadoConsulta.getInt("qtdComprada"));
            c.setValorCompra(resultadoConsulta.getDouble("valorCompra"));
            c.setData(resultadoConsulta.getDate("data"));
            listaVenda.add(c);
        }
        return listaVenda;
    }

    // Exclusão lógica das informações no Banco de Dados
    public void excluir(int nrCompra) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE compra SET status = false WHERE nrCompra = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, nrCompra);

        int linhas = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (linhas == 0) {
            throw new NotExistException();
        }
    }
    
        public Compra pesquisar(int nrCompra) throws SQLException, NotExistException {

        Compra c = null;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM compra WHERE (nrCompra = ?) AND (status = true)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrCompra);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.next();
        if (resultadoConsulta.getRow() > 0) {
            c = new Compra();
            c.setFornecedor(resultadoConsulta.getString("fornecedor"));
            c.setQtdComprada(resultadoConsulta.getInt("qtdComprada"));
            c.setValorCompra(resultadoConsulta.getDouble("valorCompra"));
            c.setData(resultadoConsulta.getDate("data")); 
        } else {
            throw new NotExistException();
        }
        executarSQL.close();
        conexao.close();
        return c;
    }

    public boolean existe(int nrCompra) throws SQLException, NotExistException {
        
        boolean existe = false;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM compra WHERE (nrCompra = ?) AND status = true";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrCompra);

        ResultSet resultadoConsulta = executarSQL.executeQuery();
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
    
    public int retonarCodProd(int nrCompra) throws SQLException, NotExistException{
        
        int codProduto;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM compra WHERE (nrCompra = ?) AND status = true";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrCompra);

        ResultSet resultadoConsulta = executarSQL.executeQuery();
        resultadoConsulta.next();
        if (resultadoConsulta.getRow() > 0) {
            codProduto = resultadoConsulta.getInt("codigoProdutoCompra");

        } else {
            throw new NotExistException();
        }

        executarSQL.close();
        conexao.close();
        return codProduto;
    }
}
