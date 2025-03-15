 import java.util.Scanner;
class AskFrom {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int feet;
        int inches;
        System.out.print("Enter intergers separated by spaces.");

        feet = ask.nextInt();
        inches = ask.nextInt();
        System.out.println("feet is equal to = " + feet);
        System.out.println("inches qual to = " + inches);
        ask.close();
        
    }
}