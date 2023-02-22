import javax.swing.JFrame;

public class JFrameTest{
    
    public static void main(String[] args) {
        JFrame f1 = new JFrame("MyFrame");
        JFrame f2 =f1;
        JFrame f3=f2;
        f1.setVisible(true);
        f2.setVisible(true);
        f3.setVisible(true);
    }
}