/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.entidades;

import java.util.Scanner;

public class Circunferencia {

    static Scanner leer = new Scanner(System.in);

    private float radio;

    //constructor
    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //Metodos
    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia deseada:");
        setRadio(leer.nextFloat());
    }

    public void area() {

        float area = (float) (Math.pow(getRadio(), 2) * (Math.PI));  //math.pow eleva al cuadrado
        System.out.println("El area de la circunferencia es: " + area);
    }

    public void perimetro() {

        float perimetro = (float) (2 * getRadio() * (Math.PI));

        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }

}
