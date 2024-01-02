/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.merge.Dashboard.Lecturer;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pkgfinal.merge.login.Login;

/**
 *
 * @author Lenovo
 */
public class Dashboard_Quiz_Lecturer extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Quiz
     */
    public Dashboard_Quiz_Lecturer() {
        initComponents();
        String usernameDosen = "dosengeorge";
        fetchDataFromDatabase(usernameDosen);
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
        headerPanel = new javax.swing.JPanel();
        Edit = new java.awt.Button();
        roleDosen = new javax.swing.JLabel();
        nipDosen = new javax.swing.JLabel();
        namaDosen = new javax.swing.JLabel();
        WelcomeText = new javax.swing.JLabel();
        LogOutButton = new java.awt.Button();
        labelQuizDosen = new javax.swing.JLabel();
        quiz1 = new javax.swing.JPanel();
        editQuiz1 = new javax.swing.JButton();
        judulQuiz1 = new javax.swing.JLabel();
        nilaiMahasiswaHeader = new javax.swing.JLabel();
        NilaiMahasiswa1 = new javax.swing.JPanel();
        lihatNilai1 = new javax.swing.JButton();
        labelNilaiQuiz1 = new javax.swing.JLabel();
        NilaiMahasiswa2 = new javax.swing.JPanel();
        lihatNilai2 = new javax.swing.JButton();
        labelNilaiQuiz2 = new javax.swing.JLabel();
        NilaiMahasiswa3 = new javax.swing.JPanel();
        lihatNilai3 = new javax.swing.JButton();
        labelNilaiQuiz3 = new javax.swing.JLabel();
        quiz2 = new javax.swing.JPanel();
        editQuiz4 = new javax.swing.JButton();
        judulQuiz2 = new javax.swing.JLabel();
        quiz3 = new javax.swing.JPanel();
        editQuiz5 = new javax.swing.JButton();
        judulQuiz3 = new javax.swing.JLabel();
        quiz4 = new javax.swing.JPanel();
        makeQuiz = new javax.swing.JLabel();
        buatQuiz = new javax.swing.JButton();

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
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(828, 612));

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

        roleDosen.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        roleDosen.setForeground(new java.awt.Color(255, 255, 255));
        roleDosen.setText("Dosen");

        nipDosen.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        nipDosen.setForeground(new java.awt.Color(255, 255, 255));
        nipDosen.setText("nipDosen");

        namaDosen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        namaDosen.setForeground(new java.awt.Color(255, 255, 255));
        namaDosen.setText("namaDosen");

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
                            .addComponent(namaDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleDosen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nipDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(WelcomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(namaDosen)
                    .addComponent(nipDosen))
                .addGap(16, 16, 16)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleDosen)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        labelQuizDosen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelQuizDosen.setText("Quiz Saat Ini");

        quiz1.setBackground(new java.awt.Color(255, 255, 255));

        editQuiz1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        editQuiz1.setText("Edit");

        judulQuiz1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz1.setText("judulQuiz1");

        javax.swing.GroupLayout quiz1Layout = new javax.swing.GroupLayout(quiz1);
        quiz1.setLayout(quiz1Layout);
        quiz1Layout.setHorizontalGroup(
            quiz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(editQuiz1)
                .addGap(59, 59, 59))
        );
        quiz1Layout.setVerticalGroup(
            quiz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(judulQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editQuiz1)
                .addGap(9, 9, 9))
        );

        nilaiMahasiswaHeader.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nilaiMahasiswaHeader.setText("Nilai Mahasiswa");

        NilaiMahasiswa1.setBackground(new java.awt.Color(255, 255, 255));

        lihatNilai1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lihatNilai1.setText("Lihat Nilai");

        labelNilaiQuiz1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNilaiQuiz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNilaiQuiz1.setText("judulQuiz1");

        javax.swing.GroupLayout NilaiMahasiswa1Layout = new javax.swing.GroupLayout(NilaiMahasiswa1);
        NilaiMahasiswa1.setLayout(NilaiMahasiswa1Layout);
        NilaiMahasiswa1Layout.setHorizontalGroup(
            NilaiMahasiswa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NilaiMahasiswa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatNilai1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(labelNilaiQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NilaiMahasiswa1Layout.setVerticalGroup(
            NilaiMahasiswa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NilaiMahasiswa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNilaiQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lihatNilai1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        NilaiMahasiswa2.setBackground(new java.awt.Color(255, 255, 255));

        lihatNilai2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lihatNilai2.setText("Lihat Nilai");

        labelNilaiQuiz2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNilaiQuiz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNilaiQuiz2.setText("judulQuiz2");

        javax.swing.GroupLayout NilaiMahasiswa2Layout = new javax.swing.GroupLayout(NilaiMahasiswa2);
        NilaiMahasiswa2.setLayout(NilaiMahasiswa2Layout);
        NilaiMahasiswa2Layout.setHorizontalGroup(
            NilaiMahasiswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NilaiMahasiswa2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatNilai2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(labelNilaiQuiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NilaiMahasiswa2Layout.setVerticalGroup(
            NilaiMahasiswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NilaiMahasiswa2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNilaiQuiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lihatNilai2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        NilaiMahasiswa3.setBackground(new java.awt.Color(255, 255, 255));

        lihatNilai3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lihatNilai3.setText("Lihat Nilai");

        labelNilaiQuiz3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNilaiQuiz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNilaiQuiz3.setText("judulQuiz3");

        javax.swing.GroupLayout NilaiMahasiswa3Layout = new javax.swing.GroupLayout(NilaiMahasiswa3);
        NilaiMahasiswa3.setLayout(NilaiMahasiswa3Layout);
        NilaiMahasiswa3Layout.setHorizontalGroup(
            NilaiMahasiswa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NilaiMahasiswa3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatNilai3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(labelNilaiQuiz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NilaiMahasiswa3Layout.setVerticalGroup(
            NilaiMahasiswa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NilaiMahasiswa3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNilaiQuiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lihatNilai3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        quiz2.setBackground(new java.awt.Color(255, 255, 255));

        editQuiz4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        editQuiz4.setText("Edit");

        judulQuiz2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz2.setText("judulQuiz2");

        javax.swing.GroupLayout quiz2Layout = new javax.swing.GroupLayout(quiz2);
        quiz2.setLayout(quiz2Layout);
        quiz2Layout.setHorizontalGroup(
            quiz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(editQuiz4)
                .addGap(59, 59, 59))
            .addComponent(judulQuiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quiz2Layout.setVerticalGroup(
            quiz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz2Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(judulQuiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editQuiz4)
                .addGap(9, 9, 9))
        );

        quiz3.setBackground(new java.awt.Color(255, 255, 255));

        editQuiz5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        editQuiz5.setText("Edit");

        judulQuiz3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        judulQuiz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulQuiz3.setText("judulQuiz3");

        javax.swing.GroupLayout quiz3Layout = new javax.swing.GroupLayout(quiz3);
        quiz3.setLayout(quiz3Layout);
        quiz3Layout.setHorizontalGroup(
            quiz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulQuiz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(editQuiz5)
                .addGap(49, 49, 49))
        );
        quiz3Layout.setVerticalGroup(
            quiz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judulQuiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editQuiz5)
                .addGap(9, 9, 9))
        );

        quiz4.setBackground(new java.awt.Color(255, 255, 255));

        makeQuiz.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        makeQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        makeQuiz.setText("buat Quiz");

        buatQuiz.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        buatQuiz.setText("Buat Quiz Baru");
        buatQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatQuizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quiz4Layout = new javax.swing.GroupLayout(quiz4);
        quiz4.setLayout(quiz4Layout);
        quiz4Layout.setHorizontalGroup(
            quiz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(makeQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buatQuiz)
                .addGap(20, 20, 20))
        );
        quiz4Layout.setVerticalGroup(
            quiz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quiz4Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(makeQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buatQuiz)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nilaiMahasiswaHeader)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quiz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quiz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quiz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quiz4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelQuizDosen)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NilaiMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NilaiMahasiswa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NilaiMahasiswa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelQuizDosen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quiz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quiz4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quiz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(nilaiMahasiswaHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NilaiMahasiswa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NilaiMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NilaiMahasiswa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        Profile_Lecturer pl = new Profile_Lecturer();
        pl.show();
        dispose();
    }//GEN-LAST:event_EditActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void buatQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatQuizActionPerformed
        TambahQuiz tq = new TambahQuiz();
        tq.show();
        dispose();
    }//GEN-LAST:event_buatQuizActionPerformed
    
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/data-quiz";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    
    
        
    private void fetchDataFromDatabase(String usernameDosen) {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare the SQL query
            String query = "SELECT * FROM `data-dosen` WHERE usernameDosen = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, usernameDosen);
                

                // Execute the query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve data from the result set and populate your GUI components
                        String dosenName = resultSet.getString("namaDosen");
                        int nip = resultSet.getInt("nipDosen");
                        // Populate the GUI components
                        namaDosen.setText(dosenName);
                        nipDosen.setText(String.valueOf(nip));
                    } else {
                        JOptionPane.showMessageDialog(this, "tidak ada data tersedia");
                    }
                }
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error executing SQL query:");
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
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Quiz_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Dashboard_Quiz_Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Edit;
    private java.awt.Button LogOutButton;
    private javax.swing.JPanel NilaiMahasiswa1;
    private javax.swing.JPanel NilaiMahasiswa2;
    private javax.swing.JPanel NilaiMahasiswa3;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JButton buatQuiz;
    private javax.swing.JButton editQuiz1;
    private javax.swing.JButton editQuiz4;
    private javax.swing.JButton editQuiz5;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel judulQuiz1;
    private javax.swing.JLabel judulQuiz2;
    private javax.swing.JLabel judulQuiz3;
    private javax.swing.JLabel labelNilaiQuiz1;
    private javax.swing.JLabel labelNilaiQuiz2;
    private javax.swing.JLabel labelNilaiQuiz3;
    private javax.swing.JLabel labelQuizDosen;
    private javax.swing.JButton lihatNilai1;
    private javax.swing.JButton lihatNilai2;
    private javax.swing.JButton lihatNilai3;
    private javax.swing.JLabel makeQuiz;
    private javax.swing.JLabel namaDosen;
    private javax.swing.JLabel nilaiMahasiswaHeader;
    private javax.swing.JLabel nipDosen;
    private javax.swing.JPanel quiz1;
    private javax.swing.JPanel quiz2;
    private javax.swing.JPanel quiz3;
    private javax.swing.JPanel quiz4;
    private javax.swing.JLabel roleDosen;
    // End of variables declaration//GEN-END:variables
}
