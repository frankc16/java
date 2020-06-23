
public class Empleado extends Persona {

    private int salary;

    public Empleado(String name, int age) {
        super(name, age); // llamando contructor con argumentos y a su vez el vacio de la clase padre
    }
    
    public Empleado(String name, int age, int salary){
        this(name,age); // uno puede usar this o super aca para llamar el constructor de doble argumento ya que existe en ambas clases
        this.salary = salary;        
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "salary=" + salary + '}';
    }
    
    

}
