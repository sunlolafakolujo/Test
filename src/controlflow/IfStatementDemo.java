package controlflow;

public class IfStatementDemo {
    public static void main(String[] args) {
        ifStatement();
        ifWithDeclarativeStatement();
        danglingIfStatement();

    }

    public static void ifStatement(){
        if (true)
            System.out.println("I am happy");
    }

    public static void ifWithDeclarativeStatement(){
        if (true);
//            int x=10;//compile time error: variable declaration not allowed here.
    }

    public static void danglingIfStatement(){
        if (true)
            if (true)
                System.out.println("I am happy");
            else System.out.println("I am not");
    }
}
