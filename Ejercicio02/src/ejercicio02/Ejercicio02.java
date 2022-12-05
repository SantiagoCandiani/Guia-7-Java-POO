/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area().
e) Método perimetro().
 */
package ejercicio02;

import ejercicio02.entidades.Circunferencia;

public class Ejercicio02 {

    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia();

        c1.crearCircunferencia();
        c1.perimetro();
        c1.area();        
    }
}
