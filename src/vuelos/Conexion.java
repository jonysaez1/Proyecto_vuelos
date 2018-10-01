
package vuelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jonathan Saez
 */
public class Conexion {
    private String url = "jdbc:mysql://localhost/pro_vuelo";
    private String user = "root";
    private String password = "";
    private Connection conexion;
    
    public Conexion() throws ClassNotFoundException {
       
        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");
       
    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
       
                    // Setup the connection with the DB
            conexion = DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + user + "&password=" + password);
           
        }
        
        
        return conexion;
    }
}
