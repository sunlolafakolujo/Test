package innerclass.interfaceinsideinterface;

public class OuterImplementationClass implements OuterInterface{
    @Override
    public String m1() {
        return "Outer Interface";
    }

    public static void main(String[] args) {
        System.out.println(new OuterImplementationClass().m1());
    }
}
