package staticandinstancecontrolflow;

public class InstanceControlFlowChild extends InstanceControlFlowParent {
    int i=100;
    {
        methodTwo();
        System.out.println("Child First instance block");
    }

    public InstanceControlFlowChild(){
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowChild i=new InstanceControlFlowChild();
        System.out.println("Child main method");
    }

    public void methodTwo(){
        System.out.println(j);
    }

    {
        System.out.println("Child second instance block");
    }

    int j=200;
}
