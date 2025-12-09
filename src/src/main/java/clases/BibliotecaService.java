package clases;


import recursos.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BibliotecaService {

    private Map<String, Libro> librosPorIsbn = new HashMap<>();
    private Map<String, Usuario> usuariosPorId = new HashMap<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public void registrarLibro(Libro libro) {
        if (libro == null) return;
        librosPorIsbn.put(libro.getIsbn(), libro);
    }

    public void registrarUsuario(Usuario usuario) {
        if (usuario == null || usuario.getNombre().isBlank()) return;
        usuariosPorId.put(usuario.getId(), usuario);
    }

    public Prestamo prestarLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        Libro l = librosPorIsbn.get(isbn);

        if (u == null || l == null) {
            System.out.println("Usuario o libro inexistente.");
            return null;
        }

        if (!l.estaDisponible()) {
            System.out.println("No hay ejemplares disponibles.");
            return null;
        }

        l.prestarEjemplar();
        Prestamo p = new Prestamo(u, l);
        prestamos.add(p);

        System.out.println("Préstamo registrado.");
        return p;
    }

    public void devolverLibro(String idUsuario, String isbn) {
        for (Prestamo p : prestamos) {
            if (p.getUsuario().getId().equals(idUsuario) &&
                    p.getLibro().getIsbn().equals(isbn) &&
                    !p.isDevuelto()) {

                p.marcarDevuelto();
                System.out.println("Libro devuelto.");
                return;
            }
        }
        System.out.println("Préstamo no encontrado.");
    }
}


