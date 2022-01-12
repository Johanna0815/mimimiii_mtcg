
package com.mimimiii.dbutils.http_news;

import com.mimimiii.dbutils.database.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface MessageService {
/*
    private static MessageServiceImpl instance;

    private MessageServiceImpl() {

    }


    public boolean deleteMessage(int id) {
        try {
            Connection conn = DatabaseService.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM messages WHERE id = ?;");
            ps.setInt(1, id);

            int affectedRows = ps.executeUpdate();

            ps.close();
            conn.close();

            if (affectedRows == 0) {
                return false;
            }

            ps.close();
            conn.close();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

 */
}
