package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ClassFile {
    public static void main(String[] args)  {
        try {
            PrintWriter pw=new PrintWriter("at.txt");
            pw.println("Hello");
            System.out.println("Hello");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        throw new ArithmeticException("/ by zero explicitly");
//        System.out.println("Hello"); //unreachable statement

    }
}
