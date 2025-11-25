import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // 1. Length of the string
        System.out.println("1. Length: " + input.length());
        
        // 2. Convert to uppercase
        System.out.println("2. Uppercase: " + input.toUpperCase());
        
        // 3. Convert to lowercase
        System.out.println("3. Lowercase: " + input.toLowerCase());
        
        // 4. First character
        if (input.length() > 0) {
            System.out.println("4. First character: " + input.charAt(0));
        } else {
            System.out.println("4. First character: (string is empty)");
        }
        
        // 5. Last character
        if (input.length() > 0) {
            System.out.println("5. Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("5. Last character: (string is empty)");
        }
        
        // 6. Substring from second to fifth character
        if (input.length() >= 5) {
            System.out.println("6. Substring (2nd to 5th): " + input.substring(1, 5));
        } else {
            System.out.println("6. Substring (2nd to 5th): String too short for substring operation");
        }
        
        scanner.close();
    }
}
