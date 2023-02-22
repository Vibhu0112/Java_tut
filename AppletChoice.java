import java.awt.*;

public class AppletChoice {

    AppletChoice() {

        Frame f = new Frame();

        Choice c = new Choice();

        c.setBounds(50,100,100,75);

        c.add("Browser");
        c.add("Chrome");
        c.add("Firefox");
        c.add("Edge");

        Choice c2 = new Choice();

        c2.setBounds(200,100,150,75);

        c2.add("Operating System");
        c2.add("Windows");
        c2.add("Mac OS");
        c2.add("Linux");

        f.add(c);
        f.add(c2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new AppletChoice();
    }
}
