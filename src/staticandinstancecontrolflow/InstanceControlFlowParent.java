package staticandinstancecontrolflow;

public class InstanceControlFlowParent {
    int x =10;

    {
        methodOne();
        System.out.println("Parent First Instance Block");
    }

    public InstanceControlFlowParent() {
        System.out.println("Parent class constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowParent i=new InstanceControlFlowParent();
        System.out.println("Parent main method");
    }

    public void methodOne(){
        System.out.println(y);
    }

    int y=20;
}
