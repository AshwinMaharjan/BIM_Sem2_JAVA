public class MathOperations {
    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Inner class for mathematical operations
    public static class Operations {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        // Demonstrate factorial calculation
        int number = 5;
        System.out.println("Factorial of " + number + ": " + calculateFactorial(number));

        // Demonstrate the use of inner class for addition and subtraction
        int operand1 = 10;
        int operand2 = 5;
        System.out.println("Addition: " + Operations.add(operand1, operand2));
        System.out.println("Subtraction: " + Operations.subtract(operand1, operand2));
    }
}
