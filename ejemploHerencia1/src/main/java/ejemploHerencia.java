/*
Cuando se usa la palabra super se debe tener en cuenta que la clase hija esta llamando
los constructores del padre, si no se utiliza por default la clase hija buscara un constructor
vacio en la clase padre, de no existir votará un error, por eso hay que crearle.
 */
import java.util.Date;
public class ejemploHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Joe", 45000);
        empleado1.setAge(30);
        empleado1.setGender('M');
        System.out.println(empleado1);  
        
        Cliente cliente1 = new Cliente(new Date(), true);
        System.out.println(cliente1);  
    }
    
    
    
}
