package java8.functionalinterface;

public class AdditionTest {
    public static void main(String[] args) {
        System.out.println("Addition of numbers");
        Addition addition= (a, b)-> a + b;
        System.out.println(addition.add(2,3));
        System.out.println("Square root of a number");
        SquareRoot s=(x)-> x * x;
        System.out.println(s.squareRoot(2));
        System.out.println("Length of a String and Sum of length of two Strings");
        LengthOfString l=c-> c.length();
        System.out.println(l.getLength("Sunlola"));
//        LengthOfString y=(q, z) -> q.length()+z.length();


    }
}
