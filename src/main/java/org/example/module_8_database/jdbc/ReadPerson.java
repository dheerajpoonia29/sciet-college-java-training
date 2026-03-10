package org.example.module_8_database.jdbc;

import java.sql.*;

public class ReadPerson {
    public static void main(String[] args) {
        try {
            // step1: make connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", "root", "root1234");

            // step2: create statement and execute sql query
            Statement stmt = conn.createStatement();
            ResultSet dbResponse = stmt.executeQuery("SELECT * FROM person_detail_table");

            // step3: process the response which we got from database
            while(dbResponse.next()) {
                int id = dbResponse.getInt("id");
                String name = dbResponse.getString("name");
                int age = dbResponse.getInt("age");
                String occupation = dbResponse.getString("occupation");
                System.out.println("id: " + id + ", name: " + name + ", age: " + age);
            }

            // step4: close the connection
            conn.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
