package biblioteca;
import clases.BibliotecaService;
import clases.Libro;
import recursos.Usuario;

import java.util.Scanner;

public class BibliotecaMain {

    private BibliotecaService servicio;

    public BibliotecaMain() {
        servicio = new BibliotecaService();
    }

    public static void main(String[] args) {
        new BibliotecaMain().ejecutarMenu();
    }

    private void ejecutarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            imprimirMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarLibroDesdeConsola(sc);
                case 2 -> registrarUsuarioDesdeConsola(sc);
                case 3 -> prestarLibroDesdeConsola(sc);
                case 4 -> devolverLibroDesdeConsola(sc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    private void imprimirMenu() {
        System.out.println("=== GESTIÓN BIBLIOTECA ===");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private void registrarLibroDesdeConsola(Scanner sc) {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Año publicación: ");
        int anio = sc.nextInt();

        System.out.print("Ejemplares totales: ");
        int totales = sc.nextInt();

        Libro libro = new Libro(isbn, titulo, autor, anio, totales, totales);
        servicio.registrarLibro(libro);
    }

    private void registrarUsuarioDesdeConsola(Scanner sc) {
        System.out.print("ID usuario: ");
        String id = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        Usuario usuario = new Usuario(id, nombre);
        servicio.registrarUsuario(usuario);
    }

    private void prestarLibroDesdeConsola(Scanner sc) {
        System.out.print("ID usuario: ");
        String id = sc.nextLine();

        System.out.print("ISBN libro: ");
        String isbn = sc.nextLine();

        servicio.prestarLibro(id, isbn);
    }

    private void devolverLibroDesdeConsola(Scanner sc) {
        System.out.print("ID usuario: ");
        String id = sc.nextLine();

        System.out.print("ISBN libro: ");
        String isbn = sc.nextLine();

        servicio.devolverLibro(id, isbn);
    }
}


