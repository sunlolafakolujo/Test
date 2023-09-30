package dara;

import java.time.LocalDate;
import java.time.Period;

public class SchoolTest {
    public static void main(String[] args) {
        System.out.println("Using setters to initalize or set variables");
        School school=new School();
        school.setSchoolName("BMJS");
        school.setYearEstablished(LocalDate.of(1996,10,18));
        school.setSchoolAge(Period.between(school.getYearEstablished(),LocalDate.now()).getYears());
        school.setSchoolAddress("12 Jobi fele Street Ilawusa");

        System.out.println("school name: "+school.getSchoolName()+" ,"
                +"Year established: "+school.getYearEstablished()+" ,"+"School age:"+school.getSchoolAge()+" "
                +"School address: "+school.getSchoolAddress());
        System.out.println("");
        System.out.println("Using constructor to set or initialize variables");
        School school1=new School("BMJS",LocalDate.of(1996,10,18),
                Period.between(school.getYearEstablished(),LocalDate.now()).getYears(),"12 Jobi fele Street Ilawusa");

        System.out.println("school name: "+school1.getSchoolName()+" ,"
                +"Year established: "+school1.getYearEstablished()+" ,"+"School age:"+school1.getSchoolAge()+" "
                +"School address: "+school1.getSchoolAddress());

    }
}
