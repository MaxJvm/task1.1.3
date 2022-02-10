package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getMySQLConnection() {
        String hostName = "localhost";
        String dbName = "jdbc_probe";
        String userName = "root";
        String password = "katasql";
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        try {
            return DriverManager.getConnection(connectionURL, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
