package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
//  public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver"; с 8 джава не обязателен!
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
