/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

/**
 *
 * @author eusebioajas
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;

public class LoginDao {

    public String authenticateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";

        try {
            con = DBConnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select userName,password from users");

            while (resultSet.next()) {
                userNameDB = resultSet.getString("userName");
                passwordDB = resultSet.getString("password");

                if (userName.equals(userNameDB) && password.equals(passwordDB)) {
                    return "SUCCESS";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Invalid user credentials";
    }
}
