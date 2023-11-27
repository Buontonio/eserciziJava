//use JDBC for executing the following query on the jdbc:mysql://localhost:3306/newdb database:
//        take the names and surnames of all the students (using ResultSet and its .next() method) and:
//        print the names on screen while executing the query
//        assign the surnames to an ArrayList called surnames
//        once the query is completed, print all the surnames

package org.example;

import java.security.PublicKey;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        printNamesAddSurnamesToArray();

    }

    public static void printNamesAddSurnamesToArray() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "SuperAbiLee96!");
            Statement statement = connection.createStatement();
            String q1 = "SELECT name, surname FROM students";

            ResultSet rs = statement.executeQuery(q1);
            ArrayList<String> surnames = new ArrayList<>();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                surnames.add(rs.getString("surname"));
            }
            System.out.println(surnames);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}