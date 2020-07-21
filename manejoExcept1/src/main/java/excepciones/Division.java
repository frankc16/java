package excepciones;

public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperacionExcepcion{
        
        if (this.denominador == 0) {
            throw new OperacionExcepcion("Denominador es 0");
        }
        
        this.numerador = numerador;
        this.denominador = denominador;

    }
    public void visualizarOperacion(){
        System.out.println("resultado de la operacion es" + (this.numerador/this.denominador));
    }
}
