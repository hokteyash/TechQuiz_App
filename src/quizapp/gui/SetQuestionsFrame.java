/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import quizapp.dao.ExamDao;
import quizapp.dao.QuestionDao;
import quizapp.pojo.Exam;
import quizapp.pojo.Question;
import quizapp.pojo.UserProfile;
import quizapp.utility.QuestionStore;

/**
 *
 * @author hokte
 */
public class SetQuestionsFrame extends javax.swing.JFrame {

    private Exam examObj;
    private QuestionStore que;
    private HashMap<String,String>hm;
    private String question,answer1,answer2,answer3,answer4;
    private Color oldColor;
    
    public SetQuestionsFrame() {

    }
    
    public SetQuestionsFrame(Exam exam){
        initComponents();
        setLocationRelativeTo(null);
        oldColor = lblLogout.getForeground();
        examObj = exam;
        lblName.setText("Hello "+UserProfile.getUsername());
        lblSetTotalNumberOfQuestions.setText(exam.getTotalQuestions()+" Questions Remaining");
        que = new QuestionStore();
        hm = new HashMap<>();
        hm.put("Option 1","ANSWER1");
        hm.put("Option 2","ANSWER2");
        hm.put("Option 3","ANSWER3");
        hm.put("Option 4","ANSWER4");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblSetTotalNumberOfQuestions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestionField = new javax.swing.JTextArea();
        lblQestionNumber = new javax.swing.JLabel();
        lblOption1 = new javax.swing.JLabel();
        txtAnswer1 = new javax.swing.JTextField();
        lblOption2 = new javax.swing.JLabel();
        txtAnswer2 = new javax.swing.JTextField();
        lblOption3 = new javax.swing.JLabel();
        txtAnswer3 = new javax.swing.JTextField();
        txtAnswer4 = new javax.swing.JTextField();
        lblCorrectAnswer = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblOption4 = new javax.swing.JLabel();
        lblQuestionNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllProjectIcons/QuestionFrameIcon.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        lblName.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 255, 0));
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNameMouseExited(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(153, 255, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblSetTotalNumberOfQuestions.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSetTotalNumberOfQuestions.setForeground(new java.awt.Color(51, 255, 102));

        txtQuestionField.setColumns(20);
        txtQuestionField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtQuestionField.setRows(5);
        jScrollPane1.setViewportView(txtQuestionField);

        lblQestionNumber.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblQestionNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblQestionNumber.setText("Que");

        lblOption1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOption1.setForeground(new java.awt.Color(153, 255, 255));
        lblOption1.setText("Option 1");

        txtAnswer1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        lblOption2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOption2.setForeground(new java.awt.Color(102, 255, 255));
        lblOption2.setText("Option 2");

        txtAnswer2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });

        lblOption3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOption3.setForeground(new java.awt.Color(102, 255, 255));
        lblOption3.setText("Option 3");

        txtAnswer3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtAnswer4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        lblCorrectAnswer.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCorrectAnswer.setForeground(new java.awt.Color(102, 255, 255));
        lblCorrectAnswer.setText("Correct Answer");

        jcCorrectOption.setEditable(true);
        jcCorrectOption.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

        btnNext.setBackground(new java.awt.Color(51, 255, 102));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 255, 102));
        btnCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(51, 255, 102));
        btnDone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        lblOption4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOption4.setForeground(new java.awt.Color(102, 255, 255));
        lblOption4.setText("Option 4");

        lblQuestionNumber.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblQuestionNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestionNumber.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQestionNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuestionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAnswer1)
                                        .addComponent(lblOption1)
                                        .addComponent(lblOption3)
                                        .addComponent(txtAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                    .addComponent(lblCorrectAnswer))
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOption2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(lblOption4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(132, 132, 132))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lblSetTotalNumberOfQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSetTotalNumberOfQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQestionNumber)
                                    .addComponent(lblQuestionNumber)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOption1)
                            .addComponent(lblOption2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOption4)
                            .addComponent(lblOption3))
                        .addGap(18, 18, 18)
                        .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorrectAnswer)
                    .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
       lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout ?","Logout?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION){
            LoginScreenFrame fr = new LoginScreenFrame();
            fr.setVisible(true);
            this.dispose();
        }
        return;
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseExited
       lblName.setForeground(oldColor);
    }//GEN-LAST:event_lblNameMouseExited

    private void lblNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseEntered
        lblName.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblNameMouseEntered

    private void txtAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer2ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please fill all the fields first !!","Incomplete Information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(Integer.parseInt(lblSetTotalNumberOfQuestions.getText().trim().substring(0,1))==0){
            JOptionPane.showMessageDialog(null, "All the Questions are already set , Go for further process !!");
            return;
        }
        
        Question ques = new Question();
        ques.setExamid(examObj.getExamid());
        ques.setQno(Integer.parseInt(lblQuestionNumber.getText()));
        ques.setQuestion(question);
        ques.setAnswer1(answer1);
        ques.setAnswer2(answer2);
        ques.setAnswer3(answer3);
        ques.setAnswer4(answer4);
        ques.setCorrect_answer(hm.get(jcCorrectOption.getSelectedItem().toString().trim()));
        ques.setLanguage(examObj.getLanguage());
        
        que.addQuestion(ques);
        clearFields();
        
        int remQue = Integer.parseInt(lblSetTotalNumberOfQuestions.getText().substring(0,1));
        remQue--;
        lblSetTotalNumberOfQuestions.setText(remQue+" Questions Remaining");
        
        if(remQue==0){
            txtQuestionField.setEnabled(false);
            txtAnswer1.setEnabled(false);
            txtAnswer2.setEnabled(false);
            txtAnswer3.setEnabled(false);
            jcCorrectOption.setEnabled(false);
            btnNext.setEnabled(false);
            JOptionPane.showMessageDialog(null, "All the Questions get Completed , You are ready to set the Question Paper , Click on DONE Button !!","Hurray",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int qnum = Integer.parseInt(lblQuestionNumber.getText());
        qnum++;
        lblQuestionNumber.setText(String.valueOf(qnum));
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        
        if(validateSetAlltheQuestions()==false){
            JOptionPane.showMessageDialog(null, "You may remains with some questions,Kindly please fill all the questions first !!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            if(ExamDao.addExam(examObj)){
                JOptionPane.showMessageDialog(null, "Exam added Successfully !!","Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Exam cannot be added in the DB !!","Failure",JOptionPane.WARNING_MESSAGE);
                return;
            }
            QuestionDao.addQuestion(que);
            JOptionPane.showMessageDialog(null,"All the Questions also get added !!","Success",JOptionPane.INFORMATION_MESSAGE);
            AdministrationOptionsFrame fr = new AdministrationOptionsFrame();
            fr.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in adding the exam or in adding the questions in db !!","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int sure = JOptionPane.showConfirmDialog(null, "Are you sure , you want to cancel this process?","Are you sure?",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(sure==JOptionPane.YES_OPTION){
            PaperSettingPanelFrame fr = new PaperSettingPanelFrame();
            fr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetQuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrectOption;
    private javax.swing.JLabel lblCorrectAnswer;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOption1;
    private javax.swing.JLabel lblOption2;
    private javax.swing.JLabel lblOption3;
    private javax.swing.JLabel lblOption4;
    private javax.swing.JLabel lblQestionNumber;
    private javax.swing.JLabel lblQuestionNumber;
    private javax.swing.JLabel lblSetTotalNumberOfQuestions;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtAnswer4;
    private javax.swing.JTextArea txtQuestionField;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        
        question = txtQuestionField.getText();
        answer1 = txtAnswer1.getText();
        answer2 = txtAnswer2.getText();
        answer3 = txtAnswer3.getText();
        answer4 = txtAnswer4.getText();
        
        if(question.isEmpty() || answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() || answer4.isEmpty())
            return false;
        return true;
    }

    private void clearFields() {
        txtQuestionField.setText("");
        txtAnswer1.setText("");
        txtAnswer2.setText("");
        txtAnswer3.setText("");
        txtAnswer4.setText("");
        jcCorrectOption.setSelectedIndex(0);
        txtQuestionField.requestFocus();
    }

    private boolean validateSetAlltheQuestions() {
        return Integer.parseInt(lblSetTotalNumberOfQuestions.getText().trim().substring(0,1))==0;
    }
}
