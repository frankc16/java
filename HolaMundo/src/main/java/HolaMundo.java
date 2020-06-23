import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un mes");
        var mes = scanner.nextInt();
        String estacion = null;
        
        switch (mes){
            case 1: case 11: case 12:
                estacion = "invierno";
                break;
            case 2: case 3 : case 4:
                estacion = "primavera";
                break;
            case 5: case 6: case 7:
                estacion = "verano";
                break;
            case 8: case 9: case 10:
                estacion = "otoño";
                break;
         
            default:
                estacion = "month out of range";
        }
           System.out.println("para el mes la estacion es : "  + estacion); 
    }
}
