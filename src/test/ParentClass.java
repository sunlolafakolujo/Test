package test;

import java.io.IOException;

public class ParentClass {
    public ParentClass() {
        System.out.println("Parent Constructor");
    }

    public ParentClass(String s) {
        System.out.println("Parent Constructor: "+s);
    }

    public void m1()throws IOException {
        System.out.println("Parent Class Method");
    }


}
