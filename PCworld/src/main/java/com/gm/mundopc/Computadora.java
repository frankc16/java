package com.gm.mundopc;

public class Computadora {
    private String nombre;
    private int idComputadora;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton; 
    private int precio;
    private static int pcCounter;

 public Computadora(){
     this.idComputadora = ++pcCounter;
 }
 public Computadora(Monitor monitor, Teclado teclado, Raton raton, int precio, String nombre){
     this();
     
     this.monitor = monitor;
     this.teclado = teclado;
     this.raton = raton;
     this.precio = precio;
     this.nombre = nombre;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + ", precio=" + precio + '}';
    }
      
}
