package manejoInterfaces;
import excepciones.*;

public class ManejoOracle implements ControlDatos{
    
    private boolean simularex;
    
    @Override
    public void insertar() throws ControlExcepciones {
        if(simularex){
        throw new ExEscritura("error de escritura en Oracle");
        }
        else{System.out.println("Insertar datos desde Oracle");}
    }

    @Override
    public void listar() throws ControlExcepciones {
        if(simularex){
        throw new ExLectura("error de lectura en Oracle");
        }
        else{System.out.println(" listar datos desde Oracle");}
    }

    public boolean isSimularex() {
        return simularex;
    }

    @Override
    public void simularError(boolean simularex) {
        this.simularex = simularex;
    }
    
}
