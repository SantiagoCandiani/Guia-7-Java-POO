package ejercicioextra05.servicios;

import ejercicioextra05.entidades.Mes;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void crearMesSectreto(Mes m1) {
        String[] auxMeses = new String[]{"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SETIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        m1.setMeses(auxMeses);

        int a = (int) (Math.random() * m1.getMeses().length);
        m1.setMesSecreto(auxMeses[a]);
    }

    public void adivinarMes(Mes m1) {
        System.out.println("Shhhhh el mes es: " + m1.getMesSecreto() + ". No le digas a nadie que te dije. ;)");

        System.out.println("- Adivine el mes secreto (escriba el nombre completo):");
        String adivinanza;

        do {
            adivinanza = leer.next();

            if (m1.getMesSecreto().equalsIgnoreCase(adivinanza)) {
                System.out.println("- FELICITACIONES. ¡Ha acertado!.");
                break;
            } else {
                System.out.println("- Mes incorrecta. Vuelva a intentarlo.");
            }
        } while (!m1.getMesSecreto().equalsIgnoreCase(adivinanza));
    }

}//Servicios
