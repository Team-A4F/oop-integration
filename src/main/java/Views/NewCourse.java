/*
Done by :: IT21711282 - M.P.W.P.Anjana Lakshan
*/
package Views;
import javax.swing.JOptionPane;
import Model.Course;
import Controller.CourseController;

public class NewCourse extends javax.swing.JFrame {
    Course modelNewC;
    Course[] arrC;
    CourseController ctrlNewC;
    int index;
    
    public NewCourse() {
        initComponents();
    }

    public void clearAll() {

        description_tf.setText("");
        name_tf.setText("");
        duration_tf.setText("");
        prerequisite_tf.setText("");
        fee_tf.setText("");
//        lecturer_combx
//        centre_combx
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        copyright_lbl = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        newCourse_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        duration_lbl = new javax.swing.JLabel();
        duration_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fee_lbl = new javax.swing.JLabel();
        fee_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        prerequisite_tf = new javax.swing.JTextArea();
        prerequisite_lbl = new javax.swing.JLabel();
        reset_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        centre_lbl = new javax.swing.JLabel();
        description_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description_tf = new javax.swing.JTextArea();
        lecturer_combx = new javax.swing.JComboBox<>();
        centre_combx = new javax.swing.JComboBox<>();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1210, 720));
        setMinimumSize(new java.awt.Dimension(1210, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1210, 10));

        back_btn.setBackground(new java.awt.Color(92, 184, 92));
        back_btn.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        back_btn.setText("< BACK");
        back_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 30));

        home_btn.setBackground(new java.awt.Color(92, 184, 92));
        home_btn.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        home_btn.setText("HOME");
        home_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 70, 30));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setToolTipText("");
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1210, 10));

        copyright_lbl.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        copyright_lbl.setText(" Copyright © 2021 Team-A4F  All Rights Reserved.");
        getContentPane().add(copyright_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 350, 30));

        logout_btn.setBackground(new java.awt.Color(92, 184, 92));
        logout_btn.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        logout_btn.setText("LOGOUT");
        logout_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        getContentPane().add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 90, 30));

        newCourse_lbl.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        newCourse_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newCourse_lbl.setText("New Course");
        getContentPane().add(newCourse_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 270, 40));

        name_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_lbl.setText("Name");
        getContentPane().add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 80, 30));

        name_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 350, 30));

        duration_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        duration_lbl.setText("Duration");
        getContentPane().add(duration_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 80, 30));

        duration_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(duration_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lecturer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, 30));

        fee_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fee_lbl.setText("Fee");
        getContentPane().add(fee_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 80, 30));

        fee_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fee_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 210, 30));

        prerequisite_tf.setColumns(20);
        prerequisite_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prerequisite_tf.setRows(5);
        jScrollPane1.setViewportView(prerequisite_tf);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 410, 140));

        prerequisite_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prerequisite_lbl.setText("Prerequisite");
        getContentPane().add(prerequisite_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 80, 30));

        reset_btn.setBackground(new java.awt.Color(255, 51, 51));
        reset_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        getContentPane().add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 100, 30));

        save_btn.setBackground(new java.awt.Color(0, 0, 255));
        save_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        save_btn.setText("Save");
        getContentPane().add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 570, 100, 30));

        centre_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        centre_lbl.setText("Centre");
        getContentPane().add(centre_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 80, 30));

        description_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        description_lbl.setText("Description");
        getContentPane().add(description_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 80, 30));

        description_tf.setColumns(20);
        description_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        description_tf.setRows(5);
        jScrollPane2.setViewportView(description_tf);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 410, 160));

        lecturer_combx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ..." }));
        getContentPane().add(lecturer_combx, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 330, 30));

        centre_combx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Kandy", "Kurunegala", "Gampaha" }));
        getContentPane().add(centre_combx, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 330, 30));

        background_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashan\\Desktop\\123\\oop-integration\\src\\Img\\7243-01-low-poly-background-16x9-1.jpg")); // NOI18N
        getContentPane().add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        CourseMain cm = new CourseMain();
        cm.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed

        StudentView ss = new StudentView();
        ss.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_home_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed

        clearAll();        
        JOptionPane.showMessageDialog(rootPane, "Successfully Cleared data !!");

    }//GEN-LAST:event_reset_btnActionPerformed
    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {
        modelNewC = ctrlNewC.addCourse(name_tf.getText(), duration_tf.getText(), fee_tf.getText(), lecturer_combx.getName(), centre_combx.getName());

        boolean result = ctrlNewC.insertCourse(modelNewC);
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "New course saved successfully", "Saved", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Failed to save", "Error", 0);
        }
    }                         

    private void lecturer_combxActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                                                                      

    private void centre_combxActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background_image;
    private javax.swing.JComboBox<String> centre_combx;
    private javax.swing.JLabel centre_lbl;
    private javax.swing.JLabel copyright_lbl;
    private javax.swing.JLabel description_lbl;
    private javax.swing.JTextArea description_tf;
    private javax.swing.JLabel duration_lbl;
    private javax.swing.JTextField duration_tf;
    private javax.swing.JLabel fee_lbl;
    private javax.swing.JTextField fee_tf;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> lecturer_combx;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_tf;
    private javax.swing.JLabel newCourse_lbl;
    private javax.swing.JLabel prerequisite_lbl;
    private javax.swing.JTextArea prerequisite_tf;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables
}
