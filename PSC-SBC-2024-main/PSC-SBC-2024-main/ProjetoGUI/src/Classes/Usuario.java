
package Classes;
import Classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Usuario {
    
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private boolean adm;

    public Usuario() {
    }

    public Usuario(String nome, String email, String usuario, String senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.adm = adm;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void inserir (){
//1: Definir o comando SQL
String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
//2: Abrir uma conexão
ConnectionFactory factory = new ConnectionFactory();
try (Connection c = factory.obtemConexao()){
//3: Pré compila o comando
PreparedStatement ps = c.prepareStatement(sql);
//4: Preenche os dados faltantes
ps.setString(1, "erica");
ps.setString(2, "3232323");
ps.setString(3, "erica@teste.com");
//5: Executa o comando
ps.execute();
}
catch (Exception e){
e.printStackTrace();
}
}
}
