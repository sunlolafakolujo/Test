package exceptions;

import java.util.Scanner;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)) {
//            scanner=new Scanner(System.in);//auto-closeable resource scanner may not be assigned as it is final
            System.out.print("Enter a number: ");
            int a=scanner.nextInt();
            int b=a/0;
            System.out.println(b);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
