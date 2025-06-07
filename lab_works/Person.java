public class Person {
    // Private variables
    private String name;
    private int age;

    // Static variable to keep track of the total number of persons
    private static int totalPersons = 0;

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        // Increment the total number of persons when a new instance is created
        totalPersons++;
    }

    // Method to display the details of a person
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Static method to retrieve and print the total number of persons
    public static void getTotalPersons() {
        System.out.println("Total persons created: " + totalPersons);
    }

    public static void main(String[] args) {
        // Creating two instances of the Person class and setting their details
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Jane Doe", 30);

        // Displaying the information of the two persons
        person1.displayDetails();
        person2.displayDetails();

        // Retrieving and printing the total number of persons
        Person.getTotalPersons();
    }
}
