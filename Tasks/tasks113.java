package Tasks;

class OddEvenChecker {
    public static void main(String[] args) {
        int check_number = 10;
        String message;
        
        // Loop from 1 to check_number
        for (int i = 1; i <= check_number; i++) {
            // Check if number is even or odd using ternary operator
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            
            // Print the message
            System.out.println(message);
        }
    }
}