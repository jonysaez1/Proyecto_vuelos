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
public class Aerolineas {
    private int id_aerolinea;
    private String tipo_avion;

    public Aerolineas(int id_aerolinea, String tipo_avion) {
        this.id_aerolinea = id_aerolinea;
        this.tipo_avion = tipo_avion;
    }

    public Aerolineas() {
        
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public String getTipo_avion() {
        return tipo_avion;
    }

    public void setTipo_avion(String tipo_avion) {
        this.tipo_avion = tipo_avion;
    }
    
    
    
}
