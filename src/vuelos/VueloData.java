/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Grupo 28
 */
public class VueloData {
    private Connection connection = null;

    public VueloData(Conexion conectar) {
        try {
            connection = conectar.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarVuelo(Vuelo vuelo){
        
    }
    
    
}
