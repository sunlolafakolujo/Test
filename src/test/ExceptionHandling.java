package test;

public class ExceptionHandling {

    private static void doStuff() {

       doMoreStuff();
       System.out.println("Hi");

    }

    private static void doMoreStuff()  {

        System.out.println("Hello");

    }

    public static void main(String[] args) {
        doStuff();
        System.out.println(10/0);
    }

}
