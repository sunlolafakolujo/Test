package array;

import static java.lang.Double.*;

public class CommandLineDemo {
    public static void main(String[] args) {
        for (int i=0;i<args.length; i++) {
            System.out.print(args[i]+" ");
        }
        System.out.println();
        System.out.println(args[0] + args[1]+args[2]);
        System.out.println('a'+'b');
        char a = 'a';
        char b = 'b';
        System.out.println(a + b);

        System.out.println(10.0/0);//Positive infinity
        System.out.println(-10.0/0);//Negative infinity
        System.out.println(-0.0/0);//NaN
        System.out.println(0.0/0);//NaN
        System.out.println(0/0.0);//NaN
        double d=0.0/0;
        double d1=10.0/2;
        double d2=10.0/0;
        System.out.println(isNaN(d));
        System.out.println(isFinite(d1));
        System.out.println(isInfinite(d2));
        }
}
