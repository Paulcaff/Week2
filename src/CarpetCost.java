import javax.swing.*;

public class CarpetCost {
    public static void main(String[] args) {

    }
    public static void details(){
     String name = JOptionPane.showInputDialog(null,"Please enter your name here: ");
     float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the length of the room: "));
     float breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the breadth of the room: "));      float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the length of the room: "));
     float cost = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the cost of carpet per square metre: "));

     float area = length * breadth;
     float quote = area * cost;


    }



    }


