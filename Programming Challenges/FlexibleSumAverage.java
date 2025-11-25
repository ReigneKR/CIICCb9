

import java.util.Scanner;

public class FlexibleSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose input method:");
        System.out.println("1. Enter numbers one by one");
        System.out.println("2. Enter numbers separated by commas");
        System.out.print("Your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        double[] numbers;
        double sum = 0;
        
        if (choice == 1) {
            System.out.print("How many numbers? ");
            int count = scanner.nextInt();
            numbers = new double[count];
            
            System.out.println("Enter " + count + " numbers:");
            for (int i = 0; i < count; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
                sum += numbers[i];
            }
        } else {
            System.out.print("Enter numbers separated by commas: ");
            String input = scanner.nextLine();
            String[] numberStrings = input.split(",");
            numbers = new double[numberStrings.length];
            
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Double.parseDouble(numberStrings[i].trim());
                sum += numbers[i];
            }
        }
        
        double average = sum / numbers.length;
        
        System.out.println("\n=== RESULTS ===");
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Count: " + numbers.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.printf("Average (formatted): %.2f\n", average);
        
        scanner.close();
    }
}