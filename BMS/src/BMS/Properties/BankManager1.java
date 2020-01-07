
package BMS.Properties;

import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class BankManager1 extends javax.swing.JInternalFrame {

        private String getName;
        private static  ResultSet rs=null;
    public BankManager1(String x) {
        initComponents();
        getName=x;
    }
    protected class Bm extends MyQeary implements BMIn{
        
        public void PolicyTable() throws SQLException{
           rs=getConnection("Select * from FMPolicy");
           Table.setModel(DbUtils.resultSetToTableModel(rs));
           rs.close();
        }
        public void CustomerSum() throws SQLException{
           rs= getConnection("Select Count(Name) from Customer");
           Total_Custmer.setText(rs.getString(1));
           rs.close();
        }
        public void AmmountSum() throws SQLException{
           rs=getConnection("Select Sum(Ammount) from Customer");
           Total_Ammount.setText(rs.getString(1));
           rs.close();
        }
        public void AccountatntInfo() throws SQLException{
           rs=getConnection("Select Name,Id,PhoneNumber,Address from Accountant");
           Table.setModel(DbUtils.resultSetToTableModel(rs));
           rs.close();
        }
        public void SeniorExecutiveInfo() throws SQLException{
            rs=getConnection("Select Name,Id,PhoneNumber,Address from SeniorExecutives");
            Table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }
        public void CustomerInfo() throws SQLException{
            rs=getConnection("Select Name,AccountNO,PhoneNumber,Address,Ammount from Customer");
            Table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Total_Ammount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Total_Custmer = new javax.swing.JTextField();
        Info = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Bg = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel1.setText("Total Customer:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 253, 28));

        Total_Ammount.setEditable(false);
        Total_Ammount.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        Total_Ammount.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Total_AmmountAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Total_Ammount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 89, 230, 35));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel2.setText("Total Ammount:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 261, 24));

        Total_Custmer.setEditable(false);
        Total_Custmer.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        Total_Custmer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Total_CustmerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Total_Custmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 26, 230, 31));

        Info.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Info.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accountant Information", "Senior Executives Information", "Customer Information" }));
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 32, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 31, 132, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 31, 181, -1));
        jButton2.getAccessibleContext().setAccessibleDescription("");

        Table.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Policy"
            }
        ));
        Table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1270, 310));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/MoneyBg.jpg"))); // NOI18N
        Bg.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Bm shakeeb=new Bm();
            try {
                shakeeb.PolicyTable();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TableAncestorAdded
        // TODO add your handling code here:
        Bm shakeeb=new Bm();
            try {
                shakeeb.PolicyTable();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_TableAncestorAdded

    private void Total_CustmerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Total_CustmerAncestorAdded
        // TODO add your handling code here:
          Bm shakeeb=new Bm();
            try {
                shakeeb.CustomerSum();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Total_CustmerAncestorAdded

    private void Total_AmmountAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Total_AmmountAncestorAdded
        // TODO add your handling code here:
          Bm shakeeb=new Bm();
            try {
                shakeeb.AmmountSum();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Total_AmmountAncestorAdded

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
        // TODO add your handling code here:
        if(Info.getSelectedIndex()==0){
            Bm shakeeb=new Bm();
            try {
                shakeeb.AccountatntInfo();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Info.getSelectedIndex()==1){
              Bm shakeeb=new Bm();
            try {
                shakeeb.SeniorExecutiveInfo();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Info.getSelectedIndex()==2){
               Bm shakeeb=new Bm();
            try {
                shakeeb.CustomerInfo();
            } catch (SQLException ex) {
                Logger.getLogger(BankManager1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_InfoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          String TableName="BankManager";
          PasswordChanged shakeeb=new  PasswordChanged(getName, TableName);
          shakeeb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JComboBox<String> Info;
    private javax.swing.JTable Table;
    private javax.swing.JTextField Total_Ammount;
    private javax.swing.JTextField Total_Custmer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
