package ejercicioextraextra05.servicios;

import ejercicioextraextra05.entidades.Triangulo;
import java.util.Scanner;

public class Servicios {

    static Scanner leer = new Scanner(System.in);

    public Triangulo crearTriangulo() {

        Triangulo tr1 = new Triangulo();

        System.out.println("- Ingrese la base (b) del triangulo isósceles:");
        tr1.setBase(leer.nextInt());
        System.out.println("- Ingrese la altura (h) del triangulo isósceles:");
        tr1.setAltura(leer.nextInt());

        System.out.println("* El area del triangulo es: " + areaTriangulo(tr1));
        System.out.println("* El perimtro del triangulo es: " + perimetroTriangulo(tr1));

        return tr1;
    }

    public float areaTriangulo(Triangulo tr1) {
        float area;
        area = (float) tr1.getBase() * tr1.getAltura() / 2;

        return area;
    }

    public float perimetroTriangulo(Triangulo tr1) {
        float perimetro, hipotenusa;

        hipotenusa = (float) Math.sqrt(Math.pow(tr1.getAltura(), 2) + Math.pow((tr1.getBase() / 2), 2));

        perimetro = 2 * hipotenusa + tr1.getAltura();

        return perimetro;
    }

    public void compararTriangulos() {

        Triangulo[] t1 = new Triangulo[4];
        int trianguloMayor = 0;
        int baseMayor = 0;
        int altutaMayor = 0;
        float areaMayor = 0;
        float perimetroMayor = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("TRIANGULO " + (i + 1) + ":");
            t1[i] = crearTriangulo();
            if (areaMayor < areaTriangulo(t1[i])) {
                trianguloMayor = i + 1;
                baseMayor = t1[i].getBase();
                altutaMayor = t1[i].getAltura();
                areaMayor = areaTriangulo(t1[i]);
                perimetroMayor = perimetroTriangulo(t1[i]);

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("**** El area mayor corresponde al triangulo Nro: " + trianguloMayor + ". ****");
        System.out.println("- Sus datos son:");
        System.out.println("         * Base (b): " + baseMayor + ".");
        System.out.println("         * Altura (h): " + altutaMayor + ".");
        System.out.println("         * Permietro: " + perimetroMayor + ".");
        System.out.println("         * Superficie: " + areaMayor + ".");
    }
}//Servicios
