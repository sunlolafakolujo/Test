package controlflow;

import java.util.Scanner;

public class TransferStatementBreakDemo {
    public static void main(String[] args) {
        System.out.println("Break in for loop block");
        for (int i = 0; i <=10;i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Break in label block");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter integer value: ");
        int value=scanner.nextInt();
        System.out.println("label l1");
        l1:
        {
           if (value<=5){
               System.out.println("Hello");
               System.out.println(value);
               break l1;
           }
            System.out.println("Hi");
        }
        System.out.println();
        System.out.println("label l2");

        l2:{
            for (int i = 1; i <=10;i++){
                if (i%2 == 0)
                break;
                System.out.println(i);
            }
        }
    }
}
