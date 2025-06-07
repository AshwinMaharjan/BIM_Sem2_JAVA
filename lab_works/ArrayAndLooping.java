import java.util.Scanner;

public class ArrayAndLooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of integers with at least 5 elements
        int[] numbers = new int[5];

        // Use a for loop to populate the array with user input values
        System.out.println("Enter 5 integers to populate the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate and print the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // Implement a while loop to find and print the largest element in the array
        int max = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("Largest element in the array: " + max);

        // Additional Challenge: Create a second array and populate it with the square of each element
        int[] squares = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            squares[j] = numbers[j] * numbers[j];
        }

        // Print both arrays side by side
        System.out.println("Original Array\tSquared Array");
        for (int k = 0; k < numbers.length; k++) {
            System.out.println(numbers[k] + "\t\t\t" + squares[k]);
        }

        scanner.close();
    }
}
