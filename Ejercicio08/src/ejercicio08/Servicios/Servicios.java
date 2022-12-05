/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio08.Servicios;

import ejercicio08.Entidades.Cadena;
import java.util.Scanner;

public class Servicios {

    static Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena c1) {
        int vocales = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            switch (c1.getFrase().substring(i, (i + 1)).toLowerCase()) {
                case "a":
                    System.out.print("a -");
                    vocales++;
                    break;
                case "e":
                    System.out.print("e - ");
                    vocales++;
                    break;
                case "i":
                    System.out.print("i - ");
                    vocales++;
                    break;
                case "o":
                    System.out.print("o - ");
                    vocales++;
                    break;
                case "u":
                    System.out.print("u - ");
                    vocales++;
                    break;
            }
        }//for
        System.out.println("");
        if (vocales == 0) {
            System.out.println("- No se encontraron vocales.");
        } else {
            System.out.println("- Se encontraron : " + vocales + " vocales.");
        }
    }//mostrarVocales()

    public void invertirFrase(Cadena c1) {
        String fraseInvertida = "";

        for (int i = (c1.getLongitud() - 1); i >= 0; i--) {
            fraseInvertida += c1.getFrase().substring(i, i + 1);

            //c1.getFrase().charAt(i); esta podria ser otra forma mas corta.
        }
        System.out.println("- La frase era:");
        System.out.println(c1.getFrase());
        // c1.setFrase(fraseInvertida);
        System.out.println("- La frase invertida queda:");
        // System.out.println(c1.getFrase());
        System.out.println(fraseInvertida);
    }//invertirFrase()

    public void vecesRepetido(Cadena c1, String letraBuscada) {

        int contarLetra = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {

            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letraBuscada)) {
                contarLetra++;
            }
        }//for
        if (contarLetra == 0) {
            System.out.println("- La letra ingresada no se encuentra dentro de la frase.");
        } else {
            System.out.println("- La cantidad de letras dentro de la frase es: " + contarLetra);
        }
    }//vecesRepetido()

    public void compararLongitud(Cadena c1, String fraseComparada) {

        if (c1.getLongitud() == fraseComparada.length()) {
            System.out.println("- Las longitudes de las frases son iguales.");
        } else {
            System.out.println("- Las frase NO tienen la misma longitud.");
        }
    }//compararLongitud()

    public void unirFrases(Cadena c1, String fraseComparada) {
        System.out.println("- Las frase unidas quedan:");
        System.out.println(c1.getFrase().concat(fraseComparada));
    }//unirfrase()

    public void reemplazar(Cadena c1) {
        System.out.println("- Ahora reemplazamos 'a' por '#' y la frase quedaria:");
        System.out.println(c1.getFrase().replace('a', '#'));
    }//reemplazar()

    public void contiene(Cadena c1, String letraContiene) {
        if (c1.getFrase().contains(letraContiene)) {
            System.out.println("La letra: " + letraContiene + ", está contenida dentro de la frase.");
        } else {
            System.out.println("NO se encontró la letra: " + letraContiene + ", dentro de la frase.");
        }
    }//contiene()

}
