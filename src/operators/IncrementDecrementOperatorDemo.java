package operators;

public class IncrementDecrementOperatorDemo {
    public static void main(String[] args) {
        int x=0;
        x++;

        System.out.println("Value of x post-increment: "+x);
        ++x;
        System.out.println("Value of x pre-increment: "+x);

        char ch="123".charAt(1);
        System.out.println(ch);
        System.out.println(ch++);
        System.out.println(++ch);
        System.out.println(ch++ + ++ch);
    }
}
