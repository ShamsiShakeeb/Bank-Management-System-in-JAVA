
package BMS.Properties;

import java.sql.SQLException;


public interface SE {
   void  LoanOfficer() throws SQLException ;
   void CashierInformation() throws SQLException;
   void AccountantInformation() throws SQLException;
   void ITInformation() throws SQLException;
   void  SearchLoanOfficer() throws SQLException ;
   void SearchCashierInformation() throws SQLException;
   void SearchAccountantInformation() throws SQLException;
   void SearchITInformation() throws SQLException;
}
