
package vuelos;

public class Vuelo {
    private int id=-1;
    private String aerolinea;
    private String aeronave;
    private String fecha_llegada;
    private String fecha_partida;
    private Ciudad id_ciudad_destino;
    private Ciudad id_ciudad_origen;

    public Vuelo(int id, String aerolinea, String aeronave, String fecha_llegada, String fecha_partida, Ciudad id_ciudad_destino, Ciudad id_ciudad_origen) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.fecha_llegada = fecha_llegada;
        this.fecha_partida = fecha_partida;
        this.id_ciudad_destino = id_ciudad_destino;
        this.id_ciudad_origen = id_ciudad_origen;
    }

    public Vuelo(String aerolinea, String aeronave, String fecha_llegada, String fecha_partida, Ciudad id_ciudad_destino, Ciudad id_ciudad_origen) {
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.fecha_llegada = fecha_llegada;
        this.fecha_partida = fecha_partida;
        this.id_ciudad_destino = id_ciudad_destino;
        this.id_ciudad_origen = id_ciudad_origen;
    }

    

    public Vuelo() {
        this.id =-1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getFecha_partida() {
        return fecha_partida;
    }

    public void setFecha_partida(String fecha_partida) {
        this.fecha_partida = fecha_partida;
    }

    public Ciudad getId_ciudad_destino() {
        return id_ciudad_destino;
    }

    public void setId_ciudad_destino(Ciudad id_ciudad_destino) {
        this.id_ciudad_destino = id_ciudad_destino;
    }

    public Ciudad getId_ciudad_origen() {
        return id_ciudad_origen;
    }

    public void setId_ciudad_origen(Ciudad id_ciudad_origen) {
        this.id_ciudad_origen = id_ciudad_origen;
    }
    
}
