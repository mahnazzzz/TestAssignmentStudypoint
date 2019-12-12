
package database;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;


public class LoginMapper {

   

    private DatabaseConnector dbc = new DatabaseConnector();
    

    public void setDataSource(DataSource datasource) {

            dbc.setDataSource(datasource);

    }
    public User getUser(String userName, String password) throws SQLException {
        dbc.open();
        String sql = "select * from User WHERE userName = ? and password = ?";
        PreparedStatement pstmt = dbc.preparedStatement(sql);
        pstmt.setString(1, userName);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
         User user = new User();
        while (rs.next()) {
            userName = rs.getString("userName");
            password = rs.getString("password");
            String who = rs.getString("who");
           
            user.setUserName(userName);
            user.setPassword(password);
            user.setWho(who);
            return user;
        }
        return user;
    }
}
