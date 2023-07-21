package classfile;

import static java.lang.Math.max; //static import.
//import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
import java.util.ArrayList;//explicit import
import java.lang.*;//implicit import
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;//static import


public class Test {
    static int a;
    static {
        a=10;
    }
    public static void main(String... args){
        java.util.ArrayList strings = new ArrayList();
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(max(10,50));
        out.println(a);
//        int MAX_VALUE=999;
        System.out.println(MAX_VALUE);
        List<StringBuffer> s=new ArrayList<>();

        List<String> a = new LinkedList<>();
        Object o=new String("Durga");
        StringBuffer str=(StringBuffer) o;//this will compile but at runtime we will get runtime error.
        out.println(o.equals(str));
        out.println(str.length());
        out.println(str);

        String st=new String("Software");
//        StringBuffer sb=(StringBuffer) st;//compile time error



    }
}
