package exceptions;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            System.out.println(10/0);
//            System.out.println(10/2);
        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
//            System.out.println(10/5);
//            System.out.println(10/0);
        }
        System.out.println("World");
}
}
