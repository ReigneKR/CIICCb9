package JobSheet.JB25; // Ensure this matches your project folder structure

import java.sql.*;

public class Transactions {

    // UPDATE THESE: Change to your actual database name, username, and password
    private final String url = "jdbc:mysql://localhost:3306/gcash_db";
    private final String user = "root";
    private final String password = "";

    /**
     * Helper method to establish connection
     */
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 1. viewAll: Returns all transactions from the table
     */
    public void viewAll() {
        String query = "SELECT * FROM transactions";
        System.out.println("\n--- Fetching All Transactions ---");
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                displayRow(rs);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * 2. viewUserAll: Returns all transactions using userID parameter
     */
    public void viewUserAll(int userID) {
        String query = "SELECT * FROM transactions WHERE user_id = ?";
        System.out.println("\n--- Fetching Transactions for User ID: " + userID + " ---");
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, userID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                displayRow(rs);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * 3. viewTransaction: Returns a transaction using ID parameter
     */
    public void viewTransaction(int transactionID) {
        String query = "SELECT * FROM transactions WHERE transaction_id = ?";
        System.out.println("\n--- Fetching Single Transaction ID: " + transactionID + " ---");
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, transactionID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                displayRow(rs);
            } else {
                System.out.println("No record found for ID: " + transactionID);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Helper method to format result output
     */
    private void displayRow(ResultSet rs) throws SQLException {
        System.out.printf("ID: %-4d | User: %-5d | Amount: %-8.2f | Type: %-10s | Date: %s%n",
                rs.getInt("transaction_id"),
                rs.getInt("user_id"),
                rs.getDouble("amount"),
                rs.getString("type"),
                rs.getTimestamp("transaction_date"));
    }
}