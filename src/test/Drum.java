package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class Drum {


    public static void main(String[] args) {
        String bike1 = "Speedy";
        String bike2 = new String("Speedy");
        boolean test1 = bike1 == bike2;
        boolean test2 = bike1.equals(bike2);
        System.out.println(test1 + " " + test2);
        int count = 0;
        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 1);
        while (localDate.getMonth() != Month.APRIL) {
            localDate = localDate.minusMonths(1);
            count++;
        }
        System.out.println(count);

        StringBuilder builder = new StringBuilder("Leaves growing");
        do {
            builder.delete(0, 5);
            System.out.println(builder);
        } while (builder.length() > 5);
//        System.out.println(builder);
        String lol = "lol";
        System.out.println(lol.toUpperCase() == lol.toUpperCase());
    }
}
