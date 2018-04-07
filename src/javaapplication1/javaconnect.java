/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Aditya
 */
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class javaconnect {
    
    Connection conn = null;
    public static Connection ConnecrDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:mysql:‪C:\\Users\\Mahe\\Desktop\\wholesale.sql");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesale","root","");
            JOptionPane.showMessageDialog(null, "Connection established");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
