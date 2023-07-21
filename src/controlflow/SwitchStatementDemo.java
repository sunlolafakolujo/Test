package controlflow;

import java.util.Scanner;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter month");
        int month=sc.nextInt();

        //fall through inside switch statement
        switch (month){
            
            case 1:
            case 2:
            case 3:
                System.out.println("Q-1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Q-2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Q-3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Q-4");
                break;
            default:
                System.out.println("Not a valid month number");
        }
        sc.close();
    }
}
