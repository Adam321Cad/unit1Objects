import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class TranslateDemo {
    public static void main(String[] args) {
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
     JOptionPane.showMessageDialog(frame,"Click OK to continue");
     Rectangle r1 = new Rectangle(0, 0, 100, 50);
     frame.setBounds(200,200,500,500);
      /* Your code goes here */
    // r1.setbounds(100,100,100,100);
        
    }
}