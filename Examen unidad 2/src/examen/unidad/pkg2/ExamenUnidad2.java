/*
Mediante un metodo que no es el metodo principal vamos a pedir un numero comprendido entre el 10 y el 50
el numero tiene que estar validado no se permite letras simbolos y espacios y si no es entre el 10 y el 50 tiene que volverlo a pedir 
hasta que introdusca el numero correcto

 */
package examen.unidad.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class ExamenUnidad2 {

    static String N;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Oscar Alejandro Alvarez Aceves");
        Numero();
    }

    static void Numero() {
        while (true) {
            N = JOptionPane.showInputDialog("Escribe un numero");
            if (ValidarNumero()) {
                if (num()) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "No esta dentro del rango", "mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No es un numero", "mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static boolean ValidarNumero() {
        boolean r = false;
        int cn = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.codePointAt(i) >= 48 && N.codePointAt(i) <= 57) {
                cn++;
            }
        }
        if (cn == N.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    static boolean num() {
        boolean R = false;
        int n = Integer.parseInt(N);
        if (n >= 10 && n <= 50) {
            R = true;
        } else {
            R = false;
        }
        return R;
    }
}
