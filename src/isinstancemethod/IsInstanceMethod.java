package isinstancemethod;

import test.Test;

public class IsInstanceMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Thread t=new Thread();
        Test test=new Test();
        Object o= Class.forName(args[0]).isInstance(test);

        System.out.println(o.getClass().getName()+" is instance of Test");
    }
}
