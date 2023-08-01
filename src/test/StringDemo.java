package test;

public class StringDemo {
    public static void main(String[] args) {
        String s=new String("hello world");
        Object o=(Object) s;

        System.out.println(o.toString());

        Integer i=new Integer(10);
        Number n=(Number)i;
        Object o2=(Object)n;
        System.out.println(o2.toString());

        String s1=new String("Long");
        Object o3=(Object)s1;
        System.out.println(o3.toString());
    }
}
