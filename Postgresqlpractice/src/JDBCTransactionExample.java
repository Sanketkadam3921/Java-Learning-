import java.sql.SQLException;

public class JDBCTransactionExample {
    public static void main(String[] args) throws SQLException {
        double transferAmount = 300 ;
        int fromId = 1;
        int toId =2;


        String getBalanceQuery = "Select money from \"user\" where id = ?";
        String updateBalanceQuery ="UPDATE \"user\" SET money = ? where id = ?";

        try(
                var conn = DButils.getConnection();
                var psSelect = conn.prepareStatement(getBalanceQuery);
                var psUpdate = conn.prepareStatement(updateBalanceQuery);

                ){
            conn.setAutoCommit(false);
            psSelect.setInt(1,fromId);
            double fromBalance ;
            try (var rs = psSelect.executeQuery()){
                if(!rs.next()) throw new SQLException("Sender not found ");
                fromBalance = rs.getDouble("money");

            }
            if(fromBalance < transferAmount){
                System.out.println("Insufficient funds");
                return;
            }
            psUpdate.setDouble(1,fromBalance -transferAmount);
            psUpdate.setInt(2,fromId);
            psUpdate.executeUpdate();

            //get receivers balance
            psSelect.setInt(1,toId);
            double tobalance;
            try(
                    var rs = psSelect.executeQuery()
                    ){
                if(!rs.next()) throw new SQLException("Receiver not found");
                tobalance = rs.getDouble("money");

            }
            psUpdate.setDouble(1,tobalance + transferAmount);
            psUpdate.setInt(2,toId);
            psUpdate.executeUpdate();

            conn.commit();
            System.out.println("Money transferred");

        }catch ( SQLException e ){
            e.printStackTrace();
        }
    }
}
