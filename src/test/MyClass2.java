package test;

public class MyClass2 implements Interf{

    @Override
    public void m1() {
        System.out.println("Hi there");
    }

    @Override
    public void m2() {
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        MyClass2 myClass = new MyClass2();
        System.out.println(Interf.x);
        myClass.m1();
        myClass.m2();
    }
}
