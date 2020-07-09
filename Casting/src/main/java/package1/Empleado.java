package package1;

public class Empleado {

    protected String nombre;
    protected int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public String ObtenerDetalles(){
        return "nombre : " + nombre + " sueldo: "+ sueldo;
    }

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
