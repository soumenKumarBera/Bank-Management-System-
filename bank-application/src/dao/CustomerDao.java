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

            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getPanNumber());
            ps.setString(5, customer.getAadres());
            ps.setString(6, customer.getPanNumber());
            ps.setLong(1, customer.getAadharNumber());



        }



         finally {

        }
return 0;

    }
}
