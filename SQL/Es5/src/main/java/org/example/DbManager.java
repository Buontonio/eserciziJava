package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {

    public static String url ="jdbc:mysql://localhost:3306/newdb";
    private static String user ="root";
    private static String psw ="Franco";

    public static Statement connectToDb() {

        try {
            Connection conn = DriverManager.getConnection(url, user, psw);
            return conn.createStatement();

        } catch (SQLException e) {
            e.getStackTrace();
        }
        return null;
    }
}
