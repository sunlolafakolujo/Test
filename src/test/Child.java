package test;

public class Child extends Parent {
    int x=111;
    static int a=0;
    private String v;
    Child(){
        System.out.println("Child constructor");
        a++;
    }

    public void m1(){
        System.out.println(super.x);
        System.out.println(x);
    }
    public void m2(int y){
        super.m2();
        System.out.println(y);
    }

    public static void main(String[] args){
        Child child = new Child();
        child.m1();
        child.m2(10);

    }
}
