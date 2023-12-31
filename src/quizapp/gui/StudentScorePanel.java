/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quizapp.dao.PerformanceDao;
import quizapp.pojo.StudentScore;
import quizapp.pojo.UserProfile;

/**
 *
 * @author hokte
 */
public class StudentScorePanel extends javax.swing.JFrame {

    /**
     * Creates new form StudentScorePanel
     */
    private Color oldColor;
    private String studentId;
    public StudentScorePanel() {
        initComponents();
        setLocationRelativeTo(null);
        oldColor = lblLogout.getForeground();
        lblName.setText("Hello "+UserProfile.getUsername());
        txtStudentId.setText(UserProfile.getUsername());
        studentId = UserProfile.getUsername();
        loadExamId();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcExamId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPercentage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtStudentId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SINGLE STUDENT SCORE PANEL");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 102));
        jLabel2.setText("STUDENT SCORE DETAILS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllProjectIcons/SingleStudentScoreIcon.jpg"))); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 102));
        jLabel4.setText("User Id :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 102));
        jLabel5.setText("Select Exam Id");

        jcExamId.setEditable(true);
        jcExamId.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 102));
        jLabel6.setText("Language");

        txtLanguage.setEditable(false);
        txtLanguage.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 102));
        jLabel7.setText("Percentage");

        txtPercentage.setEditable(false);
        txtPercentage.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        btnBack.setBackground(new java.awt.Color(102, 255, 102));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtStudentId.setEditable(false);
        txtStudentId.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentId)
                            .addComponent(jcExamId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLanguage)
                            .addComponent(txtPercentage))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(114, 169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcExamId))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseEntered
        lblName.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblNameMouseEntered

    private void lblNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseExited
        lblName.setForeground(oldColor);
    }//GEN-LAST:event_lblNameMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout ?","Logout?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION){
            LoginScreenFrame fr = new LoginScreenFrame();
            fr.setVisible(true);
            this.dispose();
        }
        return;
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        String examId = jcExamId.getSelectedItem().toString();
        try{
            StudentScore s = PerformanceDao.getScore(studentId, examId);
            String subject = s.getLanguage();
            String percentage = String.valueOf(s.getPercentage());
            txtLanguage.setText(subject);
            txtPercentage.setText(percentage);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB , In ViewSingleStudentScoreFrame","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcExamIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentOptionsFrame fr = new StudentOptionsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentScorePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentScorePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentScorePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentScorePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentScorePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPercentage;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

    private void loadExamId() {
        jcExamId.removeAllItems();
        String studentId = txtStudentId.getText();
        try{
            ArrayList<String>examIdList = PerformanceDao.getAllExamId(studentId);
            if(examIdList.isEmpty()){
                JOptionPane.showMessageDialog(null, "Sorry !! you have not yet appeared for any test","Sorry",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for(String examId:examIdList){
                jcExamId.addItem(examId);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB , In ViewSingleStudentScoreFrame","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
