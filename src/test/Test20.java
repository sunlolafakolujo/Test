package test;

public class Test20 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            final Object expected = new Exception();
            final Exception data = (RuntimeException) expected;
            System.out.println(data);
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}


