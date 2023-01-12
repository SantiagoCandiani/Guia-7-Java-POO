/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicioextraextra01.Servicios;

import ejercicioextraextra01.entidades.Fraccion;
import java.util.Scanner;

public class Servicios {

    static Scanner leer = new Scanner(System.in);

    public void crearFracciones(Fraccion f1) {

        //busca numero aleatorio entre 10 y -10. Si es 0 lo vuelve a hacer.
        f1.setNumerador1((int) (Math.random() * 10));
        if (f1.getNumerador1() == 0) {
            do {
                f1.setNumerador1((int) (Math.random() * 10));
            } while (f1.getNumerador1() == 0);
        }

        f1.setNumerador2((int) (Math.random() * 10));
        if (f1.getNumerador2() == 0) {
            do {
                f1.setNumerador2((int) (Math.random() * 10));
            } while (f1.getNumerador2() == 0);
        }

        //si el denominador es 0 quiere decir que es un numero entero, no una fraccion
        //por lo que quedaria NUM/1....
        f1.setDenominador1((int) (Math.random() * 10));
        if (f1.getDenominador1() == 0) {
            f1.setDenominador1(1);
        }

        f1.setDenominador2((int) (Math.random() * 10));
        if (f1.getDenominador2() == 0) {
            f1.setDenominador2(1);
        }
        System.out.println("- FRACCION 1: " + f1.getNumerador1() + "/" + f1.getDenominador1());
        System.out.println("- FRACCION 2: " + f1.getNumerador2() + "/" + f1.getDenominador2());
    }

    public int maximoComunDivisor(Fraccion f1) {
        int a = Math.max(f1.getDenominador1(), f1.getDenominador2());
        int b = Math.min(f1.getDenominador1(), f1.getDenominador2());
        int resultadoMCD = 0;

        do {
            resultadoMCD = b;
            b = a % b;
            a = resultadoMCD;

        } while (b != 0);
        return resultadoMCD;
    }

    public int minimoComunMultiplo(Fraccion f1) {
        int a = Math.max(f1.getDenominador1(), f1.getDenominador2());
        int b = Math.min(f1.getDenominador1(), f1.getDenominador2());

        int resultadoMCM = (a / maximoComunDivisor(f1)) * b;
        return resultadoMCM;
    }

    public void sumarFracciones(Fraccion f1) {
        int nuevoNumerador = ((minimoComunMultiplo(f1) / f1.getDenominador1()) * f1.getNumerador1()) + ((minimoComunMultiplo(f1) / f1.getDenominador2()) * f1.getNumerador2());
        int nuevoDenominador = minimoComunMultiplo(f1);

        System.out.println("* La suma es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    public void restarFracciones(Fraccion f1) {
        int nuevoNumerador = ((minimoComunMultiplo(f1) / f1.getDenominador1()) * f1.getNumerador1()) - ((minimoComunMultiplo(f1) / f1.getDenominador2()) * f1.getNumerador2());
        int nuevoDenominador = minimoComunMultiplo(f1);

        System.out.println("* La resta es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    public void multiplicarFracciones(Fraccion f1) {
        int nuevoNumerador = f1.getNumerador1() * f1.getNumerador2();
        int nuevoDenominador = f1.getDenominador1() * f1.getDenominador2();

        System.out.println("* La multiplicacion es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    public void dividirFracciones(Fraccion f1) {
        int nuevoNumerador = f1.getNumerador1() * f1.getDenominador2();
        int nuevoDenominador = f1.getDenominador1() * f1.getNumerador2();

        System.out.println("* La division es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    public void menu(Fraccion f1) {

        boolean salir = false;
        int opcion;

        while (salir == false) { // podria ser while (!salir)(se repite mientras salir no sea verdadero)
            System.out.println("**********************************");
            System.out.println("*   OPERACIONES CON FRACCIONES   *");
            System.out.println("**********************************");
            System.out.println("1. Mostrar Fracciones (nros aleatorios).");
            System.out.println("2. Sumar Fracciones.");
            System.out.println("3. Restar Fracciones.");
            System.out.println("4. Multiplicar Fracciones.");
            System.out.println("5. Dividir Fracciones.");
            System.out.println("6. SALIR");
            System.out.println("ELIJA UNA OPCION");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearFracciones(f1);
                    System.out.println("");
                    break;
                case 2:
                    sumarFracciones(f1);
                    System.out.println("");
                    break;
                case 3:
                    restarFracciones(f1);
                    System.out.println("");
                    break;
                case 4:
                    multiplicarFracciones(f1);
                    System.out.println("");
                    break;
                case 5:
                    dividirFracciones(f1);
                    System.out.println("");
                    break;
                case 6:
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
}//class
