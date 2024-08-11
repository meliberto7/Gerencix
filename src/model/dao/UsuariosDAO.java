package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import global.Global;
import global.GlobalGrupo;
import model.bean.Usuarios;


public class UsuariosDAO {   
    
    public boolean procuraUser(String usuario) {
        
        boolean very = true;
        
        try{
            
            Connection conexao = Conexao.conectar();
            
            PreparedStatement stmt2 = conexao.prepareStatement("SELECT user FROM usuarios WHERE user = ?");
            stmt2.setString(1, usuario);
            
            ResultSet rs = stmt2.executeQuery();
            
            if (rs.next()){
                
                JOptionPane.showMessageDialog(null, "Nome de usuário já existe!");
                very = false;
                
            } else {        
            
            very = true;
            
            }
            
            stmt2.close();
            conexao.close();
            
        }catch(SQLException e){
           
            e.printStackTrace();
            
        }
              
        return very;
        
    }
    
    public List<Usuarios> daoBuscar(String text, int idGrupo) {
        List<Usuarios> list = new ArrayList();
        
        try{
           
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("select * from usuarios where nome like '" + text +"%' and fk_id_grupo = ? ORDER BY nome");
            
            stmt.setInt(1, idGrupo);
                
            ResultSet rs = stmt.executeQuery();                    
            
            while (rs.next()){
                
                String nome = rs.getString("nome");
                int id = rs.getInt("id_usuario");
                Usuarios user = new Usuarios();
                user.setNome(nome);
                user.setId(id);
                
                list.add(user);
               
            }
            
            
            rs.close();
            stmt.close();
            conexao.close();
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
        
    }
    
    
    public void cadastrar(Usuarios usuario) {
        
        try{
        Connection conexao = Conexao.conectar();
        
        PreparedStatement stmt = conexao.prepareStatement("INSERT INTO usuarios (nome, endereco, genero, user, senha) VALUES (?,?,?,?,?)");
            
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEndereco());
        stmt.setString(3, usuario.getGenero());
        stmt.setString(4, usuario.getUser());
        stmt.setString(5, usuario.getSenha());
            
        stmt.execute();
        stmt.close();
        conexao.close(); 
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
    public boolean login(String user, String senha) {
        
        boolean very = true;
        
        try{
           
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios where user = ? AND senha = ?");
            
            stmt.setString(1, user);
            stmt.setString(2, senha);

            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                
                String nome = rs.getString("nome");
                Global.setMaster(rs.getBoolean("master"));
                Global.setGenero(rs.getString("genero"));
                Global.setId(rs.getInt("id_usuario"));
                Global.setSenha(rs.getString("senha"));
                GlobalGrupo.setId(rs.getInt("fk_id_grupo"));
                                 
                JOptionPane.showMessageDialog(null, "Login bem sucedido!");
                
                Global.setUser(user);
                Global.setNome(nome);
                Global.setEndereco(rs.getString("endereco"));
                very = true;
                 
            } else {
                
                JOptionPane.showMessageDialog(null, "Usuario/senha incorretos!");
                very = false;
                
            }
            
            stmt.close();
            rs.close();
            conexao.close();
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        
        return very;
        
    }
    
    public void insereGrupo() {
        
        try{
           
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE usuarios set grupo = ?, fk_id_grupo = ? where id_usuario = ?");
            
            stmt.setString(1, GlobalGrupo.getNome());
            stmt.setInt(2, GlobalGrupo.getId());
            stmt.setInt(3, Global.getId());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        
    }
    
    public boolean buscarGrupo() {
        
       boolean very = false;
        
       try{
           
           Connection conexao = Conexao.conectar();
           PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios where id_usuario = ?");
           
           stmt.setInt(1, Global.getId());
           
           ResultSet rs = stmt.executeQuery();
           
           int id = 0;
           
           if (rs.next()) {
               
               id = rs.getInt("fk_id_grupo");
               
           }
           
           if (id == 0) {
               
               very = false;
               
           } else {
               
               very = true;
               
           }
           
           rs.close();
           stmt.close();
           conexao.close();
           
       } catch(SQLException e){
           
           e.printStackTrace();
           
       }
        
       return very; 
    }
    
    public void sairGrupo() {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE usuarios SET fk_id_grupo = ?, grupo = ? WHERE id_usuario = ?");
            
            stmt.setString(1, null);
            stmt.setString(2, "Sem grupo");
            stmt.setInt(3, Global.getId());
            
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            
          e.printStackTrace();
            
        }
        
    }
    
    public void atualizar(Usuarios usuario) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE usuarios set nome = ?, endereco = ?, user = ?, senha = ? WHERE id_usuario = ?");
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEndereco());
            stmt.setString(3, usuario.getUser());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, Global.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public List<Usuarios> listarUsuarios(int id_grupo) {
        
        List<Usuarios> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE fk_id_grupo = ?");
            
            stmt.setInt(1, id_grupo);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Usuarios usuario = new Usuarios();
                usuario.setNome(rs.getString("nome"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setGenero(rs.getString("genero"));
                usuario.setUser(rs.getString("user"));
                usuario.setId(rs.getInt("id_usuario"));
                
                list.add(usuario);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return list;
    }
    
}
