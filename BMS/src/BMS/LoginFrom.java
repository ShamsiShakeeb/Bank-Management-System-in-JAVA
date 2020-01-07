
package BMS;


import BMS.Properties.Accountant;
import BMS.Properties.BankManager1;
import BMS.Query.MyQeary;

import BMS.regPane.Staffs;
import BMS.regPane.BankManager;
import BMS.Properties.Cashier;
import BMS.Properties.FinancialAnalysts;
import BMS.Properties.FinancialManager;
import BMS.Properties.LoanOfficer;
import BMS.Properties.SeniorExecutives;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.MouseMotionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class LoginFrom extends javax.swing.JFrame {


 
 private ResultSet rs;
 private ResultSet rs1;
 
    public LoginFrom() {
        initComponents();
        regStaffs.setVisible(false);
        Cashier.setVisible(false);
        Accountant.setVisible(false);
        Loan.setVisible(false);
        S_executive.setVisible(false);
        FA.setVisible(false);
        BankManagr.setVisible(false);
        FM.setVisible(false);
        TimeInfo();
        setTitle("Bank Management System");
    }
    
    public void TimeInfo(){
        
        DateFormat d=new SimpleDateFormat("hh:mm:ss");
        Date s=new Date();
        Time.setText("Time: "+d.format(s));
    }
    
    private void msg(){
        JOptionPane.showMessageDialog(null,"Login Successfully");
    }
    
    protected class ITlogin extends MyQeary{
          
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              try {
            rs=getConnection("Select Name From ITOfficer where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
               int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
   //       regStaffs.setVisible(true);
           msg();
          regStaffs.doClick();
        
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
    
    protected class CashierLogin extends  MyQeary{
          public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From Tellers where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
  //       Cashier.setVisible(true);
         msg();
         Cashier.doClick();
        
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
    protected class AccountatntLogin extends MyQeary{
        public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From Accountant where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
    //     Accountant.setVisible(true);
           msg();
         Accountant.doClick();
        
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
    protected class LoanOfficerLogin extends MyQeary{
                public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From LoanOfficers where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
 //        Loan.setVisible(true);
           msg();
         Loan.doClick();
        
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
    protected class SeniorexecutivesLogin extends MyQeary{
           public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From SeniorExecutives where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
//         S_executive.setVisible(true);
           msg();
         S_executive.doClick();
        
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
      protected class FA extends MyQeary{
           public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From FinancialAnalysts where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
   //       FA.setVisible(true);
            msg();
          FA.doClick();
         
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
      protected class FM extends MyQeary{
             public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From FinancialManagers where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
   //       FM.setVisible(true);
            msg();
          FM.doClick();
        
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
      protected class BM extends MyQeary{
              public void getFromData() {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            rs=getConnection("Select Name From BankManager where Name="+"'"+ITname1.getText()+"'"+"And Password="+"'"+T.getText()+"'");
           
             
         int count=0;
         while(rs.next()){
            
          count=count+1;
         }
         if(count ==1){
 //         BankManagr.setVisible(true);
            msg();
          BankManagr.doClick();
         
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
   
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        regStaffs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login = new javax.swing.JComboBox<>();
        ITname1 = new javax.swing.JTextField();
        Cashier = new javax.swing.JButton();
        T = new javax.swing.JPasswordField();
        Accountant = new javax.swing.JButton();
        Loan = new javax.swing.JButton();
        S_executive = new javax.swing.JButton();
        FA = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();
        FM = new javax.swing.JButton();
        BankManagr = new javax.swing.JButton();
        File = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        DataEntry = new javax.swing.JMenu();
        BnakManager = new javax.swing.JMenuItem();
        Time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(102, 153, 255));
        Desktop.setPreferredSize(new java.awt.Dimension(1280, 768));

        regStaffs.setText("Registart Staffs");
        regStaffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regStaffsActionPerformed(evt);
            }
        });
        Desktop.add(regStaffs);
        regStaffs.setBounds(1030, 230, 167, 23);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("           Name:");
        Desktop.add(jLabel1);
        jLabel1.setBounds(147, 190, 100, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("      Password:");
        Desktop.add(jLabel2);
        jLabel2.setBounds(140, 240, 110, 30);

        Login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Login.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login as IT", "Login as Cashier", "Login as Accountant", "Login as Loan Officer", "Login as Senior Executives", "Login as Financial Analysts", "Login as Financial Manager", "Login as Bank Manager" }));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Desktop.add(Login);
        Login.setBounds(260, 300, 180, 30);

        ITname1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Desktop.add(ITname1);
        ITname1.setBounds(257, 191, 190, 30);

        Cashier.setText("Cashier");
        Cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierActionPerformed(evt);
            }
        });
        Desktop.add(Cashier);
        Cashier.setBounds(1100, 40, 69, 23);

        T.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Desktop.add(T);
        T.setBounds(257, 242, 190, 30);

        Accountant.setText("Accountant");
        Accountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountantActionPerformed(evt);
            }
        });
        Desktop.add(Accountant);
        Accountant.setBounds(1090, 80, 87, 23);

        Loan.setText("LoanOfficer");
        Loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanActionPerformed(evt);
            }
        });
        Desktop.add(Loan);
        Loan.setBounds(1090, 110, 87, 23);

        S_executive.setText("Senior Ex");
        S_executive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_executiveActionPerformed(evt);
            }
        });
        Desktop.add(S_executive);
        S_executive.setBounds(1090, 150, 87, 23);

        FA.setText("FA");
        FA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAActionPerformed(evt);
            }
        });
        Desktop.add(FA);
        FA.setBounds(1120, 190, 45, 23);

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/BankBackground.jpg"))); // NOI18N
        Desktop.add(Bg);
        Bg.setBounds(0, 0, 1280, 768);

        FM.setText("FM");
        FM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMActionPerformed(evt);
            }
        });
        Desktop.add(FM);
        FM.setBounds(1120, 270, 47, 23);

        BankManagr.setText("jButton1");
        BankManagr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankManagrActionPerformed(evt);
            }
        });
        Desktop.add(BankManagr);
        BankManagr.setBounds(1080, 290, 73, 23);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        File.add(jMenu1);

        DataEntry.setText("Change Manager");
        DataEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataEntryActionPerformed(evt);
            }
        });

        BnakManager.setText("Bank Manager");
        BnakManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnakManagerActionPerformed(evt);
            }
        });
        DataEntry.add(BnakManager);

        File.add(DataEntry);

        Time.setText("jMenu2");
        File.add(Time);

        setJMenuBar(File);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenu1ActionPerformed
   
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   
    private void BnakManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnakManagerActionPerformed
   
         // TODO add your handling code here:
   
             
             BankManager s=new  BankManager();
             Desktop.add(s);
             Desktop.moveToFront(s);
             s.setSize(Desktop.getWidth(),Desktop.getHeight());
             s.setLocation(0,0);
             
             ///UnmoveAble
             
             BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
             
             
             Component north = ui.getNorthPane();
             MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);
             
             for (int i = 0; i < actions.length; i++)
             north.removeMouseMotionListener( actions[i] );
             s.setVisible(true);
   
     
    }//GEN-LAST:event_BnakManagerActionPerformed
     
    private void DataEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataEntryActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_DataEntryActionPerformed

    private void regStaffsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regStaffsActionPerformed
        // TODO add your handling code here:
       Staffs s=new  Staffs(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      regStaffs.setVisible(false);
    }//GEN-LAST:event_regStaffsActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        if(Login.getSelectedIndex()==0){
        ITlogin shakeeb=new ITlogin();
        shakeeb.getFromData();}
        if(Login.getSelectedIndex()==1){
        CashierLogin shakeeb=new CashierLogin();
       shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==2){
          AccountatntLogin shakeeb=new AccountatntLogin();
            shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==3){
            LoanOfficerLogin shakeeb=new LoanOfficerLogin();
            shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==4){
             SeniorexecutivesLogin shakeeb=new  SeniorexecutivesLogin();
             shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==5){
            FA shakeeb=new FA();
            shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==6){
            FM shakeeb=new FM();
            shakeeb.getFromData();
        }
        if(Login.getSelectedIndex()==7){
            BM shakeeb=new BM();
            shakeeb.getFromData();
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void CashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierActionPerformed
        // TODO add your handling code here:
       Cashier s=new Cashier(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      Cashier.setVisible(false);
       
    }//GEN-LAST:event_CashierActionPerformed

    private void AccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountantActionPerformed
        // TODO add your handling code here:
       Accountant s=new   Accountant(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      Accountant.setVisible(false);
    }//GEN-LAST:event_AccountantActionPerformed

    private void LoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanActionPerformed
        // TODO add your handling code here:
       LoanOfficer s=new   LoanOfficer(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      Loan.setVisible(false);
    }//GEN-LAST:event_LoanActionPerformed

    private void S_executiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_executiveActionPerformed
        // TODO add your handling code here:
       SeniorExecutives s=new    SeniorExecutives(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      S_executive.setVisible(false);
    }//GEN-LAST:event_S_executiveActionPerformed

    private void FAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAActionPerformed
        // TODO add your handling code here:
       FinancialAnalysts s=new  FinancialAnalysts(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      FA.setVisible(false);
    }//GEN-LAST:event_FAActionPerformed

    private void FMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMActionPerformed
        // TODO add your handling code here:
       FinancialManager s=new  FinancialManager(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      FM.setVisible(false);
        
    }//GEN-LAST:event_FMActionPerformed

    private void BankManagrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankManagrActionPerformed
        // TODO add your handling code here:
       BankManager1 s=new  BankManager1(ITname1.getText());
       Desktop.add(s);
       Desktop.moveToFront(s);
       s.setSize(Desktop.getWidth(),Desktop.getHeight());
       s.setLocation(0,0);
       
        ///UnmoveAble
        
      BasicInternalFrameUI ui = (BasicInternalFrameUI)s.getUI();
     
      
      Component north = ui.getNorthPane();
      MouseMotionListener[] actions = (MouseMotionListener[])north.getListeners(MouseMotionListener.class);

      for (int i = 0; i < actions.length; i++)
      north.removeMouseMotionListener( actions[i] );
      s.setVisible(true);
      BankManagr.setVisible(false);
    }//GEN-LAST:event_BankManagrActionPerformed
    
    public static void main(String args[]) throws InterruptedException {
       
         LoginFrom s=new LoginFrom();
         s.setVisible(true);
         
         for(;;){
             
             s.TimeInfo();
             Thread.sleep(1000);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accountant;
    private javax.swing.JButton BankManagr;
    private javax.swing.JLabel Bg;
    private javax.swing.JMenuItem BnakManager;
    private javax.swing.JButton Cashier;
    private javax.swing.JMenu DataEntry;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton FA;
    private javax.swing.JButton FM;
    private javax.swing.JMenuBar File;
    private javax.swing.JTextField ITname1;
    private javax.swing.JButton Loan;
    private javax.swing.JComboBox<String> Login;
    private javax.swing.JButton S_executive;
    private javax.swing.JPasswordField T;
    private javax.swing.JMenu Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton regStaffs;
    // End of variables declaration//GEN-END:variables
}
