package Views;

import Controller.StudentController;
import javax.swing.JOptionPane;
import Model.Student;

public class StudentEdit extends javax.swing.JFrame {

    StudentController stcon;
    Student st;

    public StudentEdit() {
        initComponents();

        stcon = new StudentController();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nic_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        age_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        male_radio = new javax.swing.JRadioButton();
        female_radio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_tf = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        studentid_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel2.setText(" Copyright © 2021 Team-A4F  All Rights Reserved.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 350, 30));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Full Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, 30));

        name_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 350, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("NIC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, 30));

        nic_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nic_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 210, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("V");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 20, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 80, 30));

        age_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(age_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 80, 30));

        phone_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_tfActionPerformed(evt);
            }
        });
        getContentPane().add(phone_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("E-mail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 80, 30));

        email_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 350, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 80, 30));

        male_radio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male_radio.setSelected(true);
        male_radio.setText("Male");
        male_radio.setOpaque(false);
        male_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_radioActionPerformed(evt);
            }
        });
        getContentPane().add(male_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, 30));

        female_radio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        female_radio.setText("Female");
        female_radio.setOpaque(false);
        female_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_radioActionPerformed(evt);
            }
        });
        getContentPane().add(female_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, 30));

        address_tf.setColumns(20);
        address_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address_tf.setRows(5);
        jScrollPane1.setViewportView(address_tf);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 410, 200));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 80, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 120, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Student ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 30));

        studentid_tf.setEditable(false);
        studentid_tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(studentid_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Edit Student");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 270, 40));

        jLabel1.setForeground(new java.awt.Color(217, 83, 79));
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

    private void phone_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_tfActionPerformed

    private void male_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_radioActionPerformed

        if (female_radio.isSelected()) {
            female_radio.setSelected(false);
        }
    }//GEN-LAST:event_male_radioActionPerformed

    private void female_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_radioActionPerformed
        if (male_radio.isSelected()) {

            male_radio.setSelected(false);

        }
    }//GEN-LAST:event_female_radioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String name = name_tf.getText();
        String age = age_tf.getText();
        String nic = nic_tf.getText();
        String address = address_tf.getText();
        String email = email_tf.getText();
        String phone = phone_tf.getText();
        boolean condition = true;
        String regexStr = "^[0-9]*$";
        String gender;

        if (name.length() == 0) {
            condition = false;
        } else if (!(age_tf.getText().toString().trim().matches(regexStr))) {
            condition = false;
        } else if (!(phone_tf.getText().toString().trim().matches(regexStr)) || phone.length() != 10) {
            condition = false;
        } else if (nic.length() != 9 || !(nic_tf.getText().toString().trim().matches(regexStr))) {
            condition = false;
        } else if (email.length() == 0) {
            condition = false;
        } else if (address.length() == 0) {
            condition = false;
        }

        if (male_radio.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }

        if (condition) {

            st = stcon.addStudentEnquiry(name, nic, phone, age, email, gender, address);
            boolean result = stcon.updateStudent(st , studentid_tf.getText());
            if (result) {
                JOptionPane.showMessageDialog(null, "Successful", "Successfully added", JOptionPane.PLAIN_MESSAGE);
                StudentMain stm = new StudentMain();
                stm.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Failed to add", JOptionPane.PLAIN_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Invalid Entry !! , Please try again. ");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea address_tf;
    public javax.swing.JTextField age_tf;
    public javax.swing.JTextField email_tf;
    public javax.swing.JRadioButton female_radio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JRadioButton male_radio;
    public javax.swing.JTextField name_tf;
    public javax.swing.JTextField nic_tf;
    public javax.swing.JTextField phone_tf;
    public javax.swing.JTextField studentid_tf;
    // End of variables declaration//GEN-END:variables
}
