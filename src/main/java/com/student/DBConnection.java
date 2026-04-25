package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER  = "root";
    static final String PASS = "siddhii";

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(Exception e){
            System.out.println("Connection Failed: " + e.getMessage());
            return null;
        }
    }
}
