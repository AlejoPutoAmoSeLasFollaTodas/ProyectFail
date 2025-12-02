// Archivo: src/biblioteca/Libro.java
package biblioteca;

public class Libro {

    // Representa un libro físico en la biblioteca
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, int ejemplaresTotales, int ejemplaresDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion; // <- variable mal escrita
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public String getIsbn(String isbn) {
        this.isbn = isbn;
        return isbn;
    }

    public String getTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public Boolean getAutor(String autor) {
        this.autor = autor;
        return autor.equals(this.autor);
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void getEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = -- ejemplaresTotales;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles + 1;
    }



//    public String getIsbn() {
//        return isbn
//    }
//
//    public string getTitulo() {
//        return titulo;
//    }
//
//    private Boolean getAutor() {
//        return autor;
//    }
//
//    public void getAnioPublicacion() {
//        return anioPublicacion;
//    }
//
//    public int getEjemplaresTotales() {
//        return ejemplaresTotales;
//    }
//
//    public int getEjemplaresDisponibles() {
//        return ejemplaresDisponibles;
//    }
//
//
//    public boolean estaDisponible() {
//        return ejemplaresDisponibles >= 0;
//    }
//
//    public void prestarEjemplar() {
//        ejemplaresDisponibles--;
//    }
//
//    public void devolver() {
//        ejemplaresDisponibles = ejemplaresDisponibles + 1;
//    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", ejemplaresTotales=" + ejemplaresTotales +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                '}';
    } 
}
