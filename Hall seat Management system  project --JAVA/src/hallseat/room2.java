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
public class room2 extends javax.swing.JFrame {

    /**
     * Creates new form room2
     */
    Connection getCon=null;

    /**
     * Creates new form room1
     */
    public room2() {
        initComponents();
        getCon= ConnectionProvider.getCon();
        table_update();
        
    }
    
    PreparedStatement ps;
    ResultSet rs ;
    private void table_update()
    {
       
            int c;
            try {
               
                 ps = getCon.prepareStatement("SELECT * FROM `room2`");
                 ResultSet rs = (ResultSet) ps.executeQuery();
                 
                 ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                 d.setRowCount(0);
                                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector(); 
                     for(int i=1; i<=c; i++)
                     {
                         v2.add(rs.getString("sid"));
                         v2.add(rs.getString("sname"));
                         v2.add(rs.getString("dept"));
                         v2.add(rs.getString("batch"));
                         v2.add(rs.getString("bed"));
                         v2.add(rs.getString("status"));
                         
                        
                     }             
                     d.addRow(v2);
                     
                 }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbed = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdept = new javax.swing.JTextField();
        txtbatch = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("S.id:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 70, 40));
        getContentPane().add(txtbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 91, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("STATUS:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 107, -1));
        getContentPane().add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 95, 46));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/room 102.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 314, 537));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.id", "S.name", "Dept", "Batch", "Bed", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 480, 470));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 90, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("S.name:");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 109, 47));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setText("Dept:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 70, 43));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setText("BED:");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 70, 39));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("Batch:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 88, 40));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 110, 40));
        getContentPane().add(txtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 100, 40));
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 110, 40));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 91, 40));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 90, 30));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // new floor1().setVisible(true);
       new floor1().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
        int test = Integer.parseInt(BED);
        if(test<1 || test>6){
        JOptionPane.showMessageDialog(null, "Please Enter a number between 1 to 6");
        }
        else{

        try {
            // Connection Con = ConnectionProvider.getCon();
            ps = getCon.prepareStatement("INSERT INTO `room2`(`sid`, `sname`, `dept`, `batch`, `bed`, `status`) VALUES (?,?,?,?,?,?)");
            ps.setString(1, Sid);
            ps.setString(2, Sname);
            ps.setString(3, Dept);
            ps.setString(4, Batch);
            ps.setString(5, BED);
            ps.setString(6, STATUS);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Insert");
            // tableDetails();
            table_update();
            txtid.setText("");
            txtname.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtbed.setText("");
            txtstatus.setText("");
            table_update();
            txtid.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Already Booked");
        }}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
        
      
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("UPDATE `room2` SET `sid`=?,`sname`=?,`dept`=?,`batch`=?,`bed`=?,`status`=? WHERE `sid`=?");
            ps.setString(1, Sid);
            ps.setString(2, Sname);
            ps.setString(3, Dept);
            ps.setString(4, Batch);
            ps.setString(5, BED);
            ps.setString(6, STATUS);
            ps.setString(7, Sid);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Update");
           // tableDetails();
           table_update();
            txtid.setText("");
            txtname.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtbed.setText("");
            txtstatus.setText("");
             
      
            table_update();
           txtid.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
        txtid.setText(d.getValueAt(selectedIndex, 0).toString());
        txtname.setText(d.getValueAt(selectedIndex, 1).toString());
        txtdept.setText(d.getValueAt(selectedIndex, 2).toString());
        txtbatch.setText(d.getValueAt(selectedIndex, 3).toString());
        txtbed.setText(d.getValueAt(selectedIndex, 4).toString());
        txtstatus.setText(d.getValueAt(selectedIndex,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
       
        
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("DELETE FROM `room2` WHERE `sid`=?");
             ps.setString(1, Sid);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Delete");
           // tableDetails();
           table_update();
//            
//      
            table_update();
            txtname.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new room2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbatch;
    private javax.swing.JTextField txtbed;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables

    
}
