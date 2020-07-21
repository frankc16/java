package test;

import excepciones.*;
import manejoInterfaces.*;

public class ManejoExcepciones2 {

    public static void main(String[] args) {
        ControlDatos datos = new ManejoMysql();
        datos.simularError(true);
        ejecutar(datos, "listar");
        datos.simularError(false);
        ejecutar(datos, "listar");
    }

    private static void ejecutar(ControlDatos objetodatos, String accion) {

        if ("listar".equals(accion)) {
            try {
                objetodatos.listar();
            } catch (ExLectura ex) {
                System.out.println("error de lectura");
                ex.printStackTrace(System.out);
            } catch (ControlExcepciones ex) {
                System.out.println("error de datos");
                ex.printStackTrace(System.out);
            }
        } else if ("insertar".equals(accion)) {
            try {
                objetodatos.insertar();
            } catch (ExEscritura ex) {
                System.out.println("error de escritura");
                ex.printStackTrace(System.out);

            } catch (ControlExcepciones ex) {
                System.out.println("error de datos");
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("no se proporciono la accion requerida");
        }
    }
}
