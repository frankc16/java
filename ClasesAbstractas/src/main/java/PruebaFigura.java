import figurasgeometricas.*;

public class PruebaFigura {

    public static void main(String[] args) {
        
//        la clase abstracta no puede instanciarse
//        FiguraGeometrica figura = new FiguraGeometrica("Circulo");
       
        // Generando polimorfismo con clases hijas
        FiguraGeometrica figura = new Circulo("Circulo");
        System.out.println(figura);
        figura.dibujar();
        
        Circulo circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();
        
        figura = new Triangulo("Triangulo");
        System.out.println(figura);
        figura.dibujar();
        
        //al crear un objeto tipo circulo e intentar convertirle en triangulo
        //existe un error por tipo de compatibilidad de objetos
        //circulo = new Triangulo("Triangulo");

    }

}
