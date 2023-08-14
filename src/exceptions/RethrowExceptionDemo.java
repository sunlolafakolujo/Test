package exceptions;

public class RethrowExceptionDemo {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            throw new Exception("Division by zero");
        }
    }
}
