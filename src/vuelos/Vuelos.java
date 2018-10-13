/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        } catch(Exception e) {
            
        }
        
    }
    
}
