/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import dbConnection.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Clarence
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginLBL = new javax.swing.JLabel();
        usernameLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        loginBTN = new javax.swing.JButton();
        passwordTXT = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stayeaseLBL3 = new javax.swing.JLabel();
        stayeaseLBL2 = new javax.swing.JLabel();
        stayeaseLBL = new javax.swing.JLabel();
        stayeaseLBL4 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 61, 98));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLBL.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLBL.setForeground(new java.awt.Color(10, 61, 98));
        loginLBL.setText("LOGIN");
        jPanel2.add(loginLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        usernameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLBL.setForeground(new java.awt.Color(10, 61, 98));
        usernameLBL.setText("USERNAME");
        jPanel2.add(usernameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        passwordLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLBL.setForeground(new java.awt.Color(10, 61, 98));
        passwordLBL.setText("PASSWORD");
        jPanel2.add(passwordLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel2.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 270, 30));

        loginBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginBTN.setText("LOGIN");
        loginBTN.setToolTipText("");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });
        jPanel2.add(loginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, 40));
        jPanel2.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 270, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-avatar.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(235, 235, 235));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(10, 61, 98));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel2.setForeground(new java.awt.Color(10, 61, 98));
        jLabel2.setText("SIGN IN");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, 20));

        jLabel5.setText("Don't have a account?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        stayeaseLBL3.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL3.setFont(new java.awt.Font("Serif", 3, 70)); // NOI18N
        stayeaseLBL3.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL3.setText("S");
        jPanel1.add(stayeaseLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 40, -1));

        stayeaseLBL2.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL2.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL2.setText("TAY ");
        jPanel1.add(stayeaseLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 90, 40));

        stayeaseLBL.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL.setFont(new java.awt.Font("Serif", 3, 70)); // NOI18N
        stayeaseLBL.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL.setText("E");
        jPanel1.add(stayeaseLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 60, -1));

        stayeaseLBL4.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL4.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL4.setText("ASE ");
        jPanel1.add(stayeaseLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         // TODO add your handling code here:
        // Action for checkbox, for example, show/hide password when checkbox is checked
    if (jCheckBox1.isSelected()) {
        // Show the password by changing the echoChar
        passwordTXT.setEchoChar((char) 0);  // Show the password in plain text
    } else {
        // Hide the password by setting the echoChar
        passwordTXT.setEchoChar('*');  // Hide the password with asterisks
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        // TODO add your handling code here:
        String username = usernameTXT.getText();
    String password = new String(passwordTXT.getPassword()); 

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Get the database connection from the DatabaseConnection class
        Connection conn = DatabaseConnection.getInstance().getConnection();

        // SQL Query
        String query = "SELECT 'admin' AS role FROM Admin WHERE username = ? AND password = ? " +
                       "UNION " +
                       "SELECT 'customer' AS role FROM Customer WHERE username = ? AND password = ?";
        
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, username);
        pst.setString(4, password);
        
        // Execute Query
        ResultSet rs = pst.executeQuery();

        // Process Result
        if (rs.next()) {
            String role = rs.getString("role");

            if (role.equals("admin")) {
               // JOptionPane.showMessageDialog(this, "Welcome Admin!");
                new Admin().setVisible(true); // Open Admin Dashboard
            } else {
               // JOptionPane.showMessageDialog(this, "Welcome Customer!");
                new User().setVisible(true); // Open User Dashboard
            }

            this.dispose(); // Close Login Window
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }

        // Close Connection
        rs.close();
        pst.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_loginBTNActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Signup signUpFrame = new Signup(); // Assuming SignUp is your frame class
        signUpFrame.setVisible(true); // Show the sign-up frame
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel loginLBL;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JLabel stayeaseLBL;
    private javax.swing.JLabel stayeaseLBL2;
    private javax.swing.JLabel stayeaseLBL3;
    private javax.swing.JLabel stayeaseLBL4;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
