package ejercicioextra02.servicios;

import ejercicioextra02.entidades.Puntos;
import java.util.Scanner;



public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void crearPuntos(Puntos c1) {
        System.out.println("Ingrese la coordenada en X para el 1er Punto:");
        c1.setX1(leer.nextInt());
        System.out.println("Ingrese la coordenada en Y para el 1er Punto:");
        c1.setX2(leer.nextInt());
        System.out.println("Ingrese la coordenada en X para el 2do Punto:");
        c1.setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada en Y para el 2do Punto:");
        c1.setY2(leer.nextInt());
    }

    public float calcularDistancia(Puntos c1) {
        float distancia;
        distancia = (float) Math.sqrt((Math.pow((c1.getX2() - c1.getX1()), 2) + Math.pow((c1.getY2() - c1.getY1()), 2)));
        return distancia;
    }
}
