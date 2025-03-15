import java.util.Scanner;

public class Lab2A3{
    static Scanner Aske = new Scanner(System.in);
    
    public static void main(String[] args){
        String FirstName;
        String LastName;
        int Age;
        double Weight;
        System.out.println("Enter first name, last name, age and weight ");
        FirstName = Aske.next();
        LastName = Aske.next();
        Age = Aske.nextInt();
        Weight = Aske.nextDouble();
        System.out.println("Name:" + FirstName + " " + LastName );
        System.out.println("Age: " + Age );
        System.out.println("Weight: " + Weight);
        
    }
}
