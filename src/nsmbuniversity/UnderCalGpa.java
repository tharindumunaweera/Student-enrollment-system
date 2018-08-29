/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nsmbuniversity;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tharindu dilshan
 */
public class UnderCalGpa extends javax.swing.JFrame {

    /**
     * Creates new form UnderCalGpa
     */
    public UnderCalGpa() {
        initComponents();
    }
    
    void calResult(){
        String mainSub1="0"; String mainSub2="0"; String sub1="0"; String sub2="0";
        String sub3="0"; String sub4="0";
        
        if("A+".equals(txtMainSub1Res.getText())){
            mainSub1="4.25";
        }
        else if("A".equals(txtMainSub1Res.getText())){
            mainSub1="4";
        }
        else if("A-".equals(txtMainSub1Res.getText())){
            mainSub1="3.75";
        }
        else if("B+".equals(txtMainSub1Res.getText())){
            mainSub1="3.25";
        }
        else if("B".equals(txtMainSub1Res.getText())){
            mainSub1="3";
        }
        else if("B-".equals(txtMainSub1Res.getText())){
            mainSub1="2.75";
        }
        else if("C+".equals(txtMainSub1Res.getText())){
            mainSub1="2.25";
        }
        else if("C".equals(txtMainSub1Res.getText())){
            mainSub1="2";
        }
        else if("C-".equals(txtMainSub1Res.getText())){
            mainSub1="1.75";
        }
        else if("D+".equals(txtMainSub1Res.getText())){
            mainSub1="1.25";
        }
        else if("D".equals(txtMainSub1Res.getText())){
            mainSub1="1";
        }
        else if("D-".equals(txtMainSub1Res.getText())){
            mainSub1="O.75";
        }
        else if("E".equals(txtMainSub1Res.getText())){
            mainSub1="0";
        }
        else if("F".equals(txtMainSub1Res.getText())){
            mainSub1="0";
        }
        
        
        if("A+".equals(txtMainSub2Res.getText())){
            mainSub2="4.25";
        }
        else if("A".equals(txtMainSub2Res.getText())){
            mainSub2="4";
        }
        else if("A-".equals(txtMainSub2Res.getText())){
            mainSub2="3.75";
        }
        else if("B+".equals(txtMainSub2Res.getText())){
            mainSub2="3.25";
        }
        else if("B".equals(txtMainSub2Res.getText())){
            mainSub2="3";
        }
        else if("B-".equals(txtMainSub2Res.getText())){
            mainSub2="2.75";
        }
        else if("C+".equals(txtMainSub2Res.getText())){
            mainSub2="2.25";
        }
        else if("C".equals(txtMainSub2Res.getText())){
            mainSub2="2";
        }
        else if("C-".equals(txtMainSub2Res.getText())){
            mainSub2="1.75";
        }
        else if("D+".equals(txtMainSub2Res.getText())){
            mainSub2="1.25";
        }
        else if("D".equals(txtMainSub2Res.getText())){
            mainSub2="1";
        }
        else if("D-".equals(txtMainSub2Res.getText())){
            mainSub2="O.75";
        }
        else if("E".equals(txtMainSub2Res.getText())){
            mainSub2="0";
        }
        else if("F".equals(txtMainSub2Res.getText())){
            mainSub2="0";
        }
        
        
        if("A+".equals(txtSub1Res.getText())){
            sub1="4.25";
        }
        else if("A".equals(txtSub1Res.getText())){
            sub1="4";
        }
        else if("A-".equals(txtSub1Res.getText())){
            sub1="3.75";
        }
        else if("B+".equals(txtSub1Res.getText())){
            sub1="3.25";
        }
        else if("B".equals(txtSub1Res.getText())){
            sub1="3";
        }
        else if("B-".equals(txtSub1Res.getText())){
            sub1="2.75";
        }
        else if("C+".equals(txtSub1Res.getText())){
            sub1="2.25";
        }
        else if("C".equals(txtSub1Res.getText())){
            sub1="2";
        }
        else if("C-".equals(txtSub1Res.getText())){
            sub1="1.75";
        }
        else if("D+".equals(txtSub1Res.getText())){
            sub1="1.25";
        }
        else if("D".equals(txtSub1Res.getText())){
            sub1="1";
        }
        else if("D-".equals(txtSub1Res.getText())){
            sub1="O.75";
        }
        else if("E".equals(txtSub1Res.getText())){
            sub1="0";
        }
        else if("F".equals(txtSub1Res.getText())){
            sub1="0";
        }
        
        
        
        if("A+".equals(txtSub2Res.getText())){
            sub2="4.25";
        }
        else if("A".equals(txtSub2Res.getText())){
            sub2="4";
        }
        else if("A-".equals(txtSub2Res.getText())){
            sub2="3.75";
        }
        else if("B+".equals(txtSub2Res.getText())){
            sub2="3.25";
        }
        else if("B".equals(txtSub2Res.getText())){
            sub2="3";
        }
        else if("B-".equals(txtSub2Res.getText())){
            sub2="2.75";
        }
        else if("C+".equals(txtSub2Res.getText())){
            sub2="2.25";
        }
        else if("C".equals(txtSub2Res.getText())){
            sub2="2";
        }
        else if("C-".equals(txtSub2Res.getText())){
            sub2="1.75";
        }
        else if("D+".equals(txtSub2Res.getText())){
            sub2="1.25";
        }
        else if("D".equals(txtSub2Res.getText())){
            sub2="1";
        }
        else if("D-".equals(txtSub2Res.getText())){
            sub2="O.75";
        }
        else if("E".equals(txtSub2Res.getText())){
            sub2="0";
        }
        else if("F".equals(txtSub2Res.getText())){
            sub2="0";
        }
        
        
        if("A+".equals(txtSub3Res.getText())){
            sub3="4.25";
        }
        else if("A".equals(txtSub3Res.getText())){
            sub3="4";
        }
        else if("A-".equals(txtSub3Res.getText())){
            sub3="3.75";
        }
        else if("B+".equals(txtSub3Res.getText())){
            sub3="3.25";
        }
        else if("B".equals(txtSub3Res.getText())){
            sub3="3";
        }
        else if("B-".equals(txtSub3Res.getText())){
            sub3="2.75";
        }
        else if("C+".equals(txtSub3Res.getText())){
            sub3="2.25";
        }
        else if("C".equals(txtSub3Res.getText())){
            sub3="2";
        }
        else if("C-".equals(txtSub3Res.getText())){
            sub3="1.75";
        }
        else if("D+".equals(txtSub3Res.getText())){
            sub3="1.25";
        }
        else if("D".equals(txtSub3Res.getText())){
            sub3="1";
        }
        else if("D-".equals(txtSub3Res.getText())){
            sub3="O.75";
        }
        else if("E".equals(txtSub3Res.getText())){
            sub3="0";
        }
        else if("F".equals(txtSub3Res.getText())){
            sub3="0";
        }
        
        
        if("A+".equals(txtSub4Res.getText())){
            sub4="4.25";
        }
        else if("A".equals(txtSub4Res.getText())){
            sub4="4";
        }
        else if("A-".equals(txtSub4Res.getText())){
            sub4="3.75";
        }
        else if("B+".equals(txtSub4Res.getText())){
            sub4="3.25";
        }
        else if("B".equals(txtSub4Res.getText())){
            sub4="3";
        }
        else if("B-".equals(txtSub4Res.getText())){
            sub4="2.75";
        }
        else if("C+".equals(txtSub4Res.getText())){
            sub4="2.25";
        }
        else if("C".equals(txtSub4Res.getText())){
            sub4="2";
        }
        else if("C-".equals(txtSub4Res.getText())){
            sub4="1.75";
        }
        else if("D+".equals(txtSub4Res.getText())){
            sub4="1.25";
        }
        else if("D".equals(txtSub4Res.getText())){
            sub4="1";
        }
        else if("D-".equals(txtSub4Res.getText())){
            sub4="O.75";
        }
        else if("E".equals(txtSub4Res.getText())){
            sub4="0";
        }
        else if("F".equals(txtSub4Res.getText())){
            sub4="0";
        }
        
        double mainsub1=Double.parseDouble(mainSub1);
        double mainsub2=Double.parseDouble(mainSub1);
        double Sub1=Double.parseDouble(sub1);
        double Sub2=Double.parseDouble(sub2);
        double Sub3=Double.parseDouble(sub3);
        double Sub4=Double.parseDouble(sub4);
        
        double gpa=((mainsub1*3)+(mainsub2*3)+(Sub1*2)+(Sub2*2)+(Sub3*2)+(Sub4*3))/15;
        String numberAsString = String.format ("%.3f", gpa);
        txtGPA.setText(numberAsString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtMainSub1Res = new javax.swing.JTextField();
        txtMainSub2Res = new javax.swing.JTextField();
        txtSub1Res = new javax.swing.JTextField();
        txtSub2Res = new javax.swing.JTextField();
        txtSub3Res = new javax.swing.JTextField();
        txtSub4Res = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ddCourseId = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnShowGpa = new javax.swing.JButton();
        txtGPA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(6, 75, 149));

        jPanel1.setBackground(new java.awt.Color(45, 119, 133));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cal GPA"), "View Result"));

        jLabel1.setText("Student Id");

        jLabel2.setText("Main Subject1 Result");

        jLabel3.setText("MainSubject2 Result");

        jLabel4.setText("Subject1 Result");

        jLabel5.setText("Subject2 Result");

        jLabel6.setText("Subject2 Result");

        jLabel7.setText("Subject4 Result");

        txtStudentId.setBackground(new java.awt.Color(153, 153, 153));
        txtStudentId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtMainSub1Res.setBackground(new java.awt.Color(153, 153, 153));
        txtMainSub1Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtMainSub2Res.setBackground(new java.awt.Color(153, 153, 153));
        txtMainSub2Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSub1Res.setBackground(new java.awt.Color(153, 153, 153));
        txtSub1Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSub2Res.setBackground(new java.awt.Color(153, 153, 153));
        txtSub2Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSub3Res.setBackground(new java.awt.Color(153, 153, 153));
        txtSub3Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSub4Res.setBackground(new java.awt.Color(153, 153, 153));
        txtSub4Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(94, 92, 145));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(26, 179, 184));
        btnback.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel8.setText("Course Id");

        ddCourseId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cs 1.1", "eng 1.1", "bus 1.1", "cs 1.2", "eng 1.2", "bus 1.2", "cs 2.1", "eng 2.1", "bus2.1", "cs 2.2", "eng 2.2", "bus 2.2", "cs 3.1", "eng 3.1", "bus 3.1", "cs 3.2", "eng 3.2", "bus 3.2", "cs 4.1", "eng 4.1", "bus 4.1", "cs 4.2", "eng 4.2", "bus 4.2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ddCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(btnSearch)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSub3Res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtSub4Res, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMainSub1Res)
                                    .addComponent(txtMainSub2Res)
                                    .addComponent(txtSub1Res)
                                    .addComponent(txtSub2Res))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ddCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMainSub1Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMainSub2Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSub1Res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSub2Res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSub3Res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSub4Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(122, 93, 141));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cal GPA"));

        btnShowGpa.setBackground(new java.awt.Color(12, 104, 163));
        btnShowGpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnShowGpa.setText("Show GPA");
        btnShowGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGpaActionPerformed(evt);
            }
        });

        txtGPA.setBackground(new java.awt.Color(153, 153, 153));
        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnShowGpa)
                .addGap(27, 27, 27)
                .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowGpa)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(7, 119, 160));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     void clearField(){
    txtStudentId.setText("");
    txtMainSub1Res.setText("");
    txtMainSub2Res.setText("");
    txtSub1Res.setText("");
    txtSub2Res.setText("");
    txtSub3Res.setText("");
    txtSub4Res.setText("");
    txtGPA.setText("");
    }   
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        DBOperation dbop=new DBOperation();
        ResultSet rs=null;
        rs=dbop.find(txtStudentId.getText(),ddCourseId.getSelectedItem().toString());
        
        try{
            if(rs.next()){
                txtMainSub1Res.setText(rs.getString("mainsubject1rus"));
                txtMainSub2Res.setText(rs.getString("mainsubject2rus"));
                txtSub1Res.setText(rs.getString("subject1rus"));
                txtSub2Res.setText(rs.getString("subject2rus"));
                txtSub3Res.setText(rs.getString("subject3rus"));
                txtSub4Res.setText(rs.getString("subject4rus"));
            }
            else{
                    JOptionPane.showMessageDialog(null, "No DATA FOUND");
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnShowGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGpaActionPerformed
        calResult();
        JOptionPane.showMessageDialog(null, "Successfull");
        clearField();
    }//GEN-LAST:event_btnShowGpaActionPerformed

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
            java.util.logging.Logger.getLogger(UnderCalGpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnderCalGpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnderCalGpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnderCalGpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnderCalGpa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowGpa;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox ddCourseId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtMainSub1Res;
    private javax.swing.JTextField txtMainSub2Res;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtSub1Res;
    private javax.swing.JTextField txtSub2Res;
    private javax.swing.JTextField txtSub3Res;
    private javax.swing.JTextField txtSub4Res;
    // End of variables declaration//GEN-END:variables
}
