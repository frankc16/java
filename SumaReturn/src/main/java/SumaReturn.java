/*uso de la palabra return para devolver variables tipo object*/
public class SumaReturn {
    public static void main(String[] args) {
        Suma suma = creaSuma();
        System.out.println("resultado =" + " " + suma.sumar());
    }
    private static Suma creaSuma(){
        return new Suma(4,6);
    }
}
class Suma{
int a; 
int b; 

Suma(int a, int b){
    this.a  = a;
    this.b = b;
}
public int sumar(){
return this.a + this.b;
        }
}
