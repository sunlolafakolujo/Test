package test;

public class A {
    protected void m1(){
        System.out.println("The most understood modifier");
    }
}
class B extends A{
    public static void main(String[] a){
        A a1=new A();
        a1.m1();
        B b =new B();
        b.m1();
    }
}
