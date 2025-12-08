package Tasks;

class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Prints the full name by concatenating first and last names.
     */
    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        // Iterating through the array and calling the method for each object
        for (Student s : students) {
            s.printFullName();
        }
    }
}