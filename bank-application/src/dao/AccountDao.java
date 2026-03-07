package dao;

import model.Account;
import util.DBUtil;


import java.sql.*;

public class AccountDao {
    public boolean createBankAccount(Account account) throws SQLException {
        String sql = ("insert into bankaccounts(AccountNumber, customerId, AccountType, balance, status, OpeningDate) values (?, ?, ?, ?, ?, ?)");

        try(Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)){
            ps.setLong(1,account.getAccNumber());
            ps.setInt(2, account.getCustomerId());
            ps.setString(3, account.getAccountType());
            ps.setDouble(4, account.getBankBalance());
            ps.setString(5,account.getStatus());
            ps.setDate(6, Date.valueOf(account.getOpeningDate()));

            int row = ps.executeUpdate();

            if (row > 0){
                return true;
            }else {
                return false;
            }



        }


    }

    public Account getAccount(long accNumber) throws SQLException {
        String sql = (" select * from bankaccounts where  AccountNumber = ? ");

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){

            ps.setLong(1, accNumber);

            try(ResultSet rs = ps.executeQuery()){
              if(rs.next()){
                return new Account(
                        rs.getLong("AccountNumber"),
                        rs.getInt("customerId"),
                        rs.getString("AccountType"),
                        rs.getDouble("balance"),
                        rs.getString("status"),
                        rs.getDate("OpeningDate").toLocalDate()


                );

             }else {
                  return null;
              }
            }
        }



    }
}
