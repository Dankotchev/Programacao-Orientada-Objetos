package controle;

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

        // criar a string contendo o SQL
        String comandoSQL = "INSERT INTO produto (codigo, descricao, valorVenda, valorCusto) values (?, ?, ?, ?)";

        // Preparar a string para execução do SQL
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        // passar os parametros para o SQL
        executarSQL.setInt(1, p.getCodigo());
        executarSQL.setString(2, p.getDescricao());
        executarSQL.setDouble(3, p.getValorVenda());
        executarSQL.setDouble(4, p.getValorCusto());

        // executar o comando SQL montado
        executarSQL.executeUpdate();

        // fazer o commit na conexao
        conexao.commit();

        //finaliza a execução do SQL
        executarSQL.close();

        // finaliza a conexão com o banco de dados
        conexao.close();
    }

    public void excluir(int codigo) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();

        // criar a string contendo o SQL
        String comandoSQL = "DELETE FROM produto WHERE codigo = ?";

        // Preparar a string para execução do SQL
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        // passar os parametros para o SQL
        executarSQL.setInt(1, codigo);

        // executar o comando SQL montado
        int linhas = executarSQL.executeUpdate();

        // fazer o commit na conexao
        conexao.commit();

        //finaliza a execução do SQL
        executarSQL.close();

        // finaliza a conexão com o banco de dados
        conexao.close();

        if (linhas == 0) {
            throw new NotExistException("Produto não existente");
        }
    }

    public void alterar(Produto p) throws SQLException, NotExistException {
        Connection conexao = GerenteConect.getConexao();
        // criar a string contendo o SQL
        String comandoSQL = "UPDATE produto set descricao = ?, valorVenda = ?, valorCusto = ?"
                + " where codigo = ?";

        // Preparar a string para execução do SQL
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        // passar os parametros para o SQL
        executarSQL.setString(1, p.getDescricao());
        executarSQL.setDouble(2, p.getValorVenda());
        executarSQL.setDouble(3, p.getValorCusto());
        executarSQL.setInt(4, p.getCodigo());

        // executar o comando SQL montado retornando o número de linhas afetadas
        int quantAlterados = executarSQL.executeUpdate();

        // fazer o commit na conexao
        conexao.commit();

        //finaliza a execução do SQL
        executarSQL.close();

        // finaliza a conexão com o banco de dados
        conexao.close();

        if (quantAlterados == 0) {
            throw new NotExistException("Produto não foi encontrado");
        }
    }

    public Produto pesquisar(int codigo) throws SQLException, NotExistException {
        // curso a ser retornado
        Produto p = null;

        // pega uma conexao
        Connection conexao = GerenteConect.getConexao();

        // criar a string contendo o SQL
        String comandoSQL = "SELECT * FROM produto WHERE codigo = ?";

        // Preparar a string para execução do SQL
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        // passar os parametros para o SQL
        executarSQL.setInt(1, codigo);

        // Objeto para armazenar o resuldado de uma consulta SQL
        ResultSet resultadoConsulta;

        // executa a consulta
        resultadoConsulta = executarSQL.executeQuery();

//        resultadoConsulta.first();
//        resultadoConsulta.next();
        // avança para a última linha
        resultadoConsulta.last();
        // Pega o número da última linha (para esse caso)
        if (resultadoConsulta.getRow() > 0) {
            p = new Produto();
            p.setCodigo(codigo);
            p.setDescricao(resultadoConsulta.getString("descricao"));
            p.setQuantidade(resultadoConsulta.getInt("quantidade"));
            p.setValorCusto(resultadoConsulta.getDouble("valorCusto"));
            p.setValorVenda(resultadoConsulta.getDouble("valorVenda"));
        } else {
            throw new NotExistException("Produto não foi encontrado");
        }

        //finaliza a execução do SQL
        executarSQL.close();

        // finaliza a conexão com o banco de dados
        conexao.close();

        return p;
    }

    public List<Produto> listarTodos() throws SQLException {
        // lista contendo os cursos
        List<Produto> listaProduto = new ArrayList<>();

        // pega uma conexao
        Connection conexao = GerenteConect.getConexao();

        // criar a string contendo o SQL
        String comandoSQL = "SELECT * FROM produto";

        // Preparar a string para execução do SQL
        PreparedStatement executarSQL = conexao.prepareStatement(comandoSQL);

        // Objeto para armazenar o resuldado de uma consulta SQL
        ResultSet resultadoConsulta;

        // executa a consulta
        resultadoConsulta = executarSQL.executeQuery();

        Produto p;
        // verifica se tem mais registros no resultadoConsulta
        while (resultadoConsulta.next()) {
            // preencher o objeto curso com os dados do banco
            p = new Produto();
            p.setCodigo(resultadoConsulta.getInt("codigo"));
            p.setDescricao(resultadoConsulta.getString("descricao"));
            p.setQuantidade(resultadoConsulta.getInt("quantidade"));
            p.setValorCusto(resultadoConsulta.getDouble("valorCusto"));
            p.setValorVenda(resultadoConsulta.getDouble("valorVenda"));

            // adicionar na lista de cursos
            listaProduto.add(p);
        }
        return listaProduto;
    }

}
