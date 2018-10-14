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
 * @author Jonathan Saez
 */
public class AsientoData {
    private Connection connection = null;

    public AsientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
}
