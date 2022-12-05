/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada..
 */
package ejercicio06;

import ejercicio06.Entidades.Cafetera;
import ejercicio06.Servicios.Servicios;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Servicios serv = new Servicios();

        Cafetera caf = serv.llenarCafetera();

        boolean salir = false;
        int opcion;

        while (!salir) { // (salir == false) o (!salir) SON LO MISMO. CUALQUIERA ES VALIDA
            System.out.println("*********************");
            System.out.println("*   MENU DE CAFETERA  *");
            System.out.println("*********************");
            System.out.println("1. Servir una taza de cafe.");
            System.out.println("2. Vaciar cafetera.");
            System.out.println("3. Agregar cafe a la cafetera.");
            System.out.println("4. SALIR");
            System.out.println("ELIJA UNA OPCION");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de la taza a servir (en mililitros):");
                    serv.servirTaza(caf, leer.nextInt());
                    System.out.println("");
                    break;
                case 2:
                    serv.vaciarCafetera(caf);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese una cantidad de cafe para agregar (en mililitros):");
                    serv.agregarCafe(caf, leer.nextInt());
                    break;
                case 4:
                    System.out.println("Esta seguro que desea salir del programa? S/N");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        salir = true;
                    }
                    System.out.println("");
                    break;

                default:
                    System.out.println("La opcion elegida no es una opcion correcta, vuelva a intentarlo");
            }
        }
        System.out.println("USTED SALIO DEL PROGRAMA CON EXITO!!");
        System.out.println("");
    }
}