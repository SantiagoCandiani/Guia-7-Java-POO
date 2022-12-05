/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio05;

import ejercicio05.entidades.CuentaBancaria;
import ejercicio05.servicios.Servicios;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Servicios serv = new Servicios();

        CuentaBancaria c1 = serv.crearCuenta();
        
        //serv.menu(c1);
        //Quise hacer un metodo MENU en service, pero no supe como llamar a los otros metodos adentro.
        boolean salir = false;
        int opcion;

        while (salir==false) { // podria ser while (!salir)(se repite mientras salir no sea verdadero)
            System.out.println("*********************");
            System.out.println("*   MENU DE CUENTA  *");
            System.out.println("*********************");
            System.out.println("1. Ingresar dinero a la cuenta.");
            System.out.println("2. Retirar dinero de la cuenta.");
            System.out.println("3. Extraccion rapida.");
            System.out.println("4. Consultar Saldo.");
            System.out.println("5. Consultar Datos.");
            System.out.println("6. SALIR");
            System.out.println("ELIJA UNA OPCION");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    serv.ingresar(c1); //pedia con double y puse int (no me sale)
                    System.out.println("");
                    break;
                case 2:
                    serv.retirar(c1); //pedia con double y puse int (no me sale)
                    System.out.println("");
                    break;
                case 3:
                    serv.extraccionRapida(c1);
                    System.out.println("");
                    break;
                case 4:
                    serv.consultarSaldo(c1);
                    System.out.println("");
                    break;
                case 5:
                    serv.consultarDatos(c1);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Esta seguro que desea salir del programa? S/N");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        salir = true;
                    }
                    System.out.println("");
                    break;

                default:
                    System.out.println("La opcion elegida no es una opcion correcta, vuelva a intentarlo");
            }
        }

        System.out.println("USTED SALIO DEL PROGRAMA CON EXITO!!");
        System.out.println("");

    }
}
