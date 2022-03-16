/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author eusebioajas
 */

public class DBConnection {

    public static Connection createConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/customers?zeroDateTimeBehavior=convertToNull"; //Copia y pega el enlace completo desde el NETBEANS
        String username = "root"; //MySQL username
        String password = ""; //MySQL password   
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver"); // mysql driver MySQL 5 
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, username, password); //connect MySQL database
            System.out.println("Printing connection object " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
