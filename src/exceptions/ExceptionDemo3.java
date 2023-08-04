package exceptions;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        throw new RuntimeException("Exception");
//        System.out.println("Hello World"); unreachable statement ie illegal to have a statement after throw statement
    }
}
