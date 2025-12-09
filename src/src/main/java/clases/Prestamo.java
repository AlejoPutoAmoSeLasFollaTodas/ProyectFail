package clases;

import recursos.Usuario;


import java.time.LocalDate;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaFinEstimada;
    private boolean devuelto;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = LocalDate.now();
        this.fechaFinEstimada = fechaInicio.plusDays(15);
        this.devuelto = false;
    }

    public Usuario getUsuario() { return usuario; }
    public Libro getLibro() { return libro; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public LocalDate getFechaFinEstimada() { return fechaFinEstimada; }
    public boolean isDevuelto() { return devuelto; }

    public void marcarDevuelto() {
        devuelto = true;
        libro.devolverEjemplar();
    }

    public int calcularRetrasoEnDias(LocalDate hoy) {
        if (hoy == null) return -1;
        if (!hoy.isAfter(fechaFinEstimada)) return 0;
        return hoy.compareTo(fechaFinEstimada);
    }
}


