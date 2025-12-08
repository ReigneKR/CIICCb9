package JobSheet;

import java.util.Scanner;

public class GcashApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Transactions transactionManager = new Transactions();
    // Assuming you have an Account class from previous Job Sheets
    // private static Account accountManager = new Account(); 

    public static void main(String[] args) {
        System.out.println("=== WELCOME TO GCASH ONLINE BANKING ===");
        
        // Step 1: Login Flow
        System.out.print("Enter User ID: ");
        int currentUserID = scanner.nextInt();
        
        // Simulating login validation
        System.out.println("Login Successful! Welcome, User " + currentUserID);
        
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Logic for Check Balance
                    System.out.println("\nChecking balance for User: " + currentUserID);
                    // accountManager.getBalance(currentUserID);
                    break;
                case 2:
                    // Logic for Cash-in/Transfer
                    System.out.println("\nProcessing Transaction...");
                    // handleTransaction(currentUserID);
                    break;
                case 3:
                    // Logic for View Transactions (From Job Sheet 2-5)
                    transactionManager.viewUserAll(currentUserID);
                    break;
                case 4:
                    System.out.println("Logging out... Thank you for using GCash!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            if (running) {
                System.out.print("\nDo you want another transaction? (Y/N): ");
                char again = scanner.next().toUpperCase().charAt(0);
                if (again == 'N') {
                    System.out.println("Logging out...");
                    running = false;
                }
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n----- MAIN MENU -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Cash-in / Transfer");
        System.out.println("3. View My Transactions");
        System.out.println("4. Logout");
        System.out.print("Select an option: ");
    }
}