package classfile;

public class SubChild extends Child{
    @Override
    public void m1() {
        System.out.println("I'm a subclass");
    }

    public static void main(String[] args){
        SubChild child = new SubChild();
        child.m1();
    }
}
