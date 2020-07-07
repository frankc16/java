package test;

import enumera.Dias;
import enumera.continentes;

public class testing {

    public static void main(String[] args) {
        System.out.println("Dia 1" + Dias.LUNES);
        indicadorDias(Dias.VIERNES);
        
        System.out.println("Africa tiene " + continentes.AFRICA.getPaises() + " paises");
        
    }
    public static void indicadorDias(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case VIERNES:
                System.out.println("quinto dia de la semana");
                break;
            default:
                System.out.println("no coincide con ningun dia");
                break;
        }
    }

}
