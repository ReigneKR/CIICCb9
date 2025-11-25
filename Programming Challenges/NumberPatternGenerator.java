import java.util.Scanner;

public class NumberPatternGenerator {
    
    // Method to generate the pyramid pattern
    public static void generatePattern(int rows) {
        System.out.println("\nGenerated Pattern:");
        System.out.println("==================");
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            
            // Inner loop for increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Inner loop for decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println(); // Move to next line
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PATTERN GENERATOR");
        System.out.println("=================");
        System.out.print("Enter a positive integer: ");
        
        try {
            int number = scanner.nextInt();
            
            if (number > 0) {
                generatePattern(number);
            } else {
                System.out.println("Please enter a positive integer greater than 0.");
            }
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}