package test;

import java.util.ArrayList;
import java.util.List;

public class Test17 {
    public static int wag=5;

    public Test17(int wag) {
        this.wag=wag;
    }
    public static void t(){}
    public static void get(){

    }
    public static void main(String[] args) {
       Test17 test= new Test17(2);
        System.out.println(test.wag);
        long x=0xface;
        System.out.println(x);



        StringBuffer stringBuffer=new StringBuffer("-");
        System.out.println(stringBuffer);
        StringBuffer buffer=stringBuffer.append("-");
        System.out.println(stringBuffer);
        System.out.println(buffer);
        System.out.println(stringBuffer==buffer);
        System.out.println();
        System.out.println(stringBuffer.length());

        System.out.println(new StringBuffer("radical ")
                .delete(1,100)
                .append("obots")
                .insert(1, "adical r"));
        System.out.println();
        System.out.println(new StringBuffer("radical ")
                .insert(new StringBuffer("radical ").length(), "robots"));
        System.out.println();
        System.out.println(new StringBuffer("radical ")
                .insert(7,"robots"));

        List<Character> chars=new ArrayList();
        chars.add('a');
        chars.add('b');
        chars.set(1,'c');
        chars.remove(0);
        System.out.println(chars.size());

    }

    public final static int getApplication(){
        return 0;
    }
}
