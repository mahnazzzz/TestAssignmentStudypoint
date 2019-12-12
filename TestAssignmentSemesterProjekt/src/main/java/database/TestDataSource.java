
package database;

import database.*;
import com.mysql.cj.jdbc.MysqlDataSource;


public class TestDataSource {
    
    private MysqlDataSource dataSource = new MysqlDataSource();

    public TestDataSource() {
        try {
            dataSource.setServerName("localhost");
            dataSource.setPort(3306);
            dataSource.setDatabaseName("SemesterTestT");
            dataSource.setUser("root");
            dataSource.setPassword("1234");
            dataSource.setUseSSL(false);
            dataSource.setAllowMultiQueries(true);
            dataSource.setServerTimezone("UTC");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MysqlDataSource getDataSource() {
        return dataSource;
    }
}
