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
public class PostCalGPA extends javax.swing.JFrame {

    /**
     * Creates new form PostCalGPA
     */
    public PostCalGPA() {
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
        
        
        
        
        double mainsub1=Double.parseDouble(mainSub1);
        double mainsub2=Double.parseDouble(mainSub1);
        double Sub1=Double.parseDouble(sub1);
        double Sub2=Double.parseDouble(sub2);
        double Sub3=Double.parseDouble(sub3);
        
        
        double gpa=((mainsub1*3)+(mainsub2*3)+(Sub1*2)+(Sub2*2)+(Sub3*2))/12;
        String numberAsString = String.format ("%.3f", gpa);
        txtGPA.setText(numberAsString);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    void clearField(){
    txtStudentId.setText("");
    txtMainSub1Res.setText("");
    txtMainSub2Res.setText("");
    txtSub1Res.setText("");
    txtSub2Res.setText("");
    txtSub3Res.setText("");
    txtGPA.setText("");
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ddCourseId = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMainSub1Res = new javax.swing.JTextField();
        txtMainSub2Res = new javax.swing.JTextField();
        txtSub1Res = new javax.swing.JTextField();
        txtSub2Res = new javax.swing.JTextField();
        txtSub3Res = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSowGPA = new javax.swing.JButton();
        txtGPA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cal GPA");

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculate GPA"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student Id");

        txtStudentId.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Course Id");

        ddCourseId.setBackground(new java.awt.Color(153, 153, 153));
        ddCourseId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cs 1.1", "eng 1.1", "bus 1.1", "cs 1.2", "eng 1.2", "bus 1.3", "cs 2.1", "eng 2.1", "bus2.1", "cs2.2", "eng 2.2", "bus 2.2", "cs 2.3", "eng 2.3", "bus 2.3", "cs 3.1", "eng 3.1", "bus 3.1", "cs 3.2", "eng 3.2", "bus 3.2", "cs 3.3", "eng 3.3", "bus 3.3", "cs 4.1", "eng 4.1", "bus 4.1", "cs 4.2", "eng 4.2", "bus 4.2", "cs 4.3", "eng 4.3", "bus 4.3" }));

        btnSearch.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Main Subject 1 Result");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Main Subject 2 Result");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Subject 1 Result");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Subject 2 Result");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Subject 3 Result");

        txtMainSub1Res.setBackground(new java.awt.Color(153, 153, 153));

        txtMainSub2Res.setBackground(new java.awt.Color(153, 153, 153));

        txtSub1Res.setBackground(new java.awt.Color(153, 153, 153));

        txtSub2Res.setBackground(new java.awt.Color(153, 153, 153));

        txtSub3Res.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        btnSowGPA.setBackground(new java.awt.Color(102, 102, 255));
        btnSowGPA.setText("Show GPA");
        btnSowGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSowGPAActionPerformed(evt);
            }
        });

        txtGPA.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnSowGPA)
                .addGap(85, 85, 85)
                .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSowGPA)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(ddCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnBack))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnSearch)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSub2Res, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(txtMainSub1Res, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMainSub2Res, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSub1Res, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSub3Res))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMainSub1Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMainSub2Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSub1Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtSub2Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSub3Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSowGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSowGPAActionPerformed
        calResult();
        JOptionPane.showMessageDialog(this, "successfull");
        clearField();
    
    }//GEN-LAST:event_btnSowGPAActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       DBOperation dbops=new DBOperation();
        ResultSet rs=null;
        rs=dbops.find1(txtStudentId.getText(), ddCourseId.getSelectedItem().toString());
        
        try{
            if(rs.next()){
                txtMainSub1Res.setText(rs.getString("mainsubject1rus"));
                txtMainSub2Res.setText(rs.getString("mainsubject2rus"));
                txtSub1Res.setText(rs.getString("subject1rus"));
                txtSub2Res.setText(rs.getString("subject2rus"));
                txtSub3Res.setText(rs.getString("subject3rus"));
                
            }
            else{
                    JOptionPane.showMessageDialog(null, "No DATA FOUND");
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(PostCalGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostCalGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostCalGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostCalGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostCalGPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSowGPA;
    private javax.swing.JComboBox ddCourseId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    // End of variables declaration//GEN-END:variables
}
