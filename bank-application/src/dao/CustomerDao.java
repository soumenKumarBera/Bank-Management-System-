package dao;

import model.Customer;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao {
    public int createCustomer(Customer customer) throws SQLException{
        String sql = "insert into Customers(FirstName, LastName, Email, PhoneNumber, Address, PanNumber, AaadharNumber) values(?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);


        }



         finally {

        }
return 0;

    }
}
