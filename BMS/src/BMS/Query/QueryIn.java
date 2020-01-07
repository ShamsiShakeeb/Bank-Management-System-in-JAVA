
package BMS.Query;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface QueryIn {
    public void setConnect(String x) throws SQLException;
    public ResultSet getConnection(String x)throws SQLException;
}
