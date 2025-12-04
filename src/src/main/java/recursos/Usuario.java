package recursos;


/**
 * Clase Persona
 *
 * @author Profesor - Williams
 * @version 1.2
 */
public class Usuario {
    private int Id;
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Constructor vacio de la clase Persona
     * Se inicializa la lista de vehiculos
     * Se inicializa a nulo la cuenta
     */
    public Usuario() {

    }



    /**
     * Constructor principal de la clase Persona
     * Se inicializa la lista de vehiculos
     * Se inicializa a nulo la cuenta
     *
     * @param nombre   Nombre de la persona
     * @param apellido Apellido de la persona
     * @param edad     Edad de la persona
     */
    public Usuario(String nombre, String apellido, int edad, int idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Id = idUsuario;
    }

    /**
     * Getter del atributo Nombre
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atribtuo Nombre
     *
     * @param nombre estable el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo Apellido
     *
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter del atributo Apellido
     *
     * @param apellido establece el apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getter del atributo Edad
     *
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter del atributo Edad
     *
     * @param edad establece la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdUsuario() {
        return Id;
    }

    public void setIdUsuario(int idUsuario) {
        this.Id = idUsuario;
    }


    /**
     * Metodo toString para mostrar los datos de la persona
     *
     * @return texto formateado con los datos de la persona
     */
    @Override
    public String toString() {
        return String.format("Datos de la persona: %s, %s, %d", this.nombre, this.apellido, this.edad);
    }
}
