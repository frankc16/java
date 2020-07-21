package manejoInterfaces;
import excepciones.*;

public interface ControlDatos {
    int MAX_FILES = 10;
    
    public void insertar() throws ControlExcepciones;
    public void listar() throws ControlExcepciones;
    public void simularError(boolean simularex);
}
