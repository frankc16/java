package manejoInterfaces;
import excepciones.*;

public class ManejoMysql implements ControlDatos {
    
    private boolean simularex;
    
    @Override
    public void insertar() throws ControlExcepciones {
        if (this.simularex){
           throw new ExEscritura("error de Escritura en mysql");
        }
        else{System.out.println("insertar desde Mysql");
        }    
    }

    @Override
    public void listar() throws ControlExcepciones {
        if (this.simularex){
           throw new ExLectura("error de Lectura en mysql");
        }
        else{System.out.println("listar desde Mysql");}    
    }

    public boolean isSimularex() {
        return simularex;
    }

    @Override
    public void simularError(boolean simularex) {
        this.simularex = simularex;
    }
    }
    
    
    

