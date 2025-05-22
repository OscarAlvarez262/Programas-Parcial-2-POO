
/*HACE UN PROGRAMA QUE LEA NOMBRE Y EDAD PREVIAMENTE VALIDADOS,EL PROGRAMA MOSTRARA EL POSIBLE AÑO DE NACIMIENTO 

 */
package Clases;

import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 *
 * @author oscar
 */
public class Programa3 {
    static LocalDate Fecha=LocalDate.now();
    static int Anio;
    static String nombre;
    static String edad;

    public static void main(String[] args) {
fecha();
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        edad = JOptionPane.showInputDialog("Escribe tu edad");
        Validar();
        edad();

    }
static void fecha(){
    Anio=Fecha.getYear();
}

    static void Validar() {
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
        } else {
            System.out.println("No puede ser un nombre");
             System.exit(0);
        }
    }

    static void edad() {
        int c = 0;
        for (int i = 0; i < edad.length(); i++) {
            //System.out.println(a.codePointAt(i));     
            if (edad.codePointAt(i) >= 48 && edad.codePointAt(i) <= 57) {
                c++;
            }
        }
        if (c == edad.length()) {
            int ed = 0;
            System.out.println("Edad correcta");
            ed = Integer.parseInt(edad);
            System.out.println("Tu fecha de nacimiento fue en \n" + (Anio - ed));

        } else {
            System.out.println("Edad incorrecta");
            System.out.println("No todos son numeros");
            System.exit(0);
        }
    }

}
