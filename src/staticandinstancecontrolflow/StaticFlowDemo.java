package staticandinstancecontrolflow;

public class StaticFlowDemo {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args) {
        new StaticFlowDemo();


    }
}
