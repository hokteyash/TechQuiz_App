/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.User;

/**
 *
 * @author hokte
 */
public class UserDao {
    public static boolean validateUser(User user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from users where USERID=? and PASSWORD=? and USERTYPE=?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    public static boolean addUser(User user)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from users where USERID=? and USERTYPE=?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getUserType());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) return false;
        ps = conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int ans = ps.executeUpdate();
        return ans==1;
    }
    
    public static String getPassword(String userid,String usertype)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select password from users where USERID=? and USERTYPE=?");
        ps.setString(1,userid);
        ps.setString(2,usertype);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getString(1);
    }
    
    public static boolean updatePassword(String pwd,String userid,String usertype)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users SET password=? where userid=? and usertype=?");
        ps.setString(1,pwd);
        ps.setString(2, userid);
        ps.setString(3, usertype);
        int ans = ps.executeUpdate();
        return ans==1;
    }
}
