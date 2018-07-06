import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kalra
 */
public class PresentationMark extends javax.swing.JFrame {

    /**
     * Creates new form PresentationMark
     */
    public PresentationMark() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paper_id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fee_s = new javax.swing.JRadioButton();
        fee_ns = new javax.swing.JRadioButton();
        paper_s = new javax.swing.JRadioButton();
        paper_ns = new javax.swing.JRadioButton();
        roomattend_ns = new javax.swing.JRadioButton();
        roomattend_s = new javax.swing.JRadioButton();
        present_ns = new javax.swing.JRadioButton();
        present_s = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        attend_s = new javax.swing.JRadioButton();
        attend_ns = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Presentation Marker: MARC 2018 Management");
        setExtendedState(this.MAXIMIZED_BOTH);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARC Presentation Marker", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Paper Id:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Delegate Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fees Status:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Paper Status:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Mark Room Attendance:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Presentation Status:");

        paper_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paper_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper_idActionPerformed(evt);
            }
        });
        paper_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paper_idKeyPressed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setEnabled(false);

        fee_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(fee_s);
        fee_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fee_s.setText("Submitted");
        fee_s.setEnabled(false);

        fee_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(fee_ns);
        fee_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fee_ns.setText("Not Submitted");
        fee_ns.setEnabled(false);

        paper_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(paper_s);
        paper_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paper_s.setText("Submitted");
        paper_s.setEnabled(false);

        paper_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(paper_ns);
        paper_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paper_ns.setText("Not Submitted");
        paper_ns.setEnabled(false);
        paper_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper_nsActionPerformed(evt);
            }
        });

        roomattend_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(roomattend_ns);
        roomattend_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        roomattend_ns.setText("Absent");
        roomattend_ns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomattend_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomattend_nsActionPerformed(evt);
            }
        });

        roomattend_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(roomattend_s);
        roomattend_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        roomattend_s.setText("Present");
        roomattend_s.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomattend_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomattend_sActionPerformed(evt);
            }
        });

        present_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(present_ns);
        present_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        present_ns.setText("Not Submitted");
        present_ns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        present_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                present_nsActionPerformed(evt);
            }
        });

        present_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(present_s);
        present_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        present_s.setText("Submitted");
        present_s.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        present_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                present_sActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Go Back to Main Page");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Registration Attendance:");

        attend_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(attend_s);
        attend_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attend_s.setText("Present");
        attend_s.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attend_s.setEnabled(false);
        attend_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_sActionPerformed(evt);
            }
        });

        attend_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(attend_ns);
        attend_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attend_ns.setText("Absent");
        attend_ns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attend_ns.setEnabled(false);
        attend_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_nsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomattend_s)
                                    .addComponent(present_s))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(present_ns)
                                    .addComponent(roomattend_ns)))
                            .addComponent(attend_s)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paper_s)
                                        .addComponent(fee_s))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fee_ns)
                                        .addComponent(paper_ns)
                                        .addComponent(attend_ns)))
                                .addComponent(paper_id)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(paper_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fee_s)
                    .addComponent(fee_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(paper_s)
                    .addComponent(paper_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(attend_s)
                    .addComponent(attend_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(roomattend_s)
                    .addComponent(roomattend_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(present_s)
                    .addComponent(present_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoHead.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 93, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Logout Me!");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 383, 0, 10);
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paper_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paper_idKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                String Query = paper_id.getText();
                String q = "Select * from delegate_master where Paper_Id = "+Query;
                DBConnect d = new DBConnect();
                java.sql.Statement s = d.SelectConnect();
                ResultSet rs = s.executeQuery(q);
                while(rs.next()){
                    name.setText(String.valueOf(rs.getString("Student_Name")));
                    if(rs.getInt("Fees_Paid") == 1){
                        fee_s.setSelected(true);
                    }else{
                        fee_ns.setSelected(true);
                    }
                    if(rs.getInt("Paper_Submitted") == 1){
                        paper_s.setSelected(true);
                    }else{
                        paper_ns.setSelected(true);
                    }
                    if(rs.getInt("Attendance") == 1){
                        attend_s.setSelected(true);
                    }else{
                        attend_ns.setSelected(true);
                    }
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Please Search for a Valid Id!","Invalid Data",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_paper_idKeyPressed

    private void paper_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper_nsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper_nsActionPerformed

    private void roomattend_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomattend_nsActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Absent for : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Delegate_Master set RoomAttend=? where Paper_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,0);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_roomattend_nsActionPerformed

    private void roomattend_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomattend_sActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Present for : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Delegate_Master set RoomAttend=? where Paper_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,1);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_roomattend_sActionPerformed

    private void present_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_present_nsActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Presentation not Submitted by : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Delegate_Master set PresentStatus=? where Paper_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,0);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Presenation Not Submitted Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_present_nsActionPerformed

    private void present_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_present_sActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Presentation Submitted by : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Delegate_Master set PresentStatus=? where Paper_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,1);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Presentation Submitted Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_present_sActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        paper_id.setText("");
        name.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r=JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?");
        if(r==1){
            this.setVisible(false);
            this.setVisible(true);
        }
        else if(r==0){
            this.setVisible(false);
            LoginPage m=new LoginPage();
            m.setVisible(true);
            JOptionPane.showMessageDialog(this, "You are successfully logged out!!","Logout Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void attend_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_sActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Present for : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Attendee_Master set Attendee_Attendance=? where Attendee_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,1);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_attend_sActionPerformed

    private void attend_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_nsActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Absent for : "+paper_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Attendee_Master set Attendee_Attendance=? where Attendee_Id="+Integer.parseInt(paper_id.getText()));
                e.setInt(1,0);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_attend_nsActionPerformed

    private void paper_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper_idActionPerformed

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
            java.util.logging.Logger.getLogger(PresentationMark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentationMark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentationMark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentationMark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentationMark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton attend_ns;
    private javax.swing.JRadioButton attend_s;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton fee_ns;
    private javax.swing.JRadioButton fee_s;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField paper_id;
    private javax.swing.JRadioButton paper_ns;
    private javax.swing.JRadioButton paper_s;
    private javax.swing.JRadioButton present_ns;
    private javax.swing.JRadioButton present_s;
    private javax.swing.JRadioButton roomattend_ns;
    private javax.swing.JRadioButton roomattend_s;
    // End of variables declaration//GEN-END:variables
}
