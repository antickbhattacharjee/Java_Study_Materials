// How to use String in Java
public class My_String {
    public static void main(String[] args) {
        // Declare and initialize a String
        String greeting = "Hello, World!";

        // Accessing characters in the String
        System.out.println("First character: " + greeting.charAt(0)); // Output: H
        System.out.println("Second character: " + greeting.charAt(1)); // Output: e

        // Modifying a String (Strings are immutable, so we create a new one)
        String modifiedGreeting = greeting.replace("World", "Java");
        System.out.println("Modified Greeting: " + modifiedGreeting); // Output: Hello, Java!

        // Looping through the characters in the String
        System.out.println("All characters in the String:");
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println(greeting.charAt(i));
        }

        // Using enhanced for loop with a String (not directly possible, but we can convert it to a char array)
        System.out.println("Using enhanced for loop:");
        for (char ch : greeting.toCharArray()) {
            System.out.println(ch);
        }
    }
}