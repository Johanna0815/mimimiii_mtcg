package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    private static DatabaseService instance;

    private static final String DB_URL = "jdbc:postgresql://localhost/mimimiii_mtcg";
    private static final String USER = "swe1user";
    private static final String PASSWORD = "swe1pw";

    public static DatabaseService getInstance() {
        if (DatabaseService.instance == null) {
            DatabaseService.instance = new DatabaseService();
        }
        return DatabaseService.instance;
    }

    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
