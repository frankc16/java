package package1;

public enum  TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion; 
   
// constructor de enumeracion
   TipoEscritura(String descripcion){ 
        this.descripcion = descripcion; //inicializar el atributo de la enumeracion
    }
   
// metodo para el retorno de descripcion
   public String getDescripcion(){
       return descripcion; 
   }
    
}
