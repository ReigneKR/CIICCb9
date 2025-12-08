package JobSheet.JB24;

import java.sql.*;

public class CashTransfer {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GcashApp";
    private static final String USER = "root";
    private static final String PASS = "";

    public void executeTransfer(int fromAccount, int toAccount, double amount) {
        // Restrictions
        if (fromAccount == toAccount) {
            System.err.println("Transaction Blocked: Self-transfer is not allowed.");
            return;
        }
        if (amount <= 0) {
            System.err.println("Transaction Blocked: Amount must be positive.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            conn.setAutoCommit(false); // Enable Transaction control

            // 1. Check if sender has enough money
            if (!hasSufficientFunds(conn, fromAccount, amount)) {
                System.err.println("Transaction Blocked: Account " + fromAccount + " has insufficient funds.");
                return;
            }

            try {
                // 2. Deduct from Sender
                PreparedStatement deduct = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                deduct.setDouble(1, amount);
                deduct.setInt(2, fromAccount);
                deduct.executeUpdate();

                // 3. Add to Receiver
                PreparedStatement add = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
                add.setDouble(1, amount);
                add.setInt(2, toAccount);
                add.executeUpdate();

                // 4. Record Transaction in History table
                PreparedStatement log = conn.prepareStatement(
                    "INSERT INTO Transaction (amount, name, account_ID, date, transferToID, transferFromID) VALUES (?, 'Transfer', ?, NOW(), ?, ?)"
                );
                log.setDouble(1, amount);
                log.setInt(2, fromAccount);
                log.setInt(3, toAccount);
                log.setInt(4, fromAccount);
                log.executeUpdate();

                conn.commit(); // Save both updates
                System.out.println("Success: Transferred " + amount + " from ID " + fromAccount + " to ID " + toAccount);

            } catch (SQLException e) {
                conn.rollback(); // Undo everything if a step fails
                System.err.println("Critical Error: Transfer aborted. Database rolled back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean hasSufficientFunds(Connection conn, int accID, double amount) throws SQLException {
        PreparedStatement check = conn.prepareStatement("SELECT balance FROM accounts WHERE id = ?");
        check.setInt(1, accID);
        ResultSet rs = check.executeQuery();
        return rs.next() && rs.getDouble("balance") >= amount;
    }

    public static void main(String[] args) {
        CashTransfer app = new CashTransfer();
        
        // TEST CASES
        System.out.println("--- Running Transfer Tests ---");
        app.executeTransfer(4, 9, 2500.0); // Valid: Bonifacio to Luna
        app.executeTransfer(12, 1, 500.0); // Restricted: Lapu-Lapu has insufficient funds
        app.executeTransfer(15, 15, 100.0); // Restricted: Same account
    }
}