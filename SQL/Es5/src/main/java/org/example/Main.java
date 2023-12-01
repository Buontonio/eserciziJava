//use JDBC for executing the following queries on the jdbc:mysql://localhost:3306/newdb database:
//        create a view italian_students that gets all the name and surname of the Italian students
//        create a view german_students that gets all the name and surname of the German students
//        execute a select using the italian_students and put the result in an ArrayList of Student objects called italianStudents
//        execute a select using the german_students and put the result in an ArrayList of Student objects called germanStudents

package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        createViewItalianStudentsInDb();
//        createViewGermanStudentsInDb();
        System.out.println(readFromDbAndPopulateItalianStudentsArray());
        System.out.println(readFromDbAndPopulateGermanStudentsArray());



    }

    public static void createViewItalianStudentsInDb() {

        try (Statement stmt = DbManager.connectToDb()){

            String q1 = "CREATE VIEW italian_students AS " +
                    "SELECT students.name as Name, " +
                    "students.surname as Surname " +
                    "FROM students " +
                    "WHERE (students.country = 'Italy');";

            stmt.executeUpdate(q1);

            System.out.println("View correctly created");

        }catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void createViewGermanStudentsInDb() {

        try (Statement stmt = DbManager.connectToDb()){

            String q1 = "CREATE VIEW german_students AS " +
                    "SELECT students.name as Name, " +
                    "students.surname as Surname " +
                    "FROM students " +
                    "WHERE (students.country = 'Germany');";

            stmt.executeUpdate(q1);

            System.out.println("View correctly created");

        }catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static ArrayList<Student> readFromDbAndPopulateItalianStudentsArray() {

        try (Statement stmt = DbManager.connectToDb()) {

            ArrayList<Student> italianStudents = new ArrayList<>();

            String q1 = "SELECT * FROM italian_students;";

            ResultSet rs = stmt.executeQuery(q1);

            while (rs.next()) {
                italianStudents.add(new Student(rs.getString("name"), rs.getString("surname")));
            }
            System.out.println("Tutto ok fra");
            return italianStudents;

        } catch (SQLException e) {
            e.getStackTrace();
        }
        return null;
    }

    public static ArrayList<Student> readFromDbAndPopulateGermanStudentsArray() {

        try (Statement stmt = DbManager.connectToDb()) {

            ArrayList<Student> germanStudents = new ArrayList<>();

            String q1 = "SELECT * FROM german_students;";

            ResultSet rs = stmt.executeQuery(q1);

            while (rs.next()) {
                germanStudents.add(new Student(rs.getString("name"), rs.getString("surname")));
            }
            System.out.println("Tutto ok fra");
            return germanStudents;

        } catch (SQLException e) {
            e.getStackTrace();
        }
        return null;
    }
}