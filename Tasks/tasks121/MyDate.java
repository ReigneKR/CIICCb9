package Tasks.tasks121;

public class MyDate {
    public static void main(String[] args) {
        // Set date1 to January 1st of 1978
        DateTask date1 = new DateTask(1, 1, 1978);
        
        // Set date2 to September 21st of 1984
        DateTask date2 = new DateTask(9, 21, 1984);
        
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        
        // Display leapYears after printing date2
        System.out.println("\nLeap Years from 1980 to 2023:");
        DateTask.leapYears();
    }
}
