package com.maxchauo.registerylogin.dao;

import com.maxchauo.registerylogin.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class UserDaoImpl implements UserDao {

    @Value("${spring.datasource.url}")
    private String URL;

    @Value("${spring.datasource.username}")
    private String USERNAME;

    @Value("${spring.datasource.password}")
    private String PASSWORD;

    @Override
    public User getUserByEmailFromDB(String email) {
        String getUserByEmailSQL = "SELECT * FROM user WHERE email = ?";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(getUserByEmailSQL)) {

            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {

                    int getId = resultSet.getInt("id");
                    String getEmail = resultSet.getString("email");
                    String getPassword = resultSet.getString("password");
                    return new User(getId, getEmail, getPassword);
                }
            }   //mark the exception to SQLException type,
        } catch (SQLException e) {
            //print out the details of SQLException
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public User createUser(String email, String password) {
        String createUserSQL = "INSERT INTO user (email, password) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             //RETURN_GENERATE_KEY：After insertion,return mysql autoincrement value,it's a constant code,not number
             PreparedStatement statement = connection.prepareStatement(createUserSQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, email);
            statement.setString(2, password);
            statement.executeUpdate();
            //get auto increment value
            try (ResultSet resultSet = statement.getGeneratedKeys()) {
                //cursor get next line,because we only need to find one data,so can use if
                //if we need to find more than one data in db,need to use while loop
                if (resultSet.next()) {
                    int newId = resultSet.getInt(1);
                    System.out.println(newId);
                    return new User(newId, email, password);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public User authenticateUserInDB(String email, String password) {
        String authenticateUserInDBSQL = "SELECT * FROM user WHERE email = ? AND password = ?";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(authenticateUserInDBSQL)) {

            statement.setString(1, email);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int authId = resultSet.getInt("id");
                    String authUserEmail = resultSet.getString("email");
                    String authPassword = resultSet.getString("password");
                    System.out.printf(email, password);
                    return new User(authId, authUserEmail, authPassword);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
