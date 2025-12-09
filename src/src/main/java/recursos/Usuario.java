package recursos;

public class Usuario {

    private String id;
    private String nombre;
    private int maximoPrestamosSimultaneos = 3;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getMaximoPrestamosSimultaneos() { return maximoPrestamosSimultaneos; }
}
