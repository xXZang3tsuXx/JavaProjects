/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyloginsystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Pasindu
 */
public class UserLoginScreen extends javax.swing.JFrame {
    
    int logcount;
    String T = null;
    /**
     * Creates new form UserLoginScreen
     */
    public UserLoginScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usrname = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        combotype = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Login Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 50));

        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Type");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 20));
        jPanel1.add(usrname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 40));

        passfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfieldActionPerformed(evt);
            }
        });
        jPanel1.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 40));

        combotype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Manager", "Clerk", "Accountant" }));
        combotype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotypeActionPerformed(evt);
            }
        });
        jPanel1.add(combotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 20));

        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 370, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 80, 30));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combotypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotypeActionPerformed

    private void passfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            
            String u = usrname.getText();
            String p = new String(passfield.getPassword());
            ResultSet RS = ULSDB.Search("SELECT * FROM user WHERE username='"+u+"'AND password='"+p+"' AND type='"+combotype.getSelectedItem().toString()+"'");            
            if(RS.first()){
               
              if(RS.getString("type").equals("Administrator")){
                  loadProgressBar("Administrator");
              }else if(RS.getString("type").equals("Manager")){
                  loadProgressBar("Manager");
              }else if(RS.getString("type").equals("Accountant")){
                  loadProgressBar("Accountant");
              }else{
                  loadProgressBar("Clerk");
              }
               
            }else{
                logcount++;
                showLoginMSG();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField usrname;
    // End of variables declaration//GEN-END:variables

    private void showLoginMSG() {
        if(logcount==1){
            msg.setText("First Attempt Failed");
            clearfields();
        }else if(logcount==2){
            msg.setText("Second Attempt Failed");
            clearfields();
        }else if(logcount==3){
            msg.setText("Your Last Attempt!!");
            clearfields();
        }else{
            msg.setText("System Locked");
            msg.setForeground(Color.red);
            clearfields();
            usrname.setEnabled(false);
            passfield.setEnabled(false);
        }
    }

    private void clearfields() {
        usrname.setText(null);
        passfield.setText(null);
    }

    private void loadProgressBar(String type) {
        
        if(type.equals("Administrator")){
             new Thread(new Runnable() {

                 @Override
                 public void run() {
                     try {
                         for(int i = 0; i <= 100; i++){
                        jProgressBar1.setValue(i);
                        Thread.sleep(25);
                        if(i == 100){
                            AdministratorScreen AdmS = new AdministratorScreen();
                            AdmS.setVisible(true);
                            dispose();
                        } 
                        }
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }).start();
        }else if(type.equals("Manager")){
             new Thread(new Runnable() {

                 @Override
                 public void run() {
                     try {
                        for(int i = 0; i <= 100; i++){
                        jProgressBar1.setValue(i);
                        Thread.sleep(25);
                        if(i == 100){
                            ManagerScreen MS = new ManagerScreen();
                            MS.setVisible(true);
                            dispose();
                        } 
                        }
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }).start();        
        }else if(type.equals("Accountant")){
             new Thread(new Runnable() {

                 @Override
                 public void run() {
                     try {
                        for(int i = 0; i <= 100; i++){
                        jProgressBar1.setValue(i);
                        Thread.sleep(25);
                        if(i == 100){
                            AccountantScreen AS = new AccountantScreen();
                            AS.setVisible(true);
                            dispose();
                        } 
                        }
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }).start();           
        }else if(type.equals("Clerk")){
            new Thread(new Runnable() {

                 @Override
                 public void run() {
                     try {
                        for(int i = 0; i <= 100; i++){
                        jProgressBar1.setValue(i);
                        Thread.sleep(25);
                        if(i == 100){
                            ClerkScreen CS = new ClerkScreen();
                            CS.setVisible(true);
                            dispose();
                        } 
                        }
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }).start();   
        }
                  
        
                  
    }


    
}
