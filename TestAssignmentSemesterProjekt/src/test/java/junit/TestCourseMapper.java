package junit;


import database.CourseMapper;
import entity.Student;
import entity.Teacher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCourseMapper {
 public CourseMapper cm = new CourseMapper();
 
 
    @Test
    public void testDeleteCourse() {
       
        int length = cm.courses.size();     
        cm.deleteCourse(1);
        assertThat(cm.courses.size(), is(length-1));
    }
    
    
    @Test
    public void getStudentById() {
              
        Student s = cm.getStudentbyId(6);
        int age = s.getAge();
        System.out.println("age is "+ age);
        assertEquals(age, 0);
    }
    
     @Test
    public void getTeacherById() {
              
        Teacher t = cm.getTeacherbyId(0);      
        System.out.println("age is "+ t.getName());
        assertEquals(t.getId(), 0);
    }
}