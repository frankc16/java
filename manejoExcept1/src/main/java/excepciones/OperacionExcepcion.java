package excepciones;
/*
hereda de la clase Exception que es hija de la clase Throwable
padre de todo tipo de excepcion en Java
*/

public class OperacionExcepcion extends Exception{
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
            
    }
    
}
