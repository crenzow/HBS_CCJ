/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dbConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        singupLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        fnameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        phonenumberLBL = new javax.swing.JLabel();
        emailTXT = new javax.swing.JTextField();
        fnameTXT = new javax.swing.JTextField();
        phonenumberTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JPasswordField();
        singupBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        usernameLBL = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(10, 61, 98));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(245, 245, 220));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 220));
        jLabel2.setText("S");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singupLBL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        singupLBL.setText("SIGN UP");
        jPanel2.add(singupLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, -1));

        passwordLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLBL.setText("PASSWORD:");
        jPanel2.add(passwordLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        fnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fnameLBL.setText("FULL NAME:");
        jPanel2.add(fnameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        emailLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailLBL.setText("EMAIL:");
        jPanel2.add(emailLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        phonenumberLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phonenumberLBL.setText("PHONE NUMBER:");
        jPanel2.add(phonenumberLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        jPanel2.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 240, 30));

        fnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTXTActionPerformed(evt);
            }
        });
        jPanel2.add(fnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 240, 30));
        jPanel2.add(phonenumberTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 240, 30));

        passwordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTXTActionPerformed(evt);
            }
        });
        jPanel2.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 240, 30));

        singupBTN.setBackground(new java.awt.Color(10, 61, 98));
        singupBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        singupBTN.setForeground(new java.awt.Color(245, 245, 220));
        singupBTN.setText("SIGN UP");
        singupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupBTNActionPerformed(evt);
            }
        });
        jPanel2.add(singupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel2.add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        usernameLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLBL.setText("USERNAME:");
        jPanel2.add(usernameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));
        jPanel2.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 680, 430));

        jLabel3.setBackground(new java.awt.Color(245, 245, 220));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 220));
        jLabel3.setText("TAY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(245, 245, 220));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 220));
        jLabel4.setText("E");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel5.setBackground(new java.awt.Color(245, 245, 220));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 220));
        jLabel5.setText("ASE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void passwordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTXTActionPerformed

    private void singupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupBTNActionPerformed
        // TODO add your handling code here:
        // Get values from text fields
    String fullName = fnameTXT.getText();
    String phoneNumber = phonenumberTXT.getText();
    String email = emailTXT.getText();
    String username = usernameTXT.getText();
    String password = new String(passwordTXT.getPassword()); // Convert char array to String

    // Database connection
    Connection conn = DatabaseConnection.getInstance().getConnection();
    
    if (conn != null) {
        try {
            // Insert query
            String sql = "INSERT INTO customer (fullName, phoneNumber, email, username, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // Set values
            pstmt.setString(1, fullName);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, email);
            pstmt.setString(4, username);
            pstmt.setString(5, password);
            
            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                
                JOptionPane.showMessageDialog(this, "Signup Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Signup Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_singupBTNActionPerformed

    private void fnameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTXTActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JLabel fnameLBL;
    private javax.swing.JTextField fnameTXT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JLabel phonenumberLBL;
    private javax.swing.JTextField phonenumberTXT;
    private javax.swing.JButton singupBTN;
    private javax.swing.JLabel singupLBL;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
