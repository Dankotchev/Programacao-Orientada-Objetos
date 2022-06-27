package controle.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class GerenteConect {

    //   jdbc: protocolo
    //   mysql: sgbd
    //   localhost - endereço da máquina onde está o banco
    //   3306 - porta onde o servidor está ouvindo
    //   academico -  nome do banco de dados
    private static String urlBanco = "jdbc:mariadb://localhost:3306/geren_loja";
    private static String user = "root";
    private static String password = "dknilo";
//    private static String urlBanco = "jdbc:mysql://localhost:3306/geren_loja?useSSL=false";

    public static Connection getConexao() {
        // estabelecer conexão com o banco de dados
        // declara um objeto de conexão
        Connection conexao = null;
        try {
            // estabelece cponexão com o banco de dados
            conexao = DriverManager.getConnection(urlBanco, user, password);
            // retira o autcommit da conexão
            conexao.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Não foi possível fazer conexão com o banco");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return conexao;
    }

    public static void main(String[] args) {
       GerenteConect conectar = null;
       conectar.getConexao();
    }
}
