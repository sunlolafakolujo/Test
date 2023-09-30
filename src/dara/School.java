package dara;

import java.time.LocalDate;

public class School {
    private String schoolName;
    private LocalDate yearEstablished;
    private int schoolAge;
    private String schoolAddress;

    public School(){
    }

    public School(String schoolName, LocalDate yearEstablished, int schoolAge, String schoolAddress){
        this.schoolName = schoolName;
        this.yearEstablished = yearEstablished;
        this.schoolAge = schoolAge;
        this.schoolAddress = schoolAddress;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return this.schoolName;
    }

    public void setYearEstablished(LocalDate yearEstablished){
        this.yearEstablished = yearEstablished;
    }
    public LocalDate getYearEstablished(){
        return this.yearEstablished;
    }

    public void setSchoolAge(int schoolAge){
        this.schoolAge = schoolAge;
    }
    public int getSchoolAge(){
        return this.schoolAge;
    }

    public void setSchoolAddress(String schoolAddress){
        this.schoolAddress = schoolAddress;
    }
    public String getSchoolAddress(){
        return this.schoolAddress;
    }

}
