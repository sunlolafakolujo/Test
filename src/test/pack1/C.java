package test.pack1;

import test.A;

public class C extends A {
    static int x=10;
    int y=20;

    public static void main(String... args){
        C c =new C();
        c.m1();
        A a=new A();
//        a.m1(); //CE: m1() has protected access in text.A
//        m1(10,20);
        c.x=888;
        c.y=999;
        C c1=new C();
        System.out.println(c1.x+" ..... "+c1.y);
        System.out.println(c.x+" ..... "+c.y);
    }

//    public static void m1(final int s, int y){
//        s=100;
//        y=10;
//        System.out.println(s+ "...... "+y);
//    }
}
