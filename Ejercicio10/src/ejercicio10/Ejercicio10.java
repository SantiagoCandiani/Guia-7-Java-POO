/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        float [] A = new float[50];
        float [] B = new float[20];

        //Arrays.fill(A, (float)Math.random());
        
        for (int i = 0; i < 50; i++) {
            A[i] = (float) Math.random();
        }

        System.out.print("- El Arreglo A queda: " + Arrays.toString(A));
        System.out.println("");
        Arrays.sort(A);
        System.out.print("- El arreglo A Ordenado queda: " + Arrays.toString(A));

        System.arraycopy(A, 0, B, 0, 10); // sirve para copiar elementos de un vector, matriz a otro
        Arrays.fill(B, 10, 20, (float) 0.5);
        System.out.println("");
        System.out.print("- El arreglo B queda: " + Arrays.toString(B));
        System.out.println("");

    }//main
}//class
