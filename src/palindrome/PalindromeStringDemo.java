package palindrome;

import java.util.Scanner;

public class PalindromeStringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string literal: ");
        String str=sc.nextLine();
        String strCheck="";

        for (int i=str.length()-1; i>=0; i--) {
            strCheck=strCheck+str.charAt(i);//strCheck is added to str.charAt(i) to make a string
        }

        if (strCheck.equals(str)){
            System.out.println(str+" is a palindrome word");
        }else System.out.println(str+" is not a palindrome word");

        sc.close();
    }
}
