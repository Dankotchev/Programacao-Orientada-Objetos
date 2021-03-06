package controle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controle.excecoes.NotExistException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemVendido;

public class ControleItemVendidoBanco {

    public void inserir(ItemVendido iv, int nrNF) throws SQLException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "INSERT INTO itemvendido (quantidadeVendida, precoVenda, nrNFVenda, codigoProdutoIV) VALUES (?, ?, ?, ?)";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, iv.getQuantidadeVendida());
        executarSQL.setDouble(2, iv.getPrecoVenda());
        executarSQL.setInt(3, nrNF);
        executarSQL.setInt(4, iv.getCodProduto());

        executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();
    }

    public List<ItemVendido> retonarItemVendido(int nrNF) throws SQLException, NotExistException {

        List<ItemVendido> listaIV = new ArrayList<>();
        ItemVendido iv = null;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM itemvendido WHERE nrNFVenda = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrNF);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        while (resultadoConsulta.next()) {
            iv = new ItemVendido();
            iv.setQuantidadeVendida(resultadoConsulta.getInt("quantidadeVendida"));
            iv.setPrecoVenda(resultadoConsulta.getDouble("precoVenda"));
            iv.setCodProduto(resultadoConsulta.getInt("codigoProdutoIV"));
            listaIV.add(iv);
        }
        return listaIV;
    }

    public void excluir(int nrNF) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "DELETE FROM itemvendido WHERE nrNF = ?";
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

    public double getTotalVenda(int nrNF) throws SQLException, NotExistException {

        double totalVenda = 0;
        List<ItemVendido> listaIV = new ArrayList<>();

        listaIV = this.retonarItemVendido(nrNF);
        for (ItemVendido iv : listaIV) {
            totalVenda += (iv.getPrecoVenda() * iv.getQuantidadeVendida());
        }

        return totalVenda;
    }

    public ItemVendido pesquisar(int nrNF) throws SQLException, NotExistException {
        ItemVendido iv = null;
        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "SELECT * FROM itemvendido WHERE nrNFVenda = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, nrNF);
        ResultSet resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.last();
        if (resultadoConsulta.getRow() > 0) {
            iv = new ItemVendido();
            iv.setPrecoVenda(resultadoConsulta.getDouble("precoVenda"));
            iv.setQuantidadeVendida(resultadoConsulta.getInt("quantidadeVendida"));

        } else {
            throw new NotExistException();
        }
        executarSQL.close();
        conexao.close();
        return iv;
    }
}
