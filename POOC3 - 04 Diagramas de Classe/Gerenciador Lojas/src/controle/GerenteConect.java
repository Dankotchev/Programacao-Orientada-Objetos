package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class GerenteConect {

    //   jdbc: protocolo
    //   mysql: sgbd
    //   localhost - endereço da máquina onde está o banco
    //   3306 - porta onde o servidor está ouvindo
    //   academico -  nome do banco de dados
    private static String urlBanco = "jdbc:mysql://localhost:3306/gerenciadorestoque?useSSL=false";

    public static Connection getConexao() {
        // estabelecer conexão com o banco de dados
        // declara um objeto de conexão
        Connection conexao = null;
        try {
            // estabelece cponexão com o banco de dados
//            conexao = DriverManager.getConnection(urlBanco, "root", "IFSP");
            conexao = DriverManager.getConnection(urlBanco, "root", "dknilo");
            // retira o autcommit da conexão
            conexao.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Não foi possível fazer conexão com o banco");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return conexao;
    }

}
