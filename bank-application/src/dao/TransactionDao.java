package dao;

import model.Transaction;
import util.DBUtil;

import java.lang.reflect.Type;
import java.sql.*;

import static java.sql.Timestamp.valueOf;

public class TransactionDao {

    public void addTransaction(Transaction tObj) throws SQLException {
        String sql = ("insert into transactions(AccountNumber, transactionType, amount, transactionDate, relativeAccountNumber,description) values (?, ?, ?, ?, ?, ?)");

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setLong(1,tObj.getAccountNumber());
            ps.setString(2,tObj.getRansactionType());
            ps.setDouble(3,tObj.getAmount());
            ps.setTimestamp(4, Timestamp.valueOf(tObj.getTimestamp()));
            if(tObj.getRelatedAccountNumber() == 0){
                ps.setNull(5, Types.BIGINT);

            }else {
                ps.setLong(5, tObj.getRelatedAccountNumber());
            }

            ps.setString(6,tObj.getDescription());

            ps.executeUpdate();
        }
    }
}
