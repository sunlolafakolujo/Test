package staticandinstancecontrolflow;

public class StaticControlFlowChild extends StaticControlFlowParent{
    static int x=100;

    static {
        m2();
        System.out.println("Child first static block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Child main method");
    }

    public static void m2() {
        System.out.println(y);
    }

    static {
        System.out.println("Child second static block");
    }

    static  int y=200;
}
