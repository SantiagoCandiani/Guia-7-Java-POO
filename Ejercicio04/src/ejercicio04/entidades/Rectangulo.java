package ejercicio04.entidades;

import java.util.Scanner;

public class Rectangulo {

    static Scanner leer = new Scanner(System.in);

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese el tamaño de la base del rectangulo");
        setBase(leer.nextInt());
        System.out.println("Ingrese el tamaño de la altura del rectangulo");
        setAltura(leer.nextInt());
    }

    public int perimetro() {
        int perimetro = (getBase() + getAltura()) * 2;
        return perimetro;
    }

    public int area() {
        int area = getBase() * getAltura();
        return area;
    }

    public String dibujarRectangulo() {

        String dibujarRectangulo = "";

        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {
                if (j == 0 || j == getBase() - 1 || i == 0 || i == getAltura() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        return dibujarRectangulo;
    }
}
