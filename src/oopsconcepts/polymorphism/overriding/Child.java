package oopsconcepts.polymorphism.overriding;

public class Child extends Parent {
    public void message(){
        System.out.println("Child class method-1");
    }

    protected void message2(){
        System.out.println("Child class method-2");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.message();
        Parent p=new Child();
        p.message();

        Parent p2=new Parent();
        p2.message();
        System.out.println(".........................................");
        p.message2();
        c.message2();
        p2.message2();
    }
}
