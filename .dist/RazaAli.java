/*a) Write a Java program which will take the time in seconds from user and converts
this time into hours, minutes, and seconds.
• Take input from the user as an integer value representing total seconds.
• Calculate the number of hours, minutes, and remaining seconds using integer
division (/) and modulus (%).
• Print the results in a structured format*/

import java.util.Scanner;

public class RazaAli {
    public static  void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("enter total seconds: ");
    int totalSec = scan.nextInt();

    int hours = totalSec / 3600;
    int remainingSeconds = totalSec % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;

    System.out.println("The total hours are:  "+ hours + "   and minutes are:   "+ minutes + "   and seconds are  " + seconds);
      








    }
    
}

