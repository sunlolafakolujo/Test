package singleton;

public class SingletonDemo {
    private static SingletonDemo singletonDemo=new SingletonDemo();
    String s;

    private SingletonDemo(){
        s="Singleton class";
    }

    public static SingletonDemo getSingletonDemo(){
        return singletonDemo;
    }

    public static void main(String[] args) {
        SingletonDemo singletonDemo=SingletonDemo.getSingletonDemo();
        System.out.println(singletonDemo.s);
    }
}
