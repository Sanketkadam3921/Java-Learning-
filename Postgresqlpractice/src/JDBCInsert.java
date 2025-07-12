import java.sql.SQLException;

public class JDBCInsert {
    public static void main(String[] args) {
        String query = "INSERT INTO \"user\" (first_name, last_name, email, fk_user_role, money) VALUES ('Sanket', 'Kadam', 'sanket@email.com', 2, 1000)";
       try(
               var conn = DButils.getConnection();
               var stmt = conn.createStatement()){
           int rows = stmt.executeUpdate(query);
           System.out.println("Inserted rows" + rows);
       }catch (
               SQLException e
       ){
           e.printStackTrace();
       }

    }
}
