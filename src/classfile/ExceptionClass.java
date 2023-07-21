package classfile;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class ExceptionClass {
    public static void main(String[] args) {
//        out.println(10/0);
        try{
            out.println(10/2);
        }catch (ArithmeticException e) {
//            System.out.println(10/2);
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        long y=50;
        int x=(int) 126.8;
        byte v=4;
        byte v2=(byte)(v+7);
        Scanner sc=new Scanner(in);
        System.out.print("Enter value of k: ");
        int k=sc.nextInt();
        if (k%2!=0){
            throw new IllegalArgumentException("Not a prime number");
        }else {
            out.println("k: "+k);
        }
    }
}
