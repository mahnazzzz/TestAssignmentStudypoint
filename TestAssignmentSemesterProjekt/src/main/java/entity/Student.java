package entity;

public class Student extends User {
    
    private int id;

    private Course course;
    private int age;
   

    public Student() {
    }

    public Student(int age, String who, String userName, String password) {
        super(who, userName, password);
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
