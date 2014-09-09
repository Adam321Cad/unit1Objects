import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
//import java.awt.event.keyevent; 
//import java.awt.event.keylistener;

//public class TurtleWorld 
public class TurtleWorld implements KeyListener
{
    public static void main(String args[])
    {
        
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.turn(90);
        turtle.forward(50);
        //break
        turtle2.setPenColor(Color.BLUE);
        turtle2.forward(100);
        turtle2.turn(300);
        turtle2.forward(50);
        turtle2.penUp();
        turtle2.forward(50);
        turtle2.penDown();
        turtle2.forward(50);
        turtle2.setPenColor(Color.GREEN);
        turtle2.forward(50);
        boolean x = true;
        while (x == true) {
            String action = JOptionPane.showInputDialog("");
           // System.out.println(action);
            //action = "exit";
            if (action.equals("w")){
                turtle.forward(20);
            }
            if (action.equals("s")){
                turtle.forward(-20);
            }
            if (action.equals("d")){
                turtle.turn(90);
            }
            if (action.equals("a")){
                turtle.turn(270);
            }
            if (action.equals("exit")){
                x = false;
            }
            if (action.equals("cyan")){
                turtle.setPenColor(Color.CYAN);
            }
            if (action.equals("red")){
                turtle.setPenColor(Color.RED);
            }
            if (action.equals("green")){
                turtle.setPenColor(Color.GREEN);
            }
    
        }
    }
}