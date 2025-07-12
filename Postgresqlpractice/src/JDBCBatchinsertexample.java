import java.sql.SQLException;

public class JDBCBatchinsertexample {
    public static void main(String[] args) {
        String query = "INSERT INTO \"user\" (first_name, last_name, email, fk_user_role, money) VALUES (?, ?, ?, ?, ?)";
         try (
                 var conn = DButils.getConnection();
                 var ps = conn.prepareStatement(query);
                 ){
             conn.setAutoCommit(false);

              ps.setString(1,"Riya");
              ps.setString(2,"Sharma");
              ps.setString(3,"Riya@gmail.com");
              ps.setInt(4,2);
              ps.setDouble(5,1000);
              ps.addBatch();

             ps.setString(1, "Amit");
             ps.setString(2, "Verma");
             ps.setString(3, "amit@email.com");
             ps.setInt(4, 2);
             ps.setDouble(5, 1200);
             ps.addBatch();

             ps.executeBatch();
             conn.commit();
             System.out.println("Batch Inserted");
         }catch (SQLException e){
             e.printStackTrace();
         }
    }
}
