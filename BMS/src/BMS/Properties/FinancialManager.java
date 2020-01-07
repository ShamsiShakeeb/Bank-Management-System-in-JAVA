
package BMS.Properties;

import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class FinancialManager extends javax.swing.JInternalFrame {

            private static ResultSet rs=null;
            private String getName;
    public FinancialManager(String x) {
        initComponents();
        PublishPolicy.setVisible(false);
        getName=x;
    }
    protected class FM extends MyQeary implements FmLn{
        
       public void getFromData() throws SQLException {
           rs=getConnection("Select * from FAPolicy");
           PolicyTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
       }
       public void setInData() throws SQLException{
           setConnect("Insert into FMPolicy (Policy) values("+"'"+ViewPolicy.getText()+"'"+")");
       }
       public void SumLoan() throws SQLException{
          rs=getConnection("SELECT Sum (Ammount) from LoanCustomer");
          Total_Loan.setText(rs.getString(1));
           rs.close();
       }
       public void CountCustomer() throws SQLException{
          rs=getConnection("SELECT COUNT (Name) from LoanCustomer");
          Total_Customer.setText(rs.getString(1));
           rs.close();
       }
       public void viewLoanTable() throws SQLException{
            rs=getConnection("Select Name,LoanFor,Ammount from  LoanCustomer");
            PolicyTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            
       }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PolicyTable = new javax.swing.JTable();
        Password = new javax.swing.JButton();
        PublishPolicy = new javax.swing.JButton();
        ViewPolicy = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Total_Loan = new javax.swing.JTextField();
        Total_Customer = new javax.swing.JTextField();
        Bg = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PolicyTable.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        PolicyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PolicyTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PolicyTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        PolicyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PolicyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PolicyTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 347, 1272, 310));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Password.setText("Change Password");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        PublishPolicy.setBackground(new java.awt.Color(255, 255, 255));
        PublishPolicy.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        PublishPolicy.setText("Publish Policy");
        PublishPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublishPolicyActionPerformed(evt);
            }
        });
        getContentPane().add(PublishPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 170, -1));

        ViewPolicy.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        getContentPane().add(ViewPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 1260, 218));

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Total Loan Customer:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 68, 181, 27));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText(" Total Loan:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 23, 123, 27));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("View Loan Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 200, -1));

        Total_Loan.setEditable(false);
        Total_Loan.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        Total_Loan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Total_LoanAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Total_Loan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1093, 24, 169, 27));

        Total_Customer.setEditable(false);
        Total_Customer.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        Total_Customer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Total_CustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Total_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_CustomerActionPerformed(evt);
            }
        });
        getContentPane().add(Total_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1093, 69, 169, 30));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/MoneyBg.jpg"))); // NOI18N
        Bg.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PolicyTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PolicyTableAncestorAdded
        // TODO add your handling code here:
        FM shakeeb=new FM();
                try {
                    shakeeb.getFromData();
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_PolicyTableAncestorAdded

    private void PolicyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PolicyTableMouseClicked
        // TODO add your handling code here:
          int index= PolicyTable.getSelectedRow();
         TableModel model =PolicyTable.getModel();
         String policy=model.getValueAt(index,1).toString();
         ViewPolicy.setText(policy);
         PublishPolicy.setVisible(true);
      
    }//GEN-LAST:event_PolicyTableMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        ViewPolicy.setText("");
        PublishPolicy.setVisible(false);
        FM shakeeb=new FM();
                try {
                    shakeeb.getFromData();
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_RefreshActionPerformed

    private void PublishPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublishPolicyActionPerformed
        // TODO add your handling code here:
          FM shakeeb=new FM();
                try {
                    shakeeb.setInData();
                    JOptionPane.showMessageDialog(null,"Done");
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_PublishPolicyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FM shakeeb=new FM();
                try {
                    shakeeb.viewLoanTable();
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
         String TableName="FinancialManagers";
           PasswordChanged shakeeb=new  PasswordChanged(getName, TableName);
           shakeeb.setVisible(true);  
    }//GEN-LAST:event_PasswordActionPerformed

    private void Total_LoanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Total_LoanAncestorAdded
        // TODO add your handling code here:
        FM shakeeb=new FM();
                try {
                    shakeeb.SumLoan();
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_Total_LoanAncestorAdded

    private void Total_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_CustomerActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Total_CustomerActionPerformed

    private void Total_CustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Total_CustomerAncestorAdded
        // TODO add your handling code here:
         FM shakeeb=new FM();
                try {
                    shakeeb.CountCustomer();
                } catch (SQLException ex) {
                    Logger.getLogger(FinancialManager.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_Total_CustomerAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Password;
    private javax.swing.JTable PolicyTable;
    private javax.swing.JButton PublishPolicy;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Total_Customer;
    private javax.swing.JTextField Total_Loan;
    private javax.swing.JLabel ViewPolicy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
