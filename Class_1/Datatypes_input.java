// Take all datatypes input from user and print them
import java.util.Scanner;
public class Datatypes_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for different datatypes
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean booleanValue = sc.nextBoolean();

        sc.nextLine(); // Consume the newline left by nextBoolean()

        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        // Printing the values
        System.out.println("You entered integer: " + intValue);
        System.out.println("You entered float: " + floatValue);
        System.out.println("You entered double: " + doubleValue);
        System.out.println("You entered boolean: " + booleanValue);
        System.out.println("You entered string: " + stringValue);

        sc.close();
    }
}