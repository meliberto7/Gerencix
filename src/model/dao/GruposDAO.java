package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import global.Global;
import global.GlobalGrupo;
import java.util.ArrayList;
import java.util.List;
import model.bean.Grupos;
import model.bean.Tarefas;
import model.bean.Usuarios;

public class GruposDAO {
    
    public void criar(Grupos grupo) {
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO grupos (nome, senha, descricao, data_criacao, user, fk_id_user) VALUES (?,?,?, NOW(),?,?)");
            
            stmt.setString(1, grupo.getNome());
            stmt.setString(2, grupo.getSenha());
            stmt.setString(3, grupo.getDescricao());
            stmt.setString(4, Global.getUser());
            stmt.setInt(5, Global.getId());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public boolean entrar(int id, String senha) {
        
        boolean very = false;
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM grupos WHERE id_grupo = ? AND senha = ?");
            
            stmt.setInt(1, id);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                GlobalGrupo.setNome(rs.getString("nome"));
                GlobalGrupo.setId(rs.getInt("id_grupo"));
                very = true;
                
            } else {
                
                very = false;
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return very;
    }
    
    public List<Grupos> listar(int very, String texto) {
        
        List<Grupos> list = new ArrayList();
        
        try {
            
            Connection conexao = Conexao.conectar();
            
            switch (very) {
                
                case 1:
                    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM grupos where nome like '" + texto + "%' AND fk_id_user = ? order by nome");
                    
                    stmt.setInt(1, Global.getId());
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        
                        Grupos grupo = new Grupos();
                        grupo.setNome(rs.getString("nome"));
                        grupo.setDescricao(rs.getString("descricao"));
                        grupo.setSenha(rs.getString("senha"));
                        grupo.setId(rs.getInt("id_grupo"));
                        
                        list.add(grupo);
                        
                    }
                    rs.close();
                    stmt.close();
                    break;
                
                case 2:
                    
                    break;
                case 3:
                    
                    PreparedStatement stmt3 = conexao.prepareStatement("SELECT * FROM grupos where fk_id_user = ?");
                    
                    stmt3.setInt(1, Global.getId());
                    ResultSet rs3 = stmt3.executeQuery();
                    
                    while (rs3.next()) {
                        
                        Grupos grupo3 = new Grupos();
                        grupo3.setNome(rs3.getString("nome"));
                        grupo3.setDescricao(rs3.getString("descricao"));
                        grupo3.setSenha(rs3.getString("senha"));
                        grupo3.setId(rs3.getInt("id_grupo"));
                        grupo3.setData(String.valueOf(rs3.getDate("data_criacao")));
                        
                        list.add(grupo3);
                        
                    }
                    rs3.close();
                    stmt3.close();
                    
                    break;
                
            }
            
            conexao.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return list;
    }
    
    public void buscaGrupo() {
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM grupos where id_grupo = ?");
            
            stmt.setInt(1, GlobalGrupo.getId());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public Grupos infosGrupo() {
        
        Grupos grupo = new Grupos();
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM grupos WHERE id_grupo = ?");
            
            stmt.setInt(1, GlobalGrupo.getId());
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                grupo.setNome(rs.getString("nome"));
                grupo.setSenha(rs.getString("senha"));
                grupo.setDescricao(rs.getString("descricao"));
                grupo.setData(String.valueOf(rs.getDate("data_criacao")));
                grupo.setUser(rs.getString("user"));
                grupo.setId(rs.getInt("fk_id_user"));
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return grupo;
    }
    
    public void deletar(int id) {
        
        List<Usuarios> usuario = new ArrayList();
        List<Tarefas> tarefa = new ArrayList();
        boolean very = false;
        boolean very2 = false;
        
        try {
            
            Connection conexao = Conexao.conectar();
            
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE fk_id_grupo = ?");
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    very = true;
                    
                    Usuarios user = new Usuarios();
                    user.setId(rs.getInt("id_usuario"));
                    
                    usuario.add(user);
                }
                
            
            rs.close();
            stmt.close();
            
            PreparedStatement stmt4 = conexao.prepareStatement("SELECT * FROM tarefas WHERE fk_id_grupo = ?");
            stmt4.setInt(1, id);
            
            ResultSet rs2 = stmt4.executeQuery();
            
                while (rs2.next()) {
                    
                    very2 = true;
                    
                    Tarefas tarefa2 = new Tarefas();
                    tarefa2.setId(rs2.getInt("id_tarefa"));
                    
                    tarefa.add(tarefa2);
                    
                }
                
            rs2.close();
            stmt4.close();
            
            if (very2) {
                
                very2 = false;
                
                PreparedStatement stmt5 = conexao.prepareStatement("DELETE FROM tarefas where id_tarefa = ?");
                for (int i = 0; i < tarefa.size(); i++) {
                    
                    stmt5.setInt(1, tarefa.get(i).getId());
                    stmt5.executeUpdate();
                    
                }
                
                stmt5.close();
                
            }
            
            if (very) {
                
                very = false;
                
                PreparedStatement stmt2 = conexao.prepareStatement("UPDATE usuarios set fk_id_grupo = ?, grupo = ? where id_usuario = ?");
                for (int i = 0; i < usuario.size(); i++) {
                    
                    stmt2.setString(1, null);
                    stmt2.setString(2, "Sem grupo");
                    stmt2.setInt(3, usuario.get(i).getId());
                    stmt2.executeUpdate();
                    
                }
                stmt2.close();
                
            }
            
            PreparedStatement stmt3 = conexao.prepareStatement("DELETE FROM grupos where id_grupo = ?");
            stmt3.setInt(1, id);
            
            stmt3.executeUpdate();
            stmt3.close();
            
            conexao.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public void removeGrupo(int id) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE usuarios set fk_id_grupo = ?, grupo = ? WHERE id_usuario = ?");
            
            stmt.setString(1, null);
            stmt.setString(2, "Sem grupo");
            stmt.setInt(3, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public boolean veryGrupo(String nome) {
        
        boolean very = false;
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM grupos WHERE nome = ? AND fk_id_user = ?");
            
            stmt.setString(1, nome);
            stmt.setInt(2, Global.getId());
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                very = true;
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return very;
        
    }
    
}
