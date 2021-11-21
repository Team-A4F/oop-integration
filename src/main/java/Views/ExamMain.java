/*
Done by :: IT21703294 - W.A.S.Fernando
*/
package Views;

import DatabaseLayer.DatabaseConnection;
import Controller.ExamController;
import Model.Exam;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ExamMain extends javax.swing.JFrame {
    Exam objExam;
    Exam[] ExamArray;
    ExamController objController;
    int index;
    
    public ExamMain() {
        initComponents();
        objController = new ExamController();
        ExamArray = new Exam[100];
        index = 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examIssuesTbl = new javax.swing.JTable();
        subjectLbl = new javax.swing.JLabel();
        enqLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enqTxt = new javax.swing.JTextArea();
        updateBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        showEnqsBtn = new javax.swing.JButton();
        subjectTxt = new javax.swing.JTextField();
        submitEnqBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        exEnqryTxt = new javax.swing.JTextField();
        examDateLbl = new javax.swing.JLabel();
        studIDTxt = new javax.swing.JTextField();
        clearTxtBtn1 = new javax.swing.JButton();
        examdateTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1210, 720));
        setMinimumSize(new java.awt.Dimension(1210, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1210, 10));

        jButton6.setBackground(new java.awt.Color(92, 184, 92));
        jButton6.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jButton6.setText("HOME");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 70, 30));

        jButton7.setBackground(new java.awt.Color(92, 184, 92));
        jButton7.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jButton7.setText("LOGOUT");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 90, 30));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setToolTipText("");
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1210, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel2.setText(" Copyright © 2021 Team-A4F  All Rights Reserved.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 350, 30));

        jLabel3.setBackground(new java.awt.Color(217, 83, 79));
        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EXAM");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 270, 60));

        examIssuesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inquiry ID", "Subject", "Exam Date", "Enquiry", "Student ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examIssuesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examIssuesTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(examIssuesTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 1020, 180));

        subjectLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectLbl.setText("Subject");
        getContentPane().add(subjectLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        enqLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enqLbl.setText("Briefly explain your issue");
        getContentPane().add(enqLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        enqTxt.setColumns(20);
        enqTxt.setRows(5);
        jScrollPane2.setViewportView(enqTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 590, 100));

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setText("Update Selected");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 140, 40));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 1140, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Enquiry");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        showEnqsBtn.setBackground(new java.awt.Color(51, 0, 204));
        showEnqsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showEnqsBtn.setText("Show ALL Enquires");
        showEnqsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEnqsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showEnqsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 190, 40));

        subjectTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(subjectTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 220, 30));

        submitEnqBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitEnqBtn.setText("Submit Enquiry");
        submitEnqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitEnqBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitEnqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 140, 40));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Selected");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 140, 40));

        exEnqryTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exEnqryTxt.setEnabled(false);
        getContentPane().add(exEnqryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 220, 30));

        examDateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        examDateLbl.setText("Exam Date");
        getContentPane().add(examDateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        studIDTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studIDTxt.setText("12345678");
        getContentPane().add(studIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 220, 30));

        clearTxtBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearTxtBtn1.setText("Clear Text");
        clearTxtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTxtBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(clearTxtBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 140, 40));

        examdateTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(examdateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        StudentView ss = new StudentView();
        ss.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Login ll = new Login();
        ll.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    //Submit new exam enquiry
    private void submitEnqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEnqBtnActionPerformed
        objExam = objController.addExamEnquiry(examdateTxt.getText(), subjectTxt.getText(), enqTxt.getText(), studIDTxt.getText(), exEnqryTxt.getText());
        boolean result = objController.insertExamEnquiry(objExam);        
        if(result) {
            JOptionPane.showMessageDialog(null, "Successful", "Successfully added", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Error", "Failed to add", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitEnqBtnActionPerformed

    private void showEnqsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEnqsBtnActionPerformed
        ArrayList<String> result = objController.selectExamEnquiry();
        DefaultTableModel model = (DefaultTableModel) examIssuesTbl.getModel();
        model.setRowCount(0); //to reset if new is addded
        
        for(int i=0; i<result.size(); i++){
            String exIssue = result.get(i);
            String[] eiTbl = exIssue.split(",");
        
            Object[] row = { eiTbl[0],eiTbl[1], eiTbl[2], eiTbl[3] ,eiTbl[4] };

            model.addRow(row);
        }
    }//GEN-LAST:event_showEnqsBtnActionPerformed

    private void clearTxtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTxtBtn1ActionPerformed
        exEnqryTxt.setText("");
        subjectTxt.setText("");
        enqTxt.setText("");
        examdateTxt.setText("");
    }//GEN-LAST:event_clearTxtBtn1ActionPerformed

    private void examIssuesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examIssuesTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) examIssuesTbl.getModel();
        int clickedRow = examIssuesTbl.getSelectedRow();
        
        examdateTxt.setText( model.getValueAt(clickedRow, 2).toString() );
        subjectTxt.setText( model.getValueAt(clickedRow, 1).toString() );
        enqTxt.setText( model.getValueAt(clickedRow, 3).toString() );
        exEnqryTxt.setText( model.getValueAt(clickedRow, 0).toString() );
    }//GEN-LAST:event_examIssuesTblMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        objExam = objController.updateExamEnquiry(examdateTxt.getText(), subjectTxt.getText(), enqTxt.getText(), studIDTxt.getText(), exEnqryTxt.getText());
        boolean result = objController.alterExamEnquiry(objExam);
        if(result) {
            JOptionPane.showMessageDialog(null, "Update Successful", "Successfully updated enquiry", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Update Error", "Failed to update enquiry", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        objExam = objController.removeExamEnquiry(examdateTxt.getText(), subjectTxt.getText(), enqTxt.getText(), studIDTxt.getText(), exEnqryTxt.getText());
        boolean result = objController.deleteExamEnquiry(objExam);
        if(result) {
            JOptionPane.showMessageDialog(rootPane, "Delete Successful", "Successfully delete enquiry", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Delete Error", "Failed to delete enquiry", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearTxtBtn1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel enqLbl;
    private javax.swing.JTextArea enqTxt;
    private javax.swing.JTextField exEnqryTxt;
    private javax.swing.JLabel examDateLbl;
    private javax.swing.JTable examIssuesTbl;
    private javax.swing.JTextField examdateTxt;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton showEnqsBtn;
    private javax.swing.JTextField studIDTxt;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JTextField subjectTxt;
    private javax.swing.JButton submitEnqBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
