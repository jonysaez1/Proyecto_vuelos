
package vuelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo 28
 */
public class CiudadData {
    private Connection connection = null;

    public CiudadData(Conexion conectar) {
        try{
            connection = conectar.getConexion();
        } catch(SQLException ex){
             System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarCiudad(Ciudad ciudad) throws SQLException{
        try{
            String sql = "INSERT INTO ciudad (id, ciudad_origen, ciudad_destino, pais) VALUES (? , ? , ? , ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ciudad.getId_ciudad());
            ps.setString(2, ciudad.getCiudad_origen());
            ps.setString(3, ciudad.getCiudad_destino());
            ps.setInt(4, ciudad.getPais());
            ps.execute();
        } catch(SQLException ex){
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
