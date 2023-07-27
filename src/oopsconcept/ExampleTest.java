package oopsconcept;

public class ExampleTest extends Example2 implements Example3,Example4{
    @Override
    public void message() {
        System.out.println("God is the Alpha and Omega");
    }

    @Override
    public String description(String s) {
        return s;
    }

    public static void main(String[] args) {
        new ExampleTest().message();
        System.out.println(new ExampleTest().description("Jesus is the way, the truth and light, no one come to the father except through me"));
        new ExampleTest().text();
    }

    @Override
    public String message1() {
        return "Hello World!";
    }
}
