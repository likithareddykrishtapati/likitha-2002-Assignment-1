public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an instance of MathOperations
        MathOperations mathOps = new MathOperations();

        // Adding two integers
        int sumIntegers = mathOps.add(10, 20);
        System.out.println("Sum of integers: " + sumIntegers);

        // Adding three doubles
        double sumDoubles = mathOps.add(10.5, 20.7, 30.3);
        System.out.println("Sum of doubles: " + sumDoubles);

        // Concatenating two strings
        String concatenatedStrings = mathOps.add("Hello, ", "World!");
        System.out.println("Concatenated strings: " + concatenatedStrings);
    }
}
