import java.applet.Applet;
import java.awt.*;

public class getallen extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 10;
        b = 15;
        uitkomst = (a - b);
    }

    public void paint(Graphics g) {
        g.drawString("uitkomst is"+uitkomst,20,20);

    }
}