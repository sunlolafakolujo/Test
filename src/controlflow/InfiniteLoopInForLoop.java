package controlflow;

public class InfiniteLoopInForLoop {
    public static void main(String[] args) {
        int a=10,b=20;
        for (;a<b;){
            System.out.println("Reachable statement");//infinite loop
        }
    }
}
