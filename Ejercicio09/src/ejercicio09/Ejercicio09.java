/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio09;

import ejercicio09.Entidades.Matematica;
import ejercicio09.Servicios.Servicios;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Servicios serv = new Servicios();
        Matematica m1 = new Matematica();
        
        m1.setNum1((float)Math.random()*10);
        m1.setNum2((float)Math.random()*10);
        
        System.out.println("Num1: " + m1.getNum1());
        System.out.println("Num2: " + m1.getNum2());
        
        System.out.println("- El mayor de los 2 numeros es: " + serv.devolverMayor(m1));
        System.out.println("- El mayor nro, elevado al menor es: " + serv.calcularPotencia(m1));
        System.out.println("- La raiz cuadrada del menor es: " + serv.calculaRaiz(m1));        
    }//main    
}//class
