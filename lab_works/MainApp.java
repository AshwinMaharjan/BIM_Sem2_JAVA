import people.Person;

public class MainApp {
    public static void main(String[] args) {
        // Creating an instance of the Person class from the "people" package
        Person person1 = new Person("John Doe", 25);

        // Displaying the information of the person
        person1.displayDetails();

        // Calculating and displaying the year of birth using the overloaded methods
        int yearOfBirth1 = person1.calculateYearOfBirth();
        int yearOfBirth2 = person1.calculateYearOfBirth(2023);
        System.out.println("Year of Birth (Current Year): " + yearOfBirth1);
        System.out.println("Year of Birth (Provided Year): " + yearOfBirth2);

        // Retrieving and printing the total number of persons
        Person.getTotalPersons();

        // Demonstrating package-private access control
        // This line will result in a compilation error because packagePrivateMethod() is not accessible from outside the package.
        // person1.packagePrivateMethod();
    }
}
