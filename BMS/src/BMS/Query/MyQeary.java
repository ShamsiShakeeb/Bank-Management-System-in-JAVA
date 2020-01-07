
package BMS.Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyQeary implements QueryIn{
     private static Connection con=null;
       private static Statement st=null;
       private static Connection con1=null;
       private static Statement st1=null;
   
       
     @Override
    public  void setConnect(String x) throws SQLException{
         try{
         con=DriverManager.getConnection("jdbc:sqlite:BMS.sqlite");
         System.out.println("Connected");
         }
         catch(Exception e){
             System.out.println("File Missing");
         }
         st=con.createStatement();
         st.executeUpdate(x); 
        
      
       
    }
     @Override
    public ResultSet getConnection(String x) throws SQLException{
          try{
         con1=DriverManager.getConnection("jdbc:sqlite:BMS.sqlite");
         System.out.println("Connected");
         }
         catch(Exception e){
             System.out.println("File Missing");
         }
         st1=con1.createStatement();
         ResultSet p= st1.executeQuery(x);   
        
         return p;
    }
}
