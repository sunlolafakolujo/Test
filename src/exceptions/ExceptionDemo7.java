package exceptions;

import java.io.IOException;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
