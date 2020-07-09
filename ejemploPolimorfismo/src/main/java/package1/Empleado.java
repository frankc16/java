package package1;

public class Empleado {

    //definir atributos
    protected String nombre;
    protected int sueldo;

    // definir constructor dos argumentos 
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    // definir metodos
    public String mostrarDetalles() {
        return " nombre:" + nombre + " sueldo " + sueldo ;
    }
    // definir getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
