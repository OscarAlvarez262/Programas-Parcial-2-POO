
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
public class Principal {

    public static void main(String[] args) {
        String Nombre1, Nombre2, Nombre3;
        Otra objeto = new Otra();
        Nombre1 = JOptionPane.showInputDialog("Ingresa un nombre");
        if (objeto.ValidarN1(Nombre1)) {
            Nombre2 = JOptionPane.showInputDialog("Ingresa otro nombre");
            if (objeto.ValidarN2(Nombre2)) {
                Nombre3 = JOptionPane.showInputDialog("Ingresa otro nombre");
                if (objeto.ValidarN3(Nombre3)) {
                    JOptionPane.showMessageDialog(null, "La multiplicacion de las cadenas es :"+(Nombre1.length()*Nombre2.length()*Nombre3.length()));
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

}
