
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.jsp.tagext.TryCatchFinally;


public class DBConnection {
    
    static String db = "db_mascotasperdidas";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";
    
    Connection connection;

    public DBConnection() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.db;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexión Establecida");
            
        } catch (Exception ex) {
            System.out.println("Error de Conexión");
            
        } 
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
    
    
    
    
    
}