package figurasgeometricas;

/* Las clases abstractas se utilizan solamente cuando se quiere describir un metodo
en la clase padre pero no implementarlo, las clases hijas implementan los metodos.
no se puede generar una instancia de la clase padre sino de las hijas utilizando el 
concepto de polimorfismo. (capacidad de una clase padre de apuntar a la referencia
en memoria de una clase hija)
 */
public abstract class FiguraGeometrica {

    protected String tipofigura;

    protected FiguraGeometrica(String tipofigura) {
        this.tipofigura = tipofigura;
    }

    // definiendo el metodo abstracto dibujar()
    public abstract void dibujar();

    public String gettipofigura() {
        return tipofigura;
    }

    public void settipofigura(String tipofigura) {
        this.tipofigura = tipofigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipofigura=" + tipofigura + '}';
    }

}
