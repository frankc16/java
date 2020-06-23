/*
Uso de palabra this y como cambia dependiendo del objeto al que este apuntando
 */
public class usoThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona{
String Name;

Persona(String Name){
this.Name = Name;
    System.out.println("Objeto dentro persona es = " + this);
    Imprimir imprimir = new Imprimir();
    imprimir.Imprimirtype(this);
}
}
class Imprimir{
    public void Imprimirtype(Persona p){
        System.out.println("Objeto persona dentro imprimir es = " + p); 
        System.out.println("Objeto dentro de imprimir" +this);
        
    }
}