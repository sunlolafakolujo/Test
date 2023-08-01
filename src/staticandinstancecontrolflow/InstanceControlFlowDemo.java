package staticandinstancecontrolflow;

public class InstanceControlFlowDemo {
    int i = 10;

    {
        methodOne();
        System.out.println("First instance block");
    }

    public InstanceControlFlowDemo() {
        System.out.println("Construct");
    }

    public static void main(String[] args) {
        InstanceControlFlowDemo i = new InstanceControlFlowDemo();
        System.out.println("Main method");
    }

    public void methodOne() {
        System.out.println(j);
    }

    {
        System.out.println("Second Instance block");
    }

    int j = 20;
}
