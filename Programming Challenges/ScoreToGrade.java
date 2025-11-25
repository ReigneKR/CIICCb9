import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for score
        System.out.print("Enter the student's score: ");
        int score = input.nextInt();

        char grade;

        // Determine grade based on score
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the result
        System.out.println("The grade is: " + grade);

        input.close();
    }
}
