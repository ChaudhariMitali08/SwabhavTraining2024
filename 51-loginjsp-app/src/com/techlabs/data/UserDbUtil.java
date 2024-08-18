package com.techlabs.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDbUtil {
    private Connection connection;
    private Statement statement;

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
            statement = connection.createStatement();
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Consider logging this error instead
        }
    }

    public ResultSet getAllUsers() {
        ResultSet dbUsers = null;
        try {
            dbUsers = statement.executeQuery("SELECT * FROM user");
        } catch (SQLException e) {
            e.printStackTrace(); // Consider logging this error instead
        }
        return dbUsers;
    }

    public boolean validateCredentials(String username, String password) {
        ResultSet dbUsers = getAllUsers();
        try {
            while (dbUsers.next()) {
                if (dbUsers.getString("username").equals(username) &&
                    dbUsers.getString("password").equals(password)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider logging this error instead
        }
        return false;
    }

    
    public List<Users> getUsers() {
        ResultSet dbUsers = null;
        List<User> users=new ArrayList<User>();
        try {
            while (dbUsers.next()) {
               users.add(new Users(dbUsers.getInt(1),dbUsers))
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider logging this error instead
        }
        return false;
    }

    }
    public void close() {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Consider logging this error instead
        }
    }
}
