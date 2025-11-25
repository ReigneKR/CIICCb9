
import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for easier checking
        
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Check if vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        scanner.close();
    }
}