
package com.gm.mundopc;

public class Raton extends DispoEntrada{
    private int idRaton;
    private static int contadorRaton;
    
    public Raton(String tipoEntrada, String marca){
    super(tipoEntrada, marca);
    this.idRaton = ++contadorRaton; 
    }  

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + '}';
    }
    
  }
