package entity;

import interfaces.TeacherFunctions;
import java.time.LocalDate;

public class Teacher extends User implements TeacherFunctions {

    private int id;
    private String name;
    private String education;
    private int semesterId;
    private LocalDate lastActive;
    private LocalDate currentDate;

    public Teacher(String name, String education, LocalDate lastActive) {
        this.name = name;
        this.education = education;
        this.lastActive = lastActive;
    }

    public Teacher(String name, int semesterId, LocalDate currentDate) {
        this.name = name;
        this.semesterId = semesterId;
        this.currentDate = currentDate;
    }

    public Teacher() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public LocalDate getLastActive() {
        return lastActive;
    }

    public void setLastActive(LocalDate lastActive) {
        this.lastActive = lastActive;
    }

    public int getSemesterID() {
        return semesterId;
    }

    public void setSemesterID(int semesterID) {
        this.semesterId = semesterID;
    }

   

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public int getMonthDiffirence(LocalDate date1, LocalDate date2) {
        return 0;
    }

    @Override
    public LocalDate dateToGregorianCalendar(LocalDate date) {
        return null; 
    }

    @Override
    public int daysUntilDeadLine(LocalDate teacherDate, LocalDate semesterDate) {
        return 0;
    }

    
    

}