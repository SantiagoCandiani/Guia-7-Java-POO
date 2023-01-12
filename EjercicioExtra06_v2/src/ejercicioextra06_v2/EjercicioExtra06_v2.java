package ejercicioextra06_v2;

import ejercicioextra06_v2.entidades.Ahorcado;
import ejercicioextra06_v2.servicios.Servicios;

public class EjercicioExtra06_v2 {

    public static void main(String[] args) {
        Servicios ser = new Servicios();
        Ahorcado pal = ser.crearJuego();
        ser.juego(pal);
    }
}