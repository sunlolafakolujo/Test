package controlflow.dowhileloop;

public class DoWhileLoopCounter {
    public static void main(String[] args) {
        int count = 0;
            do{
                do {
                    System.out.println(count);
                    count++;
                } while (count > 10);
//                System.out.println(count);
                break;
            }while (count <= 10);
        System.out.println(count);

    }
}
