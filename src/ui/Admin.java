/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author JESSEN SALAYSAY
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logoutBTN = new javax.swing.JButton();
        logoLBL = new javax.swing.JLabel();
        dashboardBTN = new javax.swing.JButton();
        roomsBTN = new javax.swing.JButton();
        bookingBTN = new javax.swing.JButton();
        reportsBTN = new javax.swing.JButton();
        customersBTN = new javax.swing.JButton();
        JTabbedPane = new javax.swing.JTabbedPane();
        dashboardPNL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        roomsPNL = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bookingsPNL = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reportsPNL = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        customersPNL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 61, 98));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutBTN.setText("LOGOUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });
        jPanel2.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 150, 40));

        logoLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200whiteLOGO.png"))); // NOI18N
        jPanel2.add(logoLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        dashboardBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardBTN.setText("DASHBOARD");
        dashboardBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBTNActionPerformed(evt);
            }
        });
        jPanel2.add(dashboardBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 40));

        roomsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roomsBTN.setText("ROOMS");
        roomsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(roomsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 40));

        bookingBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookingBTN.setText("BOOKING");
        bookingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingBTNActionPerformed(evt);
            }
        });
        jPanel2.add(bookingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 40));

        reportsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportsBTN.setText("REPORTS");
        reportsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(reportsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, 40));

        customersBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customersBTN.setText("CUSTOMERS");
        customersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersBTNActionPerformed(evt);
            }
        });
        jPanel2.add(customersBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        dashboardPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DASHBOARD");
        dashboardPNL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        JTabbedPane.addTab("DASHBOARD", dashboardPNL);

        roomsPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("ROOMS");
        roomsPNL.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        JTabbedPane.addTab("ROOMS", roomsPNL);

        bookingsPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("BOOKINGS");
        bookingsPNL.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        JTabbedPane.addTab("BOOKING", bookingsPNL);

        reportsPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("REPORTS");
        reportsPNL.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        JTabbedPane.addTab("REPORTS", reportsPNL);

        customersPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CUSTOMERS");
        customersPNL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        JTabbedPane.addTab("CUSTOMERS", customersPNL);

        getContentPane().add(JTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -30, 940, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        Load loadFrame = new Load();
        this.setVisible(false);
        loadFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void dashboardBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBTNActionPerformed
        JTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardBTNActionPerformed

    private void roomsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsBTNActionPerformed
        JTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_roomsBTNActionPerformed

    private void bookingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingBTNActionPerformed
        JTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_bookingBTNActionPerformed

    private void reportsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsBTNActionPerformed
        JTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_reportsBTNActionPerformed

    private void customersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersBTNActionPerformed
        JTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_customersBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton bookingBTN;
    private javax.swing.JPanel bookingsPNL;
    private javax.swing.JButton customersBTN;
    private javax.swing.JPanel customersPNL;
    private javax.swing.JButton dashboardBTN;
    private javax.swing.JPanel dashboardPNL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton reportsBTN;
    private javax.swing.JPanel reportsPNL;
    private javax.swing.JButton roomsBTN;
    private javax.swing.JPanel roomsPNL;
    // End of variables declaration//GEN-END:variables
}
