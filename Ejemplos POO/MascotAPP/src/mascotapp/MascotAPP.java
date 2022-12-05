package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");

        m1.setNombre("Pepe Chiquito");
        
        System.out.println(m1);
        
        m1.pasear(100);

        System.out.println(m1);

    }

}
