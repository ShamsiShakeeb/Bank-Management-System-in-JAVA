
package BMS.Properties;

import BMS.Query.MyQeary;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class FinancialAnalysts extends javax.swing.JInternalFrame {
             
           private static ResultSet rs=null;
           private String getName;
    public FinancialAnalysts(String x) {
        initComponents();
        getName=x;
        
        View();
    }
    private void View(){
        jLabel4.setVisible(false);
        Policy.setVisible(false);
        PBC.setVisible(false);
        Total.setVisible(false);
    }
    protected class getFromData extends MyQeary implements FA{
        
        public void getValue() throws SQLException{
          rs=getConnection("Select Name,Address,Age,LoanFor,Ammount from LoanCustomer");
          AnalysisTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        }
        public void getSearchValue() throws SQLException{
            ///Search
            rs=getConnection("Select Name,Ammount from  LoanCustomer where LoanFor="+"'"+Search.getText()+"'");
            AnalysisTable.setModel(DbUtils.resultSetToTableModel(rs));
            ///Total Cost
            rs=getConnection("Select Sum(Ammount),Count(Name) from  LoanCustomer where LoanFor ="+"'"+Search.getText()+"'");
            Total.setText("Total Ammount:"+rs.getString(1) +"/ Users:"+ rs.getString(2));
            rs.close();
        }
        public void Policy() throws SQLException{
            setConnect("Insert into FAPolicy (Policy) values ("+"'"+Policy.getText()+"'" +")");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AnalysisTable = new javax.swing.JTable();
        newPassword = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PBC = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        EditPlicy = new javax.swing.JButton();
        Policy = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnalysisTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AnalysisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        AnalysisTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AnalysisTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(AnalysisTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 393, 1270, 260));

        newPassword.setBackground(new java.awt.Color(255, 255, 255));
        newPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        newPassword.setText("Set New Password");
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 11, 184, -1));

        Search.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 200, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setText("Set Policy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 96, -1));

        PBC.setBackground(new java.awt.Color(255, 255, 255));
        PBC.setText("Publish Policy");
        PBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBCActionPerformed(evt);
            }
        });
        getContentPane().add(PBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        EditPlicy.setBackground(new java.awt.Color(255, 255, 255));
        EditPlicy.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditPlicy.setText("Edit Policy");
        EditPlicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPlicyActionPerformed(evt);
            }
        });
        getContentPane().add(EditPlicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 11, 128, -1));

        Policy.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(Policy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 605, 206));

        Total.setEditable(false);
        Total.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 350, 588, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jTextField1.setText("Search Loan Taken For:");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 386, 50));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/MoneyBg.jpg"))); // NOI18N
        Bg.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalysisTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AnalysisTableAncestorAdded
        // TODO add your handling code here:
        getFromData shakeeb=new getFromData();
               try {
                   shakeeb.getValue();
               } catch (SQLException ex) {
                   Logger.getLogger(FinancialAnalysts.class.getName()).log(Level.SEVERE, null, ex);
               }
    }//GEN-LAST:event_AnalysisTableAncestorAdded

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
         getFromData shakeeb=new  getFromData();
               try {
                   shakeeb.getSearchValue();
                   Total.setVisible(true);
               } catch (SQLException ex) {
                  System.out.println(ex);
               }
    }//GEN-LAST:event_SearchKeyReleased

    private void PBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBCActionPerformed
        // TODO add your handling code here:
         getFromData shakeeb=new   getFromData();
               try {
                   shakeeb.Policy();
               } catch (SQLException ex) {
                   Logger.getLogger(FinancialAnalysts.class.getName()).log(Level.SEVERE, null, ex);
               }
    }//GEN-LAST:event_PBCActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // TODO add your handling code here:
            String TableName=" FinancialAnalysts";
           PasswordChanged shakeeb=new  PasswordChanged(getName, TableName);
           shakeeb.setVisible(true);     
    }//GEN-LAST:event_newPasswordActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
         getFromData shakeeb=new  getFromData();
               try {
                   shakeeb.getValue();
               } catch (SQLException ex) {
                   Logger.getLogger(FinancialAnalysts.class.getName()).log(Level.SEVERE, null, ex);
               }
               View();
               Total.setVisible(false);
               Policy.setText("");
    }//GEN-LAST:event_RefreshActionPerformed

    private void EditPlicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPlicyActionPerformed
        // TODO add your handling code here:
          jLabel4.setVisible(true);
        Policy.setVisible(true);
        PBC.setVisible(true);
    }//GEN-LAST:event_EditPlicyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AnalysisTable;
    private javax.swing.JLabel Bg;
    private javax.swing.JButton EditPlicy;
    private javax.swing.JButton PBC;
    private javax.swing.JTextField Policy;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton newPassword;
    // End of variables declaration//GEN-END:variables
}
