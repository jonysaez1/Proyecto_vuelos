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
public class Compra {
    private int id_compra;
    private int id_cliente; // estos tres (cliente, vuelo, asiento no son enteros, revisar despues
    private int id_vuelo;
    private int id_asiento;

    public Compra(int id_compra, int id_cliente, int id_vuelo, int id_asiento) {
        this.id_compra = id_compra;
        this.id_cliente = id_cliente;
        this.id_vuelo = id_vuelo;
        this.id_asiento = id_asiento;
    }

    public Compra() {
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }
    
    
    
    
}
