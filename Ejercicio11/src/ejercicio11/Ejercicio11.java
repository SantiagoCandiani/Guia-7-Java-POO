/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("- Ingrese una fecha con el formato 'dia, mes , año': ");
        int dia = leer.nextInt();
        int mes = leer.nextInt() - 1;
        int anio = leer.nextInt() - 1900;

        Date fecha1 = new Date(anio, mes, dia);

        Date fechaActual = new Date(); // por defecto toma el de la pc 

        System.out.println("La Fecha ingresada es: " + fecha1.toString());
        System.out.println("La fecha actual es: " + fechaActual.toString());

        System.out.println("La diferencia de años entre fechas es: " + (fechaActual.getYear() - fecha1.getYear()) + " Años");
    }

}
