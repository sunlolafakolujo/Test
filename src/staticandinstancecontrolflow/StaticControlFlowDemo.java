package staticandinstancecontrolflow;

public class StaticControlFlowDemo {
    static int a=100;

    public static void main(String[] args) {
        print();
        System.out.println("Main method has finished execution");
    }
    static {
        System.out.println(a);
        print();
        System.out.println("First static block");
    }

    public static void print() {
        System.out.println(b);
    }

    static {
        System.out.println("Second static block");
    }
    static int b=200;
}
