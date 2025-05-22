
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Principal {

    public static void main(String[] args) {
        String r = "";
        while (!r.equals("5")) {
            r = Menu();
            if (r.equals("1")) {
                JOptionPane.showMessageDialog(null, "Suma");
                leerDatos(r);
            } else if (r.equals("2")) {
                JOptionPane.showMessageDialog(null, "Resta");
                leerDatos(r);
            } else if (r.equals("3")) {
                JOptionPane.showMessageDialog(null, "Multiplicacion");
                leerDatos(r);
            } else if (r.equals("4")) {
                JOptionPane.showMessageDialog(null, "Division");
                leerDatos(r);
            } else if (r.equals("5")) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida\n"
                        + "Vuelve a intentar", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static String leerDatos(String r) {
        String a = (JOptionPane.showInputDialog("Escribe un numero"));
        if (validar(a)) {
            String b = (JOptionPane.showInputDialog("Escribe otro numero"));
            if (validar(b)) {
                Suma(a + " " + b + " " + r);
            } else {
                JOptionPane.showMessageDialog(null, "Error en el numero 2");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en el numero 1");
            System.exit(0);
        }

        return "";
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

    static void Suma(String Datos) {
        String[] d = Datos.split(" ");//parte la cadena en base a un caracter
        /* JOptionPane.showMessageDialog(null, "valor 1: " + d[0]);
        JOptionPane.showMessageDialog(null, "valor 2: " + d[1]);
        JOptionPane.showMessageDialog(null, "Opcion: " + d[2]);*/
        switch (d[2]) {
            case "1": {
                int a = Integer.parseInt(d[0]);
                int b = Integer.parseInt(d[1]);
                int r = a + b;
                JOptionPane.showMessageDialog(null, "Resultado: " + r);
            }

            break;
            case "2": {
                int a = Integer.parseInt(d[0]);
                int b = Integer.parseInt(d[1]);
                int r = a - b;
                JOptionPane.showMessageDialog(null, "Resultado: " + r);
            }
            break;
            case "3": {
                int a = Integer.parseInt(d[0]);
                int b = Integer.parseInt(d[1]);
                int r = a * b;
                JOptionPane.showMessageDialog(null, "Resultado: " + r);
            }
            break;
            case "4": {
                float a = Float.parseFloat(d[0]);
                float b = Float.parseFloat(d[1]);
                float r = a / b;
                JOptionPane.showMessageDialog(null, "Resultado: " + r);
            }
            break;

        }
    }

    static String Menu() {
        String op = (JOptionPane.showInputDialog("1.-suma \n 2.- Resta \n 3.-Multiplicacion \n 4 Division \n 5.- Salir"));

        return op;
    }
}
