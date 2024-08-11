
package global;


public class GlobalGrupo {
    
    private static String nome;
    private static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        GlobalGrupo.id = id;
    }
    

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        GlobalGrupo.nome = nome;
    }
    
    
    
}
