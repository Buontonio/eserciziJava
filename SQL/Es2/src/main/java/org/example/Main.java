package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        tableCreation();
        tableFiller();
        tablePrinter();

    }

    public static void tableCreation() {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "SuperAbiLee96!");
            Statement statement = connection.createStatement();

            String create = "CREATE TABLE IF NOT EXISTS persone (\n" +
                    "\tstudent_id INTEGER(10) NOT NULL AUTO_INCREMENT,\n" +
                    "\tlast_name VARCHAR(30),\n" +
                    "\tfirst_name VARCHAR(30),\n" +
                    "\tPRIMARY KEY (student_id)\n" +
                    ");";

            int result = statement.executeUpdate(create);
//            System.out.println("rows affected" + result);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }


    public static void tableFiller() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "SuperAbiLee96!");
            Statement statement = connection.createStatement();
            String insertStudents = "INSERT INTO persone (first_name, last_name) \n" +
                    "VALUES \n" +
                    "\t('Antonio', 'Buonanno'),\n" +
                    "\t('Antonio', 'Troiano'),\n" +
                    "\t('Luca', 'Di Grigoli'),\n" +
                    "\t('Bruno',  'Orlandi');";
            int result = statement.executeUpdate(insertStudents);
//            System.out.println("Rows affected " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tablePrinter() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "SuperAbiLee96!");
            Statement statement = connection.createStatement();

            String selectStudents = "SELECT * FROM persone;";
            ResultSet result = statement.executeQuery(selectStudents);

            while (result.next()) {
                System.out.println(
                        result.getString("student_id") + " " +
                                result.getString("last_name") + " " +
                                result.getString("first_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
