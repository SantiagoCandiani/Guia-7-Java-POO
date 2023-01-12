package ejercicioextraextra02.entidades;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        String auxH, auxM, auxS;
        if (horas < 10) {
            auxH = "0" + horas;
        } else {
            auxH = "" + horas;
        }
        if (minutos < 10) {
            auxM = "0" + minutos;
        } else {
            auxM = "" + minutos;
        }
        if (segundos < 10) {
            auxS = "0" + segundos;
        } else {
            auxS = "" + segundos;
        }

        return "Tiempo: " + auxH + ":" + auxM + ":" + auxS + " (hs:min:seg)";
    }

}
