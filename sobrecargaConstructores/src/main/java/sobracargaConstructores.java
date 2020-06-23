
public class sobracargaConstructores {
    
    /* la sobrecarga de constructores se utiliza para tener la opcion de elegir 
    diferentes grupos de argumentos para trabajar, es util las palabras super y this
    para llamar a los contructores */
    
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria", 30);
        System.out.println(p1);
        
        Empleado e1 = new Empleado("Guille", 45, 20000);
        e1.setSalary(45000);
        System.out.println(e1);
        
    }
    
}
