import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Split by one or more whitespace characters
            String[] words = input.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
        
        scanner.close();
    }
}