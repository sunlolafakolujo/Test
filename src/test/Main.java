package test;

public class Main extends MainMethod{
    public static void main(String[] args) {
        System.out.println("Main class child");
        System.out.println(Math.abs(-101));
        m1('a');
    }
    public static void m1(double d){
        System.out.println(d);
    }

}
