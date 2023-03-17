/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bank.system;

import static com.mycompany.bank.system.Data.users;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RUMMON
 */
public class TransferMoney extends javax.swing.JFrame {

    /**
     * Creates new form TransferMoney
     */
    user Luser;
    String Ruser;

    public TransferMoney(user Luser) {
        initComponents();
        this.Luser = Luser;
        jBalance.setText(Luser.balance + " TK");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jAmount = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBalance = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("Transfer Balance");

        jlabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlabel.setText("Receiver's ID:");

        jAmount.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jAmount.setMinimumSize(new java.awt.Dimension(64, 30));
        jAmount.setName(""); // NOI18N
        jAmount.setPreferredSize(new java.awt.Dimension(71, 30));
        jAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmountActionPerformed(evt);
            }
        });
        jAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmountKeyPressed(evt);
            }
        });

        jId.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jId.setPreferredSize(new java.awt.Dimension(73, 30));
        jId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jIdKeyPressed(evt);
            }
        });

        jlabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlabel1.setText("Amount(TK):");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton3.setText("SEND");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Your account balance is-");
        jLabel4.setFocusTraversalPolicyProvider(true);

        jBalance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBalance.setFocusTraversalPolicyProvider(true);

        jButton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jId.getText();
        int currBalance = Integer.parseInt(Luser.balance);
        int amount = Integer.parseInt(jAmount.getText());
        user suser = null;
        boolean flag = false;

        for (user i : users) {
            if (i.accId.equals(id)) {
                if(id.equals(Luser.accId)){
                    JOptionPane.showMessageDialog(rootPane,"You can't send money to your own account");
                    break;
                }
                flag = true;
                if (currBalance > amount) {
                    //lessen this account tk
                    for (user u : users) {
                        if (u.accId.equals(Luser.accId)) {
                            int newBalance = (currBalance - amount);
                            u.balance = Integer.toString(newBalance);
                            jBalance.setText(u.balance + " TK");
                        }
                    }
                    //increase other account tk
                    for (user u : users) {
                        if (u.accId.equals(id)) {
                            suser = u;
                            int preBalance = Integer.parseInt(u.balance);
                            int newBalance = (preBalance + amount);
                            u.balance = Integer.toString(newBalance);
                            Ruser = u.name;
                        }
                    }
                    //call update database
                    System.out.println(".............updating txt file..........");
                    Data.update();
                    try {
                        PdfWithdraw.main(Luser, suser, Integer.toString(amount));
                    } catch (IOException ex) {
                        Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(rootPane, amount + "TK send to " + Ruser);
                    break;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "You have not enough money");
                    break;
                }
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(rootPane, "No account found with ID: " + id);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new UserFrontPage(Luser).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmountKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)|| c == KeyEvent.VK_BACK_SPACE){
            jAmount.setEditable(true);
        }else{
            jAmount.setEditable(false);
        }
    }//GEN-LAST:event_jAmountKeyPressed

    private void jIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIdKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)|| c == KeyEvent.VK_BACK_SPACE){
            jAmount.setEditable(false);
        }else{
            jAmount.setEditable(true);
        }
    }//GEN-LAST:event_jIdKeyPressed

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
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new TransferMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAmount;
    private javax.swing.JLabel jBalance;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    // End of variables declaration//GEN-END:variables
}