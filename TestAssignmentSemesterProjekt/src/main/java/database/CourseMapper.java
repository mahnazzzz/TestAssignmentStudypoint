package database;

import entity.Course;
import entity.Student;
import entity.Teacher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseMapper {

    private DatabaseConnector dbc = new DatabaseConnector();
    public List<Course> courses = new ArrayList();

    public CourseMapper() {
        dbc.setDataSource(new ReallyDataSource().getDataSource());
        courses.add(new Course(1, "system integration", new Teacher("Anne", "It", null)));
        courses.add(new Course(2, "Test", new Teacher("Casper", "Software", null)));
        courses.add(new Course(3, "Databases", new Teacher("Hans", "Data", null)));
        courses.add(new Course(4, "Machinlearning", new Teacher("Anne", "It", null)));
        courses.add(new Course(5, "Big system", new Teacher("Alice", "Software", null)));
        courses.add(new Course(6, "Databases", new Teacher("Peter", "Data", null)));
    }

    public List<Course> getCourses() throws ClassNotFoundException, SQLException {
        List<Course> courses = new ArrayList();

        try {
            dbc.open();

            String sqlCourse = "SELECT * FROM course";

            PreparedStatement pstmt = dbc.preparedStatement(sqlCourse);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Course course = new Course();

                int id = rs.getInt("id");
                int teacherId = rs.getInt("teacherId");
                int semesterId = rs.getInt("semesterId");
                String subject = rs.getString("subject");

                course.setId(id);

                course.setTeacher(getTeacherbyId(teacherId));
                course.setSubject(subject);

                //  course.setTeacher(teacherId);
                courses.add(course);

            }
            for (Course course : courses) {
                System.out.println(course.getId());
            }

            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dbc.close();
        }
        return courses;

    }

    public Teacher getTeacherbyId(int id) {

        Teacher t = new Teacher();
        try {
            dbc.open();

            String sqlTecher = "select * from Teacher WHERE teacherId = ?";
            PreparedStatement pstmt = dbc.preparedStatement(sqlTecher);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                int idT = rs.getInt("id");
                int userId = rs.getInt("userId");
                String subject = rs.getString("subject");
                String date = rs.getString("currentDate");

                getStudentbyId(userId);
                t.setId(id);
                t.setCurrentDate(LocalDate.MIN);
                t.setEducation(date);
              

            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dbc.close();
        }
        return t;
    }

    public void deleteCourse(int id) {
        Course dCourse = null;

        for (Course course : courses) {
            if (course.getId() == id) {
                dCourse = course;
            }
        }
        courses.remove(dCourse);
    }

    public Student getStudentbyId(int id ) {

        Student s = new Student();
        try {
            dbc.open();

            String sqlStudent = "select * from Student WHERE id = ?";
            PreparedStatement pstmt = dbc.preparedStatement(sqlStudent);
             pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                int userId = rs.getInt("userId");
                int courseId = rs.getInt("courseId");
                int age = rs.getInt("currentDate");

                s.setAge(age);
               
              
            }

            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dbc.close();
        }
        return s;
    }

}
