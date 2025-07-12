import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
    public static void main(String[] args) {
        String query = "Update \"user\" SET money = money + 500 where id = 1";
        try(
                var conn = DButils.getConnection();
                var stmt = conn.createStatement()
                ){
            int rows = stmt.executeUpdate(query);
            System.out.println("Updated rows"+ rows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
