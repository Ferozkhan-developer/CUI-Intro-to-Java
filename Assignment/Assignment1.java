import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        storeAndPrintNameLength();       // Task 1
        convertNameCase();               // Task 2
        concatenateNames();              // Task 3
        compareEmployeeNames();          // Task 4
        storeAndPrintAge();              // Task 5
        inputAndDisplaySalary();         // Task 6
        convertSalaryToInteger();        // Task 7
    }

    // 1. Store an employee’s full name and print its length.
    public static void storeAndPrintNameLength() {
        String fullName = "Feroz Khan"; // Literal name
        System.out.println("\n1. Employee Name: " + fullName);
        System.out.println("   Length of Name: " + fullName.length());
    }

    // 2. Convert the employee’s name to uppercase and lowercase.
    public static void convertNameCase() {
        String fullName = "Feroz Khan";
        System.out.println("\n2. Original Name: " + fullName);
        System.out.println("   Uppercase: " + fullName.toUpperCase());
        System.out.println("   Lowercase: " + fullName.toLowerCase());
    }

    // 3. Concatenate first and last name without using the + operator.
    public static void concatenateNames() {
        String firstName = "Feroz";
        String lastName = "Khan";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("\n3. Concatenated Full Name: " + fullName);
    }

    // 4. Compare two employee names using .equals() method.
    public static void compareEmployeeNames() {
        String employeeName1 = "Feroz Khan";
        String employeeName2 = "COMSATS"; // Using "COMSATS" as an alternative comparison

        System.out.println("\n4. Comparing Employee Names:");
        if (employeeName1.equals(employeeName2)) {
            System.out.println("   Both employee names are the same.");
        } else {
            System.out.println("  The employee names are different.");
        }
    }

    // 5. Store an employee’s age as an integer and print it.
    public static void storeAndPrintAge() {
        int age = 25; // Example employee age
        System.out.println("\n5. Employee Age: " + age);
    }

    // 6. Input and display an employee’s monthly salary as a float value.
    public static void inputAndDisplaySalary() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("\n6. Enter Employee's Monthly Salary: ");
        float salary = scaner.nextFloat();
        System.out.println("   Employee's Monthly Salary: " + salary);
    }

    // 7. Convert an employee’s salary from a float to an integer and display the rounded value.
    public static void convertSalaryToInteger() {
        Scanner Ask = new Scanner(System.in);
        System.out.print("\n7. Enter Employee's Salary to Convert to Integer: ");
        float salary = Ask.nextFloat();
        int roundedSalary = Math.round(salary);
        System.out.println("   Rounded Salary: " + roundedSalary);
    }
}

