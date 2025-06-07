import java.math.BigInteger;

public class TypeConversionAndMethods {
    public static void main(String[] args) {
        // Declare a long integer variable and initialize it with a large value
        long largeValue = 20L;

        // Convert the long variable to a double and print the result
        double doubleValue = (double) largeValue;
        System.out.println("Converted to double: " + doubleValue);

        // Calculate and print the factorial of a given integer using a method
        int numberForFactorial = 5;
        BigInteger factorialResult = calculateFactorial(numberForFactorial);
        System.out.println("Factorial of " + numberForFactorial + ": " + factorialResult);

        // Additional Challenge: Calculate and print the product of two large long numbers using a method
        long anotherLargeValue = 15L;
        BigInteger productResult = calculateProduct(largeValue, anotherLargeValue);
        System.out.println("Product of " + largeValue + " and " + anotherLargeValue + ": " + productResult);
    }

    // Method to calculate the factorial of a given integer
    private static BigInteger calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Additional Challenge: Method to calculate the product of two long numbers
    private static BigInteger calculateProduct(long num1, long num2) {
        return BigInteger.valueOf(num1).multiply(BigInteger.valueOf(num2));
    }
}
