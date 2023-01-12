package ejercicioextraextra01_v2;

import ejercicioextraextra01_v2.entidadesServicios.Fraccion;


public class EjercicioExtraExtra01_v2 {

    public static void main(String[] args) {
       Fraccion f = new Fraccion(6, 3);
        Fraccion f2 = new Fraccion(2, 6);
        System.out.println("Suma de " + f + " + " + f2 + " = " + f.suma(f2));
        System.out.println("Resta de " + f + " - " + f2 + " = " + f.resta(f2));
        System.out.println("Producto de " + f + " * " + f2 + " = " + f.producto(f2));
        System.out.println("Cociente de " + f + " / " + f2 + " = " + f.cociente(f2));
        System.out.println("Inversa de " + f + " = " + f.inversa());
        int exponente = 3;
        System.out.println("Potencia de " + f + " con exponente " + exponente + " = " + f.potencia(exponente));
        // Probar la simplificación y el constructor copia
        Fraccion paraSimplificar = new Fraccion(new Fraccion(80, 120));
        System.out.println("Simplificar la fracción " + paraSimplificar + " = " + paraSimplificar.simplifica());
        Fraccion f3 = new Fraccion(1, 5);
        Fraccion f4 = new Fraccion(1, 3);
        Fraccion f5 = new Fraccion(1, 5);
        System.out.println(f3 + " es igual a " + f4 + ": " + f3.equals(f4));
        System.out.println(f3 + " es igual a " + f5 + ": " + f3.equals(f5));
        System.out.println(f4 + " es igual a " + f5 + ": " + f4.equals(f5));
    }
}
