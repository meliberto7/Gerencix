
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/gerencix";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection conectar() throws SQLException {
        
        return (Connection) DriverManager.getConnection(url, user, password);
        
    }
     
}
