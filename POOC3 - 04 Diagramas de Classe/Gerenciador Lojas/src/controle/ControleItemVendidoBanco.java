package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Venda;
import controle.excecoes.NotExistException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemVendido;

public class ControleItemVendidoBanco {

    public void inserir(ItemVendido iv, int nrNF, int codProduto) throws SQLException {

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "INSERT INTO itemvendido (quantidadeVendida, precoVenda, nrNFVenda, codigoProduto) values (?, ?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, iv.getQuantidadeVendida());
        executarSQL.setDouble(2, iv.getPrecoVenda());
        executarSQL.setInt(3, nrNF);
        executarSQL.setInt(4, codProduto);

        executarSQL.executeUpdate();

        conexao.commit();

        executarSQL.close();

        conexao.close();
    }

     public List<ItemVendido> pesquisar(int notaFiscal) throws SQLException, NotExistException {
        List<ItemVendido> listaIV = new ArrayList<>();
        ItemVendido iv = null;

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM itemvendido WHERE nrNFVenda = ?";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, notaFiscal);

        ResultSet resultadoConsulta = executarSQL.executeQuery();

        while (resultadoConsulta.next()) {
            iv = new ItemVendido();
            iv.setQuantidadeVendida(resultadoConsulta.getInt("quantidadeVendida"));
            iv.setPrecoVenda(resultadoConsulta.getDouble("precoVenda"));
            listaIV.add(iv);
        }
        return listaIV;
    }
}
