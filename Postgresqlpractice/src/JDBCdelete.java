import java.sql.SQLException;

public class JDBCdelete {
    public static void main(String[] args) {
        String query = "Delete FROM \"user\" where id =3 ";
        try(
                var conn = DButils.getConnection();
                var stmt = conn.createStatement();
                ){
            int rows = stmt.executeUpdate(query);
            System.out.println("Deleted rows "+ rows);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
