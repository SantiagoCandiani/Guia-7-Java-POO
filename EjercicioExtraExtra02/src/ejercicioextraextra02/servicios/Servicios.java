/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package ejercicioextraextra02.servicios;

import ejercicioextraextra02.entidades.Tiempo;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public Tiempo crearTiempo() {
        Tiempo t1 = new Tiempo();
        t1.setHoras(hora());
        t1.setMinutos(minOSeg());
        t1.setSegundos(minOSeg());
        return t1;
    }

    public int hora() {
        int hr;

        do {
            System.out.println("- Ingrese la hora:");
            hr = leer.nextInt();

        } while (hr < 0 || hr > 23);

        return hr;
    }

    public int minOSeg() {
        int minOSeg;

        do {
            System.out.println("- Ingrese minutos o segundos segun corresponda:");
            minOSeg = leer.nextInt();

        } while (minOSeg < 0 || minOSeg > 59);

        return minOSeg;
    }

    public void imprimirHoraCompleta() throws InterruptedException {
        Tiempo t2 = crearTiempo();

        while (true) {
            System.out.println(t2.toString());
            Thread.sleep(1000);
            if (t2.getSegundos() == 59) {
                t2.setSegundos(0);
                if (t2.getMinutos() == 59) {
                    t2.setMinutos(0);
                    if (t2.getHoras() == 23) {
                        t2.setHoras(0);
                    } else {
                        t2.setHoras(t2.getHoras() + 1);
                    }
                } else {
                    t2.setMinutos(t2.getMinutos() + 1);
                }

            } else {
                t2.setSegundos(t2.getSegundos() + 1);
            }
        }//while

    }
}//Servicios
