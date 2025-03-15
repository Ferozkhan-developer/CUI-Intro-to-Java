

import java.util.Scanner;

public class Aliraza {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
     int Price_A = 20;
     int  Price_B = 15;
     int Price_C = 10;
     int Price_D = 5;

     System.out.print("Enter tickets sold for Class A: ");
     int a = scan.nextInt();
     System.out.print("Enter tickets sold for Class B: ");
     int b = scan.nextInt();
     System.out.print("Enter tickets sold for Class C: ");
     int c = scan.nextInt();
     System.out.print("Enter tickets sold for Class D: ");
     int d = scan.nextInt();

     int incomeA = a * Price_A;
     int incomeB = b * Price_B;
     int incomeC = c * Price_C;
     int incomeD = d * Price_D;

     int total = incomeA + incomeB + incomeC + incomeD;

     System.out.println("Income from Class A:  $" + incomeA);
     System.out.println("Income from Class B: $" + incomeB);
     System.out.println("Income from Class C: $" + incomeC);
     System.out.println("Income from Class D: $" + incomeD);
     System.out.println("Total Income: $" + total);
     

    }


}
