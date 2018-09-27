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
public class Clientes {
    private int id_clientes;
    private int n_pasaporte; // no es int...
    private String tarj_cred;
    private String nombre;
    private String email;

    public Clientes(int id_clientes, int n_pasaporte, String tarj_cred, String nombre, String email) {
        this.id_clientes = id_clientes;
        this.n_pasaporte = n_pasaporte;
        this.tarj_cred = tarj_cred;
        this.nombre = nombre;
        this.email = email;
    }

    public Clientes() {
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public int getN_pasaporte() {
        return n_pasaporte;
    }

    public void setN_pasaporte(int n_pasaporte) {
        this.n_pasaporte = n_pasaporte;
    }

    public String getTarj_cred() {
        return tarj_cred;
    }

    public void setTarj_cred(String tarj_cred) {
        this.tarj_cred = tarj_cred;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
