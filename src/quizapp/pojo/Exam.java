/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;

/**
 *
 * @author hokte
 */
public class Exam {
    
    private String examid;
    private String language;
    private int totalQuestions;
    
    public Exam(){
        
    }
    
    public Exam(String examid, String language, int totalQuestions) {
        this.examid = examid;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    
}
