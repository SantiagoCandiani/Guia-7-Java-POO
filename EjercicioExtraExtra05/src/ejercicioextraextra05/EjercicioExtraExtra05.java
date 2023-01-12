/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ejercicioextraextra05;

import ejercicioextraextra05.servicios.Servicios;

public class EjercicioExtraExtra05 {

    public static void main(String[] args) {

        Servicios serv = new Servicios();

        serv.compararTriangulos();
    }

}
