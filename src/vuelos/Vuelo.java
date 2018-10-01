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
    private Ciudad ciudad; // hacer esto mismo con las otras id
    private int id_asiento;
    private int id_cliente;
    private String aerolinea;
    private String aeronave;
    private String asiento;
    private boolean disponibilidad;
    private LocalDate fecha_llegada;
    private LocalDate fecha_partida;

    
}
