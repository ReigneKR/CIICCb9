
import java.util.Scanner;

public class NumberToDayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {
            "Invalid input", // index 0 - invalid
            "Monday",        // index 1
            "Tuesday",       // index 2
            "Wednesday",     // index 3
            "Thursday",      // index 4
            "Friday",        // index 5
            "Saturday",      // index 6
            "Sunday"         // index 7
        };
        
        System.out.print("Enter a number (1-7): ");
        
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            
            if (dayNumber >= 1 && dayNumber <= 7) {
                System.out.println(daysOfWeek[dayNumber]);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}