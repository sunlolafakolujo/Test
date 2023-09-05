package wrapperobject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class WrapperClassDemo2 {
    public static void main(String[] args) {
        Boolean b = new Boolean("True");
        System.out.println(b);
        System.out.println(new Boolean("Ade"));

        int t = 2;
        Integer z = Integer.valueOf(t);
        System.out.println(z);
        Float l = new Float(10.0F);
        byte q = l.byteValue();
        System.out.println(q);
        System.out.println();
        char c = 'a';
        System.out.println(new Character(c));
        Character ch = Character.valueOf(c);
        System.out.println(ch.getClass().getName());
        System.out.println(ch);
        Character ch2 = ch.charValue();
        System.out.println(ch2);
        System.out.println(ch2.getClass().getName());

        String w = "110";
        int n = Integer.parseInt(w);
        System.out.println(n);

        int w2 = Integer.valueOf(w, 2);
        System.out.println(w2);

//        System.out.println(new Character("a"));//java.lang.String cannot be converted to char

        String string = "10";
//        double q1=Double.parseDouble(string,2);//radix is not applicable to floating point numbers(double and float)
        int q1 = Integer.parseInt(string);
        System.out.println(q1);

        Double d =new Double(10);
        Long l1=Double.doubleToLongBits(d);
        boolean b1 = Boolean.valueOf(String.valueOf(l1));
        System.out.println(b1);

    }
}
