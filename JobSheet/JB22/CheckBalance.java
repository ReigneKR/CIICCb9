import java.sql.*;

public class CheckBalance {
    
    // Database connection details (Adjust based on your settings)
    private final String url = "jdbc:mysql://localhost:3306/GcashApp";
    private final String user = "root";
    private final String password = "";

    /**
     * Retrieves the account balance for a specific user ID.
     * @param userID The unique ID of the user.
     * @return The balance amount, or -1 if the user is not found.
     */
    public double checkBalance(int userID) {
        double balance = -1;
        String query = "SELECT amount FROM Balance WHERE user_ID = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, userID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                balance = rs.getDouble("amount");
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        return balance;
    }

    // Temporary Main method for testing
    public static void main(String[] args) {
        CheckBalance cb = new CheckBalance();
        int testUserID = 101;
        double currentBalance = cb.checkBalance(testUserID);
        
        if (currentBalance != -1) {
            System.out.println("Balance for User " + testUserID + ": ₱" + currentBalance);
        } else {
            System.out.println("User not found.");
        }
    }
}