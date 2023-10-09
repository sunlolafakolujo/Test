package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test37 {
    public static void main(String[] args) {
        String[] tour=new String[]{"a", "b", "c"};
        String[] times=new String[]{"d", "e"};
        for (int i=0, j=0; i<tour.length && j< times.length; i++,j++) {
            System.out.println(tour[i]+" "+times[j]);
        }
    }
}
