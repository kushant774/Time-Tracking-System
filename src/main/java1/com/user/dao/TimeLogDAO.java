package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimeLogDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/time_tracking";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public void addTimeLog(String userId, String task, int hours, String date) {
        String query = "INSERT INTO time_logs (user_id, task, hours, date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userId);
            stmt.setString(2, task);
            stmt.setInt(3, hours);
            stmt.setString(4, date);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getTimeLogs(String userId) {
        String query = "SELECT * FROM time_logs WHERE user_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userId);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
