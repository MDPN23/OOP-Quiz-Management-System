/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.merge.Dashboard.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pkgfinal.merge.login.Login;

/**
 *
 * @author Lenovo
 */
public class Dashboard_Quiz_Student extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Quiz
     */
    
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/data-quiz";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private PreparedStatement preparedStatement;
    //private String ListNotif;
    
    public Dashboard_Quiz_Student(){
        initComponents();
        ListQuiz();
        fetchDataFromDatabase("reswa");
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
        ListNotif = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListQuiz = new javax.swing.JList<>();
        BackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelQuizMahasiswa = new javax.swing.JLabel();
        quiz1 = new javax.swing.JPanel();
        mulaiQuiz1 = new javax.swing.JButton();
        judulQuiz1 = new javax.swing.JLabel();
        quiz2 = new javax.swing.JPanel();
        mulaiQuiz2 = new javax.swing.JButton();
        judulQuiz2 = new javax.swing.JLabel();
        quiz3 = new javax.swing.JPanel();
        mulaiQuiz3 = new javax.swing.JButton();
        judulQuiz4 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        Edit = new java.awt.Button();
        roleMahasiswa = new javax.swing.JLabel();
        nimMahasiswa = new javax.swing.JLabel();
        namaMahasiswa = new javax.swing.JLabel();
        WelcomeText = new javax.swing.JLabel();
        LogOutButton = new java.awt.Button();
        NotifButton = new javax.swing.JButton();

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

        ListNotif.setMinimumSize(new java.awt.Dimension(404, 222));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));

        ListQuiz.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListQuiz);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deadline Quiz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackButton)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout ListNotifLayout = new javax.swing.GroupLayout(ListNotif.getContentPane());
        ListNotif.getContentPane().setLayout(ListNotifLayout);
        ListNotifLayout.setHorizontalGroup(
            ListNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ListNotifLayout.setVerticalGroup(
            ListNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(845, 494));

        labelQuizMahasiswa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelQuizMahasiswa.setText("Quiz Saat Ini");

        quiz1.setBackground(new java.awt.Color(255, 255, 255));

        mulaiQuiz1.setText("Mulai Quiz");
        mulaiQuiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiQuiz1ActionPerformed(evt);
            }
        });

        judulQuiz1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz1.setText("judulQuiz1");

        javax.swing.GroupLayout quiz1Layout = new javax.swing.GroupLayout(quiz1);
        quiz1.setLayout(quiz1Layout);
        quiz1Layout.setHorizontalGroup(
            quiz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quiz1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mulaiQuiz1)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(judulQuiz1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quiz1Layout.setVerticalGroup(
            quiz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(judulQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mulaiQuiz1)
                .addGap(9, 9, 9))
        );

        quiz2.setBackground(new java.awt.Color(255, 255, 255));

        mulaiQuiz2.setText("Mulai Quiz");
        mulaiQuiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiQuiz2ActionPerformed(evt);
            }
        });

        judulQuiz2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz2.setText("judulQuiz2");

        javax.swing.GroupLayout quiz2Layout = new javax.swing.GroupLayout(quiz2);
        quiz2.setLayout(quiz2Layout);
        quiz2Layout.setHorizontalGroup(
            quiz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quiz2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mulaiQuiz2)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(judulQuiz2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quiz2Layout.setVerticalGroup(
            quiz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judulQuiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mulaiQuiz2)
                .addGap(9, 9, 9))
        );

        quiz3.setBackground(new java.awt.Color(255, 255, 255));

        mulaiQuiz3.setText("Mulai Quiz");
        mulaiQuiz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiQuiz3ActionPerformed(evt);
            }
        });

        judulQuiz4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz4.setText("judulQuiz3");

        javax.swing.GroupLayout quiz3Layout = new javax.swing.GroupLayout(quiz3);
        quiz3.setLayout(quiz3Layout);
        quiz3Layout.setHorizontalGroup(
            quiz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quiz3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mulaiQuiz3)
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(judulQuiz4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quiz3Layout.setVerticalGroup(
            quiz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judulQuiz4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mulaiQuiz3)
                .addGap(9, 9, 9))
        );

        headerPanel.setBackground(new java.awt.Color(0, 0, 153));

        Edit.setBackground(new java.awt.Color(204, 204, 204));
        Edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Edit.setForeground(new java.awt.Color(0, 0, 153));
        Edit.setLabel("Edit Profile\n");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        roleMahasiswa.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        roleMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        roleMahasiswa.setText("Mahasiswa");

        nimMahasiswa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        nimMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        nimMahasiswa.setText("nimMahasiswa");

        namaMahasiswa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        namaMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        namaMahasiswa.setText("namaMahasiswa");

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

        NotifButton.setText("Notifikasi");
        NotifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifButtonActionPerformed(evt);
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
                            .addComponent(namaMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleMahasiswa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nimMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(WelcomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NotifButton)
                        .addGap(26, 26, 26)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WelcomeText)
                        .addComponent(NotifButton))
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaMahasiswa)
                    .addComponent(nimMahasiswa))
                .addGap(16, 16, 16)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleMahasiswa)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quiz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quiz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quiz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelQuizMahasiswa))
                .addContainerGap(212, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelQuizMahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quiz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quiz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        Profile_Mahasiswa pm = new Profile_Mahasiswa();
        pm.show();
        dispose();
    }//GEN-LAST:event_EditActionPerformed

    private void mulaiQuiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiQuiz1ActionPerformed
        // TODO add your handling code here:
        int id = 1;
        Soal s1 = new Soal(id);
        s1.show();
        dispose();
    }//GEN-LAST:event_mulaiQuiz1ActionPerformed

    private void mulaiQuiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiQuiz2ActionPerformed
        // TODO add your handling code here:
        int id = 2;
        Soal s1 = new Soal(id);
        s1.show();
        dispose();
    }//GEN-LAST:event_mulaiQuiz2ActionPerformed

    private void mulaiQuiz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiQuiz3ActionPerformed
        // TODO add your handling code here:
        int id = 3;
        Soal s1 = new Soal(id);
        s1.show();
        dispose();
    }//GEN-LAST:event_mulaiQuiz3ActionPerformed

    private void NotifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifButtonActionPerformed
       ListNotif.setVisible(true);
    }//GEN-LAST:event_NotifButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       ListNotif.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed
     
    private void ListQuiz(){
        try{
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         String query = "SELECT * FROM `data-quiz`";
         PreparedStatement ps = connection.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         
//         ps.executeUpdate();
         
         DefaultListModel<String> listModel = new DefaultListModel<>();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String nama = rs.getString("nama");
            String batasWaktu = rs.getString("batasWaktu");
            String waktuQuiz = rs.getString("waktuQuiz");
            String hasil = nama + "  " + batasWaktu + "   " + waktuQuiz + "" + id;
            listModel.addElement(hasil);
        }

        ListQuiz.setModel(listModel);

        ListQuiz.addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int selectedId = ListQuiz.getSelectedIndex();
                selectedId++;
                if (selectedId >= 0) {
                    Soal sl = new Soal(selectedId);
                    sl.setVisible(true);
                }
            }
        }
        });
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private void fetchDataFromDatabase(String username) {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare the SQL query
            String query = "SELECT * FROM `data-mahasiswa` WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                

                // Execute the query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve data from the result set and populate your GUI components
                        String studentName = resultSet.getString("nama");
                        int nim = resultSet.getInt("nim");
                        // Populate the GUI components
                        namaMahasiswa.setText(studentName);
                        nimMahasiswa.setText(String.valueOf(nim));
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
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Quiz_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private java.awt.Button Edit;
    private javax.swing.JDialog ListNotif;
    private javax.swing.JList<String> ListQuiz;
    private java.awt.Button LogOutButton;
    private javax.swing.JButton NotifButton;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judulQuiz1;
    private javax.swing.JLabel judulQuiz2;
    private javax.swing.JLabel judulQuiz4;
    private javax.swing.JLabel labelQuizMahasiswa;
    private javax.swing.JButton mulaiQuiz1;
    private javax.swing.JButton mulaiQuiz2;
    private javax.swing.JButton mulaiQuiz3;
    private javax.swing.JLabel namaMahasiswa;
    private javax.swing.JLabel nimMahasiswa;
    private javax.swing.JPanel quiz1;
    private javax.swing.JPanel quiz2;
    private javax.swing.JPanel quiz3;
    private javax.swing.JLabel roleMahasiswa;
    // End of variables declaration//GEN-END:variables

//    private void listNotif() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private static class preparedStatement {

        public preparedStatement() {
        }

        private ResultSet executeQuery() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
