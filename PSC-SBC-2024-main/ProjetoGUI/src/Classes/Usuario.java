
package Classes;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Usuario {

    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private boolean adm;
    private String nomePac;
    private String idadePac;
    private String generoPac;
    private String telefonePac;
    private String entradaPac;
    private String convenioPac;
    private String nregistroPac;
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
     /**
     * @return the nomePac
     */
    public String getNomePac() {
        return nomePac;
    }

    /**
     * @param nomePac the nomePac to set
     */
    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    /**
     * @return the idadePac
     */
    public String getIdadePac() {
        return idadePac;
    }

    /**
     * @param idadePac the idadePac to set
     */
    public void setIdadePac(String idadePac) {
        this.idadePac = idadePac;
    }

    /**
     * @return the generoPac
     */
    public String getGeneroPac() {
        return generoPac;
    }

    /**
     * @param generoPac the generoPac to set
     */
    public void setGeneroPac(String generoPac) {
        this.generoPac = generoPac;
    }

    /**
     * @return the telefonePac
     */
    public String getTelefonePac() {
        return telefonePac;
    }

    /**
     * @param telefonePac the telefonePac to set
     */
    public void setTelefonePac(String telefonePac) {
        this.telefonePac = telefonePac;
    }

    /**
     * @return the entradaPac
     */
    public String getEntradaPac() {
        return entradaPac;
    }

    /**
     * @param entradaPac the entradaPac to set
     */
    public void setEntradaPac(String entradaPac) {
        this.entradaPac = entradaPac;
    }

    /**
     * @return the convenioPac
     */
    public String getConvenioPac() {
        return convenioPac;
    }

    /**
     * @param convenioPac the convenioPac to set
     */
    public void setConvenioPac(String convenioPac) {
        this.convenioPac = convenioPac;
    }

    /**
     * @return the nregistroPac
     */
    public String getNregistroPac() {
        return nregistroPac;
    }

    /**
     * @param nregistroPac the nregistroPac to set
     */
    public void setNregistroPac(String nregistroPac) {
        this.nregistroPac = nregistroPac;
    }
    
    public void inserir(){
    
    String sql = "INSERT INTO tb_usuario(nome, usuario, email) VALUES (?, ?, ?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, usuario);
        ps.setString(3, email);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
        }
    }
    public void atualizar(){
        
    String sql = "UPDATE tb_usuario SET (nome, usuario, email) WHERE (?, ?, ?)";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()){
    //3: Pré compila o comando
    PreparedStatement ps = c.prepareStatement(sql);
    //4: Preenche os dados faltantes
    ps.setString(1, nome);
    ps.setString(2, usuario);
    ps.setString(3, email);
    //5: Executa o comando
    ps.execute();
    
    JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!");
    
    }
    catch (Exception e){
    e.printStackTrace();
            }
        }
    
    

    public void incluiusu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
    
    