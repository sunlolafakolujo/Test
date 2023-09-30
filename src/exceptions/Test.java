package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args)  {
        try {
            String sheep[]=new String[3];
//            throw new FileNotFoundException("Test");
            System.out.println(sheep[3]);
//            System.out.println("");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
//            throw new IOException();

        }
//        finally {
//            throw new Exception("/zero");
//        }
    }
}
