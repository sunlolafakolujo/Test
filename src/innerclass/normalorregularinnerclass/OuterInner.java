package innerclass.normalorregularinnerclass;

public class OuterInner {
    public static String greetings;
    public class InnerClass{
        public void greet(){
            String s=new String("Hello World");
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new OuterInner().new InnerClass().greet();
        System.out.println();
        OuterInner o=new OuterInner();
        o.greetings="Hello World";
        System.out.println(greetings);
    }
}
