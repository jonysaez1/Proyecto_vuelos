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
        Conexion conectar;
        try {
            conectar = new Conexion("jdbc:mysql://localhost/vuelo", "root", "");
            VueloData vueloData = new VueloData(conectar); 
        } catch(Exception e) {
            
        }
        
    }
    
}
