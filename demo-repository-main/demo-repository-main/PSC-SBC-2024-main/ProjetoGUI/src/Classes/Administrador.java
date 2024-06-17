package Classes;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private List<String> permissoes; // Lista de permissões
    public Administrador() {
    }

    public Administrador(String nome, String email, String usuario, String senha) {
        
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.permissoes = new ArrayList<>(); // Inicializa a lista de permissões
    }
    // Adiciona uma permissão ao administrador
    public void adicionarPermissao(String permissao) {
        permissoes.add(permissao);
// Remove uma permissão do administrador
        permissoes.remove(permissao);
    }
    
    // Exibe as permissões do administrador
    public void exibirPermissoes() {
        System.out.println("Permissões do administrador " + nome + ":");
        for (String permissao : permissoes) {
            System.out.println("- " + permissao);
        }
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

    public static void main(String[] args) {
        // Exemplo de uso da classe Administrador
        Administrador admin = new Administrador("Admin", "Admin@exemplo.com", "Admin.admin", "Admin123");
        admin.adicionarPermissao("Gerenciar Usuários");
        admin.adicionarPermissao("Escalar Medicos");
        admin.exibirPermissoes();
        System.out.println("Nome do administrador: " + admin.getNome());
        System.out.println("Email do administrador: " + admin.getEmail());
        System.out.println("Usuário do administrador: " + admin.getUsuario());
        System.out.println("Senha do administrador: " + admin.getSenha());
    }
    
}