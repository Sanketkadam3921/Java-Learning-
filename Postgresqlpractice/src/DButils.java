import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
    private static final      String url = "jdbc:postgresql://localhost:5432/Java";
    private static final String user = "postgres";
  private static final  String password = "bowr9614";
     public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(url,user,password);
     }
}
