// How to use Array in Java
public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]); // Output: 1
        System.out.println("Second element: " + numbers[1]); // Output: 2

        // Modifying an element in the array
        numbers[2] = 10; // Change the third element to 10
        System.out.println("Modified third element: " + numbers[2]); // Output: 10

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}