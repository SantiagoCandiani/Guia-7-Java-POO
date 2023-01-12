/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio05_v2.servicios;

import static ejercicio05_v2.Ejercicio05_v2.scn;
import ejercicio05_v2.entidades.Cuenta;



public class Servicios {
    public Cuenta crearCuenta() {
        System.out.println("Primero crearemos tu cuenta!!");
        System.out.println("Ingresa el numero de cuenta:");
        int numCuenta = scn.nextInt();
        System.out.println("Ingresa el monto inicial de la cuenta:");
        int saldo = scn.nextInt();
        System.out.println("Ingresa el DNI:");
        long dni = scn.nextLong();

        return new Cuenta(numCuenta, dni, saldo);
    } //end crearCuenta

    private Cuenta ingresar(double ingreso, Cuenta c) {
        c.setSaldoActual(c.getSaldoActual() + (int) ingreso);
        return c;
    }

    public Cuenta pedirIngreso(Cuenta c) {
        System.out.println("Ingrese el monto que desea ingresar a su cuenta:");
        double ingreso = scn.nextDouble();
        c = ingresar(ingreso, c);
        return c;
    }

    private Cuenta retirar(double retiro, Cuenta c) {
        if (c.getSaldoActual() - (int) retiro <= 0) {
            System.out.println("Solo se retirarán u$d " + c.getSaldoActual() + ".");
            c.setSaldoActual(0);
        } else {
            c.setSaldoActual(c.getSaldoActual() - (int) retiro);
        }
        return c;
    }

    public Cuenta pedirRetiro(Cuenta c) {
        System.out.println("Ingresa el monto a retirar: (");
        double retiro = scn.nextDouble();
        c = retirar(retiro, c);
        return c;
    }

    private Cuenta extraccion(double ext, Cuenta c) {
        c.setSaldoActual(c.getSaldoActual() - (int) ext);
        return c;
    }

    public Cuenta extraccionRapida(Cuenta c) {
        System.out.println("Ingresa un monto a extraer (no más del 20% de tu saldo):");
        double ext;
        do {
            ext = scn.nextDouble();
            if (ext > (c.getSaldoActual() * 0.2)) {
                System.out.println("El saldo a extraer supera el monto permitido, try again:");
            }
        } while (ext > (c.getSaldoActual() * 0.2));
        return extraccion(ext, c);
    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("El saldo acrtual de la cuenta es de u$d " + c.getSaldoActual() + ".");
    }

    private boolean confirmarDni(Cuenta c) {
        boolean dniCheck = false;
        long dni;
        for (int i = 3; i > 0; i--) {
            System.out.println("Ingresa tu dni:");
            dni = scn.nextLong();
            if (!(dni == c.getDni())) {
                System.out.println("Dni incorrecto, te quedan " + (i-1) + " intentos.");
            } else {
                dniCheck = true;
                i = 0;
            }
        }
        return dniCheck;
    }

    public boolean consultarDatos(Cuenta c) {
        boolean checkeado = confirmarDni(c);
        if (checkeado) {
            System.out.println(c);
        } else {
            System.out.println("Agotaste tus intentos, prueba mas tarde, chorro.");
        }
        return checkeado;
    }

    public static void esperar(int miliSec) {
        try {
            Thread.sleep(miliSec);
        } catch (InterruptedException ignored) {
        }
    }

    public void menu(Cuenta c) {
        int opcion;
        boolean confirmado;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Presione 1 para ingresar dinero, 2 para retirar dinero.");
            System.out.println("Presione 3 para extracción rápida, 4 para consultar saldo.");
            System.out.println("Presione 5 para consultar datos de la cuenta, o 6 para salir.");
            opcion = scn.nextInt();
            esperar(1000);
            switch (opcion) {
                case 1:
                    pedirIngreso(c);
                    System.out.println("");
                    break;
                case 2:
                    pedirRetiro(c);
                    System.out.println("");
                    break;
                case 3:
                    extraccionRapida(c);
                    System.out.println("");
                    break;
                case 4:
                    consultarSaldo(c);
                    System.out.println("");
                    break;
                case 5:
                    confirmado = consultarDatos(c);
                    if (!confirmado) {
                        opcion=6;
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    System.out.println("");
            }
            esperar(1000);
        } while (!(opcion == 6));
        System.out.println("Adios bobo!");
    }

} //end ServCuenta
