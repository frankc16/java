package package1;
public class Escritor extends Empleado{
    private TipoEscritura tipoescritura;
    
    public Escritor(String nombre, int sueldo, TipoEscritura tipoescritura){
        super(nombre, sueldo);
        this.tipoescritura = tipoescritura;    
    }
    
    public String obtenerDetalles(){
        return super.ObtenerDetalles() + tipoescritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoescritura;            
    }
    public String getDescripcionTipoEscritura(){
        return this.tipoescritura.getDescripcion();
    }
}
