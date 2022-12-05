/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio01;

import ejercicio01.entidades.Libro;
import ejercicio01.servicios.Servicios;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        Servicios serv = new Servicios();
        
        Libro libroUno = new Libro();
                        
        serv.cargarLibro(libroUno);
        serv.informarDatos(libroUno);
    }

}
