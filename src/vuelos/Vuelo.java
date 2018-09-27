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
public class Vuelo {
    private int id_vuelo;
    private int id_ciudad;
    private int id_asiento;
    private int id_cliente;
    private String aerolinea;
    private String aeronave;
    private String asiento;
    private boolean disponibilidad;
    private LocalDate fecha_llegada;
    private LocalDate fecha_partida;

    public Vuelo(int id_vuelo, int id_ciudad, int id_asiento, int id_cliente, String aerolinea, String aeronave, String asiento, boolean disponibilidad, LocalDate fecha_llegada, LocalDate fecha_partida) {
        this.id_vuelo = id_vuelo;
        this.id_ciudad = id_ciudad;
        this.id_asiento = id_asiento;
        this.id_cliente = id_cliente;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.asiento = asiento;
        this.disponibilidad = disponibilidad;
        this.fecha_llegada = fecha_llegada;
        this.fecha_partida = fecha_partida;
    }

    public Vuelo() {
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public LocalDate getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(LocalDate fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public LocalDate getFecha_partida() {
        return fecha_partida;
    }

    public void setFecha_partida(LocalDate fecha_partida) {
        this.fecha_partida = fecha_partida;
    }
    
    
    
}
