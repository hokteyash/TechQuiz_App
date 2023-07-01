/*
 * To ch
ange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hokte
 */
public class DBConnection {
    private static Connection conn = null;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded successfully !!");
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
            System.exit(0);
        }
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-15J9BPS:1521/XE","onlineexam","student");
            System.out.println("Connection Open Successfully !!");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.exit(0);
        }
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public static void closeConnection(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("connection close successfully !!");
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
