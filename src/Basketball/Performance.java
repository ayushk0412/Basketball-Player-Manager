/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Basketball;

import java.sql.*;  
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


/**
 *
 * @author Ayush
 */
public class Performance extends javax.swing.JFrame {

    /** Creates new form Performance */
    public Performance() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        this.setTitle("  BASKETBALL PLAYER MANAGER");
        ImageIcon img = new ImageIcon("images/logomini.png");
        this.setIconImage(img.getImage());
        table.getTableHeader().setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        table.getTableHeader().setForeground(new Color(3, 154, 183));
    }
Connection con;
PreparedStatement pst;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/wade2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                          Player Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(32);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 450, 250));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(3, 154, 183));
        jButton2.setText("TOP 5 REBOUNDERS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 210, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(3, 154, 183));
        jButton3.setText("TOP 5 DEFENDERS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 220, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(3, 154, 183));
        jButton4.setText("TOP 5 PLAYMAKERS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, 220, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(3, 154, 183));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 670, 210, 70));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(3, 154, 183));
        jButton6.setText("MOST EFFICIENT SCORER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, 70));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(3, 154, 183));
        jButton7.setText("TOP 5 SCORERS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 210, 70));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BEST PLAYERS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basketball/wade2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 1110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
              int c;
              
              // TODO add your handling code here:
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/basketball player manager?serverTimezone=UTC","root","");
                      pst = con.prepareStatement("SELECT * FROM stats ORDER BY rebound DESC LIMIT 0,5" );
                      
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
            
                c= Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)table.getModel();
                Df.setRowCount(0);
         
         while(rs.next())
         {
             
         Vector v2 = new Vector();
         
            for(int a = 1; a<=c; a++)
            {
                v2.add(rs.getString("playername"));
              
             
            }
            Df.addRow(v2);
         }
            
      
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
              int c;
              
              // TODO add your handling code here:
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/basketball player manager?serverTimezone=UTC","root","");
                      pst = con.prepareStatement("SELECT * FROM stats ORDER BY block DESC LIMIT 0,5");
                      
                        ResultSet rs = pst.executeQuery();
                        ResultSetMetaData Rss = rs.getMetaData();
            
             c = Rss.getColumnCount();
                
             DefaultTableModel Df = (DefaultTableModel)table.getModel();
             Df.setRowCount(0);
         
         while(rs.next())
         {
         Vector v2 = new Vector();
         
            for(int a = 1; a<=c; a++)
            {
                v2.add(rs.getString("playername"));
              
             
            }
            Df.addRow(v2);
         }
            
      
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
              int c;
              
              // TODO add your handling code here:
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/basketball player manager?serverTimezone=UTC","root","");
                      pst = con.prepareStatement("SELECT * FROM stats ORDER BY assist DESC LIMIT 0,5" );
                      
                      ResultSet rs = pst.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
            
                c= Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)table.getModel();
                Df.setRowCount(0);
         
         while(rs.next())
         {
         Vector v2 = new Vector();
         
            for(int a = 1; a<=c; a++)
            {
                v2.add(rs.getString("playername"));
              
             
            }
            Df.addRow(v2);
         }
            
      
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try {
              int c;
              
              // TODO add your handling code here:
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/basketball player manager?serverTimezone=UTC","root","");
                      pst = con.prepareStatement("SELECT * FROM stats ORDER BY ((fgm/fga)*100) DESC LIMIT 0,1" );
                      
                      ResultSet rs = pst.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
            
                c= Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)table.getModel();
                Df.setRowCount(0);
               
         
         while(rs.next())
         {
         Vector v2 = new Vector();
         
            for(int a = 1; a<=c; a++)
            {
                v2.add(rs.getString("playername"));
            
             
            }
            Df.addRow(v2);
         }
            
      
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
              int c;
              
              // TODO add your handling code here:
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/basketball player manager?serverTimezone=UTC","root","");
                      pst = con.prepareStatement("SELECT * FROM stats ORDER BY fgm DESC LIMIT 0,5" );
                      
                      ResultSet rs = pst.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
            
                c= Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)table.getModel();
                Df.setRowCount(0);
         
         while(rs.next())
         {
         Vector v2 = new Vector();
         
            for(int a = 1; a<=c; a++)
            {
                v2.add(rs.getString("playername"));
              
             
            }
            Df.addRow(v2);
         }
            
      
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TeamRoster.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Performance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
