
package BMS.Properties;

import BMS.Query.MyQeary;
import BMS.regPane.BankManager;
import java.awt.Component;
import java.awt.event.MouseMotionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Accountant extends javax.swing.JInternalFrame {

      private MyQeary qeary=new MyQeary();
      private static ResultSet rs=null;
      private String getName;
      private String name;
      private String address;
      private String phoneNumber;
      private String accNo;
      private String Date;
      private String Ammount;
      private String age;
      private String bname;
      private String baddress;
      private String bphoneNumber;
      private String baccNo;
      private String bDate;
      private String bAmmount;
      private String bage;
    public Accountant(String x) {
        initComponents();
        ChangePanel.setVisible(false);
        ExtraView.setVisible(false);
      
        Unblock.setVisible(false);
      
        getName=x;
       
    }
    private void msg(String x){
       JOptionPane.showMessageDialog(null,x);
    }
    private void getDataIntoTable(){
          try {
              // TODO add your handling code here:
           rs= qeary.getConnection("Select Name,AccountNo,Address,PhoneNumber,Date,Ammount,Age As DateOfBirth from Customer");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
          } catch (SQLException ex) {
              Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    private void getBlockUser(){
           try {
              // TODO add your handling code here:
           rs= qeary.getConnection("Select * from BlockUser");
           
            BlockedTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
          } catch (SQLException ex) {
              Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
   
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        New_password = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sAccNO = new javax.swing.JTextField();
        Rfrsh = new javax.swing.JButton();
        ExtraView = new javax.swing.JPanel();
        ChangePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        New_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        new_phnNumber = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Block = new javax.swing.JButton();
        PastName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AccNo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ViewTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BlockedTable = new javax.swing.JTable();
        Unblock = new javax.swing.JButton();
        BlockedUser = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().setLayout(null);

        CustomerTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "AccNo", "Addrees", "Phone Number", "Last Date", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerTable.setRowHeight(14);
        CustomerTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CustomerTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 423, 1264, 230);

        New_password.setBackground(new java.awt.Color(255, 255, 255));
        New_password.setText("Change Password");
        New_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(New_password);
        New_password.setBounds(20, 20, 140, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setText("    Search User AccNo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(921, 388, 170, 23);

        sAccNO.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        sAccNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sAccNOKeyReleased(evt);
            }
        });
        getContentPane().add(sAccNO);
        sAccNO.setBounds(1095, 385, 160, 29);

        Rfrsh.setBackground(new java.awt.Color(255, 255, 255));
        Rfrsh.setText("Refresh");
        Rfrsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfrshActionPerformed(evt);
            }
        });
        getContentPane().add(Rfrsh);
        Rfrsh.setBounds(340, 20, 80, 23);

        ExtraView.setBackground(new java.awt.Color(176, 176, 176));
        ExtraView.setPreferredSize(new java.awt.Dimension(1280, 768));
        ExtraView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ExtraViewAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ChangePanel.setBackground(new java.awt.Color(176, 176, 176));
        ChangePanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ChangePanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setText(" Name:");

        jLabel4.setText("New Name:");

        jLabel5.setText("Address:");

        jLabel6.setText("Phone Number");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Block.setText("Block User");
        Block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockActionPerformed(evt);
            }
        });

        jLabel7.setText(" AccNo:");

        jLabel9.setText("Date Of Birth");

        javax.swing.GroupLayout ChangePanelLayout = new javax.swing.GroupLayout(ChangePanel);
        ChangePanel.setLayout(ChangePanelLayout);
        ChangePanelLayout.setHorizontalGroup(
            ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePanelLayout.createSequentialGroup()
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(new_phnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(newAddress)
                            .addComponent(New_name)
                            .addComponent(PastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DOB)))
                    .addGroup(ChangePanelLayout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Block)
                        .addGap(10, 10, 10)
                        .addComponent(Cancel)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        ChangePanelLayout.setVerticalGroup(
            ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PastName, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(AccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(New_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(new_phnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(ChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Block)
                    .addComponent(Cancel))
                .addContainerGap())
        );

        jLabel8.setText("              Block Customers");

        BlockedTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BlockedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        BlockedTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BlockedTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        BlockedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlockedTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BlockedTable);

        Unblock.setText("Unblock Customer");
        Unblock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnblockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewTableLayout = new javax.swing.GroupLayout(ViewTable);
        ViewTable.setLayout(ViewTableLayout);
        ViewTableLayout.setHorizontalGroup(
            ViewTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Unblock)))
                .addContainerGap())
        );
        ViewTableLayout.setVerticalGroup(
            ViewTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Unblock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout ExtraViewLayout = new javax.swing.GroupLayout(ExtraView);
        ExtraView.setLayout(ExtraViewLayout);
        ExtraViewLayout.setHorizontalGroup(
            ExtraViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExtraViewLayout.createSequentialGroup()
                .addComponent(ChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(ExtraViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExtraViewLayout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ViewTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ExtraViewLayout.setVerticalGroup(
            ExtraViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ExtraViewLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(ViewTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(ExtraView);
        ExtraView.setBounds(0, 86, 1280, 768);

        BlockedUser.setBackground(new java.awt.Color(255, 255, 255));
        BlockedUser.setText("View Block Customer");
        BlockedUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockedUserActionPerformed(evt);
            }
        });
        getContentPane().add(BlockedUser);
        BlockedUser.setBounds(170, 20, 160, 23);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/MoneyBg.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1260, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CustomerTableAncestorAdded
        
           getDataIntoTable();
    }//GEN-LAST:event_CustomerTableAncestorAdded
    
    private void New_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_passwordActionPerformed
           String TableName="Accountant";
           PasswordChanged shakeeb=new  PasswordChanged(getName, TableName);
           shakeeb.setVisible(true);
    }//GEN-LAST:event_New_passwordActionPerformed

    private void sAccNOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sAccNOKeyReleased
          try {
              // TODO add your handling code here:
            rs=  qeary.getConnection("Select Name,AccountNo,Address,PhoneNumber,Date,Ammount from Customer where AccountNO="+"'"+sAccNO.getText()+"'");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
          } catch (SQLException ex) {
              Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
          }
           
        
    }//GEN-LAST:event_sAccNOKeyReleased

    private void RfrshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfrshActionPerformed
        // TODO add your handling code here:
          getDataIntoTable();
          ExtraView.setVisible(false);
    }//GEN-LAST:event_RfrshActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        // TODO add your handling code here:
         int index= CustomerTable.getSelectedRow();
         TableModel model =CustomerTable.getModel();
         name=model.getValueAt(index,0).toString();
         accNo=model.getValueAt(index,1).toString();
         address=model.getValueAt(index,2).toString();
         phoneNumber=model.getValueAt(index,3).toString();
         Date=model.getValueAt(index,4).toString();
         Ammount=model.getValueAt(index,5).toString();
         age=model.getValueAt(index,6).toString();
         ExtraView.setVisible(true);
          ViewTable.setVisible(false);
         ChangePanel.setVisible(true);
         jLabel8.setVisible(false);
          PastName.setText(name);
          New_name.setText(name);
          newAddress.setText(address);
          new_phnNumber.setText(phoneNumber);
          AccNo.setText(accNo);
          DOB.setText(age);
       
          
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Canceled");
        
        ExtraView.setVisible(false);
      
    }//GEN-LAST:event_CancelActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            // TODO add your handling code here:
            qeary.setConnect("Update Customer set Name="+"'"+New_name.getText()+"',"+"Address="+"'"+newAddress.getText()+"',"+"PhoneNumber="+"'"+new_phnNumber.getText()+"',"+"Age="+"'"+DOB.getText()+"'"+"Where AccountNO="+"'"+AccNo.getText()+"'");
            getDataIntoTable();
            JOptionPane.showMessageDialog(null,"Done");
        } catch (SQLException ex) {
            Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void BlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockActionPerformed
        try {
            // TODO add your handling code here:
            qeary.setConnect("Insert into BlockUser (Name,AccNo,Address,PhoneNo,Date,Ammount,Age) values("+"'"+name+"'," +"'"+accNo+"',"+"'"+address+"',"+"'"+phoneNumber+"',"+"'"+Date+"',"+"'"+Ammount+"',"+"'"+age+"'"+")");
            qeary.setConnect("Delete From Customer Where AccountNO="+"'"+AccNo.getText()+"'");
            getDataIntoTable();
            getBlockUser();
            JOptionPane.showMessageDialog(null,"Done");
        } catch (SQLException ex) {
            Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BlockActionPerformed

    private void BlockedUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockedUserActionPerformed
           jLabel8.setVisible(true);
          ExtraView.setVisible(true);
          ViewTable.setVisible(true);
          Unblock.setVisible(false);
          ChangePanel.setVisible(false);
          
    }//GEN-LAST:event_BlockedUserActionPerformed

    private void UnblockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnblockActionPerformed
        // TODO add your handling code here:
          try {
              // TODO add your handling code here:
              qeary.setConnect("Insert into Customer (Name,AccountNO,Address,PhoneNumber,Date,Ammount,Age) values("+"'"+bname+"',"+"'"+baccNo+"',"+"'"+baddress+"',"+"'"+bphoneNumber+"',"+"'"+bDate+"',"+"'"+bAmmount+"',"+"'"+bage+"'"+")");
              qeary.setConnect("Delete from BlockUser where AccNo="+"'"+baccNo+"'");
               getDataIntoTable();
                getBlockUser();
                JOptionPane.showMessageDialog(null,"Customer Unblocked");
               Unblock.setVisible(false);
          } catch (SQLException ex) {
              Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_UnblockActionPerformed

    private void ExtraViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ExtraViewAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ExtraViewAncestorAdded

    private void BlockedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlockedTableMouseClicked
        // TODO add your handling code here:
         int index= BlockedTable.getSelectedRow();
         TableModel model =BlockedTable.getModel();
         bname=model.getValueAt(index,0).toString();
         baccNo=model.getValueAt(index,1).toString();
         baddress=model.getValueAt(index,2).toString();
         bphoneNumber=model.getValueAt(index,3).toString();
         bDate=model.getValueAt(index,4).toString();
         bAmmount=model.getValueAt(index,5).toString();
         bage=model.getValueAt(index,6).toString();
        
         
         Unblock.setVisible(true);
    }//GEN-LAST:event_BlockedTableMouseClicked

    private void BlockedTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BlockedTableAncestorAdded
        // TODO add your handling code here:
          getBlockUser();
    }//GEN-LAST:event_BlockedTableAncestorAdded

    private void ChangePanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ChangePanelAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ChangePanelAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNo;
    private javax.swing.JButton Block;
    private javax.swing.JTable BlockedTable;
    private javax.swing.JButton BlockedUser;
    private javax.swing.JButton Cancel;
    private javax.swing.JPanel ChangePanel;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JTextField DOB;
    private javax.swing.JPanel ExtraView;
    private javax.swing.JTextField New_name;
    private javax.swing.JButton New_password;
    private javax.swing.JLabel PastName;
    private javax.swing.JButton Rfrsh;
    private javax.swing.JButton Unblock;
    private javax.swing.JButton Update;
    private javax.swing.JPanel ViewTable;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField newAddress;
    private javax.swing.JTextField new_phnNumber;
    private javax.swing.JTextField sAccNO;
    // End of variables declaration//GEN-END:variables
}
