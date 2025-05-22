package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Pograma2 {

    static String a;

    public static void main(String[] args) {
        a = JOptionPane.showInputDialog("Escribe un numero");
        ValidarNumeros();
        ValidarNombre();
    }

    static void ValidarNombre() {
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.codePointAt(i) >= 65 && a.codePointAt(i) <= 90)
                    ||//mayusculas
                    (a.codePointAt(i) >= 97 && a.codePointAt(i) <= 122)
                    ||//minusculas
                    (a.codePointAt(i) == 32)) {//espacio
                c++;
            }
        }
        if (c == a.length()) {
            System.out.println("Si son letras y espacios");
            System.out.println("Nombre correcto");
        } else {
            System.out.println("No puede ser un nombre");
        }
    }

    static void ValidarNumeros() {
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            //System.out.println(a.codePointAt(i));     
            if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57) {
                c++;
            }
        }
        if (c == a.length()) {
            System.out.println("Si son numeros");
            int b = Integer.parseInt(a);

        } else {
            System.out.println("No todos son numeros");
        }
    }
}
