
package model.bean;


public class Grupos {
    
    private String nome;
    private String senha;
    private String descricao;
    private String data;
    private String user;
    private int id;
    

    public Grupos() {
    }

    public Grupos(String nome, String senha, String descricao, String data, String user, int id) {
        this.nome = nome;
        this.senha = senha;
        this.descricao = descricao;
        this.id = id;
        this.data = data;
        this.user = user;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
}
