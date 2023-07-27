package test;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test {
    int a;
    double b;
    boolean c;
    String s;
    static String g="Good Job";

    public Test() {
    }

    public static void main(String[] args){
        for (int i=1; i<= args.length; i++) {
            System.out.println(args[i]);
        }
        String[] argh=new String[]{"F", "G","H"};
        args=argh;
        int z;
        System.out.println(Arrays.toString(args));
        Test t =new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.s);
        System.out.println(Test.g);

        Object[] a=new Object[4];
        a[0]=new Object();
        a[1]=new String("Durgar");
        a[2]=new Integer(10);
        a[3]=new Long(4);
        System.out.println(Arrays.toString(a));

        Number[] n= new Number[3];
        n[0]=new Integer(12);
        n[1]=new Long(123);
//        n[2]=new String("Koko");//Can't covert java.lang.String to java.lang.Number
        System.out.println("");

//        for interface array element its implementation class objects are allowed.
        Runnable[] r=new Runnable[2];
        r[0]=new Thread();
//        r[1]=new String();//java.lang.String cannot be converted to java.lang.Number
        int[] y={10,20,30,40,50};
        int[] k= {60,70};
        y=k;
//        k=y;
        System.out.println("Y elements "+Arrays.toString(y));
        System.out.println("");
        System.out.println("K elements "+Arrays.toString(k));
        System.out.println("");
        int[][] p=new int[3][];
//        p[0]=new int[3][2];
//        p[0]=10;
        p[0]=new int[2];
        System.out.println("P elements "+Arrays.toString(p));
        System.out.println("K elements "+Arrays.toString(p[0]));

        String str="Hello, world!";
        int count=0;

        do {

                count++;

        }while(count<str.length());
        System.out.println("Number of characters in str: "+count);
        System.out.println();

        do{
            char[] character=str.toCharArray();
            for(int i=character.length-1; i>=0; i--){
                System.out.print(character[i]+" ");
            }
            System.out.println();
            for(int i=character.length-1; i>=0; i--){
                System.out.println(i+": "+str.charAt(i));
            }
            String s=new String(character);
            System.out.println();
            System.out.println("String value: "+s);
        }while (str.length()>count);



    }
}
