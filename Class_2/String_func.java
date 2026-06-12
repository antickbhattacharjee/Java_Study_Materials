/*
| Method          | Purpose          |
| --------------- | ---------------- |
| `length()`      | Length of string |
| `charAt()`      | Get character    |
| `toUpperCase()` | Uppercase        |
| `toLowerCase()` | Lowercase        |
| `equals()`      | Compare          |
| `contains()`    | Check substring  |
| `replace()`     | Replace text     |
| `substring()`   | Extract part     |
| `trim()`        | Remove spaces    |
| `split()`       | Split string     |
| `indexOf()`     | Find position    |
*/
public class String_func {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of string
        System.out.println("Length: " + str.length());
        
        // Get character at index 7
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Compare strings
        String anotherStr = "Hello, World!";
        System.out.println("Equals: " + str.equals(anotherStr));
        
        // Check if string contains "World"
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Replace "World" with "Java"
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // Extract substring from index 0 to 5
        System.out.println("Substring (0-5): " + str.substring(0, 5));
        
        // Trim spaces (not needed here but for demonstration)
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");
        
        // Split string by comma
        String[] parts = str.split(", ");
        System.out.println("Split by comma:");
        for (String part : parts) {
            System.out.println(part);
        }
        
        // Find position of 'W'
        System.out.println("Index of 'W': " + str.indexOf('W'));
    }
}