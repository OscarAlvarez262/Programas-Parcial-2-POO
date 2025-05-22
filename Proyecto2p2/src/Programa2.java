
import javax.swing.JOptionPane;

/**
 * @author oscar
 */
public class Programa2 {

    public static void main(String[] args) {
        boolean Repetir = true;
        while (Repetir == true) {
            String a = (JOptionPane.showInputDialog("Escribe un numero"));
            if (validar(a)) {
                int N = Integer.parseInt(a);
                if ((N % 2) == 0) {// Si el modulo es 0 lo deja como int 
                    division(N);   // Slo envia convertido al modulo division pero unicamente para enteros
                } else {
                    float b = (float) N;// Si el modulo es 1 lo convierte en float
                    division(b);// Slo envia convertido al modulo division pero unicamente para flotantes
                }
                int Respuesta = JOptionPane.showConfirmDialog(null, "Â¿Quieres volver a correr",
                        "confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
                if (Respuesta == JOptionPane.YES_OPTION) {
                    Repetir = true;
                } else if (Respuesta == JOptionPane.NO_OPTION) {
                    Repetir = false;
                } else {
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No es un numero");

            }
        }
    }

    //sobrecarga de metodos
    static void division(int a) {
        JOptionPane.showMessageDialog(null, (a / 2));
    }

    static void division(float b) {
        JOptionPane.showMessageDialog(null, (b / 2));
    }

    static boolean validar(String v) {
        boolean Respuesta = false;
        int c = 0;
        for (int i = 0; i < v.length(); i++) {
            if (v.codePointAt(i) >= 48 && v.codePointAt(i) <= 57) {
                c++;
            }
        }
        if (c == v.length()) {
            Respuesta = true;
        } else {
            Respuesta = false;

        }
        return Respuesta;
    }
}
