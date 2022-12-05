/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package ejercicio13.servicios;

import ejercicio13.entidades.Curso;
import java.util.Scanner;

public class Servicios {

    static Scanner leer = new Scanner(System.in);

    public void cargarAlumnos(Curso c1) {
        String auxAlumnos[] = new String[c1.getAlumnos().length];

        for (int i = 0; i < c1.getAlumnos().length; i++) { //devuelve el tamaño del arreglo.
            System.out.println("- ALUMNO " + (i + 1) + ": Ingrese el nombre:");
            auxAlumnos[i] = leer.next();
        }
        c1.setAlumnos(auxAlumnos);
    }

    public void crearCurso(Curso c1) {

        System.out.println("- Ingrese el nombre del curso:");
        c1.setNombreCurso(leer.next());

        System.out.println("- Ingrese la cantidad de dias a la semana del curso:");
        c1.setCantidadDiasPorSemana(leer.nextInt());

        System.out.println("- Ingrese la cantidad de horas diarias del curso:");
        c1.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("- Ingrese el turno del curso: T-Tarde o M-Mañana");
        String turno1;
        do {
            turno1 = leer.next();

            if (turno1.equalsIgnoreCase("t")) {
                c1.setTurno("Tarde");
                break;
            } else if (turno1.equalsIgnoreCase("m")) {
                c1.setTurno("Mañana");
                break;
            } else {
                System.out.println("Letra incorrecta. Vuelva a intentarlo.");
            }

        } while (!turno1.equalsIgnoreCase("t") || !turno1.equalsIgnoreCase("m"));

        System.out.println("- Ingrese el precio por hora del curso:");
        c1.setPrecioPorHora(leer.nextInt());

        cargarAlumnos(c1);
    }

    public void calcularGananciaSemanal(Curso c1) {
        int gananciaSemanal = (c1.getCantidadDiasPorSemana() * c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumnos().length);
        System.out.println("- La ganacia semanal es de: $ " + gananciaSemanal);
    }
}
