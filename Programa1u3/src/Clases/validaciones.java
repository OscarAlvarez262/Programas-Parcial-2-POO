/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author oscar
 */
public class validaciones {

    public boolean ValidarNumeros(String a) {
        int c = 0;
        boolean r = false;

        if (a.length() == 0) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57) {
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

    public boolean ValidarNumeros2(String a) {
        boolean r = false;
        try {
            int v = Integer.parseInt(a);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }
}
