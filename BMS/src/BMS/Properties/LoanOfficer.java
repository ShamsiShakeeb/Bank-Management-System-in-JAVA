
package BMS.Properties;

import BMS.Query.MyQeary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class LoanOfficer extends javax.swing.JInternalFrame {
            private String name;
            private String accNo;
            private String ammount;
            private String date;
            private String Phone_Number;
            private String address;
            private String age;
            private String ltf;
            private String getName;
            private static ResultSet rs=null;
            private String Interest;
        private MyQeary qeary=new MyQeary();
        
    public LoanOfficer(String x) {
        initComponents();
        getName=x;
    }
    protected class LoanCustomer extends MyQeary implements UserIn{

        @Override
        public void Uname() {
            name=Name.getText();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Uid() {
            accNo=AccNO.getText();
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void UAmount() {
            ammount=Ammount.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Date() {
            date=Date.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void PhoneNumber() {
            Phone_Number=PhoneNumber.getText();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Address() {
            address=Address.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void age() {
            age=Age.getText();
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public void LoanTakenFor(){
            ltf=Taken.getText();
        }
        protected void Insert() throws SQLException{
            setConnect("Insert into LoanCustomer (Name,AccountNO,Ammount,Date,PhoneNO,Address,Age,LoanFor) values("+"'"+name+"'," +"'"+accNo+"',"+"'"+ammount+"',"+"'"+date+"',"+"'"+Phone_Number+"',"+"'"+address+"',"+"'"+age+"',"+"'"+ltf+"'"+")");
        }
      
        
        
    }
    private void clean(){
        Name.setText("");
        AccNO.setText("");
        Ammount.setText("");
       
        PhoneNumber.setText("");
        Address.setText("");
        Age.setText("");
        Taken.setText("");
    }
    private void msg(String x){
         JOptionPane.showMessageDialog(null,x);
    }
    private void getDataIntoTable(){
           try {
                    // TODO add your handling code here:
                   rs= qeary.getConnection("Select * from LoanCustomer");
                  LoanTable.setModel(DbUtils.resultSetToTableModel(rs));
                     
                } catch (SQLException ex) {
                    Logger.getLogger(LoanOfficer.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LoanTable = new javax.swing.JTable();
        NewPassword = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Ammount = new javax.swing.JTextField();
        AccNO = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        LoanTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        CP1 = new javax.swing.JTextField();
        NewPassword1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Registar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Tax = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Taken = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        rfrash = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().setLayout(null);

        LoanTable.setBackground(new java.awt.Color(176, 176, 176));
        LoanTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        LoanTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LoanTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        LoanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LoanTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 480, 1270, 170);

        NewPassword.setBackground(new java.awt.Color(255, 255, 255));
        NewPassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        NewPassword.setText("Set New Password");
        NewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(NewPassword);
        NewPassword.setBounds(195, 29, 201, 35);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(988, 35, 67, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("    AccNO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(969, 85, 86, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("      Ammount:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(936, 136, 119, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("             Date:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(948, 183, 107, 23);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("      Phone Number:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(898, 232, 157, 23);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("                     Age:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(924, 276, 131, 23);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("            Address:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(932, 319, 123, 23);

        Name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(Name);
        Name.setBounds(1073, 32, 167, 29);

        Ammount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Ammount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmmountActionPerformed(evt);
            }
        });
        getContentPane().add(Ammount);
        Ammount.setBounds(1073, 130, 167, 29);

        AccNO.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(AccNO);
        AccNO.setBounds(1073, 82, 167, 29);

        Address.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(Address);
        Address.setBounds(1073, 316, 167, 29);

        Date.setEditable(false);
        Date.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Date.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Date);
        Date.setBounds(1073, 177, 167, 29);

        PhoneNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(PhoneNumber);
        PhoneNumber.setBounds(1073, 229, 167, 29);

        jInternalFrame1.setBackground(new java.awt.Color(103, 129, 180));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(600, 400));

        LoanTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(LoanTable1);

        jLabel9.setText("Type New Password:");

        NewPassword1.setText("Set New Password");

        jLabel10.setText("Name:");

        jLabel11.setText("AccNO:");

        jLabel12.setText("Ammount:");

        jLabel13.setText("Date:");

        jLabel14.setText("Phone Number:");

        jLabel15.setText("Age:");

        jLabel16.setText("Address:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CP1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(NewPassword1)))
                .addGap(64, 64, 64)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap(425, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewPassword1)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(625, 335, 0, 0);

        Age.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(Age);
        Age.setBounds(1073, 270, 167, 29);

        Registar.setBackground(new java.awt.Color(255, 255, 255));
        Registar.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Registar.setText("Registar Loan Customers");
        Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarActionPerformed(evt);
            }
        });
        getContentPane().add(Registar);
        Registar.setBounds(972, 425, 260, 33);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setText("Per Month Payment With 15% Tax:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 273, 284, 23);

        Tax.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        getContentPane().add(Tax);
        Tax.setBounds(312, 273, 157, 23);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("    Loan Taken For:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(910, 366, 145, 23);

        Taken.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(Taken);
        Taken.setBounds(1073, 363, 167, 29);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Search AccNo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 435, 123, 23);

        Search.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SearchMouseReleased(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(137, 432, 175, 29);

        rfrash.setBackground(new java.awt.Color(255, 255, 255));
        rfrash.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        rfrash.setText("Refresh");
        rfrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfrashActionPerformed(evt);
            }
        });
        getContentPane().add(rfrash);
        rfrash.setBounds(18, 29, 159, 35);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Properties/BankBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 1280, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmmountActionPerformed

    private void RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarActionPerformed
        // TODO add your handling code here:
        LoanCustomer shakeeb=new LoanCustomer();
        shakeeb.Uname();
        shakeeb.Uid();
        shakeeb.UAmount();
        shakeeb.Date();
        shakeeb.PhoneNumber();
        shakeeb.Address();
        shakeeb.LoanTakenFor();
        shakeeb.age();
                try {
                    shakeeb.Insert();
                    msg("Done");
                } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"AccountNO cannot be same");
                }
                 getDataIntoTable();
                  clean();
    }//GEN-LAST:event_RegistarActionPerformed

    private void NewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordActionPerformed
        // TODO add your handling code here:
           String TableName= "LoanOfficers";
           PasswordChanged shakeeb=new PasswordChanged(getName,TableName);
           shakeeb.setVisible(true);
    }//GEN-LAST:event_NewPasswordActionPerformed

    private void LoanTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LoanTableAncestorAdded
              getDataIntoTable();
    }//GEN-LAST:event_LoanTableAncestorAdded

    private void LoanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoanTableMouseClicked
        // TODO add your handling code here:
           int index= LoanTable.getSelectedRow();
         TableModel model =LoanTable.getModel();
         Interest=model.getValueAt(index,2).toString();
         double x=(Double.parseDouble(Interest)/12)*0.15;
         Tax.setText(String.valueOf(x));
    }//GEN-LAST:event_LoanTableMouseClicked

    private void DateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DateAncestorAdded
        // TODO add your handling code here:
          DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
               Date date = new Date();
               Date.setText(dateFormat.format(date));
    }//GEN-LAST:event_DateAncestorAdded

    private void SearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseReleased
              
    }//GEN-LAST:event_SearchMouseReleased

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
          try {
                    // TODO add your handling code here:
                    rs= qeary.getConnection("Select * from LoanCustomer Where AccountNO="+"'"+Search.getText()+"'");
                    LoanTable.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    Logger.getLogger(LoanOfficer.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_SearchKeyReleased

    private void rfrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfrashActionPerformed
        // TODO add your handling code here:
         Tax.setText("");
         getDataIntoTable();
    }//GEN-LAST:event_rfrashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNO;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Ammount;
    private javax.swing.JTextField CP1;
    private javax.swing.JTextField Date;
    private javax.swing.JTable LoanTable;
    private javax.swing.JTable LoanTable1;
    private javax.swing.JTextField Name;
    private javax.swing.JButton NewPassword;
    private javax.swing.JButton NewPassword1;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton Registar;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField Taken;
    private javax.swing.JLabel Tax;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton rfrash;
    // End of variables declaration//GEN-END:variables
}
