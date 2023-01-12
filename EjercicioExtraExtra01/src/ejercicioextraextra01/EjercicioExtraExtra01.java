/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicioextraextra01;

import ejercicioextraextra01.Servicios.Servicios;
import ejercicioextraextra01.entidades.Fraccion;

public class EjercicioExtraExtra01 {

    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion();
        Servicios serv = new Servicios();
               
        serv.menu(f1);
  
    }//main
    
}//class1
