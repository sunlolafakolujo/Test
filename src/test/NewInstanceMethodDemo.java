package test;

public class NewInstanceMethodDemo {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        for (int i = 0; i <args.length; i++) {
        Object o=Class.forName(args[0]).newInstance();
        System.out.println(o.getClass().getName());
        }

    }

    public void message(){
        System.out.println("NewInstanceMethodDemo");
    }
}
