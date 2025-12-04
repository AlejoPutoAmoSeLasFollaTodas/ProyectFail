// Archivo: src/biblioteca/Libro.java
package clases;

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
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
        return String.format("Libro" +
                "isbn='" + this.isbn + '\'' +
                ", titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                ", anioPublicacion=" + this.anioPublicacion +
                ", ejemplaresTotales=" + this.ejemplaresTotales +
                ", ejemplaresDisponibles=" + this.ejemplaresDisponibles
                );
    } 
}
