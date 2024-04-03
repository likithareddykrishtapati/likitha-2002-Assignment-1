public class MaxElementInArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {4, 2, 7, 1, 5, 8, 3, 6};

        // Finding the maximum element
        int maxElement = findMaxElement(array);

        // Printing the maximum element
        System.out.println("Maximum element in the array: " + maxElement);
    }

    // Method to find the maximum element in the array
    public static int findMaxElement(int[] array) {
        // Initializing maxElement with the first element of the array
        int maxElement = array[0];
        
        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If the current element is greater than the current maxElement, update maxElement
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
