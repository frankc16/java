package com.gm.mundopc;

import java.util.Date;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputadoras;
    private static final int MAXORDEN = 10;

    public Orden() {
        this.idOrden = ++contadorOrden;
        computadoras = new Computadora[MAXORDEN];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < MAXORDEN) {
            computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Máximo de computadoras alcanzado" + MAXORDEN);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            double costo = computadoras[i].getPrecio();
            total += costo;
        }
        return total;
    }

    public void mostrarOrden() {

        System.out.println("Orden #" + idOrden);
        System.out.println("Fecha" + new Date());

        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
        System.out.println(calcularTotal());
    }
}
