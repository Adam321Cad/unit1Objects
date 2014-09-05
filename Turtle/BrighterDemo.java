import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BrighterDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(50,0,0);
        frame.getContentPane().setBackground(myColor);
        frame.setVisible(true);
        //JOptionPane.showMessageDialog(frame,"Click OK to continue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}