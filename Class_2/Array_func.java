/*
Function	Use
sort()	Sort array
toString()	Print array
binarySearch()	Search element
fill()	Fill array
copyOf()	Copy array
equals()	Compare arrays
copyOfRange()	Partial copy
asList()	Convert to List
stream()	Advanced operations
*/
import java.util.Arrays;
import java.util.List;
public class Array_func {
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 2, 8, 1, 3};

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Search element
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);

        // Fill array
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArr));

        // Copy array
        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArr));

        // Compare arrays
        boolean areEqual = Arrays.equals(arr, copiedArr);
        System.out.println("Arrays are equal: " + areEqual);

        // Partial copy
        int[] partialCopy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Partial copy: " + Arrays.toString(partialCopy));

        // Convert to List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List: " + list);

        // Stream operations (e.g., filter even numbers)
        int[] evenNumbers = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }
}