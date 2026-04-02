package com.training.health_clinic.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/'health_clinic";
    private static final String USERNAME = "vaidikpandey";
    private static final String PASSWORD = "282315@Vaidik";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
