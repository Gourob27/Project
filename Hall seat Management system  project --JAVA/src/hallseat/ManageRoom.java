/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallseat;

import java.awt.event.KeyEvent;
import static java.lang.Class.forName;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
//import hallseat.ConnectionProvider;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author Aristo_NPC
 */
public class ManageRoom extends javax.swing.JFrame {
    
        Connection getCon=null;

  
   
  
    public ManageRoom() {
        initComponents();
        getCon= ConnectionProvider.getCon();
        table_update();
        //Connect();
    }
    PreparedStatement ps;
    private void table_update()
    {
       
            int c;
            try {
               
                 ps = getCon.prepareStatement("SELECT * FROM `manage`");
                 ResultSet rs = ps.executeQuery();
                 
                 ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                 d.setRowCount(0);
                                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector(); 
                     for(int i=1; i<=c; i++)
                     {
                         v2.add(rs.getString("Floor"));
                         v2.add(rs.getString("Room"));
                         v2.add(rs.getString("Bed"));
                         v2.add(rs.getString("Active"));
                         v2.add(rs.getString("Status"));
                        
                     }             
                     d.addRow(v2);
                     
                 }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtfloor = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtroom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel1.setText("ADD NEW ROOM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 13, 348, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 13, 51, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FLOOR", "ROOM", "BED", "ACTIVATE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 910, 340));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("ROOM NUMBER :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 129, 133, -1));

        txtfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfloorActionPerformed(evt);
            }
        });
        txtfloor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfloorKeyPressed(evt);
            }
        });
        getContentPane().add(txtfloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 88, 97, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox1.setText("YES");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 135, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 137, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("FLOOR NUMBER :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 133, -1));

        txtroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomActionPerformed(evt);
            }
        });
        getContentPane().add(txtroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 128, 95, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("BED NUMBER:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, 121, -1));
        getContentPane().add(txtbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 168, 97, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("ACTIVATE & DEACTIVATE :");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 206, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfloorActionPerformed

    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String FLOORNUMBER = txtfloor.getText();
        String ROOMNUMBER = txtroom.getText();
        String BEDNumber = txtbed.getText();
        String activate;
        String STATUS = "Not Booked";
        if (jCheckBox1.isSelected()) {
            activate = "YES";
        } else {
            activate = "NO";
        }
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("INSERT INTO `manage`(`Floor`, `Room`, `Bed`, `Active`, `Status`) VALUES (?,?,?,?,?)");
            ps.setString(1, FLOORNUMBER);
            ps.setString(2, ROOMNUMBER);
            ps.setString(3, BEDNumber);
            ps.setString(4, activate);
           ps.setString(5, STATUS);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Update");
           // tableDetails();
           table_update();
            txtfloor.setText("");
            txtroom.setText("");
            txtbed.setText("");
            jCheckBox1.setText("");
      
            table_update();
            txtfloor.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtfloorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfloorKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            //String floor = txtfloor.get
        }
    }//GEN-LAST:event_txtfloorKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     txtfloor.setText(d.getValueAt(selectedIndex,0).toString());
      txtroom.setText(d.getValueAt(selectedIndex,1).toString());
       txtbed.setText(d.getValueAt(selectedIndex,2).toString());
        jCheckBox1.setText(d.getValueAt(selectedIndex,3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageRoom().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbed;
    private javax.swing.JTextField txtfloor;
    private javax.swing.JTextField txtroom;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   /* private void tableDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
