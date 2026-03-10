package org.example.module_8_database.jdbc;

import java.sql.*;

public class CreatePerson {
    public static void main(String[] args) {
        try {
            // step1: make connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", "root", "root1234");

            // step2: create statement and execute sql query
            Statement stmt = conn.createStatement();
            int dbResponse = stmt.executeUpdate("INSERT INTO person_detail_table VALUES (4, 'tushar', 45, 'it'), (5, 'sachin', 50, 'cs')");

            // step3: process the response
            if(dbResponse==2) {
                System.out.println("2 rows inserted successfully.");
            } else {
                System.out.println("Error inserting data.");
            }

            // step4: close the connection
            conn.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
