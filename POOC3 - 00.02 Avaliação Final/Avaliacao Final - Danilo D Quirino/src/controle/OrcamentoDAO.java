package controle;

import controle.excecao.NotExistException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Orcamento;

public class OrcamentoDAO {

    public void alterar(Orcamento o) throws SQLException, NotExistException {

        Connection conexao = GerenteConect.getConexao();
        String comandoSQL = "UPDATE orcamento SET data = ? WHERE codigoOrcamento = ?";
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setDate(1, new java.sql.Date(o.getDataAprovacao().getTime()));
        executarSQL.setInt(2, o.getCodigoOrcamento());

        int quantAlterados = executarSQL.executeUpdate();
        conexao.commit();
        executarSQL.close();
        conexao.close();

        if (quantAlterados == 0) {
            throw new NotExistException();
        }
    }
}
