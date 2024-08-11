
package model.bean;

import java.sql.Date;


public class Tarefas {
    
    private int id;
    private String titulo;
    private String descricao;
    private String colaboradores;
    private String tarefa;
    private String grupo;
    private Date postagem;
    private Date prazo;
    private int fk_id_grupo;
    private int fk_id_usuario;

    public Tarefas() {
    }

    public Tarefas(int id, String titulo, String descricao, String colaboradores, String tarefa, String grupo, Date postagem, Date prazo, int fk_id_grupo, int fk_id_usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.colaboradores = colaboradores;
        this.tarefa = tarefa;
        this.postagem = postagem;
        this.prazo = prazo;
        this.grupo = grupo;
        this.fk_id_grupo = fk_id_grupo;
        this.fk_id_usuario = fk_id_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(String colaboradores) {
        this.colaboradores = colaboradores;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public Date getPostagem() {
        return postagem;
    }

    public void setPostagem(Date postagem) {
        this.postagem = postagem;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getFk_id_grupo() {
        return fk_id_grupo;
    }

    public void setFk_id_grupo(int fk_id_grupo) {
        this.fk_id_grupo = fk_id_grupo;
    }

    public int getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(int fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }
    
     
}
