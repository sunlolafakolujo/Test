package controlflow.forloop;

public class ForLoopBreakDemo {
    public static void main(String[] args) {
        for (int i = 100; i >=10;i--) {
            System.out.print(i+" ");
            if (i==88)
                break;
        }
        System.out.println();
        System.out.println("out of for loop");
    }
}
