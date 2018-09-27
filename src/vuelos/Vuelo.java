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
public class Vuelo {
    private int id_vuelo;
    private int id_aerolinea; // id de aerolineas y pais no son int 
    private int id_pais;

    public Vuelo(int id_vuelo, int id_aerolinea, int id_pais) {
        this.id_vuelo = id_vuelo;
        this.id_aerolinea = id_aerolinea;
        this.id_pais = id_pais;
    }

    public Vuelo() {
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
    
    
}
