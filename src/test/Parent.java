package test;

public class Parent {
    int x=100;
    Parent() {
        System.out.println("Parent Construct");
    }

    public void m2(){
        System.out.println(this.x);
    }
}
