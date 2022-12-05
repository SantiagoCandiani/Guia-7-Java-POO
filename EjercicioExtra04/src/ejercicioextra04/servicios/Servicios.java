package ejercicioextra04.servicios;

import ejercicioextra04.entidades.Nif;
import java.util.Scanner;

public class Servicios {

    static Scanner leer = new Scanner(System.in);

    public void crearNif(Nif nif1) {
        System.out.println("- Ingrese su DNI:");
        nif1.setDni(leer.nextLong());

        calcularLetraVerificadora(nif1);
    }

    public void calcularLetraVerificadora(Nif nif1) {

        int resto = (int) (nif1.getDni() % 23);

        char digitoIdentificador[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        nif1.setLetra(digitoIdentificador[resto]);
    }

    public void mostrar(Nif nif1) {
        System.out.println("- El NIF es: " + nif1.getDni() + "-" + nif1.getLetra());
    }

}//Servicios
