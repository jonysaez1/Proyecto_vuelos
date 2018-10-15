
package vuelos;

/**
 *
 * @author Grupo 28
 */
public class Vuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con;
        try {
            con = new Conexion("jdbc:mysql://localhost/vuelo", "root", "");
            ClienteData clienteData = new ClienteData(con);
            clienteData.guardarCliente(new Cliente(-1, "Gerardo", "12345", "013423495"));
            clienteData.guardarCliente(new Cliente(-1, "jose", "56345","554566445"));
            
            
        
        } catch(Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
        
    }
    
}
