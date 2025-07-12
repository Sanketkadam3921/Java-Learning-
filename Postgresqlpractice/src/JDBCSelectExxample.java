import java.sql.SQLException;

public class JDBCSelectExxample {
    public static void main(String[] args) {
        String query = "Select * from \"user\"";
        try (
                var conn = DButils.getConnection();
                var stmt = conn.createStatement();
                var rs = stmt.executeQuery(query)
                ){
            while (rs.next()){
                System.out.println("=======");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Money: ₹" + rs.getDouble("money"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
