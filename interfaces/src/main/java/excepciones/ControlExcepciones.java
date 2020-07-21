package excepciones;

//podria extender de runException para no tener que usar un try-catch
public class ControlExcepciones extends Exception {
    public ControlExcepciones(String mensaje){
    super(mensaje);}
    
}
