/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pafinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static pafinal.Abstract.DB_URL;
import static pafinal.Abstract.MySQLConfig;
import static pafinal.Abstract.PASS;
import static pafinal.Abstract.USER;
import static pafinal.Checkin.conn;
import static pafinal.Checkin.stmt;

/**
 *
 * @author Armann
 */
public class checkin_checkout implements checkin_interface  {

    @Override
    public void checkin(String tanggal, String nama, String nik, String nomor) {
        try{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(DB_URL, USER, PASS); 
        String sql = "INSERT INTO `pelanggan`(`no`, `nama`, `nik`, `tanggal`) VALUES ('%s','%s','%s','%s')"; 
        String sqll = "UPDATE `kamarhotel` SET `status` = 'unavailable' WHERE `kamarhotel`.`id` = '"+nomor+"'";
        sql = String.format(sql,nomor, nama, nik, tanggal);
        conn=(Connection)Create.DB();
        stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.execute(sqll);
        JOptionPane.showMessageDialog(null, "BERHASIL CHECK-IN DI NOMOR KAMAR "+ nomor);
         }
         catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void checkout(String noKamar, String nama) {
        try{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(DB_URL, USER, PASS); 
        String sql = "DELETE FROM pelanggan WHERE no='"+noKamar+"'";
        String sqll = "UPDATE `kamarhotel` SET `status` = 'available' WHERE `kamarhotel`.`id` = '"+noKamar+"'";
        conn=(Connection)Create.DB();
        stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.execute(sqll);
        JOptionPane.showMessageDialog(null, "BERHASIL CHECK-OUT ATAS NAMA "+nama);
         }
         catch(Exception e){
            e.printStackTrace();
        }
    }
}
