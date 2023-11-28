//use JDBC for executing a query on the jdbc:mysql://localhost:3306/newdb database that:
//        adds a new string column of 30 chars called country to the students table
//        populate the new column with Italy for 2 students and Germany for the other 2 students

package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        DbManager.printTable();
        DbManager.columnAdder();
        DbManager.countryFieldFiller();
        DbManager.printTable();

    }
}