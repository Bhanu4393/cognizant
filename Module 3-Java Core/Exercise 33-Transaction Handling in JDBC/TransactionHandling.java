import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db");

            transfer(con, 1, 2, 500);

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void transfer(Connection con, int fromAccount, int toAccount, int amount) {

        try {
            con.setAutoCommit(false);

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            PreparedStatement debitStmt =
                    con.prepareStatement(debitQuery);

            debitStmt.setInt(1, amount);
            debitStmt.setInt(2, fromAccount);

            int debitRows = debitStmt.executeUpdate();

            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement creditStmt =
                    con.prepareStatement(creditQuery);

            creditStmt.setInt(1, amount);
            creditStmt.setInt(2, toAccount);

            int creditRows = creditStmt.executeUpdate();

            if (debitRows > 0 && creditRows > 0) {
                con.commit();
                System.out.println("Transfer Successful");
            } else {
                con.rollback();
                System.out.println("Transfer Failed");
            }

            debitStmt.close();
            creditStmt.close();

        } catch (Exception e) {

            try {
                con.rollback();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Transaction Rolled Back");
        }
    }
}
// Required SQL Table
//CREATE TABLE accounts (
//    id INTEGER PRIMARY KEY,
//    balance INTEGER  
//);