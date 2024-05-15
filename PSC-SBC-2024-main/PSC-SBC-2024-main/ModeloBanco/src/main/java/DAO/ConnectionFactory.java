
package DAO;

   import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;   


public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "1234";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";

    public Connection obtemConexao() {
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=UTC",
                    usuario, senha);
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro de conexão");
            return null;
        }
    }
}