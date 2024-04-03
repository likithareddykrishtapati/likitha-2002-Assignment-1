import java.util.Arrays;

public class ArraySortingAndOccurrence {
    public static void main(String[] args) {
        // Example array
        int[] array = {4, 2, 7, 1, 5, 2, 8, 2, 3, 2, 6, 2};

        // Sorting the array
        Arrays.sort(array);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Number to find occurrences for
        int numberToFind = 2;

        // Finding the number of occurrences of a particular number
        int occurrences = findOccurrences(array, numberToFind);

        // Printing the number of occurrences
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }

    // Method to find the number of occurrences of a particular number in the array
    public static int findOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}
