
package BMS.Properties;

import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SeniorExecutives extends javax.swing.JInternalFrame {

            private static ResultSet rs=null;
            private String getName;
    public SeniorExecutives(String x) {
        initComponents();
        getName = x;
    }
    protected class Info extends MyQeary implements SE{
        
         @Override
        public void LoanOfficer() throws SQLException{
          rs=getConnection("Select Name,Address,PhoneNumber,Id from LoanOfficers");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        }
        
         @Override
        public void CashierInformation() throws SQLException{
           rs=getConnection("Select Name,Address,PhoneNumber,Id from Tellers");
           InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
           rs.close();
        }
          @Override
          public void AccountantInformation() throws SQLException{
           rs=getConnection("Select Name,Address,PhoneNumber,Id from Accountant");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        }
           @Override
           public void ITInformation() throws SQLException{
           rs=getConnection("Select Name,Address,PhoneNumber,Id from ITOfficer");
           InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
           rs.close();
        }          

        @Override
        public void SearchLoanOfficer() throws SQLException {
           rs=getConnection("Select Name,Address,PhoneNumber,Id from LoanOfficers where Id="+"'"+Search.getText()+"'");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void SearchCashierInformation() throws SQLException {
          rs=getConnection("Select Name,Address,PhoneNumber,Id from Tellers where Id="+"'"+Search.getText()+"'");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void SearchAccountantInformation() throws SQLException {
          rs=getConnection("Select Name,Address,PhoneNumber,Id from Accountant where Id="+"'"+Search.getText()+"'");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void SearchITInformation() throws SQLException {
          rs=getConnection("Select Name,Address,PhoneNumber,Id from ITOfficer where Id="+"'"+Search.getText()+"'");
          InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
          rs.close();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewPassword = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformationTable = new javax.swing.JTable();
        Information = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewPassword.setBackground(new java.awt.Color(255, 255, 255));
        NewPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        NewPassword.setText("Set New Password");
        NewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, -1));

        InformationTable.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        InformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "PhoneNumber", "Id"
            }
        ));
        jScrollPane1.setViewportView(InformationTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 318, 1280, 320));

        Information.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Information.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Of Loan Officers", "Information Of Cashier", "Information Of Accountant", "Information Of IT" }));
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });
        getContentPane().add(Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 30, 302, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel2.setText("Search Id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, -1));

        Search.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 240, 40));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/MoneyBg.jpg"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
        // TODO add your handling code here:
         Info shakeeb=new Info(); 
          
        if(Information.getSelectedIndex()==0){
           
            try {
                shakeeb.LoanOfficer();
            } catch (SQLException ex) {
                Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Information.getSelectedIndex()==1){
             try {
                 shakeeb.CashierInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if(Information.getSelectedIndex()==2){
             try {
                 shakeeb.AccountantInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
          else if(Information.getSelectedIndex()==3){
             try {
                 shakeeb.ITInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
          }
    }//GEN-LAST:event_InformationActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
         Info shakeeb=new Info();
        if(Information.getSelectedIndex()==0){
             try {
                 shakeeb.SearchLoanOfficer();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        if(Information.getSelectedIndex()==1){
             try {
                 shakeeb.SearchCashierInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        if(Information.getSelectedIndex()==2){
             try {
                 shakeeb.SearchAccountantInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        if(Information.getSelectedIndex()==3){
             try {
                 shakeeb.SearchITInformation();
             } catch (SQLException ex) {
                 Logger.getLogger(SeniorExecutives.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_SearchKeyReleased

    private void NewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordActionPerformed
        // TODO add your handling code here:
          String TableName="SeniorExecutives";
          PasswordChanged shakeeb=new PasswordChanged(getName,TableName);
          shakeeb.setVisible(true);
    }//GEN-LAST:event_NewPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JComboBox<String> Information;
    private javax.swing.JTable InformationTable;
    private javax.swing.JButton NewPassword;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
