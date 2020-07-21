package figurasgeometricas;

public class Circulo extends FiguraGeometrica {

    public Circulo(String tipofigura) {
        super(tipofigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar un " + this.getClass().getSimpleName());
    }
}
