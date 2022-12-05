/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio09.Servicios;

import ejercicio09.Entidades.Matematica;
import static java.lang.Float.max;
import static java.lang.Float.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Servicios {

    public float devolverMayor(Matematica m1) {
        return max(m1.getNum1(), m1.getNum2());
    }//devolverMayor()

    public float devolverMenor(Matematica m1) {
        return min(m1.getNum1(), m1.getNum2());
    }//devolverMenor()

    public float calcularPotencia(Matematica m1) {

        float n1 = round(devolverMayor(m1));
        System.out.println(n1);
        float n2 = round(devolverMenor(m1));
        System.out.println(n2);

        return (int) pow(n1, n2);
    }//calcularPotencia()

    public float calculaRaiz(Matematica m1) {

        float n2 = round(devolverMenor(m1));

        return (float) Math.sqrt(n2);
    }
}//class
