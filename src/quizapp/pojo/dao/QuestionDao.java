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
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Question;
import quizapp.utility.QuestionStore;

/**
 *
 * @author hokte
 */
public class QuestionDao {
    public static void addQuestion(QuestionStore qstore)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Question>questionList = qstore.getAllQuestions();
        for(Question q:questionList){
            ps.setString(1,q.getExamid());
            ps.setInt(2,q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4,q.getAnswer1());
            ps.setString(5,q.getAnswer2());
            ps.setString(6,q.getAnswer3());
            ps.setString(7,q.getAnswer4());
            ps.setString(8,q.getCorrect_answer());
            ps.setString(9,q.getLanguage());
            ps.executeUpdate();
        }
    }
    
    public static ArrayList<Question>getQuestionsByExamId(String examId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from questions where examid=?");
        ps.setString(1,examId);
        ArrayList<Question>questionList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int qno = rs.getInt(2);
            String ques = rs.getString(3);
            String answer1 = rs.getString(4);
            String answer2 = rs.getString(5);
            String answer3 = rs.getString(6);
            String answer4 = rs.getString(7);
            String currAnswer = rs.getString(8);
            String language = rs.getString(9);
            Question q = new Question(examId,qno,ques,answer1,answer2,answer3,answer4,currAnswer,language);
            questionList.add(q);
        }
        return questionList;
    }
    
    public static void updateQuestions(QuestionStore qstore)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update questions SET question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=?,language=? where examid=? and qno=?");
        ArrayList<Question>questionList = qstore.getAllQuestions();
        for(Question q:questionList){
            ps.setString(1, q.getQuestion());
            ps.setString(2,q.getAnswer1());
            ps.setString(3,q.getAnswer2());
            ps.setString(4,q.getAnswer3());
            ps.setString(5,q.getAnswer4());
            ps.setString(6,q.getCorrect_answer());
            ps.setString(7,q.getLanguage());
            ps.setString(8,q.getExamid());
            ps.setInt(9,q.getQno());
            ps.executeUpdate();
        }
    }
    
}
