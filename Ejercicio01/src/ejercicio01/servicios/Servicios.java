package ejercicio01.servicios;

import ejercicio01.entidades.Libro;
import java.util.Scanner;

public class Servicios {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

public void cargarLibro(Libro libro1) {
        System.out.println("Ingrese el numero ISBN de su libro");
        libro1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el titulo de su libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el autor de su libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas de su libro");
        libro1.setNumeroDePaginas(leer.nextInt());
    }

    public void informarDatos(Libro libro1) {
        System.out.println("El numero ISBN del libro es: " + libro1.getIsbn() + ".");
        System.out.println("El titulo del libro es: " + libro1.getTitulo() + ".");
        System.out.println("El autor del libro es: " + libro1.getAutor() + ".");
        System.out.println("El numero de paginas del libro es: " + libro1.getNumeroDePaginas() + ".");
    }

}
