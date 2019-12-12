
package Testdatabase;

import database.DatabaseConnector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;


public class TestDatabaseMapper {

    private DatabaseConnector dbc = new DatabaseConnector();

    public void setDataSource(DataSource ds) {
        dbc.setDataSource(ds);
    }

    public void createTestDatabase() {
        try {
            dbc.open();
            FileReader fr = new FileReader(new File(System.getProperty("user.dir") + "/src/test/java/sql/SemesterTestT.sql"));
            BufferedReader br = new BufferedReader(fr);
            String s = new String();
            StringBuffer sb = new StringBuffer();
            System.out.println("access to sql script ");
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            String[] inst = sb.toString().split(";");
             for(int i = 0; i<inst.length; i++)
            {
              
                if(!inst[i].trim().equals(""))
                {
                    PreparedStatement p = dbc.preparedStatement(inst[i]);
                    System.out.println("list from sql test"+inst[i]);
                    p.execute();
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("?");
        }

    }
}
