package ejercicioextraextra01.entidades;

public class Fraccion {

    private int denominador1;
    private int numerador1;
    private int denominador2;
    private int numerador2;

    public Fraccion() {
    }

    public Fraccion(int denominador1, int numerador1, int denominador2, int numerador2) {
        this.denominador1 = denominador1;
        this.numerador1 = numerador1;
        this.denominador2 = denominador2;
        this.numerador2 = numerador2;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

}
