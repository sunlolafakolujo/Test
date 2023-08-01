package operators;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int x=001, y=010, z=100;
        int i=--x + y++ - z-- - --z + ++y - --x + y-- - --x;
        System.out.println(i);
    }
}
