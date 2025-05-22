/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Codigo {
    public static void main(String[] args) {
         Ventana ven = new Ventana();
         ven.setVisible(true);
       
    }
       public boolean Letras(String a) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.codePointAt(i) >= 48) && (a.codePointAt(i) <= 57)|| (a.codePointAt(i)==45)) {
                c++;
            }
        }
        if (c == a.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }
}
