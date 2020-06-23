/*
se le puede aplicar a clases, variables o objetos.
- clases = al aplicarse final class finalClass{} ya no podremos crear clases hijas de esta clase
- variable = al aplicarse final a una variable el valor con el que se ha inicializado esta variable no puede ser cambiado.
se usa usualmente static final variable = 100
- metodo = al colocar final antes de la definicion de un metodo se asegura que este no prodra ser modificado en otras clases hijas
- al colocar final durante la creacion de una instancia de una clase, esto quiere decir qeu el objeto solo podra tener una unica
referencia en memoria y no podra cambiarse, sin embargo se podrá acceder sin problema a los atributos de este objeto y modificarlos
 */
package newpack;

public class finalClass {

    public static final int myNumber = 8;
    public static final Persona PERSONA1 = new Persona("Joe");
    finalClass(){
    System.out.println(PERSONA1.name);
    }
   
    public void method(){
        System.out.println("method executed");
    }
}

