public class VariableOperatorsControl {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 5;
        int num2 = 3;

        // Perform addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum + " is " + (sum % 2 == 0 ? "even" : "odd"));

        // Perform bitwise AND
        int bitwiseAndResult = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAndResult + " is " + (bitwiseAndResult % 2 == 0 ? "even" : "odd"));

        // Perform logical OR
        int logicalORResult = num1 | num2;
        System.out.println("Logical OR: " + logicalORResult + " is " + (logicalORResult % 2 == 0 ? "even" : "odd"));

        // Additional Challenge: Switch statement
        switch (num1) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            // Add more cases as needed
            default:
                System.out.println("Other");
        }
    }
}
