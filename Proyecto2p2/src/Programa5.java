
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Programa5 {

    public static void main(String[] args) {
        //1.1
        String n = JOptionPane.showInputDialog("Escribe un correo");
        /* if (ValidarNumerosDecimales(n)) {
            JOptionPane.showMessageDialog(null, "Si es un numero con decimales");
        } else {
            JOptionPane.showMessageDialog(null, "No es un numero con decimales");
        }*/
        if (ValidarCorreo(n)) {
            JOptionPane.showMessageDialog(null, "Si es un correo valido");
        } else {
            JOptionPane.showMessageDialog(null, "No es un correo valido");
        }

    }

    static boolean ValidarNumerosDecimales(String a) {
        boolean r = false;
        int c = 0;
        int cn = 0;
        int p = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 46) {
                c++;
                p = i;
            }

        }
        if (c != 1) {
            r = false;

        } else {
            // JOptionPane.showMessageDialog(null,"el punto esta : "+p);

            if (p == 0) {
                a = "0" + a;
            }
            if (p == a.length() - 1) {
                a = a + "0";
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
                if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57 || a.codePointAt(i) == 46) {

                }
            }
            if (cn == a.length()) {
                r = true;
            }
        }
        return r;
    }

    static boolean ValidarCorreo(String a) {
        int c = 0;
        boolean r = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 64) {
                c++;
            }

        }
        if (c != 1) {
            r = false;

        } else {
            System.out.println("por el momento si es valido");
            int p = a.indexOf("@");
            String c1 = a.substring(0, p);// a-z, 0-9
            String c2 = a.substring(p + 1, a.length());//a-z, .com
            System.out.println(c1 + "" + c2);
            if (c1.length() > 1 && c2.length() >= 5) {
                int cn = 0;
                for (int i = 0; i < c1.length(); i++) {
                    System.out.println(c1.charAt(i));
                    if (c1.codePointAt(i) >= 97 && c1.codePointAt(i) <= 122 || c1.codePointAt(i) == 45
                            || c1.codePointAt(i) <= 95) {
                        cn++;
                    }
                }
                //String c3 = c2.substring(c2.length()-4, c2.length());
                int pcom = c2.indexOf(".com");//ayuda a buscar un caracter o varios
                if (pcom != -1) {
                    String c3 = c2.substring(pcom, c2.length());
                    System.out.println("COM: " + c3);
                    if (c3.equals(".com")) {
                        String c4 = c2.substring(0, pcom);
                        if (c4.length() > 1) {
                            for (int i = 0; i < c4.length(); i++) {
                                if (c4.codePointAt(i) >= 97 && c4.codePointAt(i) <= 122) {
                                    cn++;
                                }

                            }
                            if (cn == (c4.length() + c1.length())) {
                                r = true;
                            }
                        }
                    } else {
                        r = false;
                    }

                } else {
                    r = false;

                }
            } else {
                r = false;
            }
        }
        return r;
    }

}
