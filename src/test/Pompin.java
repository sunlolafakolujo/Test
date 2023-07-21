package test;

import java.util.ArrayList;
import java.util.List;

public class Pompin {
    private static int yesterday=1;
    int tomorrow=10;
    public static void main(String[] args){
        Pompin p=new Pompin();
        int today=20, tomorrow=40;
        System.out.println(today + p.tomorrow+p.yesterday);
    }
}
