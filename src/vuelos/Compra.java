/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

import java.time.LocalDate;

/**
 *
 * @author Jonathan Saez
 */
public class Compra {
    private int id_compra;
    private int id_cliente; // estos tres (cliente, vuelo, asiento no son enteros, revisar despues
    private int id_asiento;
    private LocalDate fecha;

    public Compra(int id_compra, int id_cliente, int id_asiento, LocalDate fecha) {
        this.id_compra = id_compra;
        this.id_cliente = id_cliente;
        this.id_asiento = id_asiento;
        this.fecha = fecha;
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

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
}
