package controlflow;

public class AndOperatorInForLoop {
    public static void main(String[] args) {
        char[] c=new char[]{'a', 'b', 'c', 'd', 'e'};
        char[] c2=new char[]{'f', 'g', 'h'};
        System.out.println(c.length);
        System.out.println(c2.length);
        for (int i=0,j=0; i<c.length && j< c2.length; i++,j++) {
            System.out.print(+ c[i]+"-"+c2[j]+" ,");
        }
    }
}
