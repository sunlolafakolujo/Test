package innerclass.normalorregularinnerclass;

public class OuterClass {
    class InnerClass{
        public static String s;
        public static int age;
        public static void m1(){
            System.out.println(s+" "+age);
        }
    }
    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        OuterClass.InnerClass i=o.new InnerClass();
        i.s="xxxx";
        i.age=10;

        System.out.println(i.s);
        System.out.println(i.age);
        i.m1();
    }
}
