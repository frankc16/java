package ejemploPolimorfismo;
import package1.*;

/*
En el polimorfismo cuando dos clases tienen una relacion de herencia
un objeto de la clase padre tiene la capacidad de apuntar a otro objeto de la clase
hija, como en este caso aunque en el metodo imprimirDetalles() se especifica un 
objeto tipo Empleado este luego apunta a un objeto tipo Gerente (cambia su direccion en memoria) que es hija, 
actualizando su respuesta al ultimo objeto señalado.
*/

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 4000);
        imprimirDetalles(empleado1);
        
        Gerente gerente1 = new Gerente("Karla", 8000, "Finanzas");
        imprimirDetalles(gerente1);
    }
    
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("detalles empleado:" + empleado.mostrarDetalles());
    
    }
    
}
