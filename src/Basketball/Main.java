/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basketball;

/**
 *
 * @author Ayush
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        Clock_Date();
        this.setTitle("  BASKETBALL PLAYER MANAGER");
        ImageIcon img = new ImageIcon("images/logomini.png");
        this.setIconImage(img.getImage());
     
        txtuser.setText((DisplayUser.user).toString());
    }
    
 
    
    public void Clock_Date(){
        Thread clock = new Thread(){
        public void run(){
        try{
            while(true){
            Calendar cal = new GregorianCalendar();
            int date = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            
            int second = cal.get(Calendar.SECOND);
            int minutes = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR);
            
            txttime.setText("Time : " +hour +":"+minutes+":"+second);
            
            txtdate.setText("Date : " +date +"/"+(month+1)+"/"+year);
            
            sleep(1000); 
            }
          
        }   catch (InterruptedException ex) {
               
            }
        }
         
        
    };
    clock.start();
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
        txttime = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttime.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        txttime.setForeground(new java.awt.Color(230, 12, 6));
        txttime.setText("jLabel1");
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 641, -1, -1));

        txtdate.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        txtdate.setForeground(new java.awt.Color(230, 12, 6));
        txtdate.setText("jLabel2");
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 702, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(230, 12, 6));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/team1.png"))); // NOI18N
        jButton1.setText("CREATE TEAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 196, 328, 64));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(230, 12, 6));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\College Projects\\Basketball Player Management system\\BasketballPlayerManager\\images\\Dashboard\\registration.png")); // NOI18N
        jButton2.setText("PLAYER REGISTRATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 196, 328, 64));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(230, 12, 6));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/updateinfo.png"))); // NOI18N
        jButton4.setText("UPDATE PLAYER INFORMATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 316, -1, 65));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(230, 12, 6));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/roster.png"))); // NOI18N
        jButton3.setText("TEAM ROSTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 316, 328, 65));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(230, 12, 6));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/stats.png"))); // NOI18N
        jButton5.setText(" STATISTICS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 436, 328, 64));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(230, 12, 6));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/best.png"))); // NOI18N
        jButton7.setText("BEST PERFORMERS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 546, 328, 64));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(230, 12, 6));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/logout.png"))); // NOI18N
        jButton8.setText("LOGOUT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 546, 328, 64));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(230, 12, 6));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/updatestats.png"))); // NOI18N
        jButton6.setText("UPDATE STATISTICS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 436, 328, 64));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 12, 6));
        jLabel1.setText("DASHBOARD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 12, 6));
        jLabel2.setText("LOGGED IN AS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        txtuser.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        txtuser.setForeground(new java.awt.Color(230, 12, 6));
        txtuser.setText("jLabel3");
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Team t = new Team();
        t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PlayerRegistration pr = new PlayerRegistration();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TeamRoster tr = new TeamRoster();
        tr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        UpdatePlayer up = new UpdatePlayer();
        up.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        AddStats s = new AddStats();
        s.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Performance p = new Performance();
        p.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        UpdateStats us = new UpdateStats();
        us.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        dispose();
        l.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txttime;
    private javax.swing.JLabel txtuser;
    // End of variables declaration//GEN-END:variables
}
