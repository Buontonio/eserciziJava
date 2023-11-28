package org.example;

import java.sql.*;

public class DbManager {

    final static String url = "jdbc:mysql://localhost:3306/newdb";
    final static String user = "root";
    final static String psw = "SuperAbiLee96!";

    private static Statement createStatement() {

        try {
            Connection conn = DriverManager.getConnection(url, user, psw);
            System.out.println("Correctly connected to the database");
            return conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static void printTable() {
        String q1 = "SELECT * FROM students";

        try (Statement statement = createStatement()) {
            ResultSet rs = statement.executeQuery(q1);

            while (rs.next()) {
                System.out.print(rs.getString("name"));
                System.out.print(" ");
                System.out.print(rs.getString("surname"));
                System.out.print(" ");
                System.out.println(rs.getString("country"));
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    public static void columnAdder() {
        try (Statement statement = createStatement()) {
            String q1 = "ALTER TABLE students DROP COLUMN pippo";

            int rs = statement.executeUpdate(q1);

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void countryFieldFiller() {
        try (Statement statement = createStatement()) {
            String q1 = "UPDATE students " +
                    "SET country = 'Italy' " +
                    "WHERE id IN (1,2)";
            String q2 = "UPDATE students " +
                    "SET country = 'Germany' " +
                    "WHERE id IN (3,4)";
            int rs = statement.executeUpdate(q1);
            int rs1 = statement.executeUpdate(q2);

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }
}


//    private static Statement createStatementForDb() {
//        try {
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//            return conn.createStatement();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }