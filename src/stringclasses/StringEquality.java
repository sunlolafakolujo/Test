package stringclasses;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEquality {
    public static void main(String[] args) {
        String s1=new String("durga");
        String s2= s1.toUpperCase();
        String s3= s1.toLowerCase();
        System.out.println(s1+" "+s2+" "+s3);
        System.out.println();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        String s4=s2.toLowerCase();
        String s5=s4.toUpperCase();
        System.out.println(s4+" "+s5);
        System.out.println(s1==s4);
        System.out.println(s2==s5);

        String[] array={"a", "b", "c"};
        List<String> m= Arrays.asList(array);
        m.set(0,"d");
//        m.remove(1);
        System.out.println(m);
        System.out.println(m.contains("d"));
        List b=new ArrayList();
        LocalDate l=LocalDate.of(2016,12,24);
        l.plusDays(-1);
        System.out.println(l.getDayOfMonth());
        Period p1=Period.ofWeeks(1).ofDays(3);
        Period p2=Period.ofDays(10);
        System.out.println(p2+"--------------------"+p2);
        StringBuilder stringBuilder=new StringBuilder("boy");
        char ch=stringBuilder.charAt(1);
        stringBuilder.insert(1,"more");
        int num=stringBuilder.length();
        s1.replace('x','u');
        LocalDate localDate=LocalDate.of(2016,12,19);
        StringBuilder stringBuilder1=stringBuilder.append("boy");
        System.out.println(stringBuilder==stringBuilder1);

    }
}
