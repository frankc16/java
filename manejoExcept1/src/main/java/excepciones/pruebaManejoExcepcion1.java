package excepciones;

public class pruebaManejoExcepcion1 {

    public static void main(String[] args) {
        
        //la excepcion se puede propagar sumando throws al metodo main (se interrumpe la ejecución y se muestra la excepcion creada)
        // o envolver en un try and catch para seguir con la ejecución del programa
        try {
            Division div1 = new Division(10, 0);
        } catch (OperacionExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("el programa continua");
    }
}
