//Create your package to work in Java and replace here
package com.mycompany.mavenproject1;

//Library to scanner the keyboards pressed and give a type
import java.util.Scanner;

//Class for work
public class AprendizadoBasico {
    
//Main method
    public static void main(String[] args){

//Assigning to a object scanner the library Scanner
       Scanner scanner = new Scanner(System.in);
       
//Use the object scanner to answer the question 
//and atribute the String type
       System.out.print("Your first name: ");
       String firstname = scanner.nextLine();

//Use the object scanner to answer the question 
//and atribute the String type
       System.out.print("Your last name: ");
       String lastname = scanner.nextLine();

//Use the object scanner to answer the question 
//and atribute the int type
       System.out.print("Your old age: ");
       int age = scanner.nextInt(); 

//Use the object scanner to answer the question 
//and atribute the float type
       System.out.print("Your luck number (float): ");
       float luck_number = scanner.nextFloat();
       
//Print the paragraph with the objects from output keyboard
       System.out.println("Hello " + firstname + " " + lastname
               + ", your age is " + age 
               + " years and your luck number is "
               + luck_number + ".");
       
    }
    
}
