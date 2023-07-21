package test;

import java.util.Scanner;


public class Sample {
    String s="red";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println(s);
        Sample sample=new Sample();
        sample.printColour("pink");
//        Thread.sleep(10000);
    }
    public void printColour(String c){
        c="Green";
        System.out.println(c);
    }
}
