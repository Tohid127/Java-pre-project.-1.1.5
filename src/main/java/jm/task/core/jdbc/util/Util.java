package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection = null;
    Driver driver;
    public static Connection getConnection() {
        if (connection == null) {
            try {
                return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            if (connection != null) connection.close();
//        }
//        return connection;
//    }
}
