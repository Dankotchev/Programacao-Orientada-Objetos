package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class GerenteConect {
    private static String user = "user";
    private static String password = "pass";
    private static String urlBanco = "jdbc:mysql://localhost:3306/bancoAvaliacaoFinal?useSSL=false";

    public static Connection getConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(urlBanco, user, password);
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
