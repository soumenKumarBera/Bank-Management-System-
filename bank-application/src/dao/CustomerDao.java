package dao;

import model.Customer;
import util.DBUtil;

import java.sql.*;

public class CustomerDao {
    public int createCustomer(Customer customer) throws SQLException{
        String sql = "insert into Customers(FirstName, LastName, Email, PhoneNumber, Address, PanNumber, AaadharNumber) values(?, ?, ?, ?, ?, ?, ?)";
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){



            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getPhoneNumber());
            ps.setString(5, customer.getAadres());
            ps.setString(6, customer.getPanNumber());
            ps.setLong(7, customer.getAadharNumber());


            int affectedRaw = ps.executeUpdate();

            if(affectedRaw == 0) return -1;


            try(ResultSet resultSet =ps.getGeneratedKeys()) {
                if (resultSet.next()){
                    return resultSet.getInt(1);
                }

            };




        }




return -1;

    }
}
