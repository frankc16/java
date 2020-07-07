package ventas;
import com.gm.mundopc.*;
public class Ventas {
    public static void main(String[] args) {
        //Creando computadora pc1
        Monitor monitor1 = new Monitor("LG", 32);
        Raton raton1 = new Raton("USB", "Genius");
        Teclado teclado1 = new Teclado("USB", "Genius");        
        Computadora pc1 = new Computadora(monitor1, teclado1, raton1, 574, "pc1");
        //System.out.println(pc1);
        
        //Creando computadora pc2
          //Creando computadora pc1
        Monitor monitor2 = new Monitor("LG", 32);
        Raton raton2 = new Raton("USB", "AXUS");
        Teclado teclado2 = new Teclado("USB", "Genius");        
        Computadora pc2 = new Computadora(monitor2, teclado2, raton2, 800, "pc2");
        //System.out.println(pc2);
        
          //Creando computadora pc3
        Monitor monitor3 = new Monitor("Acer", 33);
        Raton raton3 = new Raton("USB", "AXUS");
        Teclado teclado3 = new Teclado("USB", "intel");        
        Computadora pc3 = new Computadora(monitor3, teclado3, raton3, 1000, "pc3");
        //System.out.println(pc3);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc1);
        orden1.agregarComputadora(pc2);
        orden1.agregarComputadora(pc3);
        
        
        orden1.mostrarOrden();
        
    }
    
}
