package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar 
 */
public class Principal {

    static int a, b;// SE DECLARAN EL LA SECCION PRINCIPAL PARA HACERLAS VARIABLES PRIVADAS DE LA CLASE

    public static void main(String[] args) {
        // SI DECLARAMOS VARIABLES SOLO SON DE ESTE METOD
        a = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));

        Suma();
        /*Resta();
        Multiplicacion();
        Division();
         */
    }

    static void Suma() {
        System.out.println(a + b);
        Resta();
    }

    static void Resta() {
        System.out.println(a - b);
        Multiplicacion();
    }

    static void Multiplicacion() {
        System.out.println(a * b);
        Division();
    }

    static void Division() {
        System.out.println(a / b);
    }
}
