package ejercicio05.servicios;

import ejercicio05.entidades.CuentaBancaria;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();

        System.out.println("Ingrese el numero de cuenta.");
        c1.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el DNI del Usuario.");
        c1.setDni(leer.nextInt());

        System.out.println("Ingrese el saldo actual de su cuenta.");
        c1.setSaldoActual(leer.nextInt());

        System.out.println("Ingrese la tasa de interes.");
        c1.setInteres(leer.nextInt());

        return c1;
    }

    public void ingresar(CuentaBancaria c1) {
        System.out.println("Digite el monto que desea ingresar a la cuenta:");
        int ingresar = leer.nextInt();

        c1.setSaldoActual(c1.getSaldoActual() + ingresar);

        System.out.println("El nuevo saldo es de: " + c1.getSaldoActual());
    }

    public void retirar(CuentaBancaria c1) {
        System.out.println("Digite el monto que desea retirar de la cuenta:");
        int retirar = leer.nextInt();

        if (c1.getSaldoActual() < retirar) {
            System.out.println("Solo pudo retirar: " + c1.getSaldoActual());
            c1.setSaldoActual(0);
            System.out.println("Ahora su saldo actual es: " + c1.getSaldoActual());
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retirar);
            System.out.println("El nuevo saldo es de: " + c1.getSaldoActual());
        }
    }

    public void extraccionRapida(CuentaBancaria c1) {
        System.out.println("Digite el monto que desea retirar de la cuenta:");
        int extraer = leer.nextInt();

        while (extraer > (0.2 * c1.getSaldoActual())) {
            System.out.println("Monto incorrecto. Intente de vuelta.");
            extraer = leer.nextInt();
        }
        c1.setSaldoActual(c1.getSaldoActual() - extraer);
        System.out.println("El nuevo saldo es de: " + c1.getSaldoActual());
    }

    public void consultarSaldo(CuentaBancaria c1) {
        System.out.println("El saldo de la cuenta es: " + c1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria c1) {
        System.out.println("El numero de cuenta es: " + c1.getNumeroCuenta());
        System.out.println("El dni del usuario es: " + c1.getDni());
        System.out.println("El saldo de la cuenta es: " + c1.getSaldoActual());
        System.out.println("Los interesese de la cuenta son: " + c1.getInteres());
        System.out.println("");
    }

//    public void menu(CuentaBancaria c1) {
//        boolean salir = false;
//        int opcion;
//
//        while (!salir) {
//            System.out.println("*********************");
//            System.out.println("*   MENU DE CUENTA  *");
//            System.out.println("*********************");
//            System.out.println("1. Ingresar dinero a la cuenta.");
//            System.out.println("2. Retirar dinero de la cuenta.");
//            System.out.println("3. Extraccion rapida.");
//            System.out.println("4. Consultar Saldo.");
//            System.out.println("5. Consultar Datos.");
//            System.out.println("6. SALIR");
//            System.out.println("ELIJA UNA OPCION");
//
//            opcion = leer.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    c1(ingresar()); //pedia con double y puse int (no me sale)
//                    System.out.println("");
//                    break;
//                case 2:
//                    retirar(); //pedia con double y puse int (no me sale)
//                    System.out.println("");
//                    break;
//                case 3:
//                    extraccionRapida();
//                    System.out.println("");
//                    break;
//                case 4:
//                    consultarSaldo();
//                    System.out.println("");
//                    break;
//                case 5:
//                    consultarDatos();
//                    System.out.println("");
//                    break;
//                case 6:
//                    System.out.println("Esta seguro que desea salir del programa? S/N");
//                    String respuesta = leer.next();
//                    if (respuesta.equalsIgnoreCase("s")) {
//                        salir = true;
//                    }
//                    System.out.println("");
//                    break;
//
//                default:
//                    System.out.println("La opcion elegida no es una opcion correcta, vuelva a intentarlo");
//            }
//        }
//
//        System.out.println("USTED SALIO DEL PROGRAMA CON EXITO!!");
//        System.out.println("");
//
//    }
}


