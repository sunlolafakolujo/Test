package exceptions;

public class ExceptionDemo6 {
    public static void main(String[] args) throws Exception {
        try {
            String[] strings=new String[3];
            System.out.println(strings[3]);
        }catch (RuntimeException e) {
            System.out.println("Awake");
        }finally {
            throw new Exception();
        }

    }
}
