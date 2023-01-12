package ejercicioextra06_v2.entidades;

public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int encontradas, int jugMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugMax = jugMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

}
