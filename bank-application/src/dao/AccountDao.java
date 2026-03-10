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
        String sql = (" SELECT * FROM bankaccounts WHERE  AccountNumber = ?");

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){

            ps.setLong(1, accNumber);

            try(ResultSet resultSet = ps.executeQuery()){
              if(resultSet.next()){
                return new Account(
                        resultSet.getLong("AccountNumber"),
                        resultSet.getInt("customerId"),
                        resultSet.getString("AccountType"),
                        resultSet.getDouble("balance"),
                        resultSet.getString("status"),
                        resultSet.getDate("OpeningDate").toLocalDate()


                );

             }else {
                  return null;
              }
            }
        }



    }


    public boolean closeBankAccount(long accNumber) throws SQLException{

        String sql = ("update bankaccounts set status =  'Closed'  where AccountNumber = ?");
        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){
            ps.setLong(1, accNumber);

           int value = ps.executeUpdate();

           if(value > 0){
               return true;
           }else {
               return false;
           }



        }



    }

}
