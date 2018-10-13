/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

/**
 *
 * @author grupo 28
 */
public class Ciudad {
    private int id_ciudad = -1;
    private String ciudad_origen;
    private String ciudad_destino;
    private int pais;

    public Ciudad(int id_ciudad,String ciudad_origen,String ciudad_destino, int pais) {
        this.id_ciudad = id_ciudad;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.pais = pais;
    }

    public Ciudad(String ciudad_origen,String ciudad_destino, int pais) {
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.pais = pais;
        this.id_ciudad = -1;
        
        
    }
     public Ciudad(String ciudad_destino, int pais) {
       
        this.ciudad_destino = ciudad_destino;
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

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
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
