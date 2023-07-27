package newinstancemethod;

public class NewInstanceMethodDemo {
    public NewInstanceMethodDemo() {
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Object o=Class.forName(args[0]).newInstance();

        System.out.println(o.getClass().getName()+" instant created");
    }
}
