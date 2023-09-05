package test;


import java.util.Arrays;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        List<String> exams=Arrays.asList("OCA", "OCP");
        for (String exam : exams)
            for (String exam2: exams)
                System.out.println(exam+" "+exam2);
    }
}
