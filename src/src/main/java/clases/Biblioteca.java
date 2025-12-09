
package clases;

import java.util.ArrayList;

public class Biblioteca {

    private String id;
    private String nombre;
    private int maximoPrestamosSimultaneos;
    private ArrayList<Prestamo> prestamosActivos;

    public Biblioteca(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.maximoPrestamosSimultaneos = 3;
        this.prestamosActivos = new ArrayList<>();
    }

    public String getId() { return id; }

    public String getNombre() { return nombre; }

    public int getMaximoPrestamosSimultaneos() {
        return maximoPrestamosSimultaneos;
    }

    public void setMaximoPrestamosSimultaneos(int maximo) {
        this.maximoPrestamosSimultaneos = Math.max(0, maximo);
    }

    public ArrayList<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public boolean tieneHuecoParaOtroPrestamo() {
        return prestamosActivos.size() < maximoPrestamosSimultaneos;
    }
}
