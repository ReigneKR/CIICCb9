import java.util.Scanner;

// NumberValidator class - Handles validation and result formatting
class NumberValidator {
    private int number;
    
    public NumberValidator(int number) {
        this.number = number;
    }
    
    // Method to check if number is even or odd
    public String checkEvenOdd() {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    // Method to check if number is positive, negative, or zero
    public String checkSign() {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    
    // Method to get complete analysis
    public String getFullAnalysis() {
        return number + " is " + checkEvenOdd() + " and " + checkSign();
    }
}

// NumberProcessor class - Handles input processing and operations
class NumberProcessor {
    private Scanner scanner;
    
    public NumberProcessor() {
        this.scanner = new Scanner(System.in);
    }
    
    // Method to get valid integer input from user
    public int getNumberInput() {
        System.out.print("Enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            System.out.print("Enter a number: ");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }
    
    // Method to process single number analysis
    public void analyzeSingleNumber() {
        int number = getNumberInput();
        NumberValidator validator = new NumberValidator(number);
        System.out.println("Analysis Result: " + validator.getFullAnalysis());
    }
    
    // Method to process multiple numbers
    public void analyzeMultipleNumbers() {
        System.out.print("How many numbers do you want to analyze? ");
        int count = getNumberInput();
        
        for (int i = 1; i <= count; i++) {
            System.out.println("\n--- Number " + i + " ---");
            analyzeSingleNumber();
        }
    }
    
    public void closeScanner() {
        scanner.close();
    }
}

// Main class - NumberAnalyzer
public class NumberAnalyzer {
    
    public static void displayMenu() {
        System.out.println("=========================================");
        System.out.println("      NUMBER ANALYSIS SYSTEM");
        System.out.println("=========================================");
        System.out.println("1. Analyze a single number");
        System.out.println("2. Analyze multiple numbers");
        System.out.println("3. Exit");
        System.out.println("=========================================");
        System.out.print("Choose an option (1-3): ");
    }
    
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();
        int choice;
        
        do {
            displayMenu();
            
            while (!menuScanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                System.out.print("Choose an option (1-3): ");
                menuScanner.next();
            }
            
            choice = menuScanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n--- SINGLE NUMBER ANALYSIS ---");
                    processor.analyzeSingleNumber();
                    break;
                    
                case 2:
                    System.out.println("\n--- MULTIPLE NUMBERS ANALYSIS ---");
                    processor.analyzeMultipleNumbers();
                    break;
                    
                case 3:
                    System.out.println("Thank you for using Number Analysis System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
            
            if (choice != 3) {
                System.out.println("\nPress Enter to continue...");
                menuScanner.nextLine(); // Clear buffer
                menuScanner.nextLine(); // Wait for Enter
            }
            
        } while (choice != 3);
        
        processor.closeScanner();
        menuScanner.close();
    }
}