/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pafinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Us
 */
public abstract class Abstract {
    protected static Connection MySQLConfig;
    protected static final String DB_URL = "jdbc:mysql://localhost/hotel";
    protected static final String USER = "root";
    protected static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    protected abstract void method(javax.swing.JTextField a, javax.swing.JComboBox<String> b, javax.swing.JTextField c, String d);
    
}
