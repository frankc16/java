package figurasgeometricas;

public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String tipofigura) {
        super(tipofigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar un " + this.getClass().getSimpleName());
    }
}
    
    

