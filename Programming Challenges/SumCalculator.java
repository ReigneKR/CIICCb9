import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Class to handle number processing operations
class NumberProcessor {
    
    // Method to calculate sum of integers
    public int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    // Method to validate if input is integer
    public boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

// Class to handle user input operations
class InputHandler {
    private Scanner scanner;
    
    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }
    
    // Method to get multiple integer inputs from user
    public List<Integer> getIntegerInputs() {
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("=== SUM CALCULATOR ===");
        System.out.println("Enter integers one by one (type 'done' to finish):");
        
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();
            
            // Check if user wants to finish
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            // Validate and add number
            NumberProcessor processor = new NumberProcessor();
            if (processor.isValidInteger(input)) {
                int number = Integer.parseInt(input);
                numbers.add(number);
                System.out.println("Added: " + number);
            } else {
                System.out.println("Invalid input! Please enter a valid integer or 'done' to finish.");
            }
        }
        
        return numbers;
    }
    
    public void closeScanner() {
        scanner.close();
    }
}

// Main class that orchestrates the program
public class SumCalculator {
    public static void main(String[] args) {
        // Create objects
        InputHandler inputHandler = new InputHandler();
        NumberProcessor numberProcessor = new NumberProcessor();
        
        try {
            // Get inputs from user
            List<Integer> numbers = inputHandler.getIntegerInputs();
            
            // Display results
            displayResults(numbers, numberProcessor);
            
        } finally {
            inputHandler.closeScanner();
        }
    }
    
    // Method to display results
    private static void displayResults(List<Integer> numbers, NumberProcessor processor) {
        System.out.println("\n=== RESULTS ===");
        
        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
            return;
        }
        
        // Display all entered numbers
        System.out.println("Numbers entered: " + numbers);
        
        // Calculate and display sum
        int totalSum = processor.calculateSum(numbers);
        System.out.println("Total sum: " + totalSum);
        
        // Display additional information
        System.out.println("Count of numbers: " + numbers.size());
        System.out.println("Average: " + (double) totalSum / numbers.size());
    }
}