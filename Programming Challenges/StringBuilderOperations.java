import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input with validation for minimum length
        String input;
        do {
            System.out.print("Enter a string of at least 10 characters: ");
            input = scanner.nextLine();
            if (input.length() < 10) {
                System.out.println("Error: String must be at least 10 characters long. You entered " + input.length() + " characters.\n");
            }
        } while (input.length() < 10);
        
        // Create StringBuilder from input
        StringBuilder sb = new StringBuilder(input);
        
        System.out.println("\n=== ORIGINAL STRING ===");
        System.out.println("Original: " + sb.toString());
        
        // 1. Print the length of the string
        System.out.println("\n1. Length of the string: " + sb.length());
        
        // 2. Print the first character of the string
        System.out.println("2. First character: '" + sb.charAt(0) + "'");
        
        // 3. Print the last character of the string
        System.out.println("3. Last character: '" + sb.charAt(sb.length() - 1) + "'");
        
        // 4. Print the index of the first occurrence of the letter 'a'
        int indexOfA = sb.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("4. First occurrence of 'a' at index: " + indexOfA);
        } else {
            System.out.println("4. First occurrence of 'a': Not found");
        }
        
        // 5. Print the substring from index 3 to index 6
        if (sb.length() > 6) {
            System.out.println("5. Substring from index 3 to 6: \"" + sb.substring(3, 7) + "\"");
        } else {
            System.out.println("5. Substring from index 3 to 6: String too short");
        }
        
        // 6. Append the string "123" to the end
        sb.append("123");
        System.out.println("6. After appending '123': " + sb.toString());
        
        // 7. Insert the string "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("7. After inserting 'xyz' at index 4: " + sb.toString());
        
        // 8. Delete the substring from index 2 to index 4
        sb.delete(2, 5); // Note: end index is exclusive, so 2-4 becomes 2-5 after insertion
        System.out.println("8. After deleting from index 2 to 4: " + sb.toString());
        
        // 9. Delete the character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("9. After deleting character at index 8: " + sb.toString());
        } else {
            System.out.println("9. Cannot delete at index 8 - string too short");
        }
        
        // 10. Reverse the string and print it
        sb.reverse();
        System.out.println("10. After reversing: " + sb.toString());
        
        // Final statistics
        System.out.println("\n=== FINAL STATISTICS ===");
        System.out.println("Final length: " + sb.length());
        System.out.println("Final string: " + sb.toString());
        
        scanner.close();
    }
}