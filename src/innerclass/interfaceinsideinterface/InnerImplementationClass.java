package innerclass.interfaceinsideinterface;

public class InnerImplementationClass implements OuterInterface.InnerInterface {
    @Override
    public String m2() {
        return "Innerclass method";
    }

    public static void main(String[] args) {
        System.out.println(new InnerImplementationClass().m2());
    }
}
