package package1;

public class Gerente extends Empleado{
    private String departamento;
    
// llamando constructor de 2 argumentos de la clase padre y agragando atributo depto.
    public Gerente(String nombre, int sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    
 // sobrescribiendo metodo mostrarEmpleado
    @Override
    public String mostrarDetalles(){
    return super.mostrarDetalles() + " departamento: " + departamento ;
    }

}
