package package1;

import java.util.Objects;

public class Persona {
    
    private String nombre;
    private int salario;
    
    public Persona(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;    
    }
//    //sobreescribiendo metodo toString heredado de la clase Object
//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", salario=" + salario + '}';
//    }
    
    //Se recomienda utilizar ambos hashcode y equals
    //sobreescribiendo metodo hashcode para comparar numeros hash de los objetos dependiendo del contenido
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.salario;
        return hash;
    }
    //sobreescribiendo metodo equals para comparar si el contenido de los objetos son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.salario != other.salario) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
