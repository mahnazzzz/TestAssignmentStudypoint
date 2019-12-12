package entity;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String subject;
    private Teacher teacher;
    private int semesterId;
    private List<Student> students;

    public Course() {
    }

    public Course(int id, String subject, Teacher teacher, int semesterId, List<Student> students) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.semesterId = semesterId;
        this.students = students;
    }
    
    public Course(int id, String subject, Teacher teacher) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        students = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", subject=" + subject + ", teacher=" + teacher + ", semesterId=" + semesterId + ", students=" + students + '}';
    }

}
