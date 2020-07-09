package package1;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, int sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String ObtenerDetalles(){
        return super.ObtenerDetalles() + "departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

}
