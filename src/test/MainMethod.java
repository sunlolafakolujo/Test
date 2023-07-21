package test;

public class MainMethod {
    public static void main(String[] args) {

        System.out.println("MainMethod Parent");
        Thread t=new Thread();
        t.start();
        t.start();

    }
}
