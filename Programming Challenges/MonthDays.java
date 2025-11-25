import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for month number
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        String monthName;
        int days;

        // Determine month name and number of days using switch-case
        switch (month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = 28; // assuming non-leap year
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                monthName = "Invalid";
                days = 0;
                break;
        }

        // Display the result
        if (days > 0) {
            System.out.println(monthName + " has " + days + " days.");
        } else {
            System.out.println("Invalid month number. Please enter a value between 1 and 12.");
        }

        input.close();
    }
}
