import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.event.keyevent; 
//import java.awt.event.keylistener;

//public class TurtleWorld 
public class TurtleWorld
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
    }
}