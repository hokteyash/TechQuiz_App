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
import java.sql.Statement;
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Performance;
import quizapp.pojo.StudentScore;

/**
 *
 * @author hokte
 */
public class PerformanceDao {
    public static void addPerformance(Performance p)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1,p.getUserid());
        ps.setString(2,p.getExamid());
        ps.setInt(3, p.getRight());
        ps.setInt(4, p.getWrong());
        ps.setInt(5, p.getUnattempted());
        ps.setDouble(6, p.getPercentage());
        ps.setString(7,p.getLanguage());
        ps.executeUpdate();
    }
    public static ArrayList<Performance> getAllData()throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ArrayList<Performance>dataList = new ArrayList<>();
        ResultSet rs = st.executeQuery("select * from performance");
        while(rs.next()){
            String userid = rs.getString(1);
            String examid = rs.getString(2);
            int right = rs.getInt(3);
            int wrong = rs.getInt(4);
            int unattempted = rs.getInt(5);
            double percentage = rs.getDouble(6);
            String language = rs.getString(7);
            Performance p = new Performance(userid,examid,right,wrong,unattempted,percentage,language);
            dataList.add(p);
        }
        return dataList;
    }
    
    public static ArrayList<String> getAllStudentId()throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ArrayList<String>studentList = new ArrayList<>();
        ResultSet rs = st.executeQuery("select distinct userid from performance");
        while(rs.next()){
            studentList.add(rs.getString(1));
        }
        return studentList;
    }
    
    public static ArrayList<String> getAllExamId(String studentId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from performance where userid=?");
        ps.setString(1, studentId);
        ArrayList<String>examIdList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            examIdList.add(rs.getString(1));
        }
        return examIdList;
    }
    
    public static StudentScore getScore(String studentId,String examId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select percentage,language from performance where userid=? and examid=?");
        ps.setString(1, studentId);
        ps.setString(2, examId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        double per = rs.getDouble(1);
        String subject = rs.getString(2);
        return new StudentScore(subject,per);
    }
}
