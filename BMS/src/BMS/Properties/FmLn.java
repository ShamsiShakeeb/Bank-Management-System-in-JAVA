
package BMS.Properties;

import java.sql.SQLException;


public interface FmLn {
     public void getFromData() throws SQLException;
     public void setInData() throws SQLException;
     public void SumLoan() throws SQLException;
     public void CountCustomer() throws SQLException;
     public void viewLoanTable() throws SQLException;
}
