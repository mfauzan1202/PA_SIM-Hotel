
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Us
 */
public class Conn {
    private static Connection MySQLConfig;
    public static Connection connDB()throws SQLException{
    try{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokogame", "root", "");
        System.out.println("BERHASIL");
    }
        /*Class.forName("com.mysql.jdbc.Driver");
        Connection koneksi =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmahasiswa", "root", "");
        System.out.println("BERHASIL");
        }*/
        catch(SQLException e){
        System.out.println("GAGAL" + e);
        }
    return MySQLConfig;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
