/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.merge.Dashboard.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Dashboard_Quiz_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Quiz
     */
    private static final String DB_URL = "jdbc:mysql://localhost:3306/data-quiz";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    public Dashboard_Quiz_Admin() {
        initComponents();
        String username = "admin1";
        fetchDataFromDatabase(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        headerPanel = new javax.swing.JPanel();
        roleAdmin = new javax.swing.JLabel();
        nipAdmin = new javax.swing.JLabel();
        namaAdmin = new javax.swing.JLabel();
        WelcomeText = new javax.swing.JLabel();
        LogOutButton = new java.awt.Button();
        labelTambahRole = new javax.swing.JLabel();
        addMahasiswaPanel = new javax.swing.JPanel();
        addRoleMahasiswaLabel = new javax.swing.JLabel();
        addMahasiswaButton = new javax.swing.JButton();
        addMahasiswaPanel1 = new javax.swing.JPanel();
        addRoleDosenLabel = new javax.swing.JLabel();
        addDosenButton = new javax.swing.JButton();
        labelTambahRole1 = new javax.swing.JLabel();
        addMahasiswaPanel2 = new javax.swing.JPanel();
        addRoleDosenLabel1 = new javax.swing.JLabel();
        addDosenButton1 = new javax.swing.JButton();
        addMahasiswaPanel3 = new javax.swing.JPanel();
        addRoleMahasiswaLabel1 = new javax.swing.JLabel();
        addMahasiswaButton1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddMahasiswa");

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(1280, 720));
        jInternalFrame2.setVisible(true);

        headerPanel.setBackground(new java.awt.Color(0, 0, 153));

        roleAdmin.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        roleAdmin.setForeground(new java.awt.Color(255, 255, 255));
        roleAdmin.setText("Admin");

        nipAdmin.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        nipAdmin.setForeground(new java.awt.Color(255, 255, 255));
        nipAdmin.setText("nipAdmin");

        namaAdmin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        namaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        namaAdmin.setText("namaAdmin");

        WelcomeText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeText.setText("Selamat Datang Kembali,");

        LogOutButton.setBackground(new java.awt.Color(255, 0, 0));
        LogOutButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setLabel("LogOut");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nipAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(WelcomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WelcomeText)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaAdmin)
                    .addComponent(nipAdmin))
                .addGap(16, 16, 16)
                .addComponent(roleAdmin)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        labelTambahRole.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTambahRole.setText("Tambah Role");

        addMahasiswaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addRoleMahasiswaLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addRoleMahasiswaLabel.setText("Mahasiswa");

        addMahasiswaButton.setText("+");
        addMahasiswaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMahasiswaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addMahasiswaPanelLayout = new javax.swing.GroupLayout(addMahasiswaPanel);
        addMahasiswaPanel.setLayout(addMahasiswaPanelLayout);
        addMahasiswaPanelLayout.setHorizontalGroup(
            addMahasiswaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRoleMahasiswaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMahasiswaButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addMahasiswaPanelLayout.setVerticalGroup(
            addMahasiswaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addMahasiswaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoleMahasiswaLabel)
                    .addComponent(addMahasiswaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addMahasiswaPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addRoleDosenLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addRoleDosenLabel.setText("Dosen");

        addDosenButton.setText("+");
        addDosenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDosenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addMahasiswaPanel1Layout = new javax.swing.GroupLayout(addMahasiswaPanel1);
        addMahasiswaPanel1.setLayout(addMahasiswaPanel1Layout);
        addMahasiswaPanel1Layout.setHorizontalGroup(
            addMahasiswaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRoleDosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addDosenButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addMahasiswaPanel1Layout.setVerticalGroup(
            addMahasiswaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addMahasiswaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoleDosenLabel)
                    .addComponent(addDosenButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTambahRole1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTambahRole1.setText("Data");

        addMahasiswaPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addRoleDosenLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addRoleDosenLabel1.setText("Dosen");

        addDosenButton1.setText(">");
        addDosenButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDosenButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addMahasiswaPanel2Layout = new javax.swing.GroupLayout(addMahasiswaPanel2);
        addMahasiswaPanel2.setLayout(addMahasiswaPanel2Layout);
        addMahasiswaPanel2Layout.setHorizontalGroup(
            addMahasiswaPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRoleDosenLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addDosenButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addMahasiswaPanel2Layout.setVerticalGroup(
            addMahasiswaPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addMahasiswaPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoleDosenLabel1)
                    .addComponent(addDosenButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addMahasiswaPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addRoleMahasiswaLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addRoleMahasiswaLabel1.setText("Mahasiswa");

        addMahasiswaButton1.setText(">");
        addMahasiswaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMahasiswaButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addMahasiswaPanel3Layout = new javax.swing.GroupLayout(addMahasiswaPanel3);
        addMahasiswaPanel3.setLayout(addMahasiswaPanel3Layout);
        addMahasiswaPanel3Layout.setHorizontalGroup(
            addMahasiswaPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRoleMahasiswaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMahasiswaButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addMahasiswaPanel3Layout.setVerticalGroup(
            addMahasiswaPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMahasiswaPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addMahasiswaPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoleMahasiswaLabel1)
                    .addComponent(addMahasiswaButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTambahRole1)
                    .addComponent(labelTambahRole)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(addMahasiswaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMahasiswaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(addMahasiswaPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMahasiswaPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTambahRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMahasiswaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMahasiswaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTambahRole1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMahasiswaPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMahasiswaPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMahasiswaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMahasiswaButtonActionPerformed
        // TODO add your handling code here:
        addMahasiswa am = new addMahasiswa();
        am.show();
        dispose();
    }//GEN-LAST:event_addMahasiswaButtonActionPerformed

    private void addDosenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDosenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDosenButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void addDosenButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDosenButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDosenButton1ActionPerformed

    private void addMahasiswaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMahasiswaButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMahasiswaButton1ActionPerformed

    private void fetchDataFromDatabase(String username) {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare the SQL query
            String query = "SELECT * FROM `data-admin` WHERE usernameAdmin = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);

                // Execute the query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve data from the result set and populate your GUI components
                        String adminName = resultSet.getString("namaAdmin");
                        String nip = resultSet.getString("nipAdmin");
                        

                        // Populate the GUI components
                        namaAdmin.setText(adminName);
                        nipAdmin.setText(nip);
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "tidak ada data tersedia");
                    }
                }
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

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
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Quiz_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button LogOutButton;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JButton addDosenButton;
    private javax.swing.JButton addDosenButton1;
    private javax.swing.JButton addMahasiswaButton;
    private javax.swing.JButton addMahasiswaButton1;
    private javax.swing.JPanel addMahasiswaPanel;
    private javax.swing.JPanel addMahasiswaPanel1;
    private javax.swing.JPanel addMahasiswaPanel2;
    private javax.swing.JPanel addMahasiswaPanel3;
    private javax.swing.JLabel addRoleDosenLabel;
    private javax.swing.JLabel addRoleDosenLabel1;
    private javax.swing.JLabel addRoleMahasiswaLabel;
    private javax.swing.JLabel addRoleMahasiswaLabel1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel labelTambahRole;
    private javax.swing.JLabel labelTambahRole1;
    private javax.swing.JLabel namaAdmin;
    private javax.swing.JLabel nipAdmin;
    private javax.swing.JLabel roleAdmin;
    // End of variables declaration//GEN-END:variables
}
