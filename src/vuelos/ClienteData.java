/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
* @author grupo28
 */
public class ClienteData {
    private Connection connection = null;

    public ClienteData(Conexion conectar) {
        try {
            connection = conectar.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarCliente(Cliente cliente) {
        try {
            String sql = "INSERT INTO cliente (nombre, n_pasaporte, n_tarjeta) VALUES (? , ? , ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getN_pasaporte());
            ps.setString(3, cliente.getN_tarjeta());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarCliente(Cliente cliente) {
        try {
            String sql = "UPDATE cliente SET nombre = ?, n_pasaporte = ?, n_tarjeta = ? WHERE id_cliente = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getN_pasaporte());
            ps.setString(3, cliente.getN_tarjeta());
            ps.setInt(4, cliente.getId());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrarCliente(int id) {
        try {
            String sql = "DELETE FROM cliente WHERE id_cliente = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente buscarCliente(String nombre) {
        try {
            String sql = "SELECT * FROM cliente WHERE nombre = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet r = ps.executeQuery();
            
            if(r.next()) {
                return new Cliente(r.getInt(1), r.getString(2), r.getString(3), r.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
