package ejercicio03.entidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operacion {

    static Scanner leer = new Scanner(System.in);

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        //abre una ventana que pide ingresar un numero
        setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero")));
        setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero")));
//        System.out.println("Ingrese el primer numero");
//        setNumero1(leer.nextFloat());
//        System.out.println("Ingrese el segundo numero");
//        setNumero2(leer.nextFloat());
    }

    public int sumar() {
        int sumar = getNumero1() + getNumero2();
        return sumar;
    }

    public int restar() {
        int restar = getNumero1() - getNumero2();
        return restar;
    }

    public int multiplicar() {

        int multiplicar;

        if (getNumero1() == 0 || getNumero2() == 0) {
            return 0;
        } else {
            multiplicar = getNumero1() * getNumero2();
        }
        return multiplicar;
    }

    public float dividir() {

        float dividir;

        if (getNumero1() == 0 || getNumero2() == 0) {
            return 0;
        } else {
            dividir = getNumero1() / getNumero2();
        }
        return dividir;
    }

}
