package test;

public class SubClass2 extends MyAbstract{
    @Override
    public void m2() {
        super.m2();
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        SubClass2 subClass2=new SubClass2();
        subClass2.m2();
    }
}
