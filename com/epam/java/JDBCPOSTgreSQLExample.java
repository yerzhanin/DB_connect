package com.epam.java;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCPOSTgreSQLExample {

    //Database credentials
    static final String DB_URL = "jdbc:postgresql:127.0.0.1:5432/yerzhan";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {

        System.out.println("Test connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
            return;
        }

        if (connection !=null){
            System.out.println("You successfully connected to database now");
        }else {
            System.out.println("Failed to make connection to database");
        }
    }
}
