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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan Saez
 */
public class Ciudad_Data {
    private Connection connection = null;

    public Ciudad_Data(Conexion conexion) {
        try{
            connection = conexion.getConexion();
        }catch(SQLException ex){
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarCiudad(Ciudad ciudad){
        try {
            
            String sql = "INSERT INTO ciudad (id_ciudad, nombre, pais) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, ciudad.getId_ciudad());
            statement.setString(2, ciudad.getNombre_ciudad() );
            statement.setInt(3, ciudad.getPais());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                ciudad.setId_ciudad(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    public List<Ciudad> obtenerCiudad(){
        List <Ciudad> ciudades = new ArrayList<Ciudad>();
        try {
            String sql = "SELECT * FROM ciudad;";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        Ciudad ciudad;
        while(resultSet.next()){
            ciudad = new Ciudad();
            ciudad.setId_ciudad(resultSet.getInt("id_ciudad"));
            ciudad.setNombre_cidad(resultSet.getString("nombre_ciudad"));
            ciudad.setPais(resultSet.getInt("pais"));
            ciudades.add(ciudad);
        }      
        statement.close();
        }catch(SQLException ex){
            System.out.println("Error al obtener las ciudades de destino: " + ex.getMessage());
        }
        return ciudades;
    }
    public void borrarCiudad_destino(int id_ciudad){
    try {
         String sql = "DELETE FROM ciudad WHERE id_ciudad =?;";
         PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         statement.setInt(1, id_ciudad);
         statement.executeUpdate();
         statement.close();
        } 
    catch (SQLException ex) 
        { System.out.println("Error al insertar la ciudaddestino: " + ex.getMessage());}
   }
    
    public void actualizarCiudad_destino(Ciudad ciudad){
       try {
            String sql = "UPDATE ciudad SET pais = ?, nombre_ciudad =? WHERE id_ciudad = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, ciudad.getPais());
            statement.setString(2, ciudad.getNombre_ciudad());
            statement.setInt(3, ciudad.getId_ciudad());
            statement.executeUpdate();
            statement.close();
           } 
       catch (SQLException ex) 
           { System.out.println("Error al insertar la ciudad a destino: " + ex.getMessage());}
   }
    
    public Ciudad buscarCiudad_destino(int id_ciudad){
    Ciudad ciudad=null;
    try {
        String sql = "SELECT * FROM ciudad WHERE id_ciudad =?;";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, id_ciudad);
           
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next())
        {
            ciudad = new Ciudad();
            ciudad.setId_ciudad(resultSet.getInt("id_ciudad"));
            ciudad.setNombre_cidad(resultSet.getString("nombre_ciudad"));
            ciudad.setPais(resultSet.getInt("pais"));
        }      
        statement.close();
      } 
    catch (SQLException ex) 
        {System.out.println("Error al insertar la ciudad a destino: " + ex.getMessage());}
  return ciudad;
}    
}
