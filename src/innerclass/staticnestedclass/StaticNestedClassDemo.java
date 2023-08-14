package innerclass.staticnestedclass;

public class StaticNestedClassDemo {
    static class InnerStaticNestedClass{
        public static void m1(){
            System.out.println("Static nested method");
        }

        public static void main(String[] args) {
            System.out.println("Static nested main method");
            m1();
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer class main method");
        //or
        StaticNestedClassDemo.InnerStaticNestedClass.m1();
    }
}
