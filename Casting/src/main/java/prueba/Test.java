package prueba;
/*
Down casting es reducir el nivel del tipo de variable usado en herencia
para poder utilizar los metodos del nivel inferior
*/
import package1.*;

public class Test {

    public static void main(String[] args) {
        Empleado empleado1;
        empleado1 = new Escritor("Juan", 4000, TipoEscritura.CLASICO);
        
        //ESTE NO ES POSIBLE PUES NO SE HA REALIZADO EL DOWN CASTING NECESARIO
        //Y LOS METODOS DE ESCRITOR AUN NO PUEDEN SER UTILIZADOS
        //System.out.println(empleado1.getDescripcionTipoEscritura()); 
        
        System.out.println(((Escritor)empleado1).getDescripcionTipoEscritura());
        
        empleado1 = new Gerente("Sara", 8000, "Finanzas"); 
        //ESTE NO ES POSIBLE PUES NO SE HA REALIZADO EL DOWN CASTING NECESARIO
        System.out.println(((Gerente)empleado1).getDepartamento());

     }

}
