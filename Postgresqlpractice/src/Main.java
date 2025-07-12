import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String url = "jdbc:postgresql://localhost:5432/Java";
            String user = "postgres";
            String password = "bowr9614";

            try (
                    Connection conn = DriverManager.getConnection(url,user,password);
                    Statement stmt = conn.createStatement();


            ) {
                String insertQuery = "INSERT INTO accounts (account_holder, balance) VALUES ('Sanket Kadam', 5000.0)";
                int rows = stmt.executeUpdate(insertQuery);
                System.out.println("✅ Inserted rows: " + rows);


            }catch (Exception  e){
                System.out.println("Connection failed");
                e.printStackTrace();
            }
        }
    }

