/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pafinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static pafinal.Abstract.conn;

/**
 *
 * @author Us
 */
public final class Delete extends Abstract {
    
    @Override
    public final void method(javax.swing.JTextField a, javax.swing.JComboBox<String> b, javax.swing.JTextField c, String d){
        try{
        String sql = "DELETE FROM kamarhotel WHERE id='"+a.getText()+"'";
        conn=(Connection)Create.DB();
        stmt = conn.createStatement();
        PreparedStatement pst = conn.prepareStatement(sql);
        stmt.execute(sql);              
        JOptionPane.showMessageDialog(null, "DATA BERHASIL DELETE");
         }
         catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}