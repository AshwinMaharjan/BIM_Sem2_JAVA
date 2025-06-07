public class ExceptionDemo {
    // Method that throws a custom exception if the age is less than 18
    public void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();

        try {
            demo.validateAge(16);
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
