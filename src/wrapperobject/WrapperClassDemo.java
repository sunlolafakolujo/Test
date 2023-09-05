package wrapperobject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for i: ");
        int i = sc.nextInt();
        System.out.print("Enter value for j: ");
        int j = sc.nextInt();

        System.out.println(Integer.sum(i, j));
        System.out.println(Integer.rotateLeft(i, j));//32bits(00000000000000000000000000000000)
        System.out.println(Integer.rotateRight(i, j));
        System.out.println(Long.rotateLeft(i, j));//64bits(000000000000000000000000000000000000000000000000000000000000000)
        System.out.println(Long.rotateRight(i, j));
        System.out.println(Integer.reverse(2));//to do research
    }


}
