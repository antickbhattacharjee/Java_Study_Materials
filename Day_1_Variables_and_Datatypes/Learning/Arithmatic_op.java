// Arithmatic operations in java
import java.util.Scanner;
public class Arithmatic_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Modulus
        if (num2 != 0) {
            int modulus = num1 % num2;
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Cannot perform modulus by zero.");
        }

        sc.close();
    }
}