import java.sql.SQLException;

public class MorePractice {
    public static void main(String[] args) {
        double transferamount = 500 ;
        int fromId = 2;
        int toId = 1;

        String getBal = "select money from \"user\" where id = ?";
        String updateBal = "Update \"user\" SET money = ? where id = ? ";

        try (
                var conn = DButils.getConnection();
                var psGet= conn.prepareStatement(getBal);
                var psUpdate = conn.prepareStatement(updateBal);

                ){
            conn.setAutoCommit(false);
            psGet.setInt(1,fromId);
            double fromBalance = 0 ;
            try(var rs = psGet.executeQuery()){
                if(rs.next()){
                    fromBalance = rs.getDouble("money");
                    if(fromBalance < transferamount) throw new SQLException("Insufficient funds");

                }
            }
            psUpdate.setDouble(1,fromBalance-transferamount);
            psUpdate.setInt(2,fromId);
            psUpdate.executeUpdate();

            psGet.setInt(1,toId);
            double tobalance = 0 ;
            try(
                    var rs = psGet.executeQuery()
                    ){
                if(rs.next()){
                    tobalance = rs.getDouble("money");
                }else {
                    throw  new SQLException("Receiver not found");
                }
            }
            psUpdate.setDouble(1,tobalance+transferamount);
            psUpdate.setInt(2,toId);
            psUpdate.executeUpdate();
            conn.commit();
            System.out.println("Money transferred successfully");

        }catch (SQLException e){
            e.printStackTrace();

        }
    }
}
