package JobSheet.JB23;

import java.sql.*;

public class CashIn {
    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GcashApp";
    private static final String USER = "root";
    private static final String PASS = "";

    /**
     * Models the cash-in object. Adds balance to user and logs transaction.
     */
    public void executeCashIn(int accountID, double amount, int sourceBankID) {
        Connection conn = null;
        PreparedStatement updateBalanceStmt = null;
        PreparedStatement logTransStmt = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Required for atomic banking transactions
            conn.setAutoCommit(false);

            // 1. Prepare Statement to update account balance
            String sqlUpdate = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            updateBalanceStmt = conn.prepareStatement(sqlUpdate);
            updateBalanceStmt.setDouble(1, amount);
            updateBalanceStmt.setInt(2, accountID);
            updateBalanceStmt.executeUpdate();

            // 2. Prepare Statement to log the transaction in the DB
            String sqlLog = "INSERT INTO Transaction (amount, name, account_ID, date, transferToID, transferFromID) " +
                            "VALUES (?, ?, ?, NOW(), ?, ?)";
            logTransStmt = conn.prepareStatement(sqlLog);
            logTransStmt.setDouble(1, amount);
            logTransStmt.setString(2, "Bank Cash-In");
            logTransStmt.setInt(3, accountID);
            logTransStmt.setInt(4, accountID); // transferToID
            logTransStmt.setInt(5, sourceBankID); // transferFromID
            logTransStmt.executeUpdate();

            // Commit changes
            conn.commit();
            System.out.println("Transaction Successful: Cashed-in PHP " + amount);

        } catch (SQLException e) {
            System.err.println("Transaction Failed. Rolling back changes.");
            try { if(conn != null) conn.rollback(); } catch(SQLException se) { se.printStackTrace(); }
            e.printStackTrace();
        } finally {
            // Clean up resources
            try { if(updateBalanceStmt != null) updateBalanceStmt.close(); } catch(SQLException se) {}
            try { if(logTransStmt != null) logTransStmt.close(); } catch(SQLException se) {}
            try { if(conn != null) conn.close(); } catch(SQLException se) {}
        }
    }

    public static void main(String[] args) {
        CashIn app = new CashIn();
        
        // Test Requirements: 
        // 1st Transaction: 200
        app.executeCashIn(1, 200.0, 5001);
        
        // 2nd Transaction: 300
        app.executeCashIn(1, 300.0, 5001);
        
        System.out.println("Portfolio Test Complete.");
    }
}