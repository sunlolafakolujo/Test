package test;

import java.io.IOException;

public class ChildClass extends ParentClass{

    public ChildClass() {
        System.out.println("ChildClass constructor");
    }

    public ChildClass(String s) {
        super(s);
    }

    public void display(){
        System.out.println("Hello");
    }

    public void display(String s){
        System.out.println("Happy to inherit from my parent "+ s);
    }

    public void m1()throws ArithmeticException {
        System.out.println("Child Class Method");
    }


    public static void main(String[] args){
        ChildClass child = new ChildClass();
        child.display();
        ChildClass child2 = new ChildClass("Give thanks");
        child2.display("Friend");

        child.m1();

    }
}
