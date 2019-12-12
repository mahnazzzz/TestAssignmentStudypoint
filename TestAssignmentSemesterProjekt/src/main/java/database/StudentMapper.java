package database;

import entity.Course;
import entity.Student;
import entity.Teacher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;


public class StudentMapper {

    private DatabaseConnector dbc = new DatabaseConnector();

    public StudentMapper(DataSource dataSource) {
        dbc.setDataSource(dataSource);
    }

    public String createStudent(Student student) throws SQLException {

        if (student.getAge() >= 0 && student.getAge() < 18) {
            return "You must be at least 18 years of age to register";
        } else if (student.getAge() >= 18 && student.getAge() <= 100) {
            String sql = "INSERT INTO User (userName, password, who)\n"
                    + "VALUES (?, ?, 'Student');";

            dbc.open();
            try (PreparedStatement pstmt = dbc.preparedStatement(sql)) {
                pstmt.setString(1, student.getUserName());
                pstmt.setString(2, student.getPassword());
                pstmt.executeUpdate();
            } finally {
                dbc.close();
            }

            return "You have been successfully registered";
        }  else {
            return "Invalid age";
        }
    }
   
}
