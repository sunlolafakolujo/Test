package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        }catch (ArithmeticException e) {
            throw new IOException();
        }finally {
            throw new ArithmeticException();
        }
    }
}
