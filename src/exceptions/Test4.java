package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        int a=0x777;
        System.out.println(a);
        int d=0777;//not 0786 or 778
       try {
           System.out.println(10/0);
       }catch (ArithmeticException e) {
           System.out.println(10/5);
//           throw new NullPointerException("Exception");
       }finally {
//           throw new RuntimeException("Exception");
       }

    }
}
