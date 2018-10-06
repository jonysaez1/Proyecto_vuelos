/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

/**
 *
 * @author Jonathan Saez
 */
public class Ciudad {
    private int id_ciudad = -1;
    private String nombre_ciudad;
    private int pais;

    public Ciudad(int id_ciudad,String nombre_ciudad, int pais) {
        this.id_ciudad = id_ciudad;
        this.nombre_ciudad = nombre_ciudad;
        this.pais = pais;
    }

    public Ciudad(String nombre_cidad, int pais) {
        this.nombre_ciudad = nombre_ciudad;
        this.pais = pais;
        this.id_ciudad = -1;
        
        
    }

    public Ciudad(int pais) {
        this.pais = pais;
        this.id_ciudad = -1;
        
        
    }

    public Ciudad() {
        this.id_ciudad= -1;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_cidad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }
    
    public String toString(){
    
        return id_ciudad+"-"+pais;
    }
    
    
    
    
}
