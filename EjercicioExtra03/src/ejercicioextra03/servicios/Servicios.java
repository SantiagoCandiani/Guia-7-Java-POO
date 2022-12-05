package ejercicioextra03.servicios;

import ejercicioextra03.entidades.Raices;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void cargarDatos(Raices r1) {
        System.out.println("Vamos a ingresar los valores para calcular una funcion de segundo grado.");
        System.out.println("La formula de la misma es: -b±√((b^2)-(4*a*c)))/(2*a)");
        System.out.println("- Ingrese el valor para 'a':");
        r1.setA(leer.nextInt());
        System.out.println("- Ingrese el valor para 'b':");
        r1.setB(leer.nextInt());
        System.out.println("- Ingrese el valor para 'c':");
        r1.setC(leer.nextInt());
    }

    public double getDiscriminante(Raices r1) {
        //(b^2)-4*a*c
        return (double) (Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()));
    }

    public boolean tieneRaices(Raices r1) {
        return getDiscriminante(r1) > 0;
    }

    public boolean tieneRaiz(Raices r1) {
        return getDiscriminante(r1) == 0;
    }

    public boolean tieneRaicesComplejas(Raices r1) {
        return getDiscriminante(r1) < 0;
    }

    public void obtenerRaices(Raices r1) {
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaices(r1) == true) {
            double raiz1 = (-r1.getB() + Math.sqrt(getDiscriminante(r1))) / (2 * r1.getA());
            double raiz2 = (-r1.getB() - Math.sqrt(getDiscriminante(r1))) / (2 * r1.getA());
            System.out.println("La ecuacion tiene 2 soluciones de nros reales distintas:");
            System.out.println("* La raiz 1 es: " + raiz1);
            System.out.println("* La raiz 2 es: " + raiz2);
        }
    }

    public void obtenerRaiz(Raices r1) {
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaiz(r1) == true) {
            double raizUnica = (-r1.getB());
            System.out.println("* La ecuacion tiene una solucion de un nro real unico.");
            System.out.println("* La raiz unica es: " + raizUnica);
        }
    }

    public void obtenerRaicesComplejas(Raices r1) {
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaicesComplejas(r1) == true) {

            System.out.println("* La ecuacion tiene 2 soluciones de numeros complejos conjugados.");
            System.out.println("* Y no se como se calculan =).");
        }
    }

    public void calcular(Raices r1) {
        obtenerRaicesComplejas(r1);
        obtenerRaices(r1);
        obtenerRaiz(r1);
    }

}//Servicios
