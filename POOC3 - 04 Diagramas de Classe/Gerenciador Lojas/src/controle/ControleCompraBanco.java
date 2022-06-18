package controle;

import controle.excecoes.NotExistException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Compra;
import modelo.Venda;

public class ControleCompraBanco {
    public void inserir(Compra c, int codProd) throws SQLException {

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "INSERT INTO compra (nrCompra, fornecedor, qtdComprada, valorCompra, codigoProdutoCompra) values (?, ?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, c.getNrCompra());
        executarSQL.setString(2, c.getFornecedor());
        executarSQL.setInt(3, c.getQtdComprada());
        executarSQL.setDouble(4, c.getValorCompra());
        executarSQL.setInt(5, codProd);

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }
    
    public List<Compra> listarTodos() throws SQLException {
        List<Compra> listaVenda = new ArrayList<>();
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM compra";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        Compra c;
        while (resultadoConsulta.next()) {
            c = new Compra();
            c.setNrCompra(resultadoConsulta.getInt("nrCompra"));
            c.setFornecedor(resultadoConsulta.getString("fornecedor"));
            c.setQtdComprada(resultadoConsulta.getInt("qtdComprada"));
            c.setValorCompra(resultadoConsulta.getDouble("valorCompra"));
            listaVenda.add(c);
        }
        return listaVenda;
    }
    
        public void excluir(int codCompra) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "DELETE FROM compra WHERE nrCompra = ?";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);
        executarSQL.setInt(1, codCompra);

        int linhas = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (linhas == 0) {
            throw new NotExistException();
        }
    }
}
