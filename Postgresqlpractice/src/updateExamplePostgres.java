import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateExamplePostgres {
    public static void main(String[] args) {
        try (
                Connection conn = DButils.getConnection();
                Statement stmt = conn.createStatement();
                ){
            String deleteQuery = "DELETE  FROM accounts WHERE account_holder ='Sanket Kadam'";
            int rows = stmt.executeUpdate(deleteQuery);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
