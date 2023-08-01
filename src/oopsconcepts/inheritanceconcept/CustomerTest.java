package oopsconcepts.inheritanceconcept;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c=new Customer("101","sunFak","1234",
                "aa@gmail.com","090887665","Logic Gate", LocalDate.of(2017, Month.JULY,01));

        System.out.println(c);
    }
}
