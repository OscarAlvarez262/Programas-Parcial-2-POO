
/*HACE UN PROGRAMA QUE LEA NOMBRE Y EDAD PREVIAMENTE VALIDADOS,EL PROGRAMA MOSTRARA EL POSIBLE AÑO DE NACIMIENTO 

 */
package Clases;

import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 *
 * @author oscar
 */
public class Programa3Metodos {

    static LocalDate Fecha = LocalDate.now();// sacar fecha del sistema
    static int Anio, ed;

    public static void main(String[] args) {
        String nombre, edad;
        fecha();
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        if (Validar(nombre)) {
            edad = JOptionPane.showInputDialog("Escribe tu edad");
            if (edad(edad)) {
                int b = Integer.parseInt(edad);
                ed = Anio - b;
                System.out.println("Tu fecha de nacimiento fue en \n" +ed);
            }
        }

    }

    static void fecha() {
        Anio = Fecha.getYear();
    }

    static boolean Validar(String nombre) {
        boolean r;
        int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.codePointAt(i) >= 65 && nombre.codePointAt(i) <= 90)
                    ||//mayusculas
                    (nombre.codePointAt(i) >= 97 && nombre.codePointAt(i) <= 122)
                    ||//minusculas
                    (nombre.codePointAt(i) == 32)) {//espacio
                c++;
            }
        }
        if (c == nombre.length()) {
            System.out.println("Nombre correcto");
            r = true;
        } else {
            System.out.println("No puede ser un nombre");
            System.exit(0);
            r = false;
        }
        return r;
    }

    static boolean edad(String edad) {
        boolean r;
        int c = 0;
        for (int i = 0; i < edad.length(); i++) {
            //System.out.println(a.codePointAt(i));     
            if (edad.codePointAt(i) >= 48 && edad.codePointAt(i) <= 57) {
                c++;
            }
        }
        if (c == edad.length()) {

            System.out.println("Edad correcta");
            r = true;

        } else {
            System.out.println("Edad incorrecta");
            System.out.println("No todos son numeros");
            System.exit(0);
            r = false;
        }
        return r;
    }

}
