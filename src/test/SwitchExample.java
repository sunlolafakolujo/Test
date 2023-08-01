package test;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input value of x: ");
        int x= scanner.nextInt();
        switch (x){
            case 0:
                System.out.println(0);
            case  1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            default:
                System.out.println("default");

        }

        int i=30;
        switch (i) {
            default:
                System.out.println("Not a value");
            case 30:
                System.out.println("30");
            case 40:
                System.out.println("40");
        }
    }
}
