package staticandinstancecontrolflow;

public class StaticControlFlowParent {
    static int i=10;

    static {
        m1();
        System.out.println("parent static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");
    }

    public static void m1() {
        System.out.println(j);
    }

    static int j=20;
}
