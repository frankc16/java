package pruebaObject;

import package1.Persona;

public class Test {

    public static void main(String[] args) {

        Persona per1 = new Persona("Juan", 1000);
        Persona per2 = new Persona("Juan", 1000);

        //la direccion en  memoria de los dos objetos es diferente aunque el codigo 
        // generado sea igual, esto se debe a que el contenido de los objetos es el mismo
        System.out.println(per1);
        System.out.println(per2);

        compararObjetos(per1, per2);
    }

    public static void compararObjetos(Persona per1, Persona per2) {
        if (per1 == per2) {
            System.out.println("referencia de los objetos es igual");
        } else {System.out.println("referencia de los objetos distintos");
        }
        
        //Comparando contenido mediante equals
        
        if (per1.equals(per2)){
            System.out.println("contenido de los objetos es igual");}
        else{System.out.println("contenido de los objetos es distinto");
        }
        
        //Comparando contenido mediante hashtag code
        // si los objetos tienen el mismo contenido deben tener el mismo codigo Hash
        if(per1.hashCode() == per2.hashCode()){
           System.out.println("contenido de los objetos es igual, hashcode igual");} 
        else{System.out.println("contenido de los objetos es diferente, hashcode diferente");
        }
        }
    }


