package controlflow.forloop;

public class UnreachableInForLoop3 {
    public static void main(String[] args) {
        final int a=10, b=20;

        for (;a<b;){
            System.out.println("Hello");
        }
//        System.out.println("Hi");//unreachable statement
    }
}
