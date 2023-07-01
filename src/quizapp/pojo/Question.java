/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;

import java.util.Objects;

/**
 *
 * @author hokte
 */
public class Question {
    
    private String examid;
    private int qno;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correct_answer;
    private String language;
    
    public Question(){
        
    }

    public Question(String examid, int qno, String question, String answer1, String answer2, String answer3, String answer4, String correct_answer, String language) {
        this.examid = examid;
        this.qno = qno;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correct_answer = correct_answer;
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        Question other = (Question)obj;
        if(this.examid.equals(other.examid)==false) return false;
        if(this.qno!=other.qno) return false;
        if(this.question.equals(other.question)==false) return false;
        if(this.answer1.equals(other.answer1)==false) return false;
        if(this.answer2.equals(other.answer2)==false) return false;
        if(this.answer3.equals(other.answer3)==false) return false;
        if(this.answer4.equals(other.answer4)==false) return false;
        if(this.correct_answer.equals(other.correct_answer)==false) return false;
        if(this.language.equals(other.language)==false) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "examid=" + examid + ", qno=" + qno + ", question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correct_answer=" + correct_answer + ", language=" + language + '}';
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}
