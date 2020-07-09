package mx.com.sobrescritura;
import package1.*;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 4000);
        System.out.println(empleado1.mostrarDetalles());
        
        Gerente gerente1 = new Gerente("Karla", 8000, "Finanzas");
        System.out.println(gerente1.mostrarDetalles());
       
    }
    
}
