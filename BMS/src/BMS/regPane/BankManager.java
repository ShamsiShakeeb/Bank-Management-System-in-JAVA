
package BMS.regPane;

import BMS.*;
import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BankManager extends javax.swing.JInternalFrame {
      private String name;
      private String Id;
      private String Address;
      private String Phone_Number;
      private String joingDate;
      private String salary;
      private String NationalId;
      private ResultSet rs;
      private ResultSet rs1;
     
    
    public BankManager() {
        initComponents();
      Entry.setVisible(false);
       
    }

    public BankManager(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   protected class registration extends MyQeary implements RegistrationLn
   {

        @Override
        public void InputName() {
           name=BMName.getText();
        }
          @Override
        public void InputId() {
            Id=BMId1.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputAddress() {
            Address=BMaddress.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputPhoneNumber() {
            Phone_Number=BMPhoneNumber.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputJoningData() {
            joingDate=BMJoingDate.getText();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputSalary() {
            salary=BMSalary1.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
          @Override
        public void NationalId() {
           NationalId=BMNationalId1.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Update  BankManager set Name=" +"'"+name+"',"+"Id="   +"'"+Id+"',"+"Address="    +"'"+Address+"',"+"PhoneNumber="     +"'"+Phone_Number+"',"+"JoingDate="  +"'"+joingDate+"',"+"Salary="  +"'"+salary+"',"+"NationalId=" +"'"+NationalId+"'" +"Where Count=1"+"");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                        Logger.getLogger(BankManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              try {
            rs=getConnection("Select Name From BankManager where Name="+"'"+CheckName.getText()+"'"+"And Password="+"'"+ChackId.getText()   +"'");
           
             
               int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
           Entry.setVisible(true);
         }
         else {
             System.out.println("Sry");
             JOptionPane.showMessageDialog(null,"Valid Previous Manager Information Needed");
         }  
            
          
          } catch (SQLException ex) {
              Logger.getLogger(BankManager.class.getName()).log(Level.SEVERE, null, ex);
          }
         
           
          try {
              rs.close();
          } catch (SQLException ex) {
              Logger.getLogger(BankManager.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        

      

      
     
       
      
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BMName = new javax.swing.JTextField();
        Entry = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        BMPhoneNumber = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        BMId1 = new javax.swing.JTextField();
        jlabel3 = new javax.swing.JLabel();
        BMNationalId1 = new javax.swing.JTextField();
        jlabel4 = new javax.swing.JLabel();
        BMJoingDate = new javax.swing.JTextField();
        lSalary = new javax.swing.JLabel();
        BMaddress = new javax.swing.JTextField();
        lSalary1 = new javax.swing.JLabel();
        BMSalary1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CheckName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ChackId = new javax.swing.JTextField();
        Password = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(600, 600));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("    Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 92, 22));

        BMName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 130, 22));

        Entry.setText("Entry");
        Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryActionPerformed(evt);
            }
        });
        getContentPane().add(Entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 531, -1, -1));

        jlabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlabel1.setText("   Joing Date:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 288, 108, 22));

        BMPhoneNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 255, 130, 22));

        jlabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlabel2.setText("       Id:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 180, 76, 22));

        BMId1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 130, 22));

        jlabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlabel3.setText(" National Id:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 107, 22));

        BMNationalId1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMNationalId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 130, 22));

        jlabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlabel4.setText("  Phone Number:");
        getContentPane().add(jlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 255, 149, 22));

        BMJoingDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMJoingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 292, 130, 22));

        lSalary.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lSalary.setText("     Address:");
        getContentPane().add(lSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 372, 96, 22));

        BMaddress.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 372, 130, 22));

        lSalary1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lSalary1.setText("        Salary:");
        getContentPane().add(lSalary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 332, 96, 22));

        BMSalary1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(BMSalary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 332, 130, 22));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("      Previous Manager Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 445, 260, 22));

        CheckName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(CheckName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 130, 22));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("      Previous Manager Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 405, 248, 22));

        ChackId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(ChackId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 445, 130, 22));

        Password.setText("Enter");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 490, -1, -1));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/regPane/BankBackground.jpg"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formInternalFrameClosing

    private void EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryActionPerformed
        // TODO add your handling code here:
       
          registration shakeeb=new registration();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          Entry.setVisible(false);       
    }//GEN-LAST:event_EntryActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
            registration shakeeb=new registration();
            shakeeb.getFromData();
    }//GEN-LAST:event_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BMId1;
    private javax.swing.JTextField BMJoingDate;
    private javax.swing.JTextField BMName;
    private javax.swing.JTextField BMNationalId1;
    private javax.swing.JTextField BMPhoneNumber;
    private javax.swing.JTextField BMSalary1;
    private javax.swing.JTextField BMaddress;
    private javax.swing.JLabel Bg;
    private javax.swing.JTextField ChackId;
    private javax.swing.JTextField CheckName;
    private javax.swing.JButton Entry;
    private javax.swing.JButton Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel lSalary;
    private javax.swing.JLabel lSalary1;
    // End of variables declaration//GEN-END:variables
}
