package people;

import java.util.Calendar;

public class Person {
    // Private variables
    private String name;
    private int age;

    // Static variable to keep track of the total number of persons
    private static int totalPersons = 0;

    // Package-private constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        // Increment the total number of persons when a new instance is created
        totalPersons++;
    }

    // Public method to display the details of a person
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Private method to calculate the year of birth based on the current year and age
    private int calculateYearOfBirth() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        return currentYear - age;
    }

    // Overloaded method to calculate the year of birth when the current year is not provided
    public int calculateYearOfBirth() {
        return calculateYearOfBirth(Calendar.getInstance().get(Calendar.YEAR));
    }

    // Overloaded method to calculate the year of birth when the current year is provided
    public int calculateYearOfBirth(int currentYear) {
        return currentYear - age;
    }

    // Static method to retrieve and print the total number of persons
    public static void getTotalPersons() {
        System.out.println("Total persons created: " + totalPersons);
    }

    // Package-private method for demonstration
    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }
}
