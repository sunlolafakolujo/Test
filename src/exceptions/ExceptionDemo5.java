package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo5 {
    public static void main(String[] args) throws IOException  {
        try {
            throw new FileNotFoundException();
        }catch (ArithmeticException e) {
            throw new IOException();
        }
    }
}
