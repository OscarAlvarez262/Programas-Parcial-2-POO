
/**
 *
 * @author oscar
 */
public class Otra {

    public boolean ValidarN1(String n) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.codePointAt(i) >= 97 && n.codePointAt(i) <= 122) {
                c++;
            }
        }
        if (c == n.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    public boolean ValidarN2(String n) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.codePointAt(i) >= 65 && n.codePointAt(i) <= 90) {
                c++;
            }
        }
        if (c == n.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }
       public boolean ValidarN3(String n) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if ((n.codePointAt(i) >= 65 && n.codePointAt(i) <= 90)|| (n.codePointAt(i) >= 97 && n.codePointAt(i) <= 122)|| n.codePointAt(i)==32){
                c++;
            }
        }
        if (c == n.length()&& c <=5) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

}
