package classfile;

import java.io.IOException;

public class Test2 {
    private static int x = 10;
    static {
        x++;
        System.out.println("First Static Block x: "+x);
    }
    static {
        ++x;
        System.out.println("Second Static Block x: "+x);
    }
    {
        x--;
        System.out.println("Instance Block x: "+x);
    }
    public static void main(String[] args) {

        try {
            System.out.println("Hello");
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        Float f=new Float(15.5f);//Float wrapper object
        System.out.println(f);

        Boolean b=new Boolean("false");// boolean wrapper object
        System.out.println(b);

        Integer i=new Integer('a');// integer wrapper object
        System.out.println(i);

        int i2=Integer.valueOf("15");//converts primitive to wrapper object
        System.out.println(i2);

        Character ch=Character.valueOf('a');
        System.out.println(ch);
        System.out.println(ch.charValue());

        Integer i4=Integer.valueOf("100",4); //wrapper class object
        System.out.println(i4);

        Integer i5=new Integer("100");
        int i6=i5.intValue();// converts from wrapper to primitive
        System.out.println(i6);


        String s=i5.toString(); //converts from wrapper to String
        System.out.println(s);

        int i10=new Integer("101");
        System.out.println(i10);
        Integer in=new Integer(102);
        String s1=new Integer(i10).toString();//this call method chaining. converts wrapper to String
        System.out.println(s1);
        System.out.println(in.toString());

        Integer i7=new Integer("100");
        int i8=Integer.parseInt("100");
        System.out.println(i8);
        int i9=i7.intValue();// converts from wrapper to primitive.
        System.out.println(i9);

        Integer I=10;
        String str=I.toString();
        System.out.println(str);
        String str2="100";
        Integer I2=Integer.parseInt(str2);
        System.out.println(I2);

        int i20=i4;
        System.out.println(i20);

        Integer k=new Integer(128);
        Integer q=new Integer(100);
        System.out.println(k==q);
        System.out.println(k.equals(q));

        Integer r=1000;
        Integer z=1000;
        System.out.println(r==z);//Not in the range of -128 to 128
        Test2 test2=new Test2();
        Test2 test=new Test2();
        System.out.println(x);
    }



}
