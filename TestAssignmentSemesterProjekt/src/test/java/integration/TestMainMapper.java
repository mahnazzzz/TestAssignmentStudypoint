/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import entity.Semester;
import entity.Teacher;
import entity.User;
import database.DatabaseConnector;
import database.MainMapper;
import database.TestDataSource;
import Testdatabase.TestDatabaseMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import javax.sql.DataSource;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;


@RunWith(JUnitPlatform.class)
public class TestMainMapper {

    private static MainMapper p = new MainMapper();
    private static Teacher teacher;
    private static User teacherUser;
    private static Semester semester;

    @BeforeAll
    public static void beforeAll() {
        TestDataSource d = new TestDataSource();
        TestDatabaseMapper t = new TestDatabaseMapper();
        t.setDataSource(d.getDataSource());
        t.createTestDatabase();
        p.setDataSource(d.getDataSource());
        teacherUser = new User("Teacher", "Tinea", "111");
        semester = new Semester(LocalDate.of(2019, Month.AUGUST, 1), "Test Semester");
        teacher = new Teacher("Tinea", "", LocalDate.of(2019, Month.MAY, 1));
        teacher.setEducation("Test");
        p.insertUser(teacherUser);
        p.insertSemester(semester);
        int userId = p.getPrimaryKeyIdFromTable("User");
        int semesterId = p.getPrimaryKeyIdFromTable("Semester");
        p.insertTeacher(teacher, userId, semesterId);
    }

   

    @Test
    public void testDaysDifference() {
        LocalDate teacherD = p.getTeacherDate(teacher.getEducation());
        LocalDate semesterD = p.getSemesterDate(semester.getName());
        System.out.println(teacherD + ", " + semesterD);
        assertThat(61L, is(DAYS.between(teacherD, semesterD))); //61 days.
    }
}
