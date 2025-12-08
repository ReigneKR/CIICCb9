package JobSheet.JB25;

public class Main {
    public static void main(String[] args) {
        Transactions bank = new Transactions();

        // Testing Step 1: View everything
        bank.viewAll();

        // Testing Step 2: View specific user (using dummy User ID 101)
        bank.viewUserAll(101);

        // Testing Step 3: View a single transaction (using ID 5)
        bank.viewTransaction(5);
    }
}
