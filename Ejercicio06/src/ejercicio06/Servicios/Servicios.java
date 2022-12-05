package ejercicio06.Servicios;

import ejercicio06.Entidades.Cafetera;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera caf1 = new Cafetera();
        caf1.setCapacidadMaxima(2000);
        caf1.setCantidadActual(caf1.getCapacidadMaxima());
        return caf1;
    }

    public void servirTaza(Cafetera caf, int tamanio) {

        if (caf.getCantidadActual() < tamanio) {
            System.out.println("No habia la cantidad de cafe necesario para llenar su taza.");
            System.out.println("Se sirvió: " + caf.getCantidadActual() + " mililitros de cafe.");
            caf.setCantidadActual(0);
        } else {
            System.out.println("Se completó su taza indicada con: " + tamanio + " mililitros de cafe.");
            caf.setCantidadActual(caf.getCantidadActual() - tamanio);
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
        System.out.println("Ahora la cafetera esta vacia.");
    }

    public void agregarCafe(Cafetera caf, int llenar) {
        if ((caf.getCantidadActual() + llenar) > caf.getCapacidadMaxima()) {
            caf.setCantidadActual(caf.getCapacidadMaxima());
            System.out.println("Se completó la cafetera.");
        } else {
            caf.setCantidadActual(caf.getCantidadActual() + llenar);
            System.out.println("Ahora la cafetera tiene: " + caf.getCantidadActual());
        }
    }
}
