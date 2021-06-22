/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pafinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pafinal.Main.conn;

/**
 *
 * @author Us
 */
public final class Create extends Abstract{
    
    public static Connection DB()throws SQLException{
    try{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(DB_URL, USER, PASS);        
    }
        catch(SQLException e){
        System.out.println("KONEKSI GAGAL" + e);
        }
    return MySQLConfig;
    }
    
    @Override
    public final void method(javax.swing.JTextField a, javax.swing.JComboBox<String> b, javax.swing.JTextField c, String d){
        try{
        String sql = "INSERT INTO kamarhotel VALUES ('"+a.getText()+"','"+b.getSelectedItem()+"','"+c.getText()+"','available')";
        conn=(Connection)Create.DB();
        stmt = conn.createStatement();
        PreparedStatement pst = conn.prepareStatement(sql);
        stmt.execute(sql);
        JOptionPane.showMessageDialog(null, "DATA BERHASIL DITAMBAHKAN");
         }
         catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
