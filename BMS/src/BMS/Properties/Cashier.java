
package BMS.Properties;

import BMS.Query.MyQeary;
import BMS.regPane.BankManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cashier extends javax.swing.JInternalFrame {
      private  String name;
      private  String Id;
      private  String Amount;
      private  String Date;
      private  String PhoneNumber;
      private  String Add;
      private  String getName;
      private String age;
     
    
      private  ResultSet rs=null;
       private  ResultSet rs1=null;
      private MyQeary qeary=new MyQeary();
    public Cashier(String x) {
       initComponents();
       getName=x;
        unseen();
    }
  
   
  
    
    private void unseen(){
        Udate.setVisible(false);
        Umoney.setVisible(false);
        money.setVisible(false);
       jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel1.setVisible(false);
        CP.setVisible(false);
        ChanagePassword.setVisible(false);
        Cancel.setVisible(false);
    }
    
    protected class User extends MyQeary implements UserIn{ 

        @Override
        public void Uname() {
            name=UserName.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Uid() {
            Id=UserId.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void UAmount() {
            Amount=Ammount.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Date() {
            Date=GDate.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void PhoneNumber() {
            PhoneNumber=Phone_Number.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Address() {
            Add=Address.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
          @Override
        public void age() {
            age=Age.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
        private void Insert() throws SQLException{
            
         setConnect("Insert into Customer (Name,AccountNO,Ammount,Date,PhoneNumber,Address,Age) values ("+"'"+name+"'," +"'"+Id+"'," +"'"+Amount+"'," +"'"+Date+"'," +"'"+PhoneNumber+"'," +"'"+Add+"',"+"'"+age+"'"+")");
        }
        protected void SearchUser() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From Customer where Name="+"'"+Sname1.getText()+"'"+"And AccountNO="+"'"+Suid.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
         Udate.setVisible(true);
         Umoney.setVisible(true);
         money.setVisible(true);
         jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        rs=getConnection("Select Ammount ,AccountNO,Date from Customer where Name= "+"'"+Sname1.getText()+"'"+"And AccountNO="+"'"+Suid.getText()+"'");
        msg("Name: "+Sname1.getText() +"\nAccountNO: "+rs.getString(2)+"\nAmmount: "+rs.getString(1)+"\nLast Withdraw/Deposite: "+rs.getString(3));
        
         }
         else {
             System.out.println("Sry");
             JOptionPane.showMessageDialog(null,"Invalid Id/Name");
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
    private void msg(String x){
        JOptionPane.showMessageDialog(null,x);
    }
    private void clean(){
       UserName.setText("");
       UserId.setText("");
       Ammount.setText("");
       Phone_Number.setText("");
       Address.setText("");
       Age.setText("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Clogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ammount = new javax.swing.JTextField();
        DateL = new javax.swing.JLabel();
        GDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateL1 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        DateL2 = new javax.swing.JLabel();
        Phone_Number = new javax.swing.JTextField();
        Udate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        Sname1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Umoney = new javax.swing.JTextField();
        money = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Suid = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ChanagePassword = new javax.swing.JButton();
        CP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Cp = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        jPanel1.setLayout(null);

        Clogin.setBackground(new java.awt.Color(255, 255, 255));
        Clogin.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Clogin.setText("Registar");
        Clogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloginActionPerformed(evt);
            }
        });
        jPanel1.add(Clogin);
        Clogin.setBounds(1050, 408, 120, 35);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText(" User Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(106, 23));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(854, 67, 120, 50);

        UserId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(UserId);
        UserId.setBounds(1002, 122, 168, 29);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("   Ammount:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(846, 172, 152, 23);

        UserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UserName.setPreferredSize(new java.awt.Dimension(6, 27));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel1.add(UserName);
        UserName.setBounds(1000, 80, 170, 27);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("   User AccNO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(846, 126, 138, 20);

        Ammount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(Ammount);
        Ammount.setBounds(1002, 169, 168, 29);

        DateL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DateL.setText("  Date:");
        jPanel1.add(DateL);
        DateL.setBounds(850, 220, 98, 20);

        GDate.setEditable(false);
        GDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        GDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                GDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        GDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDateActionPerformed(evt);
            }
        });
        jPanel1.add(GDate);
        GDate.setBounds(1002, 216, 168, 29);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText(" User Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 81, 106, 23);

        DateL1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DateL1.setText("  Phone:");
        jPanel1.add(DateL1);
        DateL1.setBounds(850, 269, 129, 20);

        Address.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(Address);
        Address.setBounds(1002, 314, 168, 29);

        DateL2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DateL2.setText("  Address:");
        jPanel1.add(DateL2);
        DateL2.setBounds(850, 318, 134, 20);

        Phone_Number.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Phone_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_NumberActionPerformed(evt);
            }
        });
        jPanel1.add(Phone_Number);
        Phone_Number.setBounds(1002, 265, 168, 29);

        Udate.setEditable(false);
        Udate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Udate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UdateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Udate);
        Udate.setBounds(120, 216, 151, 29);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Date:");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 219, 106, 23);

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(170, 120, 100, 35);

        Sname1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(Sname1);
        Sname1.setBounds(120, 78, 151, 29);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Money:");
        jLabel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 269, 85, 20);

        Umoney.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Umoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Umoney);
        Umoney.setBounds(120, 265, 151, 29);

        money.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        money.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Withdraw", "Diposite", "Cancel" }));
        money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyActionPerformed(evt);
            }
        });
        jPanel1.add(money);
        money.setBounds(281, 263, 146, 32);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setText("         Registar New User");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(967, 38, 203, 26);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText(" User AccNo:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 41, 106, 23);

        Suid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(Suid);
        Suid.setBounds(120, 38, 151, 29);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel11.setText(" Search User");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 6, 106, 26);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Type New Password:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 524, 159, 20);

        ChanagePassword.setBackground(new java.awt.Color(255, 255, 255));
        ChanagePassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ChanagePassword.setText("Set New Password");
        ChanagePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChanagePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ChanagePassword);
        ChanagePassword.setBounds(375, 519, 190, 31);

        CP.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(CP);
        CP.setBounds(173, 520, 192, 29);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("     Date Of Birth:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(839, 367, 145, 23);

        Age.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(Age);
        Age.setBounds(1002, 361, 168, 29);

        Cp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Cp.setText("Change Password");
        Cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpActionPerformed(evt);
            }
        });
        jPanel1.add(Cp);
        Cp.setBounds(10, 463, 170, 31);

        Cancel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(193, 463, 100, 31);

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/BankBackground.jpg"))); // NOI18N
        jPanel1.add(Bg);
        Bg.setBounds(0, -2, 1320, 770);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloginActionPerformed
        // TODO add your handling code here:
        User shakeeb=new User();
        shakeeb.Uname();
        shakeeb.Uid();
        shakeeb.UAmount();
        shakeeb.PhoneNumber();
        shakeeb.Date();
        shakeeb.Address();
        shakeeb.age();
        try {
        shakeeb.Insert();
        msg("Done");
          } catch (SQLException ex) {
            msg("Account NO cannot be same");
          }
        clean();
    }//GEN-LAST:event_CloginActionPerformed

    private void ChanagePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChanagePasswordActionPerformed
        // TODO add your handling code here:
        MyQeary shakeeb=new MyQeary();
          try {
              shakeeb.setConnect("Update Tellers set Password ="+"'"+CP.getText()+"'"+"Where Name="+"'"+getName+"'");
              msg("Password Chanaged");
        jLabel1.setVisible(false);
        CP.setVisible(false);
        ChanagePassword.setVisible(false);
        
          } catch (SQLException ex) {
              Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_ChanagePasswordActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
       User shakeeb=new User();
       shakeeb.SearchUser();
      
    }//GEN-LAST:event_SearchActionPerformed

    private void moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyActionPerformed
          try {
              // TODO add your handling code here:
              rs1=qeary.getConnection("Select Ammount from Customer where AccountNO="+"'"+Suid.getText()+"'");
            
          } catch (SQLException ex) {
            
          }
        if(money.getSelectedIndex()==0){
            try {
          //      qeary.setConnect("Update Customer set Date="+"'"+Udate.getText()+"'"+"Where Id="+"'"+Suid.getText()+"'");
               String x=rs1.getString(1);
                 rs1.close();
             double   y=Double.parseDouble(x);
             double   a=Double.parseDouble(Umoney.getText());
             double z=y-a;
               if(z<0){
                  msg("Insufficient Ballence");
               }
               else{
               String  z1=Double.toString(z);
                System.out.println(z1);
              qeary.setConnect("Update Customer set Date="+"'"+Udate.getText()+"',"+"Ammount ="+"'"+z1+"'"+"Where AccountNO="+"'"+Suid.getText()+"'"); 
              rs1.close();
               msg("Done");
               unseen();
               }
              
            
               
            } catch (SQLException ex) {
               System.out.println(ex);
            }
        }
        if(money.getSelectedIndex()==1){
            
            try {
          //      qeary.setConnect("Update Customer set Date="+"'"+Udate.getText()+"'"+"Where Id="+"'"+Suid.getText()+"'");
               String x=rs1.getString(1);
                 rs1.close();
             double   y=Double.parseDouble(x);
             double   a=Double.parseDouble(Umoney.getText());
             double z=y+a;
               String  z1=Double.toString(z);
                System.out.println(z1);
              qeary.setConnect("Update Customer set Date="+"'"+Udate.getText()+"',"+"Ammount ="+"'"+z1+"'"+"Where AccountNO="+"'"+Suid.getText()+"'");
              rs1.close();
               msg("Done");
               unseen();            
               
            } catch (SQLException ex) {
               System.out.println(ex);
            }
        }
        if(money.getSelectedIndex()==2){
            unseen();
              try {
                  rs1.close();
              } catch (SQLException ex) {
                  Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
          try {
              rs1.close();
          } catch (SQLException ex) {
              Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_moneyActionPerformed

    private void Phone_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_NumberActionPerformed

    private void UmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UmoneyActionPerformed

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel7AncestorAdded

    private void jLabel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel8AncestorAdded
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jLabel8AncestorAdded

    private void CpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpActionPerformed
        // TODO add your handling code here:
        jLabel1.setVisible(true);
        CP.setVisible(true);
        ChanagePassword.setVisible(true);
        Cancel.setVisible(true);
    }//GEN-LAST:event_CpActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        jLabel1.setVisible(false);
        CP.setVisible(false);
        ChanagePassword.setVisible(false);
        Cancel.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void GDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDateActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_GDateActionPerformed

    private void GDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_GDateAncestorAdded
        // TODO add your handling code here:
           DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
               Date date = new Date();
               GDate.setText(dateFormat.format(date));
    }//GEN-LAST:event_GDateAncestorAdded

    private void UdateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UdateAncestorAdded
        // TODO add your handling code here:
          DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
               Date date = new Date();
               Udate.setText(dateFormat.format(date));
    }//GEN-LAST:event_UdateAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Ammount;
    private javax.swing.JLabel Bg;
    private javax.swing.JTextField CP;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ChanagePassword;
    private javax.swing.JButton Clogin;
    private javax.swing.JButton Cp;
    private javax.swing.JLabel DateL;
    private javax.swing.JLabel DateL1;
    private javax.swing.JLabel DateL2;
    private javax.swing.JTextField GDate;
    private javax.swing.JTextField Phone_Number;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Sname1;
    private javax.swing.JPasswordField Suid;
    private javax.swing.JTextField Udate;
    private javax.swing.JTextField Umoney;
    private javax.swing.JTextField UserId;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> money;
    // End of variables declaration//GEN-END:variables
}
