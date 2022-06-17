package controle;

import controle.excecoes.NotExistException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ControleClienteBanco {

    public void inserir(Cliente c) throws SQLException {

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "INSERT INTO cliente (codigo, nome, contato) values (?, ?, ?)";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, c.getCodigo());
        executarSQL.setString(2, c.getNome());
        executarSQL.setString(3, c.getContato());

        executarSQL.executeUpdate();

        conexao.commit();

        executarSQL.close();

        conexao.close();
    }

    public void excluir(int codigo) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "DELETE FROM cliente WHERE codigo = ?";

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

    public void alterar(Cliente c) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "UPDATE cliente set nome = ?, contato = ? WHERE codigo = ?";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setString(1, c.getNome());
        executarSQL.setString(2, c.getContato());
        executarSQL.setDouble(3, c.getCodigo());

        int quantAlterados = executarSQL.executeUpdate();

        conexao.commit();

        executarSQL.close();

        conexao.close();

        if (quantAlterados == 0) {
            throw new NotExistException();
        }
    }

    public Cliente pesquisar(int codigo) throws SQLException, NotExistException {
        Cliente c = null;

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM cliente WHERE codigo = ?";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        executarSQL.setInt(1, codigo);

        ResultSet resultadoConsulta;

        resultadoConsulta = executarSQL.executeQuery();

        resultadoConsulta.last();

        if (resultadoConsulta.getRow() > 0) {
            c = new Cliente();
            c.setCodigo(codigo);
            c.setNome(resultadoConsulta.getString("nome"));
            c.setContato(resultadoConsulta.getString("contato"));
        } else {
            throw new NotExistException();
        }

        executarSQL.close();

        conexao.close();
        return c;
    }

    public List<Cliente> listarTodos() throws SQLException {
        List<Cliente> listaCliente = new ArrayList<>();

        Connection conexao = GerenteConect.getConexao();

        String comandoSQL = "SELECT * FROM cliente";

        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        ResultSet resultadoConsulta;

        resultadoConsulta = executarSQL.executeQuery();

        Cliente c;

        while (resultadoConsulta.next()) {
            c = new Cliente();
            c.setCodigo(resultadoConsulta.getInt("codigo"));
            c.setNome(resultadoConsulta.getString("nome"));
            c.setContato(resultadoConsulta.getString("contato"));
            listaCliente.add(c);
        }
        return listaCliente;
    }
}
