
package BMS.regPane;

import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Staffs extends javax.swing.JInternalFrame {
      private String name;
      private String Id;
      private String Address;
      private String Phone_Number;
      private String joingDate;
      private String salary;
      private String NationalId;
      private ResultSet rs;
      private ResultSet rs1;
      private String getName;
    public Staffs(String x) {
        initComponents();
        Change.setVisible(false);
        getName=x;
        
       
    }
    private void Errormsg(){
        JOptionPane.showMessageDialog(null,"Id Cannot Be Same");
    }
   

   
    protected class regAccountant extends MyQeary implements RegistrationLn
   {

        @Override
        public void InputName() {
           name=ACname1.getText();
        }
          @Override
        public void InputId() {
            
            Id=ACId.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputAddress() {
            Address=ACAddress.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputPhoneNumber() {
            Phone_Number=ACPhoneNumber.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputJoningData() {
            joingDate=ACJoingDate.getText();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void InputSalary() {
            salary=ACsalary1.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
          @Override
        public void NationalId() {
           NationalId=ACnationalId.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into  Accountant (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"'," +"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                      Errormsg();
                    
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
    protected class regFinancialAnalysts extends regAccountant
   {
   
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into FinancialAnalysts (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                      Errormsg();
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     protected class FinancialManager extends regAccountant
   {

      
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into FinancialManagers (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                       Errormsg();
                    }         
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     protected class LoanOfficers extends regAccountant
   {

     
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into LoanOfficers (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                        Errormsg();
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     protected class SeniorExecutives extends regAccountant
   {

   
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into SeniorExecutives (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                        Errormsg();
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     protected class Tellers extends  regAccountant
   {

     
       
        @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into Tellers (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                        Errormsg();
                    }
                
           
        }

        @Override
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     protected class ITofficers extends regAccountant{
           @Override
        public void sentToData() {
     
                    try {
                        setConnect("Insert Into ITOfficer (Name, Id, Address,PhoneNumber,JoingDate,Salary,NationalId,Password) values("+"'"+name+"'," +"'"+Id+"',"+"'"+Address+"',"+"'"+Phone_Number+"',"+"'"+joingDate+"',"+"'"+salary+"',"+"'"+NationalId+"',"+"'"+Id+"'"+")");
                        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    } catch (SQLException ex) {
                        Errormsg();
                    }
                
           
        }

        @Override
        public void getFromData() {
              
        }
     }
               
          
    private void msg(){
           JOptionPane.showMessageDialog(null,"Done");
       }  
    
    private void clean(){
        ACAddress.setText("");
        ACId.setText("");
      
        ACPhoneNumber.setText("");
        ACname1.setText("");
        ACnationalId.setText("");
        ACsalary1.setText("");
    }
    
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ACId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ACname1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ACnationalId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ACPhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ACJoingDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ACAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ACsalary1 = new javax.swing.JTextField();
        reg = new javax.swing.JComboBox<>();
        Change = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Cid = new javax.swing.JTextField();
        Chanage = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Passwordbg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("              Id:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(417, 198, 93, 23);

        ACId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACId);
        ACId.setBounds(514, 195, 182, 29);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("  Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(438, 151, 72, 23);

        ACname1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACname1);
        ACname1.setBounds(514, 148, 182, 29);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("       National  Id:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(376, 245, 134, 23);

        ACnationalId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACnationalId);
        ACnationalId.setBounds(514, 242, 182, 29);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Phone Number:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(376, 292, 135, 23);

        ACPhoneNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACPhoneNumber);
        ACPhoneNumber.setBounds(515, 289, 181, 29);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("  Joining Date:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(391, 338, 120, 25);

        ACJoingDate.setEditable(false);
        ACJoingDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ACJoingDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ACJoingDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(ACJoingDate);
        ACJoingDate.setBounds(515, 336, 181, 29);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("       Salary:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(417, 386, 93, 23);

        ACAddress.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACAddress);
        ACAddress.setBounds(514, 430, 182, 29);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("      Address:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(407, 436, 103, 23);

        ACsalary1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(ACsalary1);
        ACsalary1.setBounds(514, 383, 182, 29);

        reg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registar Accountant", "Registar Financial Analysts", "Registar Financial Managers", "Registar Loan Officers", "Registar Senior Executives", "Registar Cashier", "IT officer", "Change Password" }));
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        jPanel1.add(reg);
        reg.setBounds(453, 486, 243, 29);

        Change.setBackground(new java.awt.Color(255, 255, 0));
        Change.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setText("    Type New Password:");
        Change.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, -1));

        Cid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Change.add(Cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, -1));

        Chanage.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Chanage.setText("Change");
        Chanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChanageActionPerformed(evt);
            }
        });
        Change.add(Chanage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        Cancel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        Change.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        Passwordbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/regPane/PassImg1.jpg"))); // NOI18N
        Passwordbg.setPreferredSize(new java.awt.Dimension(220, 322));
        Change.add(Passwordbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 320));

        jPanel1.add(Change);
        Change.setBounds(746, 148, 220, 320);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/regPane/BankBackground.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1280, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        if(reg.getSelectedIndex()==0){
          regAccountant shakeeb=new regAccountant();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==1){
          regFinancialAnalysts shakeeb=new regFinancialAnalysts();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==2){
          FinancialManager shakeeb=new  FinancialManager();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==3){
          LoanOfficers shakeeb=new LoanOfficers();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==4){
          SeniorExecutives shakeeb=new SeniorExecutives();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==5){
          Tellers shakeeb=new Tellers();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==6){
         ITofficers shakeeb=new  ITofficers();
          shakeeb.InputName();
          shakeeb.InputId();
          shakeeb.InputAddress();
          shakeeb.InputPhoneNumber();
          shakeeb.InputJoningData();
          shakeeb.InputSalary();
          shakeeb.NationalId();
          shakeeb.sentToData();
          msg();
          clean();
        }
        else if(reg.getSelectedIndex()==7){
            Change.setVisible(true);
        }
        
            
    }//GEN-LAST:event_regActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
          Change.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void ChanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChanageActionPerformed
        // TODO add your handling code here:
        MyQeary shakeeb=new MyQeary();
       try {
                  shakeeb.setConnect("Update ITOfficer set Password="+"'"+Cid.getText()+"'"+"Where Name="+"'"+getName+"'");
                   //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               } catch (SQLException ex) {
                   Logger.getLogger(Staffs.class.getName()).log(Level.SEVERE, null, ex);
               }
       JOptionPane.showMessageDialog(null,"Password Chanaged");
    }//GEN-LAST:event_ChanageActionPerformed

    private void ACJoingDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ACJoingDateAncestorAdded
        // TODO add your handling code here:
        DateFormat format=new SimpleDateFormat("dd/MMM/yyyy");
        Date d=new Date();
          ACJoingDate.setText(format.format(d));
    }//GEN-LAST:event_ACJoingDateAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACAddress;
    private javax.swing.JTextField ACId;
    private javax.swing.JTextField ACJoingDate;
    private javax.swing.JTextField ACPhoneNumber;
    private javax.swing.JTextField ACname1;
    private javax.swing.JTextField ACnationalId;
    private javax.swing.JTextField ACsalary1;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Chanage;
    private javax.swing.JPanel Change;
    private javax.swing.JTextField Cid;
    private javax.swing.JLabel Passwordbg;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> reg;
    // End of variables declaration//GEN-END:variables
}

