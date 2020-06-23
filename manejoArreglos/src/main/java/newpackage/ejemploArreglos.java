package newpackage;
import arreglos.Persona;

public class ejemploArreglos {
    public static void main(String[] args) {
        //creando arreglo 1
        int numeros[] = new int[4];
        numeros[0] = 30;
        numeros[2] = 60;
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        
        //creando arreglo de otra  manera
        int edades [] = {15,22,38,49};
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        
        //creando arreglos tipo object
        
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Maria");
        personas[2] = new Persona("Joe");
        
        
         System.out.println("recorriendo el arreglo \"personas\"");
        for(int i=0; i < personas.length; i++){
            System.out.println("personas pos 0 :" + personas[i]);
        
        }
        
        
    }
    
}
