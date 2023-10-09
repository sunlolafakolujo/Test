package controlflow.dowhileloop;

public class DoWhileLoopFalseArgument {
    public static void main(String[] args) {
        do{
            System.out.println("Hello");
        }while (false);
        System.out.println("Hi");//output Hello and Hi;
    }
}
