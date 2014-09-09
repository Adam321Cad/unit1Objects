import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?\n");
        System.out.println(name);
        boolean x = true;
        while (x == true) {
            String action = JOptionPane.showInputDialog("\nMy name is Hal!\nWhat would you like me to do?\n");
           // System.out.println(action);
            //action = "exit";
            if (action.equals("exit")){
                x = false;
                
            } else{
            System.out.println("sorry "+name+" i can't do that");
    }
}
}
}