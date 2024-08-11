
package model.bean;


public class Usuarios {
    
    private int id;
    private String nome;
    private String endereco;
    private String user;
    private String senha;
    private String genero;

    public Usuarios() {
    }

    
    public Usuarios(String nome, String endereco, String user, String senha, String genero, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.user = user;
        this.senha = senha;
        this.genero = genero;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
