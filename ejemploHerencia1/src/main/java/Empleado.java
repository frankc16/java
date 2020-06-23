
public class Empleado extends Persona {

    private int idEmpleado;
    private int salary;
    private static int empleadoCounter;

    public Empleado(String name, int salary) {
        super(name);
        this.idEmpleado = ++empleadoCounter;
        this.salary = salary;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getEmpleadoCounter() {
        return empleadoCounter;
    }

    public String toString() {
        return  super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", salary=" + salary + '}';
    }
}
