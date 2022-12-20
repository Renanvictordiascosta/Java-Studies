//Create your package to work in Java and replace here
package com.mycompany.mavenproject1;

//Library to create a graphic interface
import javax.swing.JOptionPane;

//Class to work
public class InterfaceGrafica {
    
//Main method
    public static void main(String[] args){
        
//Create a input and output interface about your name
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

//Create a input and output interface about your age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

//Create a input and output interface about your height
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
