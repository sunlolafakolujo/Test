package palindrome;

import java.util.Scanner;

public class PalindromeIntegerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,temp;
        System.out.print("Enter integer number: ");
        int n=sc.nextInt();

        temp=n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            System.out.println(sum);
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

        sc.close();
    }
}
