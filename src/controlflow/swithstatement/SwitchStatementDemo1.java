package controlflow.swithstatement;

public class SwitchStatementDemo1 {
    public static void main(String[] args) {
        byte b=9;
        switch (b+1) {
            case 10:
                System.out.println(10);
            case 11:
                System.out.println(11);
            case 12:
                System.out.println(12);
                break;
            default:
                System.out.println("No such field");
        }
    }
}
