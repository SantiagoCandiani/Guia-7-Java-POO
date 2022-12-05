/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package ejercicio12.Servicios;

import ejercicio12.Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona p1) {
        System.out.println("- Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());

        System.out.println("- Ingrese la fecha de nacimiento:");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        p1.setFechaNacimiento(fecha);

        System.out.println("- La fecha de nacimiento de " + p1.getNombre() + " es : " + p1.getFechaNacimiento());
    }

    public void calcularEdad(Persona p1) {
        LocalDate hoy = LocalDate.now();
        System.out.println("- La fecha actual es: " + hoy);

        Period periodo1 = Period.between(p1.getFechaNacimiento(), hoy);
        System.out.println(periodo1);
        System.out.printf("- %s tiene: %s años, %s meses y %s dias.", p1.getNombre(), periodo1.getYears(), periodo1.getMonths(), periodo1.getDays());
    }

    public boolean menorQue(Persona p1, int edad) {
        LocalDate hoy = LocalDate.now();
        Period periodo1 = Period.between(p1.getFechaNacimiento(), hoy);

        return (periodo1.getYears() < edad);
    }

    public void mostrarPersona(Persona p1, int edad, String nombre1) {
        System.out.println("Su nombre es " + nombre1 + " su edad " + edad);
    }
}
