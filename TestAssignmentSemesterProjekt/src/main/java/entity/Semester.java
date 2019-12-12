package entity;

import interfaces.semesterFunctions;
import java.time.LocalDate;
import java.util.Date;


public class Semester implements semesterFunctions {
    private int id;
    private LocalDate startDate;
    private String name;

    public Semester() {
    }
    
    

    public Semester(LocalDate startDate, String name) {
        
        this.startDate = startDate;
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
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

    @Override
    public int daysUntilDeadLine() {
        return 0;
    }
    
    
}