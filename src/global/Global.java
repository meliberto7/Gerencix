
package global;


public class Global {
    
    private static String user;
    private static String endereco;
    private static String senha;
    private static String nome;
    private static boolean master;
    private static String genero;
    private static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Global.id = id;
    }
    

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Global.genero = genero;
    }

    public static boolean isMaster() {
        return master;
    }

    public static void setMaster(boolean master) {
        Global.master = master;
    }
    
    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Global.nome = nome;
    }
    
    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Global.user = user;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Global.senha = senha;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        Global.endereco = endereco;
    }
    
    
    
}
