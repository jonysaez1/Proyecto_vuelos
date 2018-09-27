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
public class Cliente {
    private int id_cliente;
    private String nombre;
    private long nro_pasaporte;
    private long nro_tarj;

    public Cliente(int id_cliente, String nombre, long nro_pasaporte, long nro_tarj) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.nro_pasaporte = nro_pasaporte;
        this.nro_tarj = nro_tarj;
    }

    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNro_pasaporte() {
        return nro_pasaporte;
    }

    public void setNro_pasaporte(long nro_pasaporte) {
        this.nro_pasaporte = nro_pasaporte;
    }

    public long getNro_tarj() {
        return nro_tarj;
    }

    public void setNro_tarj(long nro_tarj) {
        this.nro_tarj = nro_tarj;
    }
    
    
}
