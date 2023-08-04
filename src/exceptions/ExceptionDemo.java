package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            doMoreStuff();
        }catch (ArithmeticException e) {
            e.getMessage();
        }
    }

    public static void doMoreStuff() {
        System.out.println("Hello");
        doStuff();
    }

    public static void doStuff() {
        System.out.println("Hi");

        System.out.println(10 / 0);

    }
}
