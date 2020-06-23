
public class Persona {
    private String name;
    private int age;
    private static int contadorPersonas;
    
    private Persona(){
        this.contadorPersonas = ++contadorPersonas;
    }
    
    public Persona(String name, int age){
        this(); // calling empty contructor, that is private... creating a path to initializate it.
        this.name = name;
        this.age = age;        
    }   

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + '}';
    }
    
}
