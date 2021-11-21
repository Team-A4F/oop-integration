
package Views;

import Controller.StudentController;


public class ReportMain extends javax.swing.JFrame {

    StudentController stcon;
   
    public ReportMain() {
        initComponents();
        
        stcon = new StudentController();
        std_count.setText(""+stcon.studentCount());
        issue_count_total.setText(""+stcon.issueCount());
        issue_count_today.setText(""+stcon.issueCountToday());
        unres_tf.setText(""+stcon.getCountIssuesResolved());
        res_tf.setText(""+stcon.getCountIssuesUnresolved());
        course_count.setText(""+stcon.getCountCourses());
        
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        std_count = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        course_count = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        issue_count_total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        issue_count_today = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        res_tf = new javax.swing.JLabel();
        unres_tf = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel3.setText("REPORT");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 270, 60));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Download");
        jButton1.setIconTextGap(5);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 180, 40));

        jLabel4.setBackground(new java.awt.Color(153, 255, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Enrolled Students");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, 60));

        std_count.setBackground(new java.awt.Color(204, 204, 255));
        std_count.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        std_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        std_count.setOpaque(true);
        getContentPane().add(std_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 70, 60));

        jLabel5.setBackground(new java.awt.Color(153, 255, 153));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Courses");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 60));

        course_count.setBackground(new java.awt.Color(204, 204, 255));
        course_count.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        course_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        course_count.setOpaque(true);
        getContentPane().add(course_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, 60));

        jLabel6.setBackground(new java.awt.Color(153, 255, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Issues");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 250, 60));

        issue_count_total.setBackground(new java.awt.Color(204, 204, 255));
        issue_count_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        issue_count_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issue_count_total.setOpaque(true);
        getContentPane().add(issue_count_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 70, 60));

        jLabel7.setBackground(new java.awt.Color(153, 255, 153));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Issues Added Today");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 250, 60));

        issue_count_today.setBackground(new java.awt.Color(204, 204, 255));
        issue_count_today.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        issue_count_today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issue_count_today.setOpaque(true);
        getContentPane().add(issue_count_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 70, 60));

        jLabel9.setBackground(new java.awt.Color(153, 255, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Resolved Tasks");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 250, 40));

        res_tf.setBackground(new java.awt.Color(204, 204, 255));
        res_tf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        res_tf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res_tf.setOpaque(true);
        getContentPane().add(res_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 70, 40));

        unres_tf.setBackground(new java.awt.Color(204, 204, 255));
        unres_tf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        unres_tf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unres_tf.setOpaque(true);
        getContentPane().add(unres_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 470, 70, 40));

        jLabel8.setBackground(new java.awt.Color(153, 255, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Unresolved Tasks");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashan\\Desktop\\123\\oop-integration\\src\\Img\\7243-01-low-poly-background-16x9-1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 720));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel course_count;
    private javax.swing.JLabel issue_count_today;
    private javax.swing.JLabel issue_count_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel res_tf;
    private javax.swing.JLabel std_count;
    private javax.swing.JLabel unres_tf;
    // End of variables declaration//GEN-END:variables
}
