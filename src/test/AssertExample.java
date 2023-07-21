package test;

import java.awt.print.Printable;
import java.io.File;
import java.io.PrintWriter;

public class AssertExample {
    int x=20;
    public static void main(String[] args)  {
//        AssertExample a=new AssertExample();
//        assert(a.x<20);
        try(PrintWriter pw=new PrintWriter(new File("test.txt"))) {
            pw.println("Hello");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
