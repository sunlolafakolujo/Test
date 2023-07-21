package test;

public class SubClass extends MyAbstract{
    @Override
    public void m1() {
//        super.m1();
        System.out.println("Hello");
    }
    public static void main(String[] args){
        SubClass subClass=new SubClass();
        subClass.m1();
    }
}
