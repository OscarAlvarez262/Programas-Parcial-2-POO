
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class NewClass {

    public static void main(String[] args) {
        String N1 = JOptionPane.showInputDialog("Ingresa un nombre");
        if (ValidarNumero(N1)) {
            String N2 = JOptionPane.showInputDialog("Ingresa un nombre");
            if (ValidarNu(N2)) {
                String N3 = JOptionPane.showInputDialog("Ingresa un nombre");
                if (Validar(N3)) {
                    JOptionPane.showMessageDialog(null, "todo correcto");
                } else {
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }

    static boolean ValidarNumero(String a) {
        boolean r = false;
        int cn = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) >= 97 && a.codePointAt(i) <= 122) {
                cn++;
            }
        }
        if (cn == a.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    static boolean ValidarNu(String a) {
        boolean r = false;
        int cn = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) >= 65 && a.codePointAt(i) <= 90) {
                cn++;
            }
        }
        if (cn == a.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    static boolean Validar(String a) {
        boolean r = false;
        int cn = 0;
        if (a.length() <= 5) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

}
