package staticandinstancecontrolflow;

public class StaticBlockExample {
    static int num;
    static String s;
    static {
        num=78;
        s="First Static Block";
    }

    static {
        num=80;
        s="Second Static Block";
    }

    public static void main(String[] args) {
        System.out.print("number: "+ num+", ");
        System.out.print("String: "+ s);
    }
}
