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
public final class Update extends Abstract{
    @Override
    public final void method(javax.swing.JTextField a, javax.swing.JComboBox<String> b, javax.swing.JTextField c, String d){
        try{
        String sql = "UPDATE kamarhotel SET id='"+a.getText()+"', jenis='"+b.getSelectedItem()+"', biaya='"+c.getText()+"' WHERE id='"+d+"'";
        conn=(Connection)Create.DB();
        stmt = conn.createStatement();
        PreparedStatement pst = conn.prepareStatement(sql);
        stmt.execute(sql);              
        JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
         }
         catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
