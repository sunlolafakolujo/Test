package stringclasses;

public class PassingCharArrayToStringConstructor {
    public static void main(String[] args) {
        char[] charArray = new char[]{'H', 'a', 'p', 'p', 'y', '-','b','i','r', 't', 'h', 'd', 'a','y'};
        String str = new String(charArray);
        System.out.println(str);
    }
}
