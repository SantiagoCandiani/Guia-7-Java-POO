package ejercicioextra06.entidades;

public class Ahorcado {

    private String[] palabraBuscada;
    private int letrasEncontradas;
    private int cantidadJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscada, int letrasEncontradas, int cantidadJugadasMax) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

}
