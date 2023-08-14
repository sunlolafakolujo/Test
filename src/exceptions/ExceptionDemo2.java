package exceptions;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
            String s[] ={"Hello World", "Hello", "World"};
            System.out.println(s[2]);
            System.out.println(10/0);
            FileReader f=new FileReader("books.xlx");
            System.out.println(f);

        } catch (ArithmeticException |ArrayIndexOutOfBoundsException | FileNotFoundException f) {
            f.printStackTrace();
        }
    }
}
