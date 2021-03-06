package com.mimimiii.dbutils.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseService {



                                                // mimimiii_mtcg
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "swe1user";
    private static final String PASSWORD = "swe1pw";
    // private String db = "example";
    // private String command;
    private static DatabaseService instance;

    private DatabaseService() {
    }

    //    Method to obtain an object.
    public static DatabaseService getInstance() {
        if (DatabaseService.instance == null) {
            DatabaseService.instance = new DatabaseService();
        }
        return DatabaseService.instance;
    }



    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
