package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static String dbName = "jdbc:mysql://127.0.0.1:3306/BankManagment";
    private static String userName = "root";
    private static String password = "0417@2003";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbName, userName,password);
    }
}
