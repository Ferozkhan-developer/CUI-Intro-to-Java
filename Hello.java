
import java.util.Scanner;

// Hello.java file 
/*To run Hello.java file first type javac h\Hello.java if thing go well it will not show errors.
// Then write java Hello               then if all okay it will show your text.*/
public class Hello {
     public static void main(String[] args){
        System.out.println("Hello World"); 
        System.out.print("Hello with  \\n  \n");
        System.out.println("45 * 2 = " + 45*2);


int age = 25;       // Integer variable
double price = 99.99;  // Floating-point variable
char grade = 'A';   // Character variable
boolean isJavaFun = true; // Boolean variable
String name = "Feroz";  // String variable
System.out.println("Age: " + age);
System.out.println("Price: " + price);
System.out.println("Grade: " + grade);
System.out.println("Is Java Fun: " + isJavaFun);
System.out.println("Name: " + name);
Scanner scannner = new Scanner(System.in);
System.out.print("Enter your name: ");
String inputName = scannner.nextLine();
System.out.println("Your namejava is: " + inputName);


    } 
 }   

