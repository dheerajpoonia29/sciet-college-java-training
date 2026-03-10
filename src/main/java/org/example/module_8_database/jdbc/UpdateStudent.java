package org.example.module_8_database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public static void main(String[] args) {
        try {
            // step1: make connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", "root", "root1234");

            // step2: create statement and execute sql query
            String sqlQuery = "UPDATE person_detail_table SET name=?, age=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            stmt.setString(1, "ragav");
            stmt.setInt(2, 34);
            stmt.setInt(3, 3);
            int dbResponse = stmt.executeUpdate();

            // step3: process the response
            if(dbResponse==1) {
                System.out.println("1 rows updated successfully.");
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
