package org.example.module_8_database.jdbc;

import java.sql.*;

public class DeletePerson {
    public static void main(String[] args) {
        try {
            // step1: make connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", "root", "root1234");

            // step2: create statement and execute sql query
            String sqlQuery = "DELETE FROM person_detail_table WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            stmt.setInt(1, 2);
            int dbResponse = stmt.executeUpdate();

            // step3: process the response
            if(dbResponse==1) {
                System.out.println("1 row2 deleted successfully.");
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
