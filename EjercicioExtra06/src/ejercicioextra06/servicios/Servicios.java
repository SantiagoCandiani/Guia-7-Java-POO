package ejercicioextra06.servicios;

import ejercicioextra06.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

//// Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
////Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
////vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
////de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
////máximas, el valor que ingresó el usuario y encontradas en 0.
    public void crearJuego(Ahorcado ah1) {
        System.out.println("- Ingrese una palabra a adivinar:");
        String aux1 = leer.next();

        String[] aux2 = new String[aux1.length()];

        System.out.println("- Ingrese la cantidad de jugadas maximas:");
        ah1.setCantidadJugadasMax(leer.nextInt());

        for (int i = 0; i < aux1.length(); i++) {
            aux2[i] = aux1.substring(i, i + 1);
        }

        ah1.setPalabraBuscada(aux2);
        ah1.setLetrasEncontradas(0);
    }

//// Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
////buscar como se usa el vector.length.
    public void mostrarLongitud(Ahorcado ah1) {
        System.out.println("- La palabra contiene: " + ah1.getPalabraBuscada().length +" letras.");
    }

////  Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
////letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public boolean buscarLetra(Ahorcado ah1, String letra) {

        boolean banderaBuscarLetra = false;

//ASI LO TENIA ESCRITO YO:
//        for (int i = 0; i < ah1.getPalabraBuscada().length; i++) {
//            if (letra.equalsIgnoreCase(ah1.getPalabraBuscada()[i])) {
//                banderaBuscarLetra = true;
//            }
//        }
//ASI ME LO PUSO AUTOMATICO LA PC (ES LO MISMO):
        for (String palabraBuscada : ah1.getPalabraBuscada()) {
            if (letra.equalsIgnoreCase(palabraBuscada)) {
                banderaBuscarLetra = true;
                break;
            }
        }

        if (banderaBuscarLetra) {
            System.out.println("- Tu letra SI esta dentro de la palabra.");
        } else {
            System.out.println("- Tu letra NO esta dentro de la palabra.");
        }

        return banderaBuscarLetra;
    }//buscarLetra

// Método encontrarLetra(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontrarLetra(Ahorcado ah1, String letra, String[] mostrarPalabra) {

        boolean banderaEncontrarLetra = false;
        int letrasEncontradas = 0;

        for (int i = 0; i < ah1.getPalabraBuscada().length; i++) {
            if (letra.equalsIgnoreCase(ah1.getPalabraBuscada()[i])) {
                letrasEncontradas++;
                ah1.setLetrasEncontradas(ah1.getLetrasEncontradas() + 1);
                mostrarPalabra[i] = letra;
            }
        }
        System.out.println("- La letra ''" + letra + "'' se encontró: " + letrasEncontradas + " veces.");
        System.out.println(Arrays.toString(mostrarPalabra));
        if (ah1.getPalabraBuscada().length - ah1.getLetrasEncontradas() == 0) {
            System.out.println("FELICITACIONES - ENCONTRASTE LA PALABRA!!!");
        } else {
            System.out.println("- Las letras encontradas hasta ahora fueron: " + ah1.getLetrasEncontradas());
            System.out.println("- Las letras faltantes son: " + (ah1.getPalabraBuscada().length - ah1.getLetrasEncontradas()));
            if (letrasEncontradas > 0) {
                banderaEncontrarLetra = true;
            }
        }
        return banderaEncontrarLetra;
    }
    // Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

    public void intentos(Ahorcado ah1, String letra) {
        ah1.setCantidadJugadasMax(ah1.getCantidadJugadasMax() - 1);
        int intentos = ah1.getCantidadJugadasMax();
        System.out.println("- Te quedan " + intentos + " intentos.");
    }

// Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void jugar(Ahorcado ah1) {
        crearJuego(ah1);
        String[] mostrarPalabra = new String[ah1.getPalabraBuscada().length];
        for (int i = 0; i < ah1.getPalabraBuscada().length; i++) {

            mostrarPalabra[i] = "_";
        }
        mostrarLongitud(ah1);
        String letra;
        do {
            System.out.println("- Ingrese una letra:");
            letra = leer.next();
            if (Arrays.toString(mostrarPalabra).contains((letra))) {
                System.out.println("Ya se encuentra la letra en la palabra");
                System.out.println(Arrays.toString(mostrarPalabra));
                continue;
            }
            if (buscarLetra(ah1, letra)) {
                if (encontrarLetra(ah1, letra, mostrarPalabra));
            } else {
                intentos(ah1, letra);
            }

        } while (ah1.getCantidadJugadasMax() > 0 && ah1.getLetrasEncontradas() != ah1.getPalabraBuscada().length);

    }

}//Servicios
