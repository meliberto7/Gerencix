package model.dao;

import conexao.Conexao;
import global.Global;
import global.GlobalGrupo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Tarefas;

public class TarefasDAO {

    public List<Tarefas> infos() {

        List<Tarefas> tarefas = new ArrayList();

        if (Global.isMaster()) {

            try {

                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tarefas where fk_id_usuario = ?");

                stmt.setInt(1, Global.getId());

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    Tarefas tarefa = new Tarefas();

                    tarefa.setId(rs.getInt("id_tarefa"));
                    tarefa.setTitulo(rs.getString("titulo"));
                    tarefa.setDescricao(rs.getString("descricao"));
                    tarefa.setColaboradores(rs.getString("integrantes"));
                    tarefa.setTarefa(rs.getString("tarefa"));
                    tarefa.setPostagem(rs.getDate("postagem"));
                    tarefa.setPrazo(rs.getDate("prazo"));

                    tarefas.add(tarefa);

                }

                rs.close();
                stmt.close();
                conexao.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {

            try {

                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tarefas where fk_id_grupo = ?");

                stmt.setInt(1, GlobalGrupo.getId());

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    Tarefas tarefa = new Tarefas();

                    tarefa.setId(rs.getInt("id_tarefa"));
                    tarefa.setTitulo(rs.getString("titulo"));
                    tarefa.setDescricao(rs.getString("descricao"));
                    tarefa.setColaboradores(rs.getString("integrantes"));
                    tarefa.setTarefa(rs.getString("tarefa"));
                    tarefa.setPostagem(rs.getDate("postagem"));
                    tarefa.setPrazo(rs.getDate("prazo"));

                    tarefas.add(tarefa);

                }

                rs.close();
                stmt.close();
                conexao.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return tarefas;

    }

    public void salvar(Tarefas tarefa) {

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tarefas (titulo, descricao, integrantes, tarefa, postagem, prazo, grupo, fk_id_grupo, fk_id_usuario) VALUES (?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, tarefa.getColaboradores());
            stmt.setString(4, tarefa.getTarefa());
            stmt.setDate(5, tarefa.getPostagem());
            stmt.setDate(6, tarefa.getPrazo());
            stmt.setString(7, tarefa.getGrupo());
            stmt.setInt(8, tarefa.getFk_id_grupo());
            stmt.setInt(9, tarefa.getFk_id_usuario());

            stmt.execute();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void deletar(Tarefas tarefa) {

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("DELETE FROM tarefas where id_tarefa = ?");
            stmt.setInt(1, tarefa.getId());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
